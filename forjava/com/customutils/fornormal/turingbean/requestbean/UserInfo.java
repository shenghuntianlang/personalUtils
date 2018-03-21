package com.customutils.fornormal.turingbean.requestbean;

/**
 * Created by User on 2018/3/21.
 * 用户参数
 */

public class UserInfo {
    //    机器人标识
    private String apiKey;
    //    用户唯一标示
    private String userId;
    //    群聊唯一标示
    private String groupId;
    //    群内用户昵称
    private String userIdName;

    public UserInfo(String apiKey, String userId) {
        this.apiKey = apiKey;
        this.userId = userId;
    }

    public UserInfo(String apiKey, String userId, String groupIdOrUserIdName, boolean isGroupId) {
        this.apiKey = apiKey;
        this.userId = userId;
        if (isGroupId) {
            this.groupId = groupIdOrUserIdName;
        } else {
            this.userIdName = groupIdOrUserIdName;
        }
    }

    public UserInfo(String apiKey, String userId, String groupId, String userIdName) {
        this.apiKey = apiKey;
        this.userId = userId;
        this.groupId = groupId;
        this.userIdName = userIdName;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getUserIdName() {
        return userIdName;
    }

    public void setUserIdName(String userIdName) {
        this.userIdName = userIdName;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "apiKey='" + apiKey + '\'' +
                ", userId='" + userId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", userIdName='" + userIdName + '\'' +
                '}';
    }
}
