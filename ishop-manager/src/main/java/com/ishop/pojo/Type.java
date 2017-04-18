package com.ishop.pojo;

import java.io.Serializable;
import java.util.Date;

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
    private Byte grade;

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

    public Byte getGrade() {
        return grade;
    }

    public void setGrade(Byte grade) {
        this.grade = grade;
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