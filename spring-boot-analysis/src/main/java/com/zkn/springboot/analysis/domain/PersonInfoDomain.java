package com.zkn.springboot.analysis.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author zkn
 * @date 2018/1/7 14:36
 */
@Component
@ConfigurationProperties(prefix ="person.info")
public class PersonInfoDomain {
    /**
     * 用户名
     */
    private String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "PersonInfoDomain{" +
                "userName='" + userName + '\'' +
                '}';
    }
}
