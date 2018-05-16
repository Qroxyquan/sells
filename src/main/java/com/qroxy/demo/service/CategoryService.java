package com.qroxy.demo.service;

import com.qroxy.demo.dataobject.ProductCategory;

import java.util.List;

/**
 * create by 林镇权
 * *
 * QQ：1114031075
 * *
 * 时间: 2018/5/9-下午12:42
 */
public interface CategoryService {
    ProductCategory findOne(Integer categoryId);
    List<ProductCategory> findAll();
    List<ProductCategory> findByCategoryIn(List<Integer> categoryTypeList);
    ProductCategory save(ProductCategory productCategory);
}
