package com.ishop.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @author 
 */
public class Order implements Serializable {
    /**
     * 订单id,主键自增
     */
    private Integer id;

    /**
     * 用户id,外键
     */
    private Integer userId;

    /**
     * 管理员id,外键
     */
    private Integer adminId;

    /**
     * 总价格
     */
    private BigDecimal productPrice;

    /**
     * 运费
     */
    private BigDecimal trafficPrice;

    /**
     * 总价
     */
    private Long totalPrice;

    /**
     * 订单状态:未支付,已支付,待发货,已取消,已发货,已收货,未评论,已评论
     */
    private String status;

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

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public BigDecimal getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    public BigDecimal getTrafficPrice() {
        return trafficPrice;
    }

    public void setTrafficPrice(BigDecimal trafficPrice) {
        this.trafficPrice = trafficPrice;
    }

    public Long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        if (!(o instanceof Order)) return false;

        Order order = (Order) o;

        if (getId() != null ? !getId().equals(order.getId()) : order.getId() != null) return false;
        if (getUserId() != null ? !getUserId().equals(order.getUserId()) : order.getUserId() != null) return false;
        if (getAdminId() != null ? !getAdminId().equals(order.getAdminId()) : order.getAdminId() != null) return false;
        if (getProductPrice() != null ? !getProductPrice().equals(order.getProductPrice()) : order.getProductPrice() != null)
            return false;
        if (getTrafficPrice() != null ? !getTrafficPrice().equals(order.getTrafficPrice()) : order.getTrafficPrice() != null)
            return false;
        if (getTotalPrice() != null ? !getTotalPrice().equals(order.getTotalPrice()) : order.getTotalPrice() != null)
            return false;
        if (getStatus() != null ? !getStatus().equals(order.getStatus()) : order.getStatus() != null) return false;
        if (getCreated() != null ? !getCreated().equals(order.getCreated()) : order.getCreated() != null) return false;
        return getUpdated() != null ? getUpdated().equals(order.getUpdated()) : order.getUpdated() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getUserId() != null ? getUserId().hashCode() : 0);
        result = 31 * result + (getAdminId() != null ? getAdminId().hashCode() : 0);
        result = 31 * result + (getProductPrice() != null ? getProductPrice().hashCode() : 0);
        result = 31 * result + (getTrafficPrice() != null ? getTrafficPrice().hashCode() : 0);
        result = 31 * result + (getTotalPrice() != null ? getTotalPrice().hashCode() : 0);
        result = 31 * result + (getStatus() != null ? getStatus().hashCode() : 0);
        result = 31 * result + (getCreated() != null ? getCreated().hashCode() : 0);
        result = 31 * result + (getUpdated() != null ? getUpdated().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", adminId=" + adminId +
                ", productPrice=" + productPrice +
                ", trafficPrice=" + trafficPrice +
                ", totalPrice=" + totalPrice +
                ", status='" + status + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}