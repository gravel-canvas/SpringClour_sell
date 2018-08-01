package com.canvas.order.controller;

import com.canvas.order.config.GirlConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 宗恣
 * @Date: 2018/8/1 0001 11:42
 */
@RestController
public class GirlController {

    @Autowired
    private GirlConfig girlConfig;

    @GetMapping("/girl/print")
    public String print() {
        return "name: " + girlConfig.getName() + ", age:" + girlConfig.getAge();
    }

}
