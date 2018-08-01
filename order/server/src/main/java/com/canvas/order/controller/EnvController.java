package com.canvas.order.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 宗恣
 * @Date: 2018/8/1 0001 9:31
 */
@RestController
@RefreshScope
public class EnvController {

    @Value("${env}")
    private String env;

    @GetMapping("env")
    public String env() {
        return env;
    }

}
