package com.canvas.product.com.canvas.product.com.canvas.product.repository;

import com.canvas.product.pojo.ProductCategory;
import com.canvas.product.repository.ProductCategoryRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: 宗恣
 * @Date: 2018/7/26 0026 16:02
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> list = repository.findByCategoryTypeIn(Arrays.asList(1,2));
        Assert.assertTrue(list.size() > 0);
    }



}