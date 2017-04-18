package com.ishop.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Admin implements Serializable {
    /**
     * 管理员表id,自增
     */
    private Integer id;

    /**
     * 角色id,外键
     */
    private Integer roleId;

    /**
     * 管理员登录名
     */
    private String name;

    /**
     * 管理员密码
     */
    private String password;

    /**
     * 管理员真实名字
     */
    private String realName;

    /**
     * 管理员邮箱
     */
    private String email;

    /**
     * 管理员电话
     */
    private String phone;

    /**
     * 管理员创建时间
     */
    private Date created;

    /**
     * 管理员更新时间
     */
    private Date updated;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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