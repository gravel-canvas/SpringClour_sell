package com.canvas.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 宗恣
 * @Date: 2018/7/31 21:34
 */
@RestController
public class EnvController {

    @Value("${env}")
    private String env;

    @GetMapping("/print")
    public String print() {
        return env;
    }

}
