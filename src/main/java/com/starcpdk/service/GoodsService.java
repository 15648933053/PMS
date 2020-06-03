package com.starcpdk.service;

import com.starcpdk.entity.Goods;

import java.util.List;

public interface GoodsService {
    public List<Goods> selAllGoods(int idd);
    public boolean dinggou(String userid , int id);
    public boolean addhole(int id);
    public List<Goods> selallorder();
    public List<Goods> sellike(String title);
    public List<Goods> selAllByUser(String userid);
    public List<Goods> seldaizhifu(String userid);
    public boolean zhifu(int id , String userid);

    public boolean tuifang(int id);
    boolean addgood(Goods goods);
}
