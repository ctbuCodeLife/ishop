package com.ishop.dao.impl;

import com.ishop.dao.TypeDao;
import com.ishop.pojo.Type;
import com.ishop.pojo.Type;
import com.ishop.util.DBUtil;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tao on 2017/4/21 0021.
 */
public class TypeDaoImpl implements TypeDao {
    //保存方法
    public boolean save(Type type){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "insert into `type`(parent_id,`name`,`describe`,grade,created) values(?,?,?,?,?)";
        //获取当前时间并设置
        type.setCreated(new Timestamp(System.currentTimeMillis()));
        //sql 的参数
        Object[] params = {
                type.getParentId(),
                type.getName(),
                type.getDescribe(),
                type.getGrade(),
                type.getCreated()
        };
        //rowNum表示影响行数,执行SQL
        int rowNum = db.doUpdate(sql,params);
        return rowNum == 1;
    }
    //更新方法
    public boolean update(Type type){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "update `type` set parent_id=?,`name`=?,`describe`=?,grade=?,updated=? where id=?";
        //获取当前时间并设置
        type.setUpdated(new Timestamp(System.currentTimeMillis()));
        //sql 的参数
        Object[] params = {
                type.getParentId(),
                type.getName(),
                type.getDescribe(),
                type.getGrade(),
                type.getUpdated(),
                type.getId()
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
        String sql = "delete from `type` where id=?";
        //sql 的参数
        Object[] params = {id};
        //rowNum表示影响行数,执行SQL
        int rowNum = db.doUpdate(sql,params);
        return rowNum == 1;
    }
    //根据对象删除
    public boolean delete(Type type){
        return delete(type.getId());
    }
    //根据Id获取对象
    public Type get(Integer id){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select parent_id,`name`,`describe`,grade,created,updated from `type` where id =?";
        //sql 的参数
        Object[] params = {id};
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql,params);
        //查询返回的对象
        Type type = new Type();
        try {
            if (rs.next()){
                type.setParentId(rs.getInt(1));
                type.setName(rs.getString(2));
                type.setDescribe(rs.getString(3));
                type.setGrade(rs.getByte(4));
                type.setCreated(rs.getTimestamp(5));
                type.setUpdated(rs.getTimestamp(6));
                type.setId(id);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return type ;

    }
    //统计总条数
    public int countAll(){

        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select count(id) from `type`";
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
    public List<Type> listAll(){
        //返回的列表
        List<Type> list = new ArrayList<Type>();
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select * from `type`";
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql);
        //查询返回的对象
        Type type = new Type();
        try {
            if (rs.next()){
                type.setId(rs.getInt(1));
                type.setParentId(rs.getInt(2));
                type.setName(rs.getString(3));
                type.setDescribe(rs.getString(4));
                type.setGrade(rs.getByte(5));
                type.setCreated(rs.getTimestamp(6));
                type.setUpdated(rs.getTimestamp(7));
                list.add(type);
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
        String sql = "select id from `type` where id=?";
        //sql 的参数
        Object[] params = {id};
        //rowNum表示影响行数,执行SQL
        int rowNum = db.doUpdate(sql,params);
        return rowNum == 1;
    }
}