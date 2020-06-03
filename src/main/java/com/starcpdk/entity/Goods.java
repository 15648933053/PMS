package com.starcpdk.entity;

public class Goods {
    private int id;
    private int idd;
    private String userid;
    private String imageURL;
    private int price;
    private String descc;
    private String title;
    private int codec;
    private int guige;
    private int renshu;
    private String pmswifi;
    private String chuangguige;
    private int zhifu;

    public Goods() {
    }

    public Goods(int id, int idd, String userid, String imageURL, int price, String descc, String title, int codec, int guige, int renshu, String pmswifi, String chuangguige, int zhifu) {
        this.id = id;
        this.idd = idd;
        this.userid = userid;
        this.imageURL = imageURL;
        this.price = price;
        this.descc = descc;
        this.title = title;
        this.codec = codec;
        this.guige = guige;
        this.renshu = renshu;
        this.pmswifi = pmswifi;
        this.chuangguige = chuangguige;
        this.zhifu = zhifu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescc() {
        return descc;
    }

    public void setDescc(String descc) {
        this.descc = descc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCodec() {
        return codec;
    }

    public void setCodec(int codec) {
        this.codec = codec;
    }

    public int getGuige() {
        return guige;
    }

    public void setGuige(int guige) {
        this.guige = guige;
    }

    public int getRenshu() {
        return renshu;
    }

    public void setRenshu(int renshu) {
        this.renshu = renshu;
    }

    public String getPmswifi() {
        return pmswifi;
    }

    public void setPmswifi(String pmswifi) {
        this.pmswifi = pmswifi;
    }

    public String getChuangguige() {
        return chuangguige;
    }

    public void setChuangguige(String chuangguige) {
        this.chuangguige = chuangguige;
    }

    public int getZhifu() {
        return zhifu;
    }

    public void setZhifu(int zhifu) {
        this.zhifu = zhifu;
    }
}
