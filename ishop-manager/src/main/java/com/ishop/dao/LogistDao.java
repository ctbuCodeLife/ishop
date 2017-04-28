package com.ishop.dao;

import com.ishop.pojo.Logist;

import java.util.List;

/**
 * Created by tao on 2017/4/19 0019.
 */
public interface LogistDao {
    //添加方法
    public boolean add(Logist logist);
    //根据Id删除
    public boolean delete(Integer id);
    //更新方法
    public boolean update(Logist logist);
    //根据Id获取对象
    public Logist get(Integer id);
    //统计总条数
    public int getTotal();
    //查询列表
    public List<Logist> list();
    //查询列表
    public List<Logist> list(int start,int count);
    //根据Id判断对象是否存在
    public  boolean exists(Integer id);

}
