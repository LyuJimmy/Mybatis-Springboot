package com.example.mybatisspringboot;

import com.example.mybatisspringboot.bean.User;
import com.example.mybatisspringboot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
@Slf4j
@SpringBootTest
class MybatisSpringbootApplicationTests {
    @Resource
    UserService userService;

    //AOP Before
    @BeforeEach
    private void before(){
        log.info("测试开始-------------------");
    }
    @AfterEach
    private void after(){
        System.out.println("测试结束----------------------------");
    }

    @Test
    void contextLoads() {
    }
    @Test
    void Test01() {
        User user = userService.findOneUser(2);
        log.info(user.toString());
    }

}
