package com.qroxy.demo.enums;

import lombok.Data;
import lombok.Getter;

/**
 * create by 林镇权
 * *商品状态
 * QQ：1114031075
 * *
 * 时间: 2018/5/13-下午3:13
 */
@Getter
public enum ProductStatusEnum {

    Up(0,"在架"),
    Down(1,"下架")
    ;
    private  Integer code;
    private String message;
    ProductStatusEnum(Integer code,String message){
        this.code=code;
        this.message=message;
    }
}
