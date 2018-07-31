package com.canvas.product.utils;

import com.canvas.product.VO.ResultVO;

/**
 * @Author: 宗恣
 * @Date: 2018/7/26 0026 17:52
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();

        resultVO.setCode(0);
        resultVO.setMessage("ok");
        resultVO.setData(object);

        return resultVO;
    }

}
