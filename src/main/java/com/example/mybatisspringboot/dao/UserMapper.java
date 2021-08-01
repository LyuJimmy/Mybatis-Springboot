package com.example.mybatisspringboot.dao;

import com.example.mybatisspringboot.bean.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author JIMMY
 */
@Component
public interface UserMapper {
    /**
     * fetch data by rule id
     *      *
     *      * @param ruleId rule id
     *      * @param page page number
     *      * @param jsonContext json format context
     *      * @return Result<XxxxDO>
     *      */
    User getUser(Integer id);
    void addUser(User user);
    void deleteUserByID(Integer id);

}
