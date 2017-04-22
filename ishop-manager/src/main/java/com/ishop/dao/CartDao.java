package com.ishop.dao;

import com.ishop.pojo.Cart;

import java.util.List;

/**
 * Created by tao on 2017/4/20 0020.
 */
public interface CartDao {
    //添加方法
    public boolean add(Cart cart);
    //根据Id删除
    public boolean delete(Integer id);
    //更新方法
    public boolean update(Cart cart);
    //根据Id获取对象
    public Cart get(Integer id);
    //统计总条数
    public int getTotal();
    //查询列表
    public List<Cart> list();
    //查询列表
    public List<Cart> list(int start,int count);
    //根据Id判断对象是否存在
    public  boolean exists(Integer id);
    //根据name判断对象是否存在
    public boolean exists(String name);
}
