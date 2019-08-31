package com.pingan.VPRCENGINEEFISE.ServiceImpl;

import com.github.pagehelper.PageHelper;
import com.pingan.VPRCENGINEEFISE.Dao.UserDao;
import com.pingan.VPRCENGINEEFISE.Entity.User;
import com.pingan.VPRCENGINEEFISE.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public int insert(User record) {
        System.out.println("UserServiceImpl insert start");
        return userDao.insert(record);
    }

    @Override
    public List<User> selectUsers() {
        System.out.println("UserServiceImpl selectUsers start");
        PageHelper.startPage(1,3);
        return userDao.selectUsers();
    }
}

