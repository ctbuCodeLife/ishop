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
}