package com.qroxy.demo.service;

import com.qroxy.demo.dataobject.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * create by 林镇权
 * *商品
 * QQ：1114031075
 * *
 * 时间: 2018/5/13-下午2:58
 */
public interface ProductService {
    ProductInfo findOne(String productId);
    /*
    * 查询所有在架商品
    * */
    List<ProductInfo> findUpAll();
    Page<ProductInfo> findAll(Pageable pageable);
    ProductInfo save(ProductInfo productInfo);
    //加库存
    //减库存

}
