package com.starcpdk.service.impl;

import com.starcpdk.dao.UserDao;
import com.starcpdk.dao.impl.UserDaoImpl;
import com.starcpdk.entity.User;
import com.starcpdk.service.UserService;

public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();

    @Override
    public User selUser(String userid) {
        User user = userDao.selUser(userid);
        return user;
    }

    @Override
    public boolean updUser(User user) {
        boolean updUser = userDao.updUser(user);
        return updUser;
    }
}
