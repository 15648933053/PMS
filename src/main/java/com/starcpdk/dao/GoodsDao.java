package com.starcpdk.dao;

import com.starcpdk.entity.Goods;

import java.util.List;

public interface GoodsDao {
    public List<Goods> selAllGoods(int idd);
    public boolean dinggou(String userid , int id);
    public boolean addhole(int id);
    public List<Goods> selallorder();
    public List<Goods> sellike(String title);
    public List<Goods> selAllByUser(String userid);
    public List<Goods> seldaizhifu(String userid);
    public boolean zhifu(int id , String useid);

    public boolean tuifang(int id);

    boolean addgood(Goods goods);
}
