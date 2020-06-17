package com.example.demo.controller;

import com.example.demo.bean.UserInfo;
import com.example.demo.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
@Autowired
private UserService userService;

    @RequestMapping("/login")
    public String show(){
        return "login";
    }
  @RequestMapping(value = "/loginIn" ,method = RequestMethod.POST)
    public String loginIn(String name,String age){
        UserInfo userInfo=userService.loginIn(name,age);
        if(userInfo!=null){
            return "success";
        }else{
            return "error";
        }
    }
}
