package com.canvas.order.com.canvas.order.repository;

import com.canvas.order.OrderApplicationTests;
import com.canvas.order.pojo.OrderDetail;
import com.canvas.order.repository.OrderDetailRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import static org.junit.Assert.assertTrue;

/**
 * @Author: 宗恣
 * @Date: 2018/7/27 0027 13:48
 */
@Component
public class OrderDetailRepositoryTest extends OrderApplicationTests {

    @Autowired
    private OrderDetailRepository orderDetailRepository;

    @Test
    public void tsetSave() {
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setOrderId("123456");
        orderDetail.setDetailId("12");
        orderDetail.setProductId("123456");
        orderDetail.setProductIcon("http://images.cad.com.cn/2018/0707/thumb_375_250_1530923715466.jpg");
        orderDetail.setProductName("椰子");
        orderDetail.setProductPrice(new BigDecimal(2.30));
        orderDetail.setProductQuantity(2);


        OrderDetail result = orderDetailRepository.save(orderDetail);
        assertTrue(null != result);
    }


}