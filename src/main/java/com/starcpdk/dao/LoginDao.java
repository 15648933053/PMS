package com.starcpdk.dao;

import com.starcpdk.entity.User;

public interface LoginDao {
    public User selLogin(String userid);

    public boolean insLogin(User user);
}
