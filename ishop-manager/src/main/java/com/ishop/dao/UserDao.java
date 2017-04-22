package com.ishop.dao;

import com.ishop.pojo.User;

import java.util.List;

/**
 * Created by tao on 2017/4/19 0019.
 */
public interface UserDao {
    //保存方法
    public boolean add(User user);
    //根据Id删除
    public boolean delete(Integer id);
    //更新方法
    public boolean update(User user);
    //根据Id获取对象
    public User get(Integer id);
    //统计总条数
    public int getTotal();
    //查询列表
    public List<User> list();
    //根据Id判断对象是否存在
    public  boolean exists(Integer id);
    public  boolean exists(String name);
    //根据登录名和密码获取对象
    public User get(String name, String password);
}
