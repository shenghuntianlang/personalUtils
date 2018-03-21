package com.customutils.fornormal.turingbean.requestbean;

/**
 * Created by User on 2018/3/21.
 * 图灵机器人请求Bean
 */

public class RequestBean {
    //    输入类型:0-文本(默认)、1-图片、2-音频
    private int reqType;
    //    输入信息
    private Perception perception;
    //    用户参数
    private UserInfo userInfo;

    public RequestBean(Perception perception, UserInfo userInfo) {
        this.perception = perception;
        this.userInfo = userInfo;
    }

    public RequestBean(int reqType, Perception perception, UserInfo userInfo) {
        this.reqType = reqType;
        this.perception = perception;
        this.userInfo = userInfo;
    }

    public int getReqType() {
        return reqType;
    }

    public void setReqType(int reqType) {
        this.reqType = reqType;
    }

    public Perception getPerception() {
        return perception;
    }

    public void setPerception(Perception perception) {
        this.perception = perception;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public String toString() {
        return "RequestBean{" +
                "reqType=" + reqType +
                ", perception=" + perception.toString() +
                ", userInfo=" + userInfo.toString() +
                '}';
    }
}
