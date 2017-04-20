package com.ishop.dao;

import com.ishop.pojo.Leave;

import java.util.List;

/**
 * Created by tao on 2017/4/19 0019.
 */
public interface LeaveDao {
    //保存方法
    public boolean save(Leave leave);
    //更新方法
    public boolean update(Leave leave);
    //根据Id删除
    public boolean delete(Integer id);
    //根据对象删除
    public boolean delete(Leave leave);
    //根据Id获取对象
    public Leave get(Integer id);
    //统计总条数
    public int countAll();
    //查询列表
    public List<Leave> listAll();
    //根据Id判断对象是否存在
    public  boolean exists(Integer id);

}
