package com.qroxy.demo.dataobject;


import com.sun.javafx.beans.IDProperty;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * create by 林镇权
 * *
 * QQ：1114031075
 * *
 * 时间: 2018/5/7-下午1:20
 */
@Entity
@DynamicUpdate
@Data
public class ProductCategory {

@Id
@GeneratedValue
//
//    public int getCategoryId() {
//        return categoryId;
//    }
//
//    public void setCategoryId(int categoryId) {
//        this.categoryId = categoryId;
//    }
//
//    public String getCategoryName() {
//        return categoryName;
//    }
//
//    public void setCategoryName(String categoryName) {
//        this.categoryName = categoryName;
//    }
//
//    public int getCategoryType() {
//        return categoryType;
//    }
//
//    public void setCategoryType(int categoryType) {
//        this.categoryType = categoryType;
//    }
//利用lombok插件省去这些set 和get代码，注解自动生成
    /*类目ID*/
        private int categoryId;
        /*类目名字*/
        private  String categoryName;
        /*类目编号*/
        private  int categoryType;
        public ProductCategory(){}

//        /*创建时间*/
//        private Date updateTime;

//    public Date getUpdateTime() {
//        return updateTime;
//    }
//
//    public void setUpdateTime(Date updateTime) {
//        this.updateTime = updateTime;
//    }
//
//    public Date getCreateTime() {
//        return createTime;
//    }
//
//    public void setCreateTime(Date createTime) {
//        this.createTime = createTime;
//    }
//
//    /*更新时间*/
//        private Date createTime;
}
