package com.zdxk.lbscache.model;

public class LbsData {

    String mcc;

    String mnc;

    String lac;

    String ci;

    public String toParam(){
        return "?mcc="+mcc+"&mnc="+mnc+"&lac="+lac+"&ci="+ ci +"&coord=bd09&output=json";
    }

    public String getMcc() {
        return mcc;
    }

    public void setMcc(String mcc) {
        this.mcc = mcc;
    }

    public String getMnc() {
        return mnc;
    }

    public void setMnc(String mnc) {
        this.mnc = mnc;
    }

    public String getLac() {
        return lac;
    }

    public void setLac(String lac) {
        this.lac = lac;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    @Override
    public String toString() {
        return "LbsData{" +
                "mcc='" + mcc + '\'' +
                ", mnc='" + mnc + '\'' +
                ", lac='" + lac + '\'' +
                ", ci='" + ci + '\'' +
                '}';
    }
}
