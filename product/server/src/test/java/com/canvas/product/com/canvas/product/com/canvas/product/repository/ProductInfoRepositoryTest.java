package com.canvas.product.com.canvas.product.com.canvas.product.repository;

import com.canvas.product.pojo.ProductInfo;
import com.canvas.product.repository.ProductInfoRepository;
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
 * @Date: 2018/7/26 0026 15:53
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;


    @Test
    public void findByProductStatus() {

        List<ProductInfo> list = repository.findByProductStatus(0);
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void findByProductIdIn() {
        List<ProductInfo> list = repository.findByProductIdIn(Arrays.asList("123456", "132456"));
        Assert.assertTrue(list.size() > 0);
    }


}