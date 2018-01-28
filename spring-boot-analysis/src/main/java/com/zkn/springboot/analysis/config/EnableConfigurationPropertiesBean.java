package com.zkn.springboot.analysis.config;

import com.zkn.springboot.analysis.domain.EnableConfigurationPropertiesDomain;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 *
 * @author zkn
 * @date 2018/1/28
 */
@Component
@EnableConfigurationProperties(value = EnableConfigurationPropertiesDomain.class)
public class EnableConfigurationPropertiesBean {

}
