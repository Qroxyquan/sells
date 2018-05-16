package com.qroxy.demo.service.impl;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.qroxy.demo.dataobject.ProductInfo;
import com.qroxy.demo.enums.ProductStatusEnum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceImplTest {

    @Autowired
    private ProductServiceImpl productService;
    @Test
    public void findOne() throws Exception {
       ProductInfo productInfo= productService.findOne("1234");
        Assert.assertEquals("1234",productInfo.getProductId());
    }

    @Test
    public void findUpAll() throws Exception {
        List<ProductInfo> productInfoList=productService.findUpAll();
        Assert.assertNotEquals(0,productInfoList.size());
    }

    @Test
    public void findAll() throws Exception {
        PageRequest pageRequest=new PageRequest(0,2);
        Page<ProductInfo> productInfoPage=productService.findAll(pageRequest);
//        System.out.println(productInfoPage.getTotalElements());
        Assert.assertNotEquals(0,productInfoPage.getTotalElements());
    }

    @Test
    public void save() throws Exception {
        ProductInfo productInfo=new ProductInfo();
        productInfo.setProductId("12334");
        productInfo.setProductName("海鲜炒饭");
        productInfo.setProductPrice(new BigDecimal(3.883));
        productInfo.setProductStock(122);
        productInfo.setProductDescription("很贵很好吃");
        productInfo.setProductIcon("*");
        productInfo.setProductStatus(ProductStatusEnum.Down.getCode() );
        productInfo.setCategoryType(20);
        ProductInfo result=productService.save(productInfo);
        Assert.assertNotNull(result);
    }
}