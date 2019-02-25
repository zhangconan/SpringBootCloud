package com.zkn.spring.dubbo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 *
 * @author zkn
 * @date 2017/11/3
 */
@SpringBootApplication
@ImportResource(locations = "dubbo/consumer/dubbo-consumer.xml")
public class StartConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartConsumerApplication.class, args);
    }
}
