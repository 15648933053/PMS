package com.starcpdk.service;

import com.starcpdk.entity.User;

public interface UserService {
    public User selUser(String userid);
    public boolean updUser(User user);
}
