package com.newler.springbootquick.service.impl;

import com.newler.springbootquick.dao.UserDao;
import com.newler.springbootquick.pojo.User;
import com.newler.springbootquick.service.UserService;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


@Service
public class UserServiceImpl implements UserService {
    @Resource
    public UserDao userDao;

    @Override
    public User getUser(Integer id) {
        return userDao.selectByPrimaryKey(id);
    }
}
