package com.ishop.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author 
 */
public class Collect implements Serializable {
    /**
     * 收藏夹表id,主键自增
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

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public Timestamp getUpdated() {
        return updated;
    }

    public void setUpdated(Timestamp updated) { this.updated = updated; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Collect)) return false;

        Collect collect = (Collect) o;

        if (getId() != null ? !getId().equals(collect.getId()) : collect.getId() != null) return false;
        if (getUserId() != null ? !getUserId().equals(collect.getUserId()) : collect.getUserId() != null) return false;
        if (getProductId() != null ? !getProductId().equals(collect.getProductId()) : collect.getProductId() != null)
            return false;
        if (getCreated() != null ? !getCreated().equals(collect.getCreated()) : collect.getCreated() != null)
            return false;
        return getUpdated() != null ? getUpdated().equals(collect.getUpdated()) : collect.getUpdated() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getUserId() != null ? getUserId().hashCode() : 0);
        result = 31 * result + (getProductId() != null ? getProductId().hashCode() : 0);
        result = 31 * result + (getCreated() != null ? getCreated().hashCode() : 0);
        result = 31 * result + (getUpdated() != null ? getUpdated().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Collect{" +
                "id=" + id +
                ", userId=" + userId +
                ", productId=" + productId +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}