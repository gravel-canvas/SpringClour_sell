package com.canvas.order.com.canvas.order.repository;

import com.canvas.order.OrderApplicationTests;
import com.canvas.order.enums.OrderStatusEnum;
import com.canvas.order.enums.PayStatusEnum;
import com.canvas.order.pojo.OrderMaster;
import com.canvas.order.repository.OrderMasterRepository;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * @Author: 宗恣
 * @Date: 2018/7/27 0027 13:36
 */
@Component
public class OrderMasterRepositoryTest extends OrderApplicationTests {

    @Autowired
    private OrderMasterRepository orderMasterRepository;

    @Test
    public void testSave() {
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("123456");
        orderMaster.setBuyerName("粽子");
        orderMaster.setBuyerPhone("12345678911");
        orderMaster.setBuyerAddress("在人间");
        orderMaster.setBuyerOpenid("110120119");
        orderMaster.setOrderAmount(new BigDecimal(3.22));
        orderMaster.setOrderStatus(OrderStatusEnum.NEW.getCode());
        orderMaster.setPayStatus(PayStatusEnum.WAIT.getCode());


        OrderMaster result = orderMasterRepository.save(orderMaster);
        Assert.assertTrue( null != result);
    }


}