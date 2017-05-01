package com.ishop.dao.impl;

import com.ishop.dao.OrderDao;
import com.ishop.pojo.Order;
import com.ishop.pojo.Order;
import com.ishop.util.DBUtil;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tao on 2017/5/1 0001.
 */
public class OrderDaoImpl implements OrderDao{
    //添加方法
    public boolean add(Order order){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "insert into `order`(user_id,product_price,traffic_price,total_price,`status`,created,updated) values(?,?,?,?,?,?,?)";
        //获取当前时间并设置
        order.setCreated(new Timestamp(System.currentTimeMillis()));
        order.setUpdated(new Timestamp(System.currentTimeMillis()));
        //sql 的参数
        Object[] params = {
                order.getUserId(),
                order.getProductPrice(),
                order.getTrafficPrice(),
                order.getTotalPrice(),
                order.getStatus(),
                order.getCreated(),
                order.getUpdated()
        };
        //rowNum表示影响行数,执行SQL
        int rowNum = db.doUpdate(sql,params);
        return rowNum == 1;
    }
    //更新方法
    public boolean update(Order order){
        //数据库工具类
        DBUtil db = new DBUtil();
        //获取当前时间并设置
        order.setUpdated(new Timestamp(System.currentTimeMillis()));
        //sql statement
        String sql = "update `order` set user_id=?,admin_id=?,product_price=?,traffic_price=?,total_price=?,`status`=?,updated=? where id=?";
        //sql 的参数
        Object[] params = {
                order.getUserId(),
                order.getAdminId(),
                order.getProductPrice(),
                order.getTrafficPrice(),
                order.getTotalPrice(),
                order.getStatus(),
                order.getUpdated(),
                order.getId()
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
        String sql = "delete from `order` where id=?";
        //sql 的参数
        Object[] params = {id};
        //rowNum表示影响行数,执行SQL
        int rowNum = db.doUpdate(sql,params);
        return rowNum == 1;
    }
    //根据对象删除
    public boolean delete(Order order){
        return  delete(order.getId());
    }
    //根据Id获取对象
    public Order get(Integer id){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select user_id,admin_id,product_price,traffic_price,total_price,`status`,created,updated from `order` where id =?";
        //sql 的参数
        Object[] params = {id};
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql,params);
        //查询返回的对象
        Order order = new Order();
        try {
            if (rs.next()){
                order.setUserId(rs.getInt(1));
                order.setAdminId(rs.getInt(2));
                order.setProductPrice(rs.getBigDecimal(3));
                order.setTrafficPrice(rs.getBigDecimal(4));
                order.setTotalPrice(rs.getBigDecimal(5));
                order.setStatus(rs.getString(6));
                order.setCreated(rs.getTimestamp(7));
                order.setUpdated(rs.getTimestamp(8));
                order.setId(id);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return order ;
    }
    //统计总条数
    public int getTotal(){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select count(id) from `order`";
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
    public List<Order> list(){
        return list(0,Short.MAX_VALUE);
    }
    /**
     * @param start 开始位置
     * @param count 数量
     * @return start到count范围的对象
     */
    public List<Order> list(int start ,int count){
        //返回的列表
        List<Order> list = new ArrayList<Order>();
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select * from `order` order by id limit ?,?";
        Object[] params = {start,count};
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql,params);
        try {
            while (rs.next()){
                Order order = new Order();
                order.setId(rs.getInt(1));
                order.setUserId(rs.getInt(2));
                order.setAdminId(rs.getInt(3));
                order.setProductPrice(rs.getBigDecimal(4));
                order.setTrafficPrice(rs.getBigDecimal(5));
                order.setTotalPrice(rs.getBigDecimal(6));
                order.setStatus(rs.getString(7));
                order.setCreated(rs.getTimestamp(8));
                order.setUpdated(rs.getTimestamp(9));

                list.add(order);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list ;
    }
}
