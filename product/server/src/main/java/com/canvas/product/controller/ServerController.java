package com.canvas.product.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 宗恣
 * @Date: 2018/7/30 0030 9:18
 */
@RestController
public class ServerController {

    @RequestMapping("/msg")
    public String msg() {
        return "我是产品";
    }


}
