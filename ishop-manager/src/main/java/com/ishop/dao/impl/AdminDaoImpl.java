package com.ishop.dao.impl;

import com.ishop.dao.AdminDao;
import com.ishop.pojo.Admin;
import com.ishop.util.DBUtil;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tao on 2017/4/19 0019.
 */
public class AdminDaoImpl implements AdminDao{
    //保存方法
    public boolean save(Admin admin){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "insert into admin(role_id,`name`,`password`,real_name,email,phone,created) values(?,?,?,?,?,?,?)";
        //获取当前时间并设置
        admin.setCreated(new Timestamp(System.currentTimeMillis()));
        //sql 的参数
        Object[] params = {
                admin.getRoleId(),
                admin.getName(),
                admin.getPassword(),
                admin.getRealName(),
                admin.getEmail(),
                admin.getPassword(),
                admin.getCreated()
        };
        //rowNum表示影响行数,执行SQL
        int rowNum = db.doUpdate(sql,params);
        return rowNum == 1;
    }
    //更新方法
    public boolean update(Admin admin){
        //数据库工具类
        DBUtil db = new DBUtil();
        //获取当前时间并设置
        admin.setUpdated(new Timestamp(System.currentTimeMillis()));
        //sql statement
        String sql = "update admin set role_id=?,`name`=?,`password`=?,real_name=?,email=?,phone=?,updated=? where id=?";
        //sql 的参数
        Object[] params = {
                admin.getRoleId(),
                admin.getName(),
                admin.getPassword(),
                admin.getRealName(),
                admin.getEmail(),
                admin.getPhone(),
                admin.getUpdated(),
                admin.getId()
        };
        //rowNum表示影响行数,执行SQL
        int rowNum = db.doUpdate(sql,params);
        return rowNum == 1;
    }
    //根据Id删除
    public boolean delete(Integer id){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "delete from admin where id=?";
        //sql 的参数
        Object[] params = {id};
        //rowNum表示影响行数,执行SQL
        int rowNum = db.doUpdate(sql,params);
        return rowNum == 1;
    }
    //根据对象删除
    public boolean delete(Admin admin){
        return  delete(admin.getId());
    }
    //根据Id获取对象
    public Admin get(Integer id){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select role_id,`name`,`password`,real_name,email,phone,created,updated from admin where id =?";
        //sql 的参数
        Object[] params = {id};
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql,params);
        //查询返回的对象
        Admin admin = new Admin();
        try {
            if (rs.next()){
               admin.setRoleId(rs.getInt(1));
               admin.setName(rs.getString(2));
               admin.setPassword(rs.getString(3));
               admin.setRealName(rs.getString(4));
               admin.setEmail(rs.getString(5));
               admin.setPhone(rs.getString(6));
               admin.setCreated(rs.getTimestamp(7));
               admin.setUpdated(rs.getTimestamp(8));
               admin.setId(id);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return admin ;
    }
    //统计总条数
    public int countAll(){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select count(id) from admin";
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql);
        //查询返回的条数
        int count = 0;
        try {
            if (rs.next()){
                 count = rs.getInt(1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return count ;
    }
    //查询列表
    public List<Admin> listAll(){
        //返回的列表
        List<Admin> list = new ArrayList<Admin>();
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select * from admin";
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql);
        //查询返回的对象
        try {
            while (rs.next()){
                Admin admin = new Admin();
                admin.setId(rs.getInt(1));
                admin.setRoleId(rs.getInt(2));
                admin.setName(rs.getString(3));
                admin.setPassword(rs.getString(4));
                admin.setRealName(rs.getString(5));
                admin.setEmail(rs.getString(6));
                admin.setPhone(rs.getString(7));
                admin.setCreated(rs.getTimestamp(8));
                admin.setUpdated(rs.getTimestamp(9));
                list.add(admin);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list ;
    }
    //根据Id判断对象是否存在
    public  boolean exists(Integer id){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select id from admin where id =?";
        //sql 的参数
        Object[] params = {id};
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql,params);
        //查询返回的对象
        return  rs != null;
    }
    //根据管理员名判断对象是否存在
    public  boolean exists(String name){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select id from admin where `name`=?";
        //sql 的参数
        Object[] params = {name};
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql,params);
        //查询返回的对象
        return  rs != null;
    }
    //根据登录名和密码获取对象
    public  Admin get(String name,String password){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select id,role_id,real_name,email,phone,created,updated from admin where `name`=? and `password`=?";
        //sql 的参数
        Object[] params = {name,password};
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql,params);
        //查询返回的对象
        //查询返回的对象
        Admin admin = new Admin();
        try {
            if (rs.next()){
                admin.setId(rs.getInt(1));
                admin.setRoleId(rs.getInt(2));
                admin.setRealName(rs.getString(3));
                admin.setEmail(rs.getString(4));
                admin.setPhone(rs.getString(5));
                admin.setCreated(rs.getTimestamp(6));
                admin.setUpdated(rs.getTimestamp(7));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return admin ;
    }
}
