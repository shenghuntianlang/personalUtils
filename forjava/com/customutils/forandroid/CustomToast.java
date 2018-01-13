package com.customutils.forandroid;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by User on 2017/12/26.
 */

public class CustomToast {
    public static void showShortToast(Context context, String string) {
        Toast.makeText(context, string, Toast.LENGTH_SHORT).show();
    }

    public static void showLongToast(Context context, String string) {
        Toast.makeText(context, string, Toast.LENGTH_LONG).show();
    }
}
