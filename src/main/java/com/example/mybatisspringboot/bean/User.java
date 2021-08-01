package com.example.mybatisspringboot.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author 软件工程10班 吕俊铭
 * @create 2021-07-31 0:31
 * Description:
 */
@Data
@AllArgsConstructor
public class User {
    private Integer id;
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public User() {
    }
}
