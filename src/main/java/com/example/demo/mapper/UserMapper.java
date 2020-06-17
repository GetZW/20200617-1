package com.example.demo.mapper;

import com.example.demo.bean.UserInfo;
import org.springframework.stereotype.Repository;

   public interface UserMapper{
       UserInfo getInfo(String name, String age);
    }

