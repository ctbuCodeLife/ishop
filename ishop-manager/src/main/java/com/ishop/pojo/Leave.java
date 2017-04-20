package com.ishop.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author 
 */
public class Leave implements Serializable {
    /**
     * 留言表id,主键自增
     */
    private Integer id;

    /**
     * 商品id,来自商品表
     */
    private Integer productId;

    /**
     * 用户id,来自用户表
     */
    private Integer userId;

    /**
     * 留言主题
     */
    private String subject;

    /**
     * 留言者ip
     */
    private String ip;

    /**
     * 创建时间
     */
    private Timestamp created;

    /**
     * 更新时间
     */
    private Timestamp updated;

    /**
     * 留言内容
     */
    private String content;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Leave)) return false;

        Leave leave = (Leave) o;

        if (getId() != null ? !getId().equals(leave.getId()) : leave.getId() != null) return false;
        if (getProductId() != null ? !getProductId().equals(leave.getProductId()) : leave.getProductId() != null)
            return false;
        if (getUserId() != null ? !getUserId().equals(leave.getUserId()) : leave.getUserId() != null) return false;
        if (getSubject() != null ? !getSubject().equals(leave.getSubject()) : leave.getSubject() != null) return false;
        if (getIp() != null ? !getIp().equals(leave.getIp()) : leave.getIp() != null) return false;
        if (getCreated() != null ? !getCreated().equals(leave.getCreated()) : leave.getCreated() != null) return false;
        if (getUpdated() != null ? !getUpdated().equals(leave.getUpdated()) : leave.getUpdated() != null) return false;
        return getContent() != null ? getContent().equals(leave.getContent()) : leave.getContent() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getProductId() != null ? getProductId().hashCode() : 0);
        result = 31 * result + (getUserId() != null ? getUserId().hashCode() : 0);
        result = 31 * result + (getSubject() != null ? getSubject().hashCode() : 0);
        result = 31 * result + (getIp() != null ? getIp().hashCode() : 0);
        result = 31 * result + (getCreated() != null ? getCreated().hashCode() : 0);
        result = 31 * result + (getUpdated() != null ? getUpdated().hashCode() : 0);
        result = 31 * result + (getContent() != null ? getContent().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Leave{" +
                "id=" + id +
                ", productId=" + productId +
                ", userId=" + userId +
                ", subject='" + subject + '\'' +
                ", ip='" + ip + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                ", content='" + content + '\'' +
                '}';
    }
}