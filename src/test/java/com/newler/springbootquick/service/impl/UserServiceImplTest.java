package com.newler.springbootquick.service.impl;

import com.newler.springbootquick.SpringBootQuickApplication;
import com.newler.springbootquick.service.UserService;
import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= SpringBootQuickApplication.class)
@EnableAutoConfiguration
class UserServiceImplTest {
    @Autowired
    public UserService userService;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getUser() {
        Assert.assertNotNull(userService.getUser(1));
    }
}