package com.zkn.spring.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by zkn on 2017/11/3.
 */
@SpringBootApplication
@ImportResource(locations = "classpath:dubbo/consumer/dubbo-consumer.xml")
public class StartConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartConsumerApplication.class, args);
    }
}
