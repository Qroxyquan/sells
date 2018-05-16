package com.qroxy.demo.repository;

import com.qroxy.demo.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * create by 林镇权
 * *
 * QQ：1114031075
 * *
 * 时间: 2018/5/9-下午3:54
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
