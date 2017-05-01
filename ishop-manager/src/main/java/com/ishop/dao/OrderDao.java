package com.ishop.dao;

import com.ishop.pojo.Leave;
import com.ishop.pojo.Order;

import java.util.List;

/**
 * Created by tao on 2017/4/19 0019.
 */
public interface OrderDao {
    //添加方法
    public boolean add(Order order);
    //根据Id删除
    public boolean delete(Integer id);
    //更新方法
    public boolean update(Order order);
    //根据Id获取对象
    public Order get(Integer id);
    //统计总条数
    public int getTotal();
    //查询列表
    public List<Order> list();
    //查询列表
    public List<Order> list(int start,int count);

}
