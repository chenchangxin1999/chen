package com.qy25.cn.entity;

import com.qy25.cn.entity.base.BaseEntity;

public class Goods extends BaseEntity {

    private String goodsName;

    private Long goodsType;

    private Double goodsBazaarMoney;

    private Double goodsShoppingMoney;

    private Long goodsInventory;

    private Integer goodsStatus;

    private Long goodsBrand;

    private String goodsImg;

    private String categoryName;

    private String brandName;

    private Long goodsSupplier;

    private String SupplierName;


    public String getSupplierName() {
        return SupplierName;
    }

    public void setSupplierName(String supplerName) {
        SupplierName = supplerName;
    }

    public Long getGoodsSupplier() {
        return goodsSupplier;
    }

    public void setGoodsSupplier(Long goodsSupplier) {
        this.goodsSupplier = goodsSupplier;
    }

    public String getBrandName() {
        return brandName;
    }


    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Long getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Long goodsType) {
        this.goodsType = goodsType;
    }

    public Double getGoodsBazaarMoney() {
        return goodsBazaarMoney;
    }

    public void setGoodsBazaarMoney(Double goodsBazaarMoney) {
        this.goodsBazaarMoney = goodsBazaarMoney;
    }

    public Double getGoodsShoppingMoney() {
        return goodsShoppingMoney;
    }

    public void setGoodsShoppingMoney(Double goodsShoppingMoney) {
        this.goodsShoppingMoney = goodsShoppingMoney;
    }

    public Long getGoodsInventory() {
        return goodsInventory;
    }

    public void setGoodsInventory(Long goodsInventory) {
        this.goodsInventory = goodsInventory;
    }

    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    public Long getGoodsBrand() {
        return goodsBrand;
    }

    public void setGoodsBrand(Long goodsBrand) {
        this.goodsBrand = goodsBrand;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg == null ? null : goodsImg.trim();
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsName='" + goodsName + '\'' +
                ", goodsType=" + goodsType +
                ", goodsBazaarMoney=" + goodsBazaarMoney +
                ", goodsShoppingMoney=" + goodsShoppingMoney +
                ", goodsInventory=" + goodsInventory +
                ", goodsStatus=" + goodsStatus +
                ", goodsBrand=" + goodsBrand +
                ", goodsImg='" + goodsImg + '\'' +
                ", categoryName='" + categoryName + '\'' +
                ", brandName='" + brandName + '\'' +
                ", goodsSupplier=" + goodsSupplier +
                ", SupplierName='" + SupplierName + '\'' +
                '}';
    }
}