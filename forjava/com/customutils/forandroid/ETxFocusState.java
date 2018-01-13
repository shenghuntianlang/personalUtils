package com.customutils.forandroid;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 * Created by User on 2017/11/7.
 */

public class ETxFocusState {
    private Context context;
    private EditText editText;
    private InputMethodManager inputMethodManager;

    public ETxFocusState(Context context, EditText editText, InputMethodManager inputMethodManager) {
        this.context = context;
        this.editText = editText;
        this.inputMethodManager = inputMethodManager;
    }

    public void clearETxFocus() {
        editText.setFocusable(false);
        inputMethodManager.hideSoftInputFromWindow(editText.getWindowToken(), 0);
    }

    public void requestETxFocus() {
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        editText.findFocus();
        inputMethodManager.showSoftInput(editText, InputMethodManager.SHOW_FORCED);
    }
}
