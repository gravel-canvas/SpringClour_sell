package com.canvas.order.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * @Author: 宗恣
 * @Date: 2018/8/1 0001 11:41
 */
@Data
@ConfigurationProperties(prefix = "girl")
@Component
@RefreshScope
public class GirlConfig {

    private String name;

    private Integer age;

}
