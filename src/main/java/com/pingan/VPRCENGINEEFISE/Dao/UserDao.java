package com.pingan.VPRCENGINEEFISE.Dao;

import com.pingan.VPRCENGINEEFISE.Entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    int insert(User record);
    List<User> selectUsers();
}
