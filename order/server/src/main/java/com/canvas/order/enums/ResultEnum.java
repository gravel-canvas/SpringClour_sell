package com.canvas.order.enums;

import lombok.Getter;

/**
 * @Author: 宗恣
 * @Date: 2018/7/27 17:32
 */
@Getter
public enum ResultEnum {

    PARAM_ERROR(1, "参数不正确"),

    CART_EMPTY(2, "购物车为空"),


    ;


    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
