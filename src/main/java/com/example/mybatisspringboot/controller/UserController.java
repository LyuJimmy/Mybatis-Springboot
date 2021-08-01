package com.example.mybatisspringboot.controller;

import com.example.mybatisspringboot.bean.User;
import com.example.mybatisspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author 软件工程10班 吕俊铭
 * @create 2021-07-31 0:39
 * Description:
 */
@RestController
public class UserController {
    @Resource
    UserService userService;
    @GetMapping("/hello/{id}")
    public String queryUser(@PathVariable Integer id){

        User oneUser = userService.findOneUser(id);

        return oneUser.toString();
    }
    @GetMapping("/put/{name}/{age}")
    public String addUser(@PathVariable String name,@PathVariable Integer age){
        User user = new User(name,age);
        userService.addUser(user);
        return "成功卡!!";
    }
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
        return "I kill the id of"+id;

    }

}
