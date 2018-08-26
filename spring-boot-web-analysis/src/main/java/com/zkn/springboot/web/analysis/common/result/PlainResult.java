package com.zkn.springboot.web.analysis.common.result;

/**
 * @author zkn
 * @date 2018/8/26 21:51
 **/
public class PlainResult<T> extends BaseResult {

    private static final long serialVersionUID = 1710288088960490633L;
    /**
     * 结果集
     */
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
