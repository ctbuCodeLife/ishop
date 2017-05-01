package com.ishop.dao;

import com.ishop.pojo.Product;

import java.util.List;

/**
 * Created by tao on 2017/4/19 0019.
 */
public interface ProductDao {
    //添加方法
    public boolean add(Product product);
    //根据Id删除
    public boolean delete(Integer id);
    //更新方法
    public boolean update(Product product);
    //根据Id获取对象
    public Product get(Integer id);
    //根据name获取对象
    public Product get(String name);
    //统计总条数
    public int getTotal();
    //查询列表
    public List<Product> list();
    //查询列表
    public List<Product> list(int start,int count);
    //根据typeID查询列表
    public List<Product> list(int typeId);
    //根据Id判断对象是否存在
    public  boolean exists(Integer id);
    //根据name判断对象是否存在
    public  boolean exists(String name);
}
