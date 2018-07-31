package com.canvas.order.handler;

import com.canvas.order.VO.ResultVO;
import com.canvas.order.exception.OrderException;
import com.canvas.order.utils.ResultVOUtil;
import feign.FeignException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author: 宗恣
 * @Date: 2018/7/30 0030 15:14
 */
@RestControllerAdvice
public class OrderExceptionHandler {

    @ExceptionHandler(value = FeignException.class)
    public ResultVO<OrderException> handlerOrderException(FeignException e) {
        return ResultVOUtil.error(e.status(), e.getMessage());
    }

}
