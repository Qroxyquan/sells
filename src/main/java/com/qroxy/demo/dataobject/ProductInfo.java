package com.qroxy.demo.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * 商品
 * create by 林镇权
 * *
 * QQ：1114031075
 * *
 * 时间: 2018/5/9-下午3:42
 */
@Entity
@Data
public class ProductInfo {
    @Id
    /*id*/
    private String productId;

    /*名字*/
    private String productName;
    /*价格*/

    private BigDecimal productPrice;
    /*库存*/
    private Integer productStock;

    /*描述*/
    private String productDescription;

   /*小图*/
    private  String productIcon;
    /*状态 0正常1下架*/
    private  Integer productStatus;
     /*类目编号*/
    private Integer categoryType;
}
