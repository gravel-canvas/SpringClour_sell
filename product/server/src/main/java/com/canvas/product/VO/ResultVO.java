package com.canvas.product.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @Author: 宗恣
 * @Date: 2018/7/26 0026 16:26
 */
@Data
public class ResultVO<T> {

    /** 错误码*/
    private Integer code;

    /** 提示信息*/
    private String message;

    /** 具体内容*/
    private T data;

}
