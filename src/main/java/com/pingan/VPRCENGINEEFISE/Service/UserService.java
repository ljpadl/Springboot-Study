package com.pingan.VPRCENGINEEFISE.Service;

import com.pingan.VPRCENGINEEFISE.Entity.User;

import java.util.List;

public interface UserService {
    int insert(User record);
    List<User> selectUsers();
}
