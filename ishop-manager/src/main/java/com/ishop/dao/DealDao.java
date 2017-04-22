package com.ishop.dao;

import com.ishop.pojo.Deal;

import java.util.List;

/**
 * Created by tao on 2017/4/20 0020.
 */
public interface DealDao {
    //添加方法
    public boolean add(Deal deal);
    //根据Id删除
    public boolean delete(Integer id);
    //更新方法
    public boolean update(Deal deal);
    //根据Id获取对象
    public Deal get(Integer id);
    //统计总条数
    public int getTotal();
    //查询列表
    public List<Deal> list();
    //查询列表
    public List<Deal> list(int start,int count);
    //根据Id判断对象是否存在
    public  boolean exists(Integer id);
    //根据名字判断对象是否存在
    public  boolean exists(String name);
}
