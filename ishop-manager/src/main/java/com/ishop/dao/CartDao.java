package com.ishop.dao;

import com.ishop.pojo.Cart;

import java.util.List;

/**
 * Created by tao on 2017/4/20 0020.
 */
public interface CartDao {
    //保存方法
    public boolean save(Cart cart);
    //更新方法
    public boolean update(Cart cart);
    //根据Id删除
    public boolean delete(Integer id);
    //根据对象删除
    public boolean delete(Cart cart);
    //根据Id获取对象
    public Cart get(Integer id);
    //统计总条数
    public int countAll();
    //查询列表
    public List<Cart> listAll();
    //根据Id判断对象是否存在
    public  boolean exists(Integer id);
    //根据管理员名判断对象是否存在
    public  boolean exists(String name);
    //根据登录名和密码获取对象
    public  Cart get(String name,String password);
}
