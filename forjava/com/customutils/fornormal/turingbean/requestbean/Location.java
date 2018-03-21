package com.customutils.fornormal.turingbean.requestbean;

/**
 * Created by User on 2018/3/21.
 * 地理位置信息
 */

public class Location {
    //    城市
    private String city;
    //    所属省份
    private String province;
    //    街道
    private String street;

    public Location(String city) {
        this.city = city;
    }

    public Location(String city, String provinceOrStreet, boolean isProvince) {
        this.city = city;
        if (isProvince) {
            this.province = provinceOrStreet;
        } else {
            this.street = provinceOrStreet;
        }
    }

    public Location(String city, String province, String street) {
        this.city = city;
        this.province = province;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Location{" +
                "city='" + city + '\'' +
                ", province='" + province + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
