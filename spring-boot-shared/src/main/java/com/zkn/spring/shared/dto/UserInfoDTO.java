package com.zkn.spring.shared.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created by zkn on 2017/11/2.
 */
@Getter
@Setter
@ToString
public class UserInfoDTO implements Serializable {

    private static final long serialVersionUID = -2419695620432080962L;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 地址
     */
    private String address;
    /**
     * 年龄
     */
    private Integer age;
}
