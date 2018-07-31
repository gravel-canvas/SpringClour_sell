package com.canvas.product.common;

import lombok.Data;

/**
 * 减库存入参
 * @Author: 宗恣
 * @Date: 2018/7/30 0030 13:09
 */
@Data
public class DecreaseStockInput {

    /** 商品ID*/
    private String productId;

    /** 商品数量*/
    private Integer productQuantity;

    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
