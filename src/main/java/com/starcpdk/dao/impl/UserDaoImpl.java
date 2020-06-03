package com.starcpdk.dao.impl;

import com.starcpdk.dao.UserDao;
import com.starcpdk.entity.User;
import com.starcpdk.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

    @Override
    public User selUser(String userid) {
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
    public boolean updUser(User user) {
        System.out.println("updateUser的daoimpl层上边边的代码传入的值" + user);

        String sql;
        Object[] params;

        params = new Object[]{user.getUserName() , user.getPhone() , user.getFaceUrl() , user.getIdentify() , user.getUserId()};
        sql = "update user set username = ? , phone = ? , face_url = ? , identify = ? where userid = ?";

        Boolean upduser = DBUtil.excuteUpdate(sql, params);
        System.out.println("updateUser的daoimpl层下边的代码返回值" + upduser);
        return upduser;
    }
}
