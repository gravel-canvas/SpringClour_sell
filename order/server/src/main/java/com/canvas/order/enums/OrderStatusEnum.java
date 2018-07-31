package com.canvas.order.enums;

import lombok.Getter;

/**
 * @Author: 宗恣
 * @Date: 2018/7/27 0027 9:50
 */
@Getter
public enum  OrderStatusEnum {

    NEW(0, "新订单"),

    FINISHED(1, "完结"),

    CANCEL(2, "取消"),

    ;


    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
