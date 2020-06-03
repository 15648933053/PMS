package com.starcpdk.service;

import com.starcpdk.entity.User;

public interface LoginService {
    public User selLogin(String userid);
    public boolean insLogin(User user);
}
