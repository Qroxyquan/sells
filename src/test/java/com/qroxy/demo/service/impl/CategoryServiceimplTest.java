package com.qroxy.demo.service.impl;

import com.qroxy.demo.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceimplTest {

    @Autowired
    private CategoryServiceimpl categoryService;
    @Test
    public void findOne() throws Exception{
        ProductCategory productCategory=categoryService.findOne(19);

        Assert.assertEquals(19,productCategory.getCategoryId());
    }

    @Test
    public void findAll() throws Exception{
        List<ProductCategory> productCategoryList=categoryService.findAll();
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void findByCategoryIn() throws Exception{
        List<ProductCategory> productCategoryList=categoryService.findByCategoryIn(Arrays.asList(7,8,9));
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void save() throws Exception{
        ProductCategory productCategory=new ProductCategory();
        productCategory.setCategoryName("男生专享");
        productCategory.setCategoryType(6);
        ProductCategory result = categoryService.save(productCategory);
        Assert.assertNotNull(result);

    }
}