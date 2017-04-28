package com.ishop.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Releave implements Serializable {
    /**
     * 回复留言表id,主键自增
     */
    private Integer id;

    /**
     * 管理员id,来自管理员表
     */
    private Integer adminId;

    /**
     * 留言id,来自留言表
     */
    private Integer leaveId;

    /**
     * 回复主题
     */
    private String subject;

    /**
     * 回复者ip
     */
    private String ip;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 更新时间
     */
    private Date updated;

    /**
     * 回复内容
     */
    private String content;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Integer getLeaveId() {
        return leaveId;
    }

    public void setLeaveId(Integer leaveId) {
        this.leaveId = leaveId;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Releave)) return false;

        Releave releave = (Releave) o;

        if (getId() != null ? !getId().equals(releave.getId()) : releave.getId() != null) return false;
        if (getAdminId() != null ? !getAdminId().equals(releave.getAdminId()) : releave.getAdminId() != null)
            return false;
        if (getLeaveId() != null ? !getLeaveId().equals(releave.getLeaveId()) : releave.getLeaveId() != null)
            return false;
        if (getSubject() != null ? !getSubject().equals(releave.getSubject()) : releave.getSubject() != null)
            return false;
        if (getIp() != null ? !getIp().equals(releave.getIp()) : releave.getIp() != null) return false;
        if (getCreated() != null ? !getCreated().equals(releave.getCreated()) : releave.getCreated() != null)
            return false;
        if (getUpdated() != null ? !getUpdated().equals(releave.getUpdated()) : releave.getUpdated() != null)
            return false;
        return getContent() != null ? getContent().equals(releave.getContent()) : releave.getContent() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getAdminId() != null ? getAdminId().hashCode() : 0);
        result = 31 * result + (getLeaveId() != null ? getLeaveId().hashCode() : 0);
        result = 31 * result + (getSubject() != null ? getSubject().hashCode() : 0);
        result = 31 * result + (getIp() != null ? getIp().hashCode() : 0);
        result = 31 * result + (getCreated() != null ? getCreated().hashCode() : 0);
        result = 31 * result + (getUpdated() != null ? getUpdated().hashCode() : 0);
        result = 31 * result + (getContent() != null ? getContent().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Releave{" +
                "id=" + id +
                ", adminId=" + adminId +
                ", leaveId=" + leaveId +
                ", subject='" + subject + '\'' +
                ", ip='" + ip + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                ", content='" + content + '\'' +
                '}';
    }
}