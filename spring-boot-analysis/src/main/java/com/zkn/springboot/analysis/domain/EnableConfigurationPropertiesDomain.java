package com.zkn.springboot.analysis.domain;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

/**
 * @author zkn
 * @date 2018/1/28
 */
@ConfigurationProperties(prefix = "configuration.properties")
public class EnableConfigurationPropertiesDomain implements Serializable {

    private static final long serialVersionUID = -3485524455817230192L;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EnableConfigurationPropertiesDomain{" +
                "name='" + name + '\'' +
                '}';
    }
}
