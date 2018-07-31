package com.canvas.order.utils;

import com.canvas.order.VO.ResultVO;

/**
 * @Author: 宗恣
 * @Date: 2018/7/27 21:37
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {

        ResultVO resultVO = new ResultVO();

        resultVO.setCode(0);
        resultVO.setMessage("ok");
        resultVO.setData(object);

        return resultVO;
    }

    public static ResultVO error(Integer code, String message) {

        ResultVO resultVO = new ResultVO();

        resultVO.setCode(code);
        resultVO.setMessage(message);

        return resultVO;
    }
}