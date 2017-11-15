package com.zkn.spring.dubbo.controller;

import com.zkn.spring.shared.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zkn on 2017/11/3.
 */
@RestController
@RequestMapping("/userInfo")
public class UserInfoController {

    @Autowired
    private UserService userService;

    /**
     *
     *获取用户信息
     * @return
     */
    @RequestMapping("/getUserName")
    public String getUserName() {
        return userService.getUserName();
    }
}
