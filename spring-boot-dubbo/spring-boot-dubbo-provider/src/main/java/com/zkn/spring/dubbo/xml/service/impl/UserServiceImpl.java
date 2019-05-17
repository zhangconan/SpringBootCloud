package com.zkn.spring.dubbo.xml.service.impl;

import com.zkn.spring.shared.service.UserService;
import org.springframework.stereotype.Service;

/**
 * Created by zkn on 2017/11/2.
 */
@Service
public class UserServiceImpl implements UserService {

    /**
     * 获取用户名
     *
     * @return
     */
    @Override
    public String getUserName() {
        System.out.println("我被调用了。。。。");
        return "我是张三";
    }
}
