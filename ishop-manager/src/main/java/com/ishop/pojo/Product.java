package com.ishop.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author 
 */
public class Product implements Serializable {
    /**
     * 商品id,自增
     */
    private Integer id;

    /**
     * 类别id
     */
    private Integer typeId;

    /**
     * 商品名
     */
    private String name;

    /**
     * 商品子标题
     */
    private String subTitle;

    /**
     * 商品缩略图连接地址
     */
    private String imageSrc;

    /**
     * 库存数量
     */
    private Integer inventNumber;

    /**
     * 月销量
     */
    private Integer mothSellNumber;

    /**
     * 定购链接
     */
    private String orderLink;

    /**
     * 商品原价
     */
    private BigDecimal realPrice;

    /**
     * 商品实际价格
     */
    private BigDecimal sellPrice;

    /**
     * 是否推荐到首页,0表示不推荐,1表示推荐,默认为0
     */
    private Integer isRecommmend;

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

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }

    public Integer getInventNumber() {
        return inventNumber;
    }

    public void setInventNumber(Integer inventNumber) {
        this.inventNumber = inventNumber;
    }

    public Integer getMothSellNumber() {
        return mothSellNumber;
    }

    public void setMothSellNumber(Integer mothSellNumber) {
        this.mothSellNumber = mothSellNumber;
    }

    public String getOrderLink() {
        return orderLink;
    }

    public void setOrderLink(String orderLink) {
        this.orderLink = orderLink;
    }

    public BigDecimal getRealPrice() {
        return realPrice;
    }

    public void setRealPrice(BigDecimal realPrice) {
        this.realPrice = realPrice;
    }

    public BigDecimal getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(BigDecimal sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Integer getIsRecommmend() {
        return isRecommmend;
    }

    public void setIsRecommmend(Integer isRecommmend) {
        this.isRecommmend = isRecommmend;
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
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        if (getId() != null ? !getId().equals(product.getId()) : product.getId() != null) return false;
        if (getTypeId() != null ? !getTypeId().equals(product.getTypeId()) : product.getTypeId() != null) return false;
        if (getName() != null ? !getName().equals(product.getName()) : product.getName() != null) return false;
        if (getSubTitle() != null ? !getSubTitle().equals(product.getSubTitle()) : product.getSubTitle() != null)
            return false;
        if (getImageSrc() != null ? !getImageSrc().equals(product.getImageSrc()) : product.getImageSrc() != null)
            return false;
        if (getInventNumber() != null ? !getInventNumber().equals(product.getInventNumber()) : product.getInventNumber() != null)
            return false;
        if (getMothSellNumber() != null ? !getMothSellNumber().equals(product.getMothSellNumber()) : product.getMothSellNumber() != null)
            return false;
        if (getOrderLink() != null ? !getOrderLink().equals(product.getOrderLink()) : product.getOrderLink() != null)
            return false;
        if (getRealPrice() != null ? !getRealPrice().equals(product.getRealPrice()) : product.getRealPrice() != null)
            return false;
        if (getSellPrice() != null ? !getSellPrice().equals(product.getSellPrice()) : product.getSellPrice() != null)
            return false;
        if (getIsRecommmend() != null ? !getIsRecommmend().equals(product.getIsRecommmend()) : product.getIsRecommmend() != null)
            return false;
        if (getCreated() != null ? !getCreated().equals(product.getCreated()) : product.getCreated() != null)
            return false;
        return getUpdated() != null ? getUpdated().equals(product.getUpdated()) : product.getUpdated() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getTypeId() != null ? getTypeId().hashCode() : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + (getSubTitle() != null ? getSubTitle().hashCode() : 0);
        result = 31 * result + (getImageSrc() != null ? getImageSrc().hashCode() : 0);
        result = 31 * result + (getInventNumber() != null ? getInventNumber().hashCode() : 0);
        result = 31 * result + (getMothSellNumber() != null ? getMothSellNumber().hashCode() : 0);
        result = 31 * result + (getOrderLink() != null ? getOrderLink().hashCode() : 0);
        result = 31 * result + (getRealPrice() != null ? getRealPrice().hashCode() : 0);
        result = 31 * result + (getSellPrice() != null ? getSellPrice().hashCode() : 0);
        result = 31 * result + (getIsRecommmend() != null ? getIsRecommmend().hashCode() : 0);
        result = 31 * result + (getCreated() != null ? getCreated().hashCode() : 0);
        result = 31 * result + (getUpdated() != null ? getUpdated().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", typeId=" + typeId +
                ", name='" + name + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", imageSrc='" + imageSrc + '\'' +
                ", inventNumber=" + inventNumber +
                ", mothSellNumber=" + mothSellNumber +
                ", orderLink='" + orderLink + '\'' +
                ", realPrice=" + realPrice +
                ", sellPrice=" + sellPrice +
                ", isRecommmend=" + isRecommmend +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
