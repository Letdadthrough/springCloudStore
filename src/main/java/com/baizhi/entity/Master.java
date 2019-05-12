package com.baizhi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Master implements Serializable {
    private String orderId;

    private String buyerName;

    private String buyerIphone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    private Byte orderStatus;

    private Byte payStayus;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getBuyerName() {
        return buyerName;
    }

    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName == null ? null : buyerName.trim();
    }

    public String getBuyerIphone() {
        return buyerIphone;
    }

    public void setBuyerIphone(String buyerIphone) {
        this.buyerIphone = buyerIphone == null ? null : buyerIphone.trim();
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress == null ? null : buyerAddress.trim();
    }

    public String getBuyerOpenid() {
        return buyerOpenid;
    }

    public void setBuyerOpenid(String buyerOpenid) {
        this.buyerOpenid = buyerOpenid == null ? null : buyerOpenid.trim();
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Byte getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Byte getPayStayus() {
        return payStayus;
    }

    public void setPayStayus(Byte payStayus) {
        this.payStayus = payStayus;
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
        Master other = (Master) that;
        return (this.getOrderId() == null ? other.getOrderId() == null : this.getOrderId().equals(other.getOrderId()))
            && (this.getBuyerName() == null ? other.getBuyerName() == null : this.getBuyerName().equals(other.getBuyerName()))
            && (this.getBuyerIphone() == null ? other.getBuyerIphone() == null : this.getBuyerIphone().equals(other.getBuyerIphone()))
            && (this.getBuyerAddress() == null ? other.getBuyerAddress() == null : this.getBuyerAddress().equals(other.getBuyerAddress()))
            && (this.getBuyerOpenid() == null ? other.getBuyerOpenid() == null : this.getBuyerOpenid().equals(other.getBuyerOpenid()))
            && (this.getOrderAmount() == null ? other.getOrderAmount() == null : this.getOrderAmount().equals(other.getOrderAmount()))
            && (this.getOrderStatus() == null ? other.getOrderStatus() == null : this.getOrderStatus().equals(other.getOrderStatus()))
            && (this.getPayStayus() == null ? other.getPayStayus() == null : this.getPayStayus().equals(other.getPayStayus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOrderId() == null) ? 0 : getOrderId().hashCode());
        result = prime * result + ((getBuyerName() == null) ? 0 : getBuyerName().hashCode());
        result = prime * result + ((getBuyerIphone() == null) ? 0 : getBuyerIphone().hashCode());
        result = prime * result + ((getBuyerAddress() == null) ? 0 : getBuyerAddress().hashCode());
        result = prime * result + ((getBuyerOpenid() == null) ? 0 : getBuyerOpenid().hashCode());
        result = prime * result + ((getOrderAmount() == null) ? 0 : getOrderAmount().hashCode());
        result = prime * result + ((getOrderStatus() == null) ? 0 : getOrderStatus().hashCode());
        result = prime * result + ((getPayStayus() == null) ? 0 : getPayStayus().hashCode());
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
        sb.append(", orderId=").append(orderId);
        sb.append(", buyerName=").append(buyerName);
        sb.append(", buyerIphone=").append(buyerIphone);
        sb.append(", buyerAddress=").append(buyerAddress);
        sb.append(", buyerOpenid=").append(buyerOpenid);
        sb.append(", orderAmount=").append(orderAmount);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", payStayus=").append(payStayus);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}