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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Admin)) return false;

        Admin admin = (Admin) o;

        if (getId() != null ? !getId().equals(admin.getId()) : admin.getId() != null) return false;
        if (getRoleId() != null ? !getRoleId().equals(admin.getRoleId()) : admin.getRoleId() != null) return false;
        if (getName() != null ? !getName().equals(admin.getName()) : admin.getName() != null) return false;
        if (getPassword() != null ? !getPassword().equals(admin.getPassword()) : admin.getPassword() != null)
            return false;
        if (getRealName() != null ? !getRealName().equals(admin.getRealName()) : admin.getRealName() != null)
            return false;
        if (getEmail() != null ? !getEmail().equals(admin.getEmail()) : admin.getEmail() != null) return false;
        if (getPhone() != null ? !getPhone().equals(admin.getPhone()) : admin.getPhone() != null) return false;
        if (getCreated() != null ? !getCreated().equals(admin.getCreated()) : admin.getCreated() != null) return false;
        return getUpdated() != null ? getUpdated().equals(admin.getUpdated()) : admin.getUpdated() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getRoleId() != null ? getRoleId().hashCode() : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getPassword() != null ? getPassword().hashCode() : 0);
        result = 31 * result + (getRealName() != null ? getRealName().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
        result = 31 * result + (getCreated() != null ? getCreated().hashCode() : 0);
        result = 31 * result + (getUpdated() != null ? getUpdated().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", realName='" + realName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}