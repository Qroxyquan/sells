package com.qroxy.demo.controller.VO;

import lombok.Data;

/**
 * create by 林镇权
 * *http请求的返回的最外层对象
 * QQ：1114031075
 * *
 * 时间: 2018/5/13-下午5:39
 */
@Data
public class ResultVO<T> {
    //错误码
    private Integer code;
    //提示信息
    private  String msg;
    //返回具体内容
    private T data;
}
