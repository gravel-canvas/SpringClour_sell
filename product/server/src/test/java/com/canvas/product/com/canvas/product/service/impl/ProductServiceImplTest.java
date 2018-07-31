package com.canvas.product.com.canvas.product.service.impl;

import com.canvas.product.ProductApplicationTests;
import com.canvas.product.common.DecreaseStockInput;
import com.canvas.product.pojo.ProductInfo;
import com.canvas.product.service.ProductService;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: 宗恣
 * @Date: 2018/7/26 0026 16:13
 */
@Component
public class ProductServiceImplTest extends ProductApplicationTests {

    @Autowired
    private ProductService productService;

    @Test
    public void findUpAll() {
        List<ProductInfo> list = productService.findUpAll();
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void findList() {
        List<ProductInfo> list = productService.findList(Arrays.asList("123456", "132456"));
        Assert.assertTrue(list.size() > 0);
    }

    @Test
    public void decreaseStock() {
        DecreaseStockInput cartDTO = new DecreaseStockInput("987654", 2);
//        CartDTO cartDTO2 = new CartDTO("456789", 98);
        productService.decreaseStock(Arrays.asList(cartDTO));
    }

}