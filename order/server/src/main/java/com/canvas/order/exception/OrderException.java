package com.canvas.order.exception;

import com.canvas.order.enums.ResultEnum;
import lombok.Getter;

/**
 * @Author: 宗恣
 * @Date: 2018/7/27 17:30
 */
@Getter
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code, String message) {
        super(message);

        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }


}
