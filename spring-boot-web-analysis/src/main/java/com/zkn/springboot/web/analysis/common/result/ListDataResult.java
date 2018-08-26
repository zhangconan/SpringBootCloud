package com.zkn.springboot.web.analysis.common.result;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author zkn
 * @date 2018/8/26 21:45
 **/
@Getter
@Setter
@ToString(callSuper = true)
public class ListDataResult<T> extends BaseResult {

    private static final long serialVersionUID = 7993336472346861323L;
    /**
     * 结果集
     */
    private List<T> data;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
