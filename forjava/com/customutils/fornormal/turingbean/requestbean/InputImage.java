package com.customutils.fornormal.turingbean.requestbean;

/**
 * Created by User on 2018/3/21.
 * 图片信息
 */

public class InputImage {
    //    图片地址
    private String url;

    public InputImage(String url) {
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
        return "InputImage{" +
                "url='" + url + '\'' +
                '}';
    }
}
