package com.canvas.order.utils;

import java.util.Random;

/**
 * @Author: 宗恣
 * @Date: 2018/7/27 0027 14:48
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式：时间 + 随机数
     */
    public static synchronized String getUniqueKey() {
        Random random = new Random();
        Integer number = random.nextInt(9000000) + 100000;

        return new StringBuffer(String.valueOf(System.currentTimeMillis())).append(number).toString();
    }

}










