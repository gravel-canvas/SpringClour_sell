package com.canvas.product.enums;

import lombok.Getter;

/**
 * 商品上下架状态
 * @Author: 宗恣
 * @Date: 2018/7/26 0026 16:10
 */
@Getter
public enum ProductStatusEnum {

    UP(0, "在架"),
    DOWN(1, "下架"),

    ;


    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
