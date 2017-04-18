package com.ishop.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Logist implements Serializable {
    /**
     * 物流id,主键自增
     */
    private Integer id;

    /**
     * 订单id,外键
     */
    private Integer orderId;

    /**
     * 快递员姓名
     */
    private String logistName;

    /**
     * 快递员电话
     */
    private String logistPhone;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 更新时间
     */
    private Date updated;

    /**
     * 物流信息,json格式
     */
    private String logistContent;

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

    public String getLogistName() {
        return logistName;
    }

    public void setLogistName(String logistName) {
        this.logistName = logistName;
    }

    public String getLogistPhone() {
        return logistPhone;
    }

    public void setLogistPhone(String logistPhone) {
        this.logistPhone = logistPhone;
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

    public String getLogistContent() {
        return logistContent;
    }

    public void setLogistContent(String logistContent) {
        this.logistContent = logistContent;
    }
}