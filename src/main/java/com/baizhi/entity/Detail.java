package com.baizhi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Detail implements Serializable {
    private String detailId;

    private String orderId;

    private String productId;

    private String prodcutName;

    private BigDecimal productPrice;

    private String productIcon;

    private Integer productQuantity;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId == null ? null : detailId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

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

    public String getProductIcon() {
        return productIcon;
    }

    public void setProductIcon(String productIcon) {
        this.productIcon = productIcon == null ? null : productIcon.trim();
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
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
        Detail other = (Detail) that;
        return (this.getDetailId() == null ? other.getDetailId() == null : this.getDetailId().equals(other.getDetailId()))
            && (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getProdcutName() == null ? other.getProdcutName() == null : this.getProdcutName().equals(other.getProdcutName()))
            && (this.getProductPrice() == null ? other.getProductPrice() == null : this.getProductPrice().equals(other.getProductPrice()))
            && (this.getProductIcon() == null ? other.getProductIcon() == null : this.getProductIcon().equals(other.getProductIcon()))
            && (this.getProductQuantity() == null ? other.getProductQuantity() == null : this.getProductQuantity().equals(other.getProductQuantity()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDetailId() == null) ? 0 : getDetailId().hashCode());
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getProdcutName() == null) ? 0 : getProdcutName().hashCode());
        result = prime * result + ((getProductPrice() == null) ? 0 : getProductPrice().hashCode());
        result = prime * result + ((getProductIcon() == null) ? 0 : getProductIcon().hashCode());
        result = prime * result + ((getProductQuantity() == null) ? 0 : getProductQuantity().hashCode());
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
        sb.append(", detailId=").append(detailId);
        sb.append(", orderId=").append(orderId);
        sb.append(", productId=").append(productId);
        sb.append(", prodcutName=").append(prodcutName);
        sb.append(", productPrice=").append(productPrice);
        sb.append(", productIcon=").append(productIcon);
        sb.append(", productQuantity=").append(productQuantity);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}