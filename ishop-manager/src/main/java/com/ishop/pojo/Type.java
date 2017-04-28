package com.ishop.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author 
 */
public class Type implements Serializable {
    /**
     * 类别id,自增
     */
    private Integer id;

    /**
     * 父类别id
     */
    private Integer parentId;

    /**
     * 类别名称
     */
    private String name;

    /**
     * 类别描述
     */
    private String describe;

    /**
     * 类别等级,为1时表示一级类别
     */
    private Integer grade;

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

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
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
        if (!(o instanceof Type)) return false;

        Type type = (Type) o;

        if (getId() != null ? !getId().equals(type.getId()) : type.getId() != null) return false;
        if (getParentId() != null ? !getParentId().equals(type.getParentId()) : type.getParentId() != null)
            return false;
        if (getName() != null ? !getName().equals(type.getName()) : type.getName() != null) return false;
        if (getDescribe() != null ? !getDescribe().equals(type.getDescribe()) : type.getDescribe() != null)
            return false;
        if (getGrade() != null ? !getGrade().equals(type.getGrade()) : type.getGrade() != null) return false;
        if (getCreated() != null ? !getCreated().equals(type.getCreated()) : type.getCreated() != null) return false;
        return getUpdated() != null ? getUpdated().equals(type.getUpdated()) : type.getUpdated() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getParentId() != null ? getParentId().hashCode() : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getDescribe() != null ? getDescribe().hashCode() : 0);
        result = 31 * result + (getGrade() != null ? getGrade().hashCode() : 0);
        result = 31 * result + (getCreated() != null ? getCreated().hashCode() : 0);
        result = 31 * result + (getUpdated() != null ? getUpdated().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id=" + id +
                ", parentId=" + parentId +
                ", name='" + name + '\'' +
                ", describe='" + describe + '\'' +
                ", grade=" + grade +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}