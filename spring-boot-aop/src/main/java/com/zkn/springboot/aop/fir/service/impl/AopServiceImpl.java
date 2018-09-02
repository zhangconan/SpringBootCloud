package com.zkn.springboot.aop.fir.service.impl;

import com.zkn.springboot.aop.fir.service.AopService;
import org.springframework.stereotype.Service;

/**
 * @author zkn
 * @date 2018/9/2 21:50
 **/
@Service
public class AopServiceImpl implements AopService {

    /**
     * 前置执行的测试
     */
    @Override
    public void beforeInvoke() {
        System.out.println("我是前置通知，我被执行了!");
    }
}
