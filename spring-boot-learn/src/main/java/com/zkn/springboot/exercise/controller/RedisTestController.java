package com.zkn.springboot.exercise.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zkn on 2016/8/15.
 */
@RestController
@RequestMapping("/redis")
public class RedisTestController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/putStringkey.do")
    public String putString(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
        return "保存成功";
    }

    @RequestMapping("/getStringkey.do")
    public String getString(@RequestParam String key) {

        return stringRedisTemplate.opsForValue().get(key);
    }
}
