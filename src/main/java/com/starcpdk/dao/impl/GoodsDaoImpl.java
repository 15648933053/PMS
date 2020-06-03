package com.starcpdk.dao.impl;

import com.starcpdk.dao.GoodsDao;
import com.starcpdk.entity.Goods;
import com.starcpdk.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GoodsDaoImpl implements GoodsDao {
    @Override
    public List<Goods> selAllGoods(int idd) {

        String sql;
        Object[] params;

        params = new Object[]{idd};
        sql = "select * from goods where idd = ?";

        ResultSet rs = DBUtil.executeQuery(sql, params);

        List<Goods> goods = new ArrayList<>();

        System.out.println("我的查询结果....嘻嘻嘻嘻嘻嘻嘻嘻嘻嘻嘻嘻............是.........."+goods);
        if (rs != null) {
            try {
                while (rs.next()) {
                    Goods good = new Goods();
                    good.setId(rs.getInt("id"));
                    good.setIdd(rs.getInt("idd"));
                    good.setUserid(rs.getString("userid"));
                    good.setImageURL(rs.getString("imageURL"));
                    good.setPrice(rs.getInt("price"));
                    good.setDescc(rs.getString("descc"));
                    good.setTitle(rs.getString("title"));
                    good.setCodec(rs.getInt("codec"));
                    good.setGuige(rs.getInt("guige"));
                    good.setRenshu(rs.getInt("renshu"));
                    good.setPmswifi(rs.getString("pmswifi"));
                    good.setChuangguige(rs.getString("chuangguige"));
                    good.setZhifu(rs.getInt("zhifu"));
                    goods.add(good);
                }
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
        System.out.println("我的查询结果....ddd哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈.............是.........."+goods);
        return goods;
    }

    @Override
    public boolean dinggou(String userid, int id) {
        String sql;
        Object[] params;

        params = new Object[]{userid , id};
        sql = "update goods set userid = ? , codec = 1 where id = ?";

        Boolean dinggou = DBUtil.excuteUpdate(sql, params);
        return dinggou;
    }

    @Override
    public boolean addhole(int id) {
        String sql;
        Object[] params;

        params = new Object[]{id};
        sql = "update goods set hole = hole+1  where id = ?";

        Boolean hole = DBUtil.excuteUpdate(sql, params);
        return hole;
    }

    @Override
    public List<Goods> selallorder() {
        String sql;
        Object[] params;

        params = new Object[]{};
        sql = "select * from goods order by hole desc";

        ResultSet rs = DBUtil.executeQuery(sql, params);

        List<Goods> goods = new ArrayList<>();

        System.out.println("我的查询结果....嘻嘻嘻嘻嘻嘻嘻嘻嘻嘻嘻嘻............是.........."+goods);
        if (rs != null) {
            try {
                while (rs.next()) {
                    Goods good = new Goods();
                    good.setId(rs.getInt("id"));
                    good.setIdd(rs.getInt("idd"));
                    good.setUserid(rs.getString("userid"));
                    good.setImageURL(rs.getString("imageURL"));
                    good.setPrice(rs.getInt("price"));
                    good.setDescc(rs.getString("descc"));
                    good.setTitle(rs.getString("title"));
                    good.setCodec(rs.getInt("codec"));
                    good.setGuige(rs.getInt("guige"));
                    good.setRenshu(rs.getInt("renshu"));
                    good.setPmswifi(rs.getString("pmswifi"));
                    good.setChuangguige(rs.getString("chuangguige"));
                    good.setZhifu(rs.getInt("zhifu"));
                    goods.add(good);
                }
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
        System.out.println("我的查询结果....ddd哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈.............是.........."+goods);
        return goods;
    }

    @Override
    public List<Goods> sellike(String title) {
        String sql;
        Object[] params;

        params = new Object[]{title};
        sql = "select * from goods where title = ?";

        ResultSet rs = DBUtil.executeQuery(sql, params);

        List<Goods> goods = new ArrayList<>();

        System.out.println("我的查询结果....嘻嘻嘻嘻嘻嘻嘻嘻嘻嘻嘻嘻............是.........."+goods);
        if (rs != null) {
            try {
                while (rs.next()) {
                    Goods good = new Goods();
                    good.setId(rs.getInt("id"));
                    good.setIdd(rs.getInt("idd"));
                    good.setUserid(rs.getString("userid"));
                    good.setImageURL(rs.getString("imageURL"));
                    good.setPrice(rs.getInt("price"));
                    good.setDescc(rs.getString("descc"));
                    good.setTitle(rs.getString("title"));
                    good.setCodec(rs.getInt("codec"));
                    good.setGuige(rs.getInt("guige"));
                    good.setRenshu(rs.getInt("renshu"));
                    good.setPmswifi(rs.getString("pmswifi"));
                    good.setChuangguige(rs.getString("chuangguige"));
                    good.setZhifu(rs.getInt("zhifu"));
                    goods.add(good);
                }
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
        System.out.println("我的查询结果....ddd哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈.............是.........."+goods);
        return goods;
    }

    @Override
    public List<Goods> selAllByUser(String userid) {
        String sql;
        Object[] params;

        params = new Object[]{userid};
        sql = "select * from goods where userid = ?";

        ResultSet rs = DBUtil.executeQuery(sql, params);

        List<Goods> goods = new ArrayList<>();

        System.out.println("我的查询结果....嘻嘻嘻嘻嘻嘻嘻嘻嘻嘻嘻嘻............是.........."+goods);
        if (rs != null) {
            try {
                while (rs.next()) {
                    Goods good = new Goods();
                    good.setId(rs.getInt("id"));
                    good.setIdd(rs.getInt("idd"));
                    good.setUserid(rs.getString("userid"));
                    good.setImageURL(rs.getString("imageURL"));
                    good.setPrice(rs.getInt("price"));
                    good.setDescc(rs.getString("descc"));
                    good.setTitle(rs.getString("title"));
                    good.setCodec(rs.getInt("codec"));
                    good.setGuige(rs.getInt("guige"));
                    good.setRenshu(rs.getInt("renshu"));
                    good.setPmswifi(rs.getString("pmswifi"));
                    good.setChuangguige(rs.getString("chuangguige"));
                    good.setZhifu(rs.getInt("zhifu"));
                    goods.add(good);
                }
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
        System.out.println("我的查询结果....ddd哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈.............是.........."+goods);
        return goods;
    }

    @Override
    public List<Goods> seldaizhifu(String userid) {
        String sql;
        Object[] params;

        params = new Object[]{userid};
        sql = "select * from goods where userid = ? and zhifu = 0";

        ResultSet rs = DBUtil.executeQuery(sql, params);

        List<Goods> goods = new ArrayList<>();

        System.out.println("我的查询结果....嘻嘻嘻嘻嘻嘻嘻嘻嘻嘻嘻嘻............是.........."+goods);
        if (rs != null) {
            try {
                while (rs.next()) {
                    Goods good = new Goods();
                    good.setId(rs.getInt("id"));
                    good.setIdd(rs.getInt("idd"));
                    good.setUserid(rs.getString("userid"));
                    good.setImageURL(rs.getString("imageURL"));
                    good.setPrice(rs.getInt("price"));
                    good.setDescc(rs.getString("descc"));
                    good.setTitle(rs.getString("title"));
                    good.setCodec(rs.getInt("codec"));
                    good.setGuige(rs.getInt("guige"));
                    good.setRenshu(rs.getInt("renshu"));
                    good.setPmswifi(rs.getString("pmswifi"));
                    good.setChuangguige(rs.getString("chuangguige"));
                    good.setZhifu(rs.getInt("zhifu"));
                    goods.add(good);
                }
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
        System.out.println("我的查询结果....ddd哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈.............是.........."+goods);
        return goods;
    }

    @Override
    public boolean zhifu(int id , String userid) {
        String sql;
        Object[] params;

        params = new Object[]{userid , id};
        sql = "update goods set zhifu = 1 , userid = ? , codec = 1 where id = ?";

        Boolean hole = DBUtil.excuteUpdate(sql, params);
        return hole;
    }

    @Override
    public boolean tuifang(int id) {
        String sql;
        Object[] params;

        String s = null;
        params = new Object[]{s , id};
        sql = "update goods set zhifu = 0 , codec = 0 , userid = ?  where id = ?";

        Boolean hole = DBUtil.excuteUpdate(sql, params);
        return hole;
    }

    @Override
    public boolean addgood(Goods goods) {
        String sql;
        Object[] params;

        params = new Object[] {goods.getIdd() , goods.getImageURL() , goods.getPrice() , goods.getDescc() , goods.getTitle() , goods.getGuige() , goods.getRenshu() , goods.getPmswifi() , goods.getChuangguige()};

        sql = "insert into goods (idd , imageURL , price , descc , title , guige , renshu , pmswifi , chuangguige) values(? , ? , ? , ? , ? , ? , ? , ? , ?) ";
        System.out.println(params);
        boolean result = DBUtil.excuteUpdate(sql, params);
        return result;
    }
}
