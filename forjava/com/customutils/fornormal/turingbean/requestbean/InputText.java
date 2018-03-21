package com.customutils.fornormal.turingbean.requestbean;

/**
 * Created by User on 2018/3/21.
 * 文本信息
 */

public class InputText {
    //    直接输入文本
    private String text;

    public InputText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "InputText{" +
                "text='" + text + '\'' +
                '}';
    }
}
