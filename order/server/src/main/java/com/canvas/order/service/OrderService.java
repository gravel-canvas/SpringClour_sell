package com.canvas.order.service;

import com.canvas.order.dto.OrderDTO;

/**
 * @Author: 宗恣
 * @Date: 2018/7/3 0003 16:39
 */
public interface OrderService {

    /** 创建订单*/
    OrderDTO create(OrderDTO orderDTO);

}
