package com.zkn.springboot.web.analysis.jsonp.controller;

import com.zkn.springboot.web.analysis.common.result.PlainResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zkn
 * @date 2018/8/26 21:35
 **/
@RestController
@RequestMapping("jsonp")
public class JsonpController {

    @RequestMapping("test")
    public PlainResult<Map<String, String>> test() {
        PlainResult<Map<String, String>> plainResult = new PlainResult<>();
        Map<String, String> resultMap = new HashMap<>(2);
        resultMap.put("name", "zhangsan");
        resultMap.put("address", "李四");
        plainResult.setData(resultMap);
        plainResult.setSuccess(true);
        return plainResult;
    }
}
