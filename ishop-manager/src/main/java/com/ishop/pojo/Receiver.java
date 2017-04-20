package com.ishop.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Receiver implements Serializable {
    /**
     * 收货人表id,主键自增
     */
    private Integer id;

    /**
     * 用户id,来自用户表
     */
    private Integer userId;

    /**
     * 收货人姓名
     */
    private String name;

    /**
     * 收货人电话
     */
    private String phone;

    /**
     * 收货人详细地址,xx省xx市xx县xx镇+详细地址
     */
    private String address;

    /**
     * 收货人邮箱
     */
    private String email;

    /**
     * 邮编
     */
    private String zipcode;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
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
        if (!(o instanceof Receiver)) return false;

        Receiver receiver = (Receiver) o;

        if (getId() != null ? !getId().equals(receiver.getId()) : receiver.getId() != null) return false;
        if (getUserId() != null ? !getUserId().equals(receiver.getUserId()) : receiver.getUserId() != null)
            return false;
        if (getName() != null ? !getName().equals(receiver.getName()) : receiver.getName() != null) return false;
        if (getPhone() != null ? !getPhone().equals(receiver.getPhone()) : receiver.getPhone() != null) return false;
        if (getAddress() != null ? !getAddress().equals(receiver.getAddress()) : receiver.getAddress() != null)
            return false;
        if (getEmail() != null ? !getEmail().equals(receiver.getEmail()) : receiver.getEmail() != null) return false;
        if (getZipcode() != null ? !getZipcode().equals(receiver.getZipcode()) : receiver.getZipcode() != null)
            return false;
        if (getCreated() != null ? !getCreated().equals(receiver.getCreated()) : receiver.getCreated() != null)
            return false;
        return getUpdated() != null ? getUpdated().equals(receiver.getUpdated()) : receiver.getUpdated() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getUserId() != null ? getUserId().hashCode() : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getPhone() != null ? getPhone().hashCode() : 0);
        result = 31 * result + (getAddress() != null ? getAddress().hashCode() : 0);
        result = 31 * result + (getEmail() != null ? getEmail().hashCode() : 0);
        result = 31 * result + (getZipcode() != null ? getZipcode().hashCode() : 0);
        result = 31 * result + (getCreated() != null ? getCreated().hashCode() : 0);
        result = 31 * result + (getUpdated() != null ? getUpdated().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Receiver{" +
                "id=" + id +
                ", userId=" + userId +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}