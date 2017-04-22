package com.ishop.dao;

import com.ishop.pojo.ProductImage;

import java.util.List;

/**
 * Created by tao on 2017/4/19 0019.
 */
public interface ProductImageDao {
    //添加方法
    public boolean add(ProductImage productImage);
    //根据Id删除
    public boolean delete(Integer id);
    //更新方法
    public boolean update(ProductImage productImage);
    //根据Id获取对象
    public ProductImage get(Integer id);
    //根据商品id找到所有类型为imageType的图片
    public List<ProductImage> listProductImage(Integer productId,String imageType);
    //统计总条数
    public int getTotal();
    //查询列表
    public List<ProductImage> list();
    //查询列表
    public List<ProductImage> list(int start,int count);
    //根据Id判断对象是否存在
    public  boolean exists(Integer id);

}
