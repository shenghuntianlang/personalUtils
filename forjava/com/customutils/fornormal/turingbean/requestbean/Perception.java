package com.customutils.fornormal.turingbean.requestbean;

/**
 * Created by User on 2018/3/21.
 * 输入信息
 */

public class Perception {
    //    文本信息
    private InputText inputText;
    //    图片信息
    private InputImage inputImage;
    //    音频信息
    private InputMedia inputMedia;
    //    客户端属性
    private SelfInfo selfInfo;

    public Perception(InputText inputText) {
        this.inputText = inputText;
    }

    public Perception(InputImage inputImage) {
        this.inputImage = inputImage;
    }

    public Perception(InputMedia inputMedia) {
        this.inputMedia = inputMedia;
    }

    public Perception(SelfInfo selfInfo) {
        this.selfInfo = selfInfo;
    }

    public InputText getInputText() {
        return inputText;
    }

    public void setInputText(InputText inputText) {
        this.inputText = inputText;
    }

    public InputImage getInputImage() {
        return inputImage;
    }

    public void setInputImage(InputImage inputImage) {
        this.inputImage = inputImage;
    }

    public InputMedia getInputMedia() {
        return inputMedia;
    }

    public void setInputMedia(InputMedia inputMedia) {
        this.inputMedia = inputMedia;
    }

    public SelfInfo getSelfInfo() {
        return selfInfo;
    }

    public void setSelfInfo(SelfInfo selfInfo) {
        this.selfInfo = selfInfo;
    }

    @Override
    public String toString() {
        return "Perception{" +
                "inputText=" + inputText.toString() +
                ", inputImage=" + inputImage.toString() +
                ", inputMedia=" + inputMedia.toString() +
                ", selfInfo=" + selfInfo.toString() +
                '}';
    }
}

enum PerceptionEnum {
    OBJECT_INPUTTEXT, OBJECT_INPUTIMAGE, OBJECT_INPUTMEDIA, OBJECT_SELFINFO
}