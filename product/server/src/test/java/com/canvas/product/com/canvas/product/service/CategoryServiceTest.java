package com.canvas.product.com.canvas.product.service;

import com.canvas.product.ProductApplicationTests;
import com.canvas.product.pojo.ProductCategory;
import com.canvas.product.service.CategoryService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * @Author: 宗恣
 * @Date: 2018/7/26 0026 16:23
 */
@Component
public class CategoryServiceTest extends ProductApplicationTests {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(1, 2));
        assertTrue(list.size() > 0);
    }
}