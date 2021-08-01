package com.example.mybatisspringboot.service;

import com.example.mybatisspringboot.bean.User;
import com.example.mybatisspringboot.dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 软件工程10班 吕俊铭
 * @create 2021-07-31 0:42
 * Description:
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User findOneUser(int index){
        User user = userMapper.getUser(index);
        return user;
    }
    public void addUser(User user){
        userMapper.addUser(user);
        System.out.println("插入了一条人");
    }
    public void deleteUser(Integer id){
        userMapper.deleteUserByID(id);
    }
}
