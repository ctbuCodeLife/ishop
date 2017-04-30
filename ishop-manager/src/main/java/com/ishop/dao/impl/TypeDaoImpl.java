package com.ishop.dao.impl;

import com.ishop.dao.TypeDao;
import com.ishop.pojo.Product;
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
    //添加方法
    public boolean add(Type type){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "insert into `type`(parent_id,`name`,`describe`,grade,created,updated) values(?,?,?,?,?,?)";
        //获取当前时间并设置
        type.setCreated(new Timestamp(System.currentTimeMillis()));
        type.setUpdated(new Timestamp(System.currentTimeMillis()));
        //sql 的参数
        Object[] params = {
                type.getParentId(),
                type.getName(),
                type.getDescribe(),
                type.getGrade(),
                type.getCreated(),
                type.getUpdated()
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
                type.setGrade(rs.getInt(4));
                type.setCreated(rs.getTimestamp(5));
                type.setUpdated(rs.getTimestamp(6));
                type.setId(id);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return type ;
    }
    //根据name获取对象
    public Type get(String name){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select id,parent_id,`describe`,grade,created,updated from `type` where `name` =?";
        //sql 的参数
        Object[] params = {name};
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql,params);
        //查询返回的对象
        Type type = new Type();
        try {
            if (rs.next()){
                type.setId(rs.getInt(1));
                type.setParentId(rs.getInt(2));
                type.setDescribe(rs.getString(3));
                type.setGrade(rs.getInt(4));
                type.setCreated(rs.getTimestamp(5));
                type.setUpdated(rs.getTimestamp(6));
                type.setName(name);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return type ;

    }
    //统计总条数
    public int getTotal(){

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
    public List<Type> list(){
        return list(0,Short.MAX_VALUE);
    }
    /**
     * @param start 开始位置
     * @param count 数量
     * @return start到count范围的对象
     */
    public List<Type> list(int start, int count){
        //返回的列表
        List<Type> list = new ArrayList<Type>();
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select * from `type` order by id limit ?,?";
        Object[] params = {start,count};
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql,params);
        //查询返回的对象

        try {
            while (rs.next()){
                Type type = new Type();
                type.setId(rs.getInt(1));
                type.setParentId(rs.getInt(2));
                type.setName(rs.getString(3));
                type.setDescribe(rs.getString(4));
                type.setGrade(rs.getInt(5));
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
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql,params);
        //查询返回的对象
        try {
            if (rs.next()){
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    //根据name判断对象是否存在
    public  boolean exists(String name){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select id from `type` where `name`=?";
        //sql 的参数
        Object[] params = {name};
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql,params);
        //查询返回的对象
        try {
            if (rs.next()){
                return true;
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
    /**
     * 通过子类别等级获取所有父类别
     * @param grade 类别等级
     * @return 所有父类别
     */
    public  List<Type> getParentList(int grade){
        if (grade > 1){
            //表示类别等级不为1的父类别
            int parentGrade = grade - 1;
            //返回的列表
            List<Type> parentList = new ArrayList<Type>();
            //数据库工具类
            DBUtil db = new DBUtil();
            //sql statement
            String sql = "select * from `type` where grade = ? order by id ";
            Object[] params = {parentGrade};
            //rs表示查询结果集,执行SQL
            ResultSet rs = db.doQuery(sql,params);
            //查询返回的对象

           try {
                while (rs.next()){
                    Type type = new Type();
                    type.setId(rs.getInt(1));
                    type.setParentId(rs.getInt(2));
                    type.setName(rs.getString(3));
                    type.setDescribe(rs.getString(4));
                    type.setGrade(rs.getInt(5));
                    type.setCreated(rs.getTimestamp(6));
                    type.setUpdated(rs.getTimestamp(7));
                    parentList.add(type);
                }
                return parentList ;
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        //类别等级为1时没有父类别.
        return null;
    }
}