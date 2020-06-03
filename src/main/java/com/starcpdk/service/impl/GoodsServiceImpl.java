package com.starcpdk.service.impl;

import com.starcpdk.dao.GoodsDao;
import com.starcpdk.dao.impl.GoodsDaoImpl;
import com.starcpdk.entity.Goods;
import com.starcpdk.service.GoodsService;

import java.util.List;


public class GoodsServiceImpl implements GoodsService {

    GoodsDao goodsDao = new GoodsDaoImpl();

    @Override
    public List<Goods> selAllGoods(int idd) {

        List<Goods> goods = goodsDao.selAllGoods(idd);
        return goods;
    }

    @Override
    public boolean dinggou(String userid, int id) {

        boolean dinggou1 = goodsDao.dinggou(userid, id);
        return dinggou1;
    }

    @Override
    public boolean addhole(int id) {

        boolean hole1 = goodsDao.addhole(id);
        return hole1;
    }

    @Override
    public List<Goods> selallorder() {
        List<Goods> goods = goodsDao.selallorder();
        return goods;
    }

    @Override
    public List<Goods> sellike(String title) {
        List<Goods> goods = goodsDao.sellike(title);
        return goods;
    }

    @Override
    public List<Goods> selAllByUser(String userid) {
        List<Goods> goods = goodsDao.selAllByUser(userid);
        return goods;
    }

    @Override
    public List<Goods> seldaizhifu(String userid) {
        List<Goods> goods = goodsDao.seldaizhifu(userid);
        return goods;
    }

    @Override
    public boolean zhifu(int id , String userid) {
        boolean hole1 = goodsDao.zhifu(id , userid);
        return hole1;
    }

    @Override
    public boolean tuifang(int id) {
        boolean hole1 = goodsDao.tuifang(id);
        return hole1;
    }

    @Override
    public boolean addgood(Goods goods) {
        boolean addgood = goodsDao.addgood(goods);
        return addgood;
    }
}
