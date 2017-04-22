package com.ishop.dao;

import com.ishop.pojo.ProductImage;

import java.util.List;

/**
 * Created by tao on 2017/4/19 0019.
 */
public interface ProductImageDao {
    //保存方法
    public boolean save(ProductImage productImage);
    //更新方法
    public boolean update(ProductImage productImage);
    //根据Id删除
    public boolean delete(Integer id);
    //根据对象删除
    public boolean delete(ProductImage productImage);
    //根据Id获取对象
    public ProductImage get(Integer id);
    //根据商品id找到所有类型为imageType的图片
    public List<ProductImage> listProductImage(Integer productId,String imageType);
    //统计总条数
    public int countAll();
    //查询列表
    public List<ProductImage> listAll();
    //根据Id判断对象是否存在
    public  boolean exists(Integer id);

}
