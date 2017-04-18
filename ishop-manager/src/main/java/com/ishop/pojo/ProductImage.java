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
}