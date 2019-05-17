package com.zkn.spring.dubbo.xml;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author zkn
 * @date 2017/11/2
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:dubbo/provider/dubbo-provider.xml"})
public class StartApplication {

    public static void main(String[] args) {

        SpringApplication.run(StartApplication.class, args);
    }
}
