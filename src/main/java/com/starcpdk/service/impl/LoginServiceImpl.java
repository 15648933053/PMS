package com.starcpdk.service.impl;

import com.starcpdk.dao.LoginDao;
import com.starcpdk.dao.impl.LoginDaoImpl;
import com.starcpdk.entity.User;
import com.starcpdk.service.LoginService;

public class LoginServiceImpl implements LoginService {

    LoginDao loginDao = new LoginDaoImpl();
    @Override
    public User selLogin(String userid) {
        User user = loginDao.selLogin(userid);
        return user;
    }

    @Override
    public boolean insLogin(User user) {
        boolean count = loginDao.insLogin(user);
        return count;
    }
}
