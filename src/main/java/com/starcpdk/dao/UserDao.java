package com.starcpdk.dao;

import com.starcpdk.entity.User;

public interface UserDao {
    public User selUser(String userid);
    public boolean updUser(User user);
}
