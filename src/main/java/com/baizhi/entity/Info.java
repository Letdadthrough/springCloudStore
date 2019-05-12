package com.baizhi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Info implements Serializable {
    private String productId;

    private String prodcutName;

    private BigDecimal productPrice;

    private Integer productStock;

    private String productDescription;

    private String productIcon;

    private Integer categoryType;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createTime;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProdcutName() {
        return prodcutName;
    }

    public void setProdcutName(String prodcutName) {
        this.prodcutName = prodcutName == null ? null : prodcutName.trim();
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription == null ? null : productDescription.trim();
    }

    public String getProductIcon() {
        return productIcon;
    }

    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon == null ? null : productIcon.trim();
    }

    public Integer getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(Integer categoryType) {
        this.categoryType = categoryType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Info other = (Info) that;
        return (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getProdcutName() == null ? other.getProdcutName() == null : this.getProdcutName().equals(other.getProdcutName()))
            && (this.getProductPrice() == null ? other.getProductPrice() == null : this.getProductPrice().equals(other.getProductPrice()))
            && (this.getProductStock() == null ? other.getProductStock() == null : this.getProductStock().equals(other.getProductStock()))
            && (this.getProductDescription() == null ? other.getProductDescription() == null : this.getProductDescription().equals(other.getProductDescription()))
            && (this.getProductIcon() == null ? other.getProductIcon() == null : this.getProductIcon().equals(other.getProductIcon()))
            && (this.getCategoryType() == null ? other.getCategoryType() == null : this.getCategoryType().equals(other.getCategoryType()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getProdcutName() == null) ? 0 : getProdcutName().hashCode());
        result = prime * result + ((getProductPrice() == null) ? 0 : getProductPrice().hashCode());
        result = prime * result + ((getProductStock() == null) ? 0 : getProductStock().hashCode());
        result = prime * result + ((getProductDescription() == null) ? 0 : getProductDescription().hashCode());
        result = prime * result + ((getProductIcon() == null) ? 0 : getProductIcon().hashCode());
        result = prime * result + ((getCategoryType() == null) ? 0 : getCategoryType().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", productId=").append(productId);
        sb.append(", prodcutName=").append(prodcutName);
        sb.append(", productPrice=").append(productPrice);
        sb.append(", productStock=").append(productStock);
        sb.append(", productDescription=").append(productDescription);
        sb.append(", productIcon=").append(productIcon);
        sb.append(", categoryType=").append(categoryType);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}