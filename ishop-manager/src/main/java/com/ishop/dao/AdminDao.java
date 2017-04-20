package com.ishop.dao;

import com.ishop.pojo.Admin;

import java.util.List;
import java.util.Map;

/**
 * Created by tao on 2017/4/19 0019.
 */
public interface AdminDao {
    //保存方法
    public boolean save(Admin admin);
    //更新方法
    public boolean update(Admin admin);
    //根据Id删除
    public boolean delete(Integer id);
    //根据对象删除
    public boolean delete(Admin admin);
    //根据Id获取对象
    public Admin get(Integer id);
    //统计总条数
    public int countAll();
    //查询列表
    public List<Admin> listAll();
    //根据Id判断对象是否存在
    public  boolean exists(Integer id);
    //根据管理员名判断对象是否存在
    public  boolean exists(String name);
    //根据登录名和密码获取对象
    public  Admin get(String name,String password);
}
