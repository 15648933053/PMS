package com.starcpdk.entity;

public class PMS {
    private String phone;
    private String holename;
    private String wifiname;

    public PMS() {
    }

    public PMS(String phone, String holename, String wifiname) {
        this.phone = phone;
        this.holename = holename;
        this.wifiname = wifiname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHolename() {
        return holename;
    }

    public void setHolename(String holename) {
        this.holename = holename;
    }

    public String getWifiname() {
        return wifiname;
    }

    public void setWifiname(String wifiname) {
        this.wifiname = wifiname;
    }


}
