package com.zkn.springboot.web.analysis.jsonp.config;

import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.AbstractJsonpResponseBodyAdvice;

import java.nio.charset.Charset;

/**
 * 不推荐的做法
 *
 * @author zkn
 * @date 2018/8/26 21:29
 **/
@ControllerAdvice(basePackages = "com.zkn.springboot.web.analysis.jsonp.controller")
public class JsonpAdvice extends AbstractJsonpResponseBodyAdvice {

    public JsonpAdvice() {
        super("callback", "jsonp");
    }

    /**
     * 此方法是解决 jsonp中文乱码
     *
     * @param contentType
     * @param request
     * @param response
     * @return
     */
    @Override
    protected MediaType getContentType(MediaType contentType, ServerHttpRequest request, ServerHttpResponse response) {
        return new MediaType("application", "javascript", Charset.forName("UTF-8"));
    }
}
