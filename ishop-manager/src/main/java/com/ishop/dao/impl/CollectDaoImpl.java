package com.ishop.dao.impl;

import com.ishop.dao.CollectDao;
import com.ishop.pojo.Collect;
import com.ishop.util.DBUtil;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tao on 2017/5/1 0001.
 */
public class CollectDaoImpl implements CollectDao {
    //添加方法
    public boolean add(Collect collect){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "insert into collect(user_id,product_id,created,updated) values(?,?,?,?)";
        //获取当前时间并设置
        collect.setCreated(new Timestamp(System.currentTimeMillis()));
        collect.setUpdated(new Timestamp(System.currentTimeMillis()));
        //sql 的参数
        Object[] params = {
                collect.getUserId(),
                collect.getProductId(),
                collect.getCreated(),
                collect.getUpdated()
        };
        //rowNum表示影响行数,执行SQL
        int rowNum = db.doUpdate(sql,params);
        return rowNum == 1;
    }
    //更新方法
    public boolean update(Collect collect){
        //数据库工具类
        DBUtil db = new DBUtil();
        //获取当前时间并设置
        collect.setUpdated(new Timestamp(System.currentTimeMillis()));
        //sql statement
        String sql = "update collect set user_id=?,product_id=?,updated=? where id=?";
        //sql 的参数
        Object[] params = {
                collect.getUserId(),
                collect.getProductId(),
                collect.getUpdated(),
                collect.getId()
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
        String sql = "delete from collect where id=?";
        //sql 的参数
        Object[] params = {id};
        //rowNum表示影响行数,执行SQL
        int rowNum = db.doUpdate(sql,params);
        return rowNum == 1;
    }
    //根据对象删除
    public boolean delete(Collect collect){
        return  delete(collect.getId());
    }
    //根据Id获取对象
    public Collect get(Integer id){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select user_id,product_id,created,updated from collect where id =?";
        //sql 的参数
        Object[] params = {id};
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql,params);
        //查询返回的对象
        Collect collect = new Collect();
        try {
            if (rs.next()){
                collect.setUserId(rs.getInt(1));
                collect.setProductId(rs.getInt(2));
                collect.setCreated(rs.getTimestamp(3));
                collect.setUpdated(rs.getTimestamp(4));
                collect.setId(id);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return collect ;
    }
    //统计总条数
    public int getTotal(){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select count(id) from collect";
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
    public List<Collect> list(){
        return list(0,Short.MAX_VALUE);
    }
    /**
     * @param start 开始位置
     * @param count 数量
     * @return start到count范围的对象
     */
    public List<Collect> list(int start ,int count){
        //返回的列表
        List<Collect> list = new ArrayList<Collect>();
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select * from collect order by id limit ?,?";
        Object[] params = {start,count};
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql,params);
        //查询返回的对象
        try {
            while (rs.next()){
                Collect collect = new Collect();
                collect.setId(rs.getInt(1));
                collect.setUserId(rs.getInt(2));
                collect.setProductId(rs.getInt(3));
                collect.setCreated(rs.getTimestamp(4));
                collect.setUpdated(rs.getTimestamp(5));
                list.add(collect);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list ;
    }
}
