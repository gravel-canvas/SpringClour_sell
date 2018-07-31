package com.canvas.product.service.impl;

import com.canvas.product.pojo.ProductCategory;
import com.canvas.product.repository.ProductCategoryRepository;
import com.canvas.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: 宗恣
 * @Date: 2018/7/26 0026 16:20
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
    }
}
