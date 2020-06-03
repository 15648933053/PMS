package com.starcpdk.entity;

public class User {
    private int id;
    private String userId;
    private String userName;
    private String phone;
    private String faceUrl;
    private String identify;

    public User() {
    }

    public User(int id, String userId, String userName, String phone, String faceUrl, String identify) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.phone = phone;
        this.faceUrl = faceUrl;
        this.identify = identify;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFaceUrl() {
        return faceUrl;
    }

    public void setFaceUrl(String faceUrl) {
        this.faceUrl = faceUrl;
    }

    public String getIdentify() {
        return identify;
    }

    public void setIdentify(String identify) {
        this.identify = identify;
    }
}
