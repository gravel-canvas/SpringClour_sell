package com.canvas.order.VO;

import lombok.Data;

/**
 * @Author: 宗恣
 * @Date: 2018/7/27 21:36
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String message;

    private T data;

}
