package com.canvas.order.dto;

import lombok.Data;

/**
 * @Author: 宗恣
 * @Date: 2018/7/30 0030 13:09
 */
@Data
public class CartDTO {

    /** 商品ID*/
    private String productId;

    /** 商品数量*/
    private Integer productQuantity;

    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
