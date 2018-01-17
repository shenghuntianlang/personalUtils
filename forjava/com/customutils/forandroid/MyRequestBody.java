package com.customutils.forandroid;

import android.support.annotation.Nullable;

import java.io.IOException;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import okio.Sink;

/**
 * Created by User on 2018/1/16.
 */

public class MyRequestBody extends RequestBody {
    protected RequestBody requestBody;
    private Listener listener;

    /**
     * 构造方法,传入requestBody和已定义listener
     *
     * @param requestBody
     * @param listener
     */
    public MyRequestBody(RequestBody requestBody, Listener listener) {
        this.requestBody = requestBody;
        this.listener = listener;
    }

    /**
     * 定义listener接口,进行传值
     */
    public static interface Listener {
        void onRequestProgress(long byteWrited, long contentLength);
    }

    /**
     * 覆写contentLength方法,返回requestBody的内容总长度
     *
     * @return
     * @throws IOException
     */
    @Override
    public long contentLength() throws IOException {
        try {
            return requestBody.contentLength();
        } catch (Exception e) {
            return -1;
        }
    }


    /**
     * 封装buffersink,通过listener接口获取数据
     */
    protected final class CountingSink extends ForwardingSink {

        private long bytesWritten;              //已写长度

        /**
         * 构造方法
         *
         * @param delegate
         */
        public CountingSink(Sink delegate) {
            super(delegate);
        }

        /**
         * 覆写write方法,将总长度及已写长度传入接口listener;
         *
         * @param source
         * @param byteCount
         * @throws IOException
         */
        @Override
        public void write(Buffer source, long byteCount) throws IOException {
            super.write(source, byteCount);
            bytesWritten += byteCount;
            listener.onRequestProgress(bytesWritten, contentLength());
        }

    }

    /**
     * 覆写weitrTo方法,令requestBody将封装好的bufferSink写出
     *
     * @param sink
     * @throws IOException
     */
    @Override
    public void writeTo(BufferedSink sink) throws IOException {
        CountingSink countingSink = new CountingSink(sink);
        BufferedSink bufferedSink = Okio.buffer(countingSink);
        requestBody.writeTo(bufferedSink);
        bufferedSink.flush();
    }

    @Nullable
    @Override
    public MediaType contentType() {
        return requestBody.contentType();
    }
}
