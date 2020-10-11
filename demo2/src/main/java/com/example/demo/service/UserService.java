package com.example.demo.service;

import com.example.demo.bean.User;
import com.example.demo.dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    public User getById(int id) {
        return userMapper.selectById(id);
    }
}
