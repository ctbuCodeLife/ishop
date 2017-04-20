package com.ishop.pojo;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @author 
 */
public class Property implements Serializable {
    /**
     * 商品参数id,主键自增
     */
    private Integer id;

    /**
     * 类型id,来自类别表
     */
    private Integer typeId;

    /**
     * 商品参数名
     */
    private String name;

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

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (!(o instanceof Property)) return false;

        Property property = (Property) o;

        if (getId() != null ? !getId().equals(property.getId()) : property.getId() != null) return false;
        if (getTypeId() != null ? !getTypeId().equals(property.getTypeId()) : property.getTypeId() != null)
            return false;
        if (getName() != null ? !getName().equals(property.getName()) : property.getName() != null) return false;
        if (getCreated() != null ? !getCreated().equals(property.getCreated()) : property.getCreated() != null)
            return false;
        return getUpdated() != null ? getUpdated().equals(property.getUpdated()) : property.getUpdated() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getTypeId() != null ? getTypeId().hashCode() : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getCreated() != null ? getCreated().hashCode() : 0);
        result = 31 * result + (getUpdated() != null ? getUpdated().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Property{" +
                "id=" + id +
                ", typeId=" + typeId +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}