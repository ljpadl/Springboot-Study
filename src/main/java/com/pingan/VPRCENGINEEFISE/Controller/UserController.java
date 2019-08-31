package com.pingan.VPRCENGINEEFISE.Controller;

import com.github.pagehelper.PageInfo;
import com.pingan.VPRCENGINEEFISE.Entity.User;
import com.pingan.VPRCENGINEEFISE.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user) {
        userService.insert(user);
    }

    @GetMapping("/getUsers")
    public PageInfo<User> getUsers() {
        List<User> users = userService.selectUsers();
        PageInfo<User> here = new PageInfo<>(users);
        return here;



    }

}
