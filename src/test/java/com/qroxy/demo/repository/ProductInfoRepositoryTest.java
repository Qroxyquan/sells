package com.qroxy.demo.repository;

import com.qroxy.demo.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.swing.*;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {
@Autowired
  private   ProductInfoRepository repository;
@Test
    public void savaTest(){

    ProductInfo productInfo=new ProductInfo();

    productInfo.setProductId("1234");
    productInfo.setProductName("皮蛋粥");
    productInfo.setProductPrice(new BigDecimal(3.33));
    productInfo.setProductStock(122);
    productInfo.setProductDescription("很好喝的粥");
    productInfo.setProductIcon("*");
    productInfo.setProductStatus(0);
    productInfo.setCategoryType(19);
    ProductInfo result=repository.save(productInfo);
    Assert.assertNotNull(result);
}
@Test
    public void findByProductStatusTest(){

   List<ProductInfo> productInfoList= repository.findByProductStatus(0);
   Assert.assertNotEquals(0,productInfoList.size());
}
}