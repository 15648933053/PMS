package com.starcpdk.dao.impl;

import com.starcpdk.dao.PMSDao;
import com.starcpdk.entity.Goods;
import com.starcpdk.entity.PMS;
import com.starcpdk.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PMSDaoImpl implements PMSDao {

    @Override
    public boolean updpms(PMS pms) {
        String sql;
        Object[] params;

        String s = null;
        params = new Object[]{pms.getPhone() , pms.getHolename() , pms.getWifiname()};
        sql = "update pms set phone = ? , holename = ? , wifiname = ?";

        Boolean updpms = DBUtil.excuteUpdate(sql, params);
        return updpms;
    }

    @Override
    public PMS selPms() {
        String sql;
        Object[] params;

        params = new Object[]{};
        sql = "select * from pms";

        ResultSet rs = DBUtil.executeQuery(sql, params);

        PMS pms = new PMS();

        if (rs != null) {
            try {
                while (rs.next()) {
                    pms.setWifiname(rs.getString("wifiname"));
                    pms.setPhone(rs.getString("phone"));
                    pms.setHolename(rs.getString("holename"));
                    return pms;
                }
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }
}
