package com.canvas.product.service;

import com.canvas.product.pojo.ProductCategory;

import java.util.List;

/**
 * @Author: 宗恣
 * @Date: 2018/7/26 0026 16:16
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
