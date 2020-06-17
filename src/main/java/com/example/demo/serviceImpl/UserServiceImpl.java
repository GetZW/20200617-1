package com.example.demo.serviceImpl;

import com.example.demo.bean.UserInfo;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements com.example.demo.service.UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserInfo loginIn(String name, String age) {
        return userMapper.getInfo(name, age);
    }
}
