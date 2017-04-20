package com.ishop.dao;

import com.ishop.pojo.PropertyValue;

import java.util.List;

/**
 * Created by tao on 2017/4/19 0019.
 */
public interface PropertyValueDao {
    //保存方法
    public boolean save(PropertyValue propertyValue);
    //更新方法
    public boolean update(PropertyValue propertyValue);
    //根据Id删除
    public boolean delete(Integer id);
    //根据对象删除
    public boolean delete(PropertyValue propertyValue);
    //根据Id获取对象
    public PropertyValue get(Integer id);
    //统计总条数
    public int countAll();
    //查询列表
    public List<PropertyValue> listAll();
    //根据Id判断对象是否存在
    public  boolean exists(Integer id);
}
