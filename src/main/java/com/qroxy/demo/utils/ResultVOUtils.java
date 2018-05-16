package com.qroxy.demo.utils;

import com.qroxy.demo.controller.VO.ResultVO;

/**
 * create by 林镇权
 * *
 * QQ：1114031075
 * *
 * 时间: 2018/5/15-下午4:47
 */
public class ResultVOUtils {
    public static ResultVO success(Object object) {

        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return  resultVO;
    }
    public static ResultVO success(){
        return success(null);
    }
    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO=new ResultVO();
        resultVO.setMsg(msg);
        resultVO.setCode(code);
        return resultVO;
        //哦哦哦
    }
}
