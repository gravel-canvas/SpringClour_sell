package com.canvas.product.service;

import com.canvas.product.common.DecreaseStockInput;
import com.canvas.product.pojo.ProductInfo;

import java.util.List;

/**
 * @Author: 宗恣
 * @Date: 2018/7/26 0026 16:06
 */
public interface ProductService {

    /** 查询所有在架商品列表*/
    List<ProductInfo> findUpAll();

    /** 查询商品列表*/
    List<ProductInfo> findList(List<String> productIdList);

    /** 扣库存*/
    void decreaseStock(List<DecreaseStockInput> cartDTOList);

}
