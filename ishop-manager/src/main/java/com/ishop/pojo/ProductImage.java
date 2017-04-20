package com.ishop.pojo;

import java.io.Serializable;

/**
 * @author 
 */
public class ProductImage implements Serializable {
    /**
     * 商品图片id,主键自增
     */
    private Integer id;

    /**
     * 商品id,来自商品表
     */
    private Integer productId;

    /**
     * 图片类别,single:商品缩略图,detail:商品详情图
     */
    private String imageType;

    /**
     * 图片名
     */
    private String imageName;

    /**
     * 图片链接
     */
    private String imageLink;

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

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProductImage)) return false;

        ProductImage that = (ProductImage) o;

        if (getId() != null ? !getId().equals(that.getId()) : that.getId() != null) return false;
        if (getProductId() != null ? !getProductId().equals(that.getProductId()) : that.getProductId() != null)
            return false;
        if (getImageType() != null ? !getImageType().equals(that.getImageType()) : that.getImageType() != null)
            return false;
        if (getImageName() != null ? !getImageName().equals(that.getImageName()) : that.getImageName() != null)
            return false;
        return getImageLink() != null ? getImageLink().equals(that.getImageLink()) : that.getImageLink() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getProductId() != null ? getProductId().hashCode() : 0);
        result = 31 * result + (getImageType() != null ? getImageType().hashCode() : 0);
        result = 31 * result + (getImageName() != null ? getImageName().hashCode() : 0);
        result = 31 * result + (getImageLink() != null ? getImageLink().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ProductImage{" +
                "id=" + id +
                ", productId=" + productId +
                ", imageType='" + imageType + '\'' +
                ", imageName='" + imageName + '\'' +
                ", imageLink='" + imageLink + '\'' +
                '}';
    }
}