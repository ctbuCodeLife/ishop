package com.ishop.dao;

import com.ishop.pojo.Property;

import java.util.List;

/**
 * Created by tao on 2017/4/19 0019.
 */
public interface PropertyDao {
    //保存方法
    public boolean add(Property property);
    //根据Id删除
    public boolean delete(Integer id);
    //更新方法
    public boolean update(Property property);
    //根据Id获取对象
    public Property get(Integer id);
    //统计总条数
    public int getTotal();
    //查询列表
    public List<Property> list();
    //根据Id判断对象是否存在
    public  boolean exists(Integer id);
}
