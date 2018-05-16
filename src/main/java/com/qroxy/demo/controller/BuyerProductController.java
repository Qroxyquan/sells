package com.qroxy.demo.controller;

import com.qroxy.demo.controller.VO.ProductInfoVO;
import com.qroxy.demo.controller.VO.ProductVO;
import com.qroxy.demo.controller.VO.ResultVO;
import com.qroxy.demo.dataobject.ProductCategory;
import com.qroxy.demo.dataobject.ProductInfo;
import com.qroxy.demo.service.CategoryService;
import com.qroxy.demo.service.ProductService;
import com.qroxy.demo.utils.ResultVOUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * create by 林镇权
 * 卖家商品
 * QQ：1114031075
 * *
 * 时间: 2018/5/13-下午5:25
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;
@GetMapping("/list")
public ResultVO list(){


    //1.查询所有上架商品
    List<ProductInfo> productInfoList=productService.findUpAll();

    //2.查询类目(一次性查询）

    //传统方法
//    for(ProductInfo productInfo:productInfoList){
//        categoryTypeList.add(productInfo.getCategoryType());
//    }
    //精简方法（jave8特性，课后学习,lambda）
    List<Integer> categoryTypeList=productInfoList.stream()
            .map(e->e.getCategoryType())
            .collect(Collectors.toList());
   List<ProductCategory> productCategorylist= categoryService.findByCategoryIn(categoryTypeList);
    //3.数据拼装
    List<ProductVO> productVOList=new ArrayList<>();
    for (ProductCategory productCategory: productCategorylist){
        ProductVO productVO=new ProductVO();
        productVO.setCategoryType(productCategory.getCategoryType());
        productVO.setCategoryName(productCategory.getCategoryName());

        List<ProductInfoVO> productInfoVOS=new ArrayList<>();
        for (ProductInfo productInfo:productInfoList){
            if (productInfo.getCategoryType().equals(productCategory.getCategoryType())){
                ProductInfoVO productInfoVO=new ProductInfoVO();
                BeanUtils.copyProperties(productInfo,productInfoVO);
                productInfoVOS.add(productInfoVO);
            }
        }
        productVO.setProductInfoVOList(productInfoVOS);
        productVOList.add(productVO);
    }

//这是一个封装方法
     return ResultVOUtils.success(productVOList);
}
}
