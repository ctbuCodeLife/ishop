package com.ishop.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class PropertyValue implements Serializable {
    /**
     * 商品参数id,主键自增
     */
    private Integer id;

    /**
     * 商品id,来自商品表
     */
    private Integer productId;

    /**
     * 商品参数值
     */
    private String value;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 更新时间
     */
    private Date updated;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }
}