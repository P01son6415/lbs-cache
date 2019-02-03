package com.zdxk.lbscache.model;

import com.alibaba.fastjson.JSONObject;

public class BaseStationInfo {

    private Integer id;

    private String mcc;

    private String mnc;

    private String lac;

    private String ci;

    private String lon;

    private String lat;

    private String coord;

    private String radius;

    private String address;

    private String cacheAge;

    private String reserved2;

    private String reserved3;

    private String reserved4;

    private String reserved5;

    public BaseStationInfo(LbsData lbsData , JSONObject location){
        this.mcc = lbsData.getMcc();
        this.mnc = lbsData.getMnc();
        this.lac = lbsData.getLac();
        this.ci = lbsData.getCi();
        this.lon = location.getString("lon");
        this.lat = location.getString("lat");
        this.coord = "bd09";
        this.radius = location.getString("radius");
        this.address = location.getString("address");
        this.cacheAge = "0";

    }

    public BaseStationInfo(String mcc, String mnc, String lac,
                           String ci, String lon, String lat,
                           String coord, String radius, String address) {
        this.mcc = mcc;
        this.mnc = mnc;
        this.lac = lac;
        this.ci = ci;
        this.lon = lon;
        this.lat = lat;
        this.coord = coord;
        this.radius = radius;
        this.address = address;
    }

    public BaseStationInfo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc == null ? null : mcc.trim();
    }

    public String getMnc() {
        return mnc;
    }

    public void setMnc(String mnc) {
        this.mnc = mnc == null ? null : mnc.trim();
    }

    public String getLac() {
        return lac;
    }

    public void setLac(String lac) {
        this.lac = lac == null ? null : lac.trim();
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci == null ? null : ci.trim();
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon == null ? null : lon.trim();
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    public String getCoord() {
        return coord;
    }

    public void setCoord(String coord) {
        this.coord = coord == null ? null : coord.trim();
    }

    public String getRadius() {
        return radius;
    }

    public void setRadius(String radius) {
        this.radius = radius == null ? null : radius.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCacheAge() {
        return cacheAge;
    }

    public void setCacheAge(String cacheAge) {
        this.cacheAge = cacheAge == null ? null : cacheAge.trim();
    }

    public String getReserved2() {
        return reserved2;
    }

    public void setReserved2(String reserved2) {
        this.reserved2 = reserved2 == null ? null : reserved2.trim();
    }

    public String getReserved3() {
        return reserved3;
    }

    public void setReserved3(String reserved3) {
        this.reserved3 = reserved3 == null ? null : reserved3.trim();
    }

    public String getReserved4() {
        return reserved4;
    }

    public void setReserved4(String reserved4) {
        this.reserved4 = reserved4 == null ? null : reserved4.trim();
    }

    public String getReserved5() {
        return reserved5;
    }

    public void setReserved5(String reserved5) {
        this.reserved5 = reserved5 == null ? null : reserved5.trim();
    }

    @Override
    public String toString() {
        return "BaseStationInfo{" +
                "id=" + id +
                ", mcc='" + mcc + '\'' +
                ", mnc='" + mnc + '\'' +
                ", lac='" + lac + '\'' +
                ", ci='" + ci + '\'' +
                ", lon='" + lon + '\'' +
                ", lat='" + lat + '\'' +
                ", coord='" + coord + '\'' +
                ", radius='" + radius + '\'' +
                ", address='" + address + '\'' +
                ", cacheAge='" + cacheAge + '\'' +
                ", reserved2='" + reserved2 + '\'' +
                ", reserved3='" + reserved3 + '\'' +
                ", reserved4='" + reserved4 + '\'' +
                ", reserved5='" + reserved5 + '\'' +
                '}';
    }
}