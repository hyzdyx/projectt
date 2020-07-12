package com.cdrail.service.controller;


import com.cdrail.common_util.RetResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("user/")
public class UserLogin {

    private RetResult retResult;
    @RequestMapping("/login")
    public RetResult login(){
        retResult = new RetResult();
        retResult.setCode(20000);
        Map map = new HashMap();
        map.put("username", "username");
        map.put("password", "hyzdyx");
        retResult.setData(map);
        return retResult;
    }

    @RequestMapping("/info")
    public RetResult info(){
        retResult = new RetResult();
        retResult.setCode(20000);
        Map map = new HashMap();
        map.put("token", "wuyuing");
        map.put("password", "hyzdyx");
        map.put("roles", "[admin]");
        map.put("name", "wuyu");
        map.put("avatar", "http://img1.imgtn.bdimg.com/it/u=2303417984,2128545381&fm=26&gp=0.jpg");
        retResult.setData(map);
        return retResult;
    }
}
