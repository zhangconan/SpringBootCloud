package com.zkn.springboot.analysis.controller;

import com.zkn.springboot.analysis.domain.EnableConfigurationPropertiesDomain;
import com.zkn.springboot.analysis.domain.PersonInfoDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zkn
 * @date 2017/11/26 22:45
 */
@RestController
public class FirstController {

    /**
     * 用户配置信息
     */
    @Autowired
    private PersonInfoDomain personInfoDomain;
    @Autowired
    private EnableConfigurationPropertiesDomain propertiesDomain;

    @RequestMapping("index")
    public String index() {
        System.out.println(propertiesDomain);
        return "success";
    }
}
