package com.canvas.order.dto;

import com.canvas.order.pojo.OrderDetail;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Author: 宗恣
 * @Date: 2018/7/3 0003 16:48
 */
@Data
// @JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDTO {

    /** 订单ID*/
    private String  orderId;

    /** 买家名字*/
    private String  buyerName;

    /** 买家手机号*/
    private String  buyerPhone;

    /** 买家地址*/
    private String  buyerAddress;

    /** 买家微信Openid*/
    private String  buyerOpenid;

    /** 订单总金额*/
    private BigDecimal orderAmount;

    /** 订单状态,默认为新下单*/
    private Integer orderStatus;

    /** 支付状态,默认是0：未支付 1：已支付*/
    private Integer payStatus;

    /** 创建时间*/
    private Date createTime;

    /** 更新时间*/
    private Date  updateTime;

    /** 购物车*/
    private List<OrderDetail> orderDetailList;

}
