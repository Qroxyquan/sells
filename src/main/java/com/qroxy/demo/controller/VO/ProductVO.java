package com.qroxy.demo.controller.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * create by 林镇权
 * *
 * QQ：1114031075
 * *商品包含类目
 * 时间: 2018/5/13-下午6:15
 */
@Data
public class ProductVO {

    @JsonProperty("name")
    private String categoryName;
    @JsonProperty("type")
    private  Integer categoryType;
    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;

}
