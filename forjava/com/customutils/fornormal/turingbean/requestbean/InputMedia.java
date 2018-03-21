package com.customutils.fornormal.turingbean.requestbean;

/**
 * Created by User on 2018/3/21.
 * 音频信息
 */

public class InputMedia {
    //    音频地址
    private String url;

    public InputMedia(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "InputMedia{" +
                "url='" + url + '\'' +
                '}';
    }
}
