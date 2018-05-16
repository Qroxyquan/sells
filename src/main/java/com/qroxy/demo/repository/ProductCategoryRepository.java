package com.qroxy.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.qroxy.demo.dataobject.ProductCategory;

import java.util.List;

/**
 * create by 林镇权
 * *
 * QQ：1114031075
 * *
 * 时间: 2018/5/7-下午8:07
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
