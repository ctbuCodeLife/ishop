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
}