package com.zkn.spring.dubbo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by zkn on 2017/11/2.
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:spring/dubbo/provider/service-dubbo-provider.xml"})
public class StartApplication {

    public static void main(String[] args) {

        SpringApplication.run(StartApplication.class, args);
    }
}
