package com.canvas.order.controller;

import com.canvas.product.client.ProductClient;
import com.canvas.product.common.DecreaseStockInput;
import com.canvas.product.common.ProductInfoOutput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: 宗恣
 * @Date: 2018/7/30 0030 9:20
 */
@RestController
@Slf4j
public class ClientController {

//    @Autowired
//    private LoadBalancerClient loadBalancerClient;

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private ProductClient productClient;

    @RequestMapping("/getProductMsg")
    public String getProductMsg() {

        // 1.第一种(直接使用restTemplate, url写死)
        RestTemplate restTemplate = new RestTemplate();
//        String response = restTemplate.getForObject("http://localhost:8080/msg", String.class);

        // 2.第二种(利用loadBalancerClient通过应用名获取url, 然后再使用restTemplate)
//        ServiceInstance serviceInstance = loadBalancerClient.choose("PRODUCT");
//        String url = String.format("http://%s:%s", serviceInstance.getHost(), serviceInstance.getPort() + "/msg");
//        String response = restTemplate.getForObject(url, String.class);

        // 3.第三种(利用@LoadBalanced, 可在restTemplate里使用应用名字)
        String response = restTemplate.getForObject("http://PRODUCT/msg", String.class);


//        String response = productClient.productMsg();
//
//        log.info("response: {}", response);
        return null;
    }

    @GetMapping("/getProductList")
    public String getProductList() {
        List<ProductInfoOutput> productInfoList = productClient.listForOrder(Arrays.asList("987654", "456789"));
        log.info("response: {}", productInfoList);
        return "ok";
    }


    @GetMapping("/productDecreaseStock")
    public String productDecreaseStock() {
        productClient.decreaseStock(Arrays.asList(new DecreaseStockInput("456789", 2)));
        return "ok";
    }


}

