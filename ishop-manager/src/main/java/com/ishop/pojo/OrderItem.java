package com.ishop.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 
 */
public class OrderItem implements Serializable {
    /**
     * 订单项id,主键自增
     */
    private Integer id;

    /**
     * 订单id,来自订单表
     */
    private Integer orderId;

    /**
     * 商品id,来自商品表
     */
    private Integer productId;

    /**
     * 商品数量
     */
    private Integer productNum;

    /**
     * 商品实际上总价
     */
    private BigDecimal total;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderItem)) return false;

        OrderItem orderItem = (OrderItem) o;

        if (getId() != null ? !getId().equals(orderItem.getId()) : orderItem.getId() != null) return false;
        if (getOrderId() != null ? !getOrderId().equals(orderItem.getOrderId()) : orderItem.getOrderId() != null)
            return false;
        if (getProductId() != null ? !getProductId().equals(orderItem.getProductId()) : orderItem.getProductId() != null)
            return false;
        if (getProductNum() != null ? !getProductNum().equals(orderItem.getProductNum()) : orderItem.getProductNum() != null)
            return false;
        if (getTotal() != null ? !getTotal().equals(orderItem.getTotal()) : orderItem.getTotal() != null) return false;
        return getRemark() != null ? getRemark().equals(orderItem.getRemark()) : orderItem.getRemark() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getOrderId() != null ? getOrderId().hashCode() : 0);
        result = 31 * result + (getProductId() != null ? getProductId().hashCode() : 0);
        result = 31 * result + (getProductNum() != null ? getProductNum().hashCode() : 0);
        result = 31 * result + (getTotal() != null ? getTotal().hashCode() : 0);
        result = 31 * result + (getRemark() != null ? getRemark().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", productId=" + productId +
                ", productNum=" + productNum +
                ", total=" + total +
                ", remark='" + remark + '\'' +
                '}';
    }
}