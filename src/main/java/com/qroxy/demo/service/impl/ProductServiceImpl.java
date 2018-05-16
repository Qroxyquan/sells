package com.qroxy.demo.service.impl;

import com.qroxy.demo.dataobject.ProductInfo;
import com.qroxy.demo.enums.ProductStatusEnum;
import com.qroxy.demo.repository.ProductInfoRepository;
import com.qroxy.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * create by 林镇权
 * *
 * QQ：1114031075
 * *
 * 时间: 2018/5/13-下午3:07
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductInfoRepository repository;
    @Override
    public ProductInfo findOne(String productId) {
        return repository.findById(productId).get();
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return repository.findByProductStatus(ProductStatusEnum.Up.getCode());
        //查询上架商品
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return repository.save(productInfo);
    }
}
