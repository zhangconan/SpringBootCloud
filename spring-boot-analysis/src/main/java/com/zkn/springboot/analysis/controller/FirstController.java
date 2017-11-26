package com.zkn.springboot.analysis.controller;/**
 * Created by zkn on 2017/11/26.
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zkn
 * @date 2017/11/26 22:45
 */
@RestController
public class FirstController {

    @RequestMapping("index")
    public String index() {
        return "success";
    }
}
