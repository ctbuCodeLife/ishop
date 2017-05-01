package com.ishop.dao.impl;

import com.ishop.dao.OrderDao;
import com.ishop.dao.OrderItemDao;
import com.ishop.pojo.Order;
import com.ishop.pojo.OrderItem;
import com.ishop.util.DBUtil;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tao on 2017/5/1 0001.
 */
public class OrderItemDaoImpl implements OrderItemDao {
    //添加方法
    public boolean add(OrderItem orderItem){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "insert into `order_item`(order_id,product_id,product_num,total,remark) values(?,?,?,?,?)";
        //sql 的参数
        Object[] params = {
                orderItem.getOrderId(),
                orderItem.getProductId(),
                orderItem.getProductNum(),
                orderItem.getTotal(),
                orderItem.getRemark()
        };
        //rowNum表示影响行数,执行SQL
        int rowNum = db.doUpdate(sql,params);
        return rowNum == 1;
    }
    //更新方法
    public boolean update(OrderItem orderItem){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "update `order_item` set order_id=?,product_id=?,product_num=?,total=?,remark=? where id=?";
        //sql 的参数
        Object[] params = {
                orderItem.getOrderId(),
                orderItem.getProductId(),
                orderItem.getProductNum(),
                orderItem.getTotal(),
                orderItem.getRemark(),
                orderItem.getId()
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
        String sql = "delete from `order_item` where id=?";
        //sql 的参数
        Object[] params = {id};
        //rowNum表示影响行数,执行SQL
        int rowNum = db.doUpdate(sql,params);
        return rowNum == 1;
    }
    //根据对象删除
    public boolean delete(OrderItem orderItem){
        return  delete(orderItem.getId());
    }
    //根据Id获取对象
    public OrderItem get(Integer id){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select order_id,product_id,product_num,total,remark from `order_item` where id =?";
        //sql 的参数
        Object[] params = {id};
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql,params);
        //查询返回的对象
        OrderItem orderItem = new OrderItem();
        try {
            if (rs.next()){
                orderItem.setOrderId(rs.getInt(1));
                orderItem.setProductId(rs.getInt(2));
                orderItem.setProductNum(rs.getInt(3));
                orderItem.setTotal(rs.getBigDecimal(4));
                orderItem.setRemark(rs.getString(5));
                orderItem.setId(id);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return orderItem ;
    }
    //统计总条数
    public int getTotal(){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select count(id) from `order_item`";
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
    public List<OrderItem> list(){
        return list(0,Short.MAX_VALUE);
    }
    /**
     * @param start 开始位置
     * @param count 数量
     * @return start到count范围的对象
     */
    public List<OrderItem> list(int start ,int count){
        //返回的列表
        List<OrderItem> list = new ArrayList<OrderItem>();
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select * from `order_item` order by id limit ?,?";
        Object[] params = {start,count};
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql,params);
        try {
            while (rs.next()){
                OrderItem orderItem = new OrderItem();

                orderItem.setId(rs.getInt(1));
                orderItem.setOrderId(rs.getInt(2));
                orderItem.setProductId(rs.getInt(3));
                orderItem.setProductNum(rs.getInt(4));
                orderItem.setTotal(rs.getBigDecimal(5));
                orderItem.setRemark(rs.getString(6));

                list.add(orderItem);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list ;
    }

}
