package com.ishop.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author 
 */
public class Cart implements Serializable {
    /**
     * ,购物车表id,主键自增
     */
    private Integer id;

    /**
     * 用户id,来自用户表
     */
    private Integer userId;

    /**
     * 商品id,来自商品表
     */
    private Integer productId;

    /**
     * 商品数量,默认为1
     */
    private Integer productNum;

    /**
     * 0:未购买 1:提交订单后删除,默认未购买
     */
    private Integer isBuy;

    /**
     * 创建时间
     */
    private Timestamp created;

    /**
     * 更新时间
     */
    private Timestamp updated;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductNum() {
        return productNum;
    }

    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

    public Integer getIsBuy() {
        return isBuy;
    }

    public void setIsBuy(Integer isBuy) {
        this.isBuy = isBuy;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) {
        this.updated = updated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cart)) return false;

        Cart cart = (Cart) o;

        if (getId() != null ? !getId().equals(cart.getId()) : cart.getId() != null) return false;
        if (getUserId() != null ? !getUserId().equals(cart.getUserId()) : cart.getUserId() != null) return false;
        if (getProductId() != null ? !getProductId().equals(cart.getProductId()) : cart.getProductId() != null)
            return false;
        if (getProductNum() != null ? !getProductNum().equals(cart.getProductNum()) : cart.getProductNum() != null)
            return false;
        if (getIsBuy() != null ? !getIsBuy().equals(cart.getIsBuy()) : cart.getIsBuy() != null) return false;
        if (getCreated() != null ? !getCreated().equals(cart.getCreated()) : cart.getCreated() != null) return false;
        return getUpdated() != null ? getUpdated().equals(cart.getUpdated()) : cart.getUpdated() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getUserId() != null ? getUserId().hashCode() : 0);
        result = 31 * result + (getProductId() != null ? getProductId().hashCode() : 0);
        result = 31 * result + (getProductNum() != null ? getProductNum().hashCode() : 0);
        result = 31 * result + (getIsBuy() != null ? getIsBuy().hashCode() : 0);
        result = 31 * result + (getCreated() != null ? getCreated().hashCode() : 0);
        result = 31 * result + (getUpdated() != null ? getUpdated().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", userId=" + userId +
                ", productId=" + productId +
                ", productNum=" + productNum +
                ", isBuy=" + isBuy +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}