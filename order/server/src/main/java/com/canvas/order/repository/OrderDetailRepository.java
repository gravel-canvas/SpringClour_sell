package com.canvas.order.repository;

import com.canvas.order.pojo.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: 宗恣
 * @Date: 2018/7/27 0027 9:37
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
}
