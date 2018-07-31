package com.canvas.product.common;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品
 * @Author: 宗恣
 * @Date: 2018/6/22 12:42
 */
@Data
public class ProductInfoOutput {

    /** 产品ID*/
    private String      productId;

    /** 商品名称*/
    private String      productName;

    /** 价格*/
    private BigDecimal productPrice;

    /** 库存*/
    private Integer     productStock;

    /** 描述*/
    private String      productDescription;

    /** 小图*/
    private String      productIcon;

    /** 商品状态，0：正常 1：下架*/
    private Integer     productStatus;

    /** 类目编号*/
    private Integer      categoryType;

}
