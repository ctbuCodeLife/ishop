package com.ishop.dao.impl;

import com.ishop.dao.ReceiverDao;
import com.ishop.pojo.Receiver;
import com.ishop.util.DBUtil;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tao on 2017/5/1 0001.
 */
public class ReceiverDaoImpl implements ReceiverDao {
    //添加方法
    public boolean add(Receiver receiver){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "insert into receiver(user_id,name,phone,address,email,zipcode,is_default,created,updated) values(?,?,?,?,?,?,?,?,?)";
        //获取当前时间并设置
        receiver.setCreated(new Timestamp(System.currentTimeMillis()));
        receiver.setUpdated(new Timestamp(System.currentTimeMillis()));
        //sql 的参数
        Object[] params = {
                receiver.getUserId(),
                receiver.getName(),
                receiver.getPhone(),
                receiver.getAddress(),
                receiver.getEmail(),
                receiver.getZipcode(),
                receiver.getIsDefault(),
                receiver.getCreated(),
                receiver.getUpdated()
        };
        //rowNum表示影响行数,执行SQL
        int rowNum = db.doUpdate(sql,params);
        return rowNum == 1;
    }
    //更新方法
    public boolean update(Receiver receiver){
        //数据库工具类
        DBUtil db = new DBUtil();
        //获取当前时间并设置
        receiver.setUpdated(new Timestamp(System.currentTimeMillis()));
        //sql statement
        String sql = "update receiver set user_id=?,name=?,phone=?,address=?,email=?,zipcode=?,is_default=?,updated=? where id=?";
        //sql 的参数
        Object[] params = {
                receiver.getUserId(),
                receiver.getName(),
                receiver.getPhone(),
                receiver.getAddress(),
                receiver.getEmail(),
                receiver.getZipcode(),
                receiver.getIsDefault(),
                receiver.getUpdated(),
                receiver.getId()
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
        String sql = "delete from receiver where id=?";
        //sql 的参数
        Object[] params = {id};
        //rowNum表示影响行数,执行SQL
        int rowNum = db.doUpdate(sql,params);
        return rowNum == 1;
    }
    //根据对象删除
    public boolean delete(Receiver receiver){
        return  delete(receiver.getId());
    }
    //根据Id获取对象
    public Receiver get(Integer id){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select user_id,name,phone,address,email,zipcode,is_default,created,updated from receiver where id =?";
        //sql 的参数
        Object[] params = {id};
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql,params);
        //查询返回的对象
        Receiver receiver = new Receiver();
        try {
            if (rs.next()){
                receiver.setUserId(rs.getInt(1));
                receiver.setName(rs.getString(2));
                receiver.setPhone(rs.getString(3));
                receiver.setAddress(rs.getString(4));
                receiver.setEmail(rs.getString(5));
                receiver.setZipcode(rs.getString(6));
                receiver.setIsDefault(rs.getInt(7));
                receiver.setCreated(rs.getTimestamp(8));
                receiver.setUpdated(rs.getTimestamp(9));
                receiver.setId(id);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return receiver ;
    }
    //统计总条数
    public int getTotal(){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select count(id) from receiver";
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
    public List<Receiver> list(){
        return list(0,Short.MAX_VALUE);
    }
    /**
     * @param start 开始位置
     * @param count 数量
     * @return start到count范围的对象
     */
    public List<Receiver> list(int start ,int count){
        //返回的列表
        List<Receiver> list = new ArrayList<Receiver>();
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select * from receiver order by id limit ?,?";
        Object[] params = {start,count};
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql,params);
        //查询返回的对象
        try {
            while (rs.next()){
                Receiver receiver = new Receiver();
                receiver.setId(rs.getInt(1));
                receiver.setUserId(rs.getInt(2));
                receiver.setName(rs.getString(3));
                receiver.setPhone(rs.getString(4));
                receiver.setAddress(rs.getString(5));
                receiver.setEmail(rs.getString(6));
                receiver.setZipcode(rs.getString(7));
                receiver.setIsDefault(rs.getInt(8));
                receiver.setCreated(rs.getTimestamp(9));
                receiver.setUpdated(rs.getTimestamp(10));

                list.add(receiver);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list ;
    }
}
