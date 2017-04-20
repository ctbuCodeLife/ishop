package com.ishop.dao;

import com.ishop.pojo.Releave;

import java.util.List;

/**
 * Created by tao on 2017/4/19 0019.
 */
public interface ReleaveDao {
    //保存方法
    public boolean save(Releave releave);
    //更新方法
    public boolean update(Releave releave);
    //根据Id删除
    public boolean delete(Integer id);
    //根据对象删除
    public boolean delete(Releave releave);
    //根据Id获取对象
    public Releave get(Integer id);
    //统计总条数
    public int countAll();
    //查询列表
    public List<Releave> listAll();
    //根据Id判断对象是否存在
    public  boolean exists(Integer id);
}
