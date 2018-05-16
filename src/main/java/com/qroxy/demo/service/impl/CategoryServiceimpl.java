package com.qroxy.demo.service.impl;

import com.qroxy.demo.dataobject.ProductCategory;
import com.qroxy.demo.repository.ProductCategoryRepository;
import com.qroxy.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类目
 * create by 林镇权
 * *
 * QQ：1114031075
 * *
 * 时间: 2018/5/9-下午12:51
 */
@Service
public class CategoryServiceimpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository repository;
    @Override
    public ProductCategory findOne(Integer categoryId) {
        return repository.findById(categoryId).get();
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}
