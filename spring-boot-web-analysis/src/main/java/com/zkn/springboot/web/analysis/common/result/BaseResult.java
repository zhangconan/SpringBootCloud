package com.zkn.springboot.web.analysis.common.result;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author zkn
 * @date 2018/8/26 21:44
 **/
@Getter
@Setter
@ToString
public class BaseResult implements Serializable {

    private static final long serialVersionUID = 6851166506546276993L;
    /**
     * code码
     */
    private String code;
    /**
     * 错误信息
     */
    private String message;
    /**
     * 请求成功标识
     */
    private boolean success;
}
