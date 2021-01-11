package com.qy25.cn.entity;

import com.qy25.cn.entity.base.BaseEntity;

import java.util.Date;
import java.util.List;

public class Category extends BaseEntity {
    private Long id;

    private String categoryName;

    private String categoryDesc;

    private Long oarentId;

    private List<Category> children;


    public List<Category> getChildren() {
        return children;
    }

    public void setChildren(List<Category> children) {
        this.children = children;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc == null ? null : categoryDesc.trim();
    }

    public Long getOarentId() {
        return oarentId;
    }

    public void setOarentId(Long oarentId) {
        this.oarentId = oarentId;
    }


}