package com.starcpdk.dao.impl;

import com.starcpdk.dao.LoginDao;
import com.starcpdk.entity.User;
import com.starcpdk.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDaoImpl implements LoginDao {
    @Override
    public User selLogin(String userid) {

        String sql = "select * from user where userid = ?";
        Object[] params = new Object[]{userid};

        ResultSet rs = DBUtil.executeQuery(sql, params);

        User user = new User();
        System.out.println("上边的user值"+user);

        if (rs != null){
            try {
                while (rs.next()) {
                    user.setId(rs.getInt("id"));
                    user.setUserId(rs.getString("userid"));
                    user.setUserName(rs.getString("username"));
                    user.setPhone(rs.getString("phone"));
                    user.setFaceUrl(rs.getString("face_url"));
                    user.setIdentify(rs.getString("identify"));
                    return user;
                }
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }
        return null;
    }

    @Override
    public boolean insLogin(User user) {
        // TODO Auto-generated method stub
        String sql;
        Object[] params;

        System.out.println(user.getUserId()+user.getUserName());
        params = new Object[] {user.getUserId() , user.getUserName() , user.getPhone() , user.getFaceUrl() , user.getIdentify()};

        sql = "insert into user (userid , username , phone , face_url , identify) values(? , ? , ? , ? , ?) ";
        System.out.println(params);
        boolean result = DBUtil.excuteUpdate(sql, params);
        return result;
    }
}
