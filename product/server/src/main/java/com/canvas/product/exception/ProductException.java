package com.canvas.product.exception;

import com.canvas.product.enums.ResultEnum;

/**
 * @Author: 宗恣
 * @Date: 2018/7/30 0030 13:19
 */
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }
}
