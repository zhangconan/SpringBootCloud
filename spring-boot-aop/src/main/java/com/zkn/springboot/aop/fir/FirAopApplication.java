package com.zkn.springboot.aop.fir;

import com.zkn.springboot.aop.fir.service.AopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author zkn
 * @date 2018/9/2 21:44
 **/
@SpringBootApplication
public class FirAopApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(FirAopApplication.class, args);
        AopService aopService = applicationContext.getBean(AopService.class);
        aopService.beforeInvoke();
    }
}
