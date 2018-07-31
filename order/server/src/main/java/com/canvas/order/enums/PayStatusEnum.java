package com.canvas.order.enums;

import lombok.Getter;

/**
 * @Author: 宗恣
 * @Date: 2018/7/27 0027 10:03
 */
@Getter
public enum PayStatusEnum {

    WAIT(0, "等待支付"),

    SUCCESS(1, "支付成功"),

    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
