package com.qroxy.demo.repository;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.qroxy.demo.dataobject.ProductCategory;

import javax.persistence.Id;
import javax.transaction.TransactionScoped;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {
@Autowired
    ProductCategoryRepository repository;
//@Test
//    public void saveTest(){
//    ProductCategory productCategary =new ProductCategory();
//    productCategary.setCategoryType(1);
//    productCategary.setCategoryName("男生最爱");
//
//
//    repository.save(productCategary);
//}
@Test
@TransactionScoped//数据库数据不会改变
    public void savTest(){
    ProductCategory productCategory=repository.findById(20).get();
    productCategory.setCategoryType(8);
    productCategory.setCategoryName("男士最爱");
    repository.save(productCategory);
}
@Test
    public void findByCategoryType(){
    List<Integer> list=Arrays.asList(7,8,9);
        List<ProductCategory> result=repository.findByCategoryTypeIn(list);
    Assert.assertNotEquals(0,result.size());
}
}