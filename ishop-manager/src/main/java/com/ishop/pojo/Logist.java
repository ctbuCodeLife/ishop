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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Logist)) return false;

        Logist logist = (Logist) o;

        if (getId() != null ? !getId().equals(logist.getId()) : logist.getId() != null) return false;
        if (getOrderId() != null ? !getOrderId().equals(logist.getOrderId()) : logist.getOrderId() != null)
            return false;
        if (getLogistName() != null ? !getLogistName().equals(logist.getLogistName()) : logist.getLogistName() != null)
            return false;
        if (getLogistPhone() != null ? !getLogistPhone().equals(logist.getLogistPhone()) : logist.getLogistPhone() != null)
            return false;
        if (getCreated() != null ? !getCreated().equals(logist.getCreated()) : logist.getCreated() != null)
            return false;
        if (getUpdated() != null ? !getUpdated().equals(logist.getUpdated()) : logist.getUpdated() != null)
            return false;
        return getLogistContent() != null ? getLogistContent().equals(logist.getLogistContent()) : logist.getLogistContent() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getOrderId() != null ? getOrderId().hashCode() : 0);
        result = 31 * result + (getLogistName() != null ? getLogistName().hashCode() : 0);
        result = 31 * result + (getLogistPhone() != null ? getLogistPhone().hashCode() : 0);
        result = 31 * result + (getCreated() != null ? getCreated().hashCode() : 0);
        result = 31 * result + (getUpdated() != null ? getUpdated().hashCode() : 0);
        result = 31 * result + (getLogistContent() != null ? getLogistContent().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Logist{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", logistName='" + logistName + '\'' +
                ", logistPhone='" + logistPhone + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                ", logistContent='" + logistContent + '\'' +
                '}';
    }
}