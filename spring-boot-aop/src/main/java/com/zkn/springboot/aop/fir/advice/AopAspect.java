package com.zkn.springboot.aop.fir.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author zkn
 * @date 2018/9/2 21:47
 **/
@Aspect
@Component
public class AopAspect {

    @Before("execution(* com.zkn.springboot.aop.fir.service..*.*(..))")
    public void before() {
        System.out.println("前置通知被执行了！");
    }
}

