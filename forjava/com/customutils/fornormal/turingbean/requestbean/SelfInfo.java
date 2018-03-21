package com.customutils.fornormal.turingbean.requestbean;

/**
 * Created by User on 2018/3/21.
 * 客户端属性
 */

public class SelfInfo {
    //    地理位置信息
    private Location location;

    public SelfInfo(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "SelfInfo{" +
                "location=" + location +
                '}';
    }
}
