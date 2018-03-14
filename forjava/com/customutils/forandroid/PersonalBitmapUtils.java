package com.customutils.forandroid;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/** * Created by User on 2018/3/13. */

public class PersonalBitmapUtils {
    public static Bitmap resizeBitmap(Context context, int resID, int needW, int needH) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        //设置bitmap仅返回图片宽高
        options.inJustDecodeBounds = true;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        BitmapFactory.decodeResource(context.getResources(), resID, options);
        int originalHeight = options.outHeight;
        int originalWidth = options.outWidth;
        options.inSampleSize = calculateSampleSize(originalWidth, originalHeight, needW, needH);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(context.getResources(), resID, options);
    }

    public static int calculateSampleSize(int originalW, int originalH, int needW, int needH) {
        int sampleSize = 1;
        if (originalW > originalH && originalW > needW) {
            sampleSize = originalW / needW;
        } else if (originalW < originalH && originalH > needH) {
            sampleSize = originalH / needH;
        }
        if (sampleSize < 1) {
            sampleSize = 1;
        }
        return sampleSize;
    }
}
