package com.ishop.dao.impl;

import com.ishop.dao.CartDao;
import com.ishop.pojo.Cart;
import com.ishop.util.DBUtil;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tao on 2017/5/1 0001.
 */
public class CartDaoImpl implements CartDao {
    //添加方法
    public boolean add(Cart cart){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "insert into cart(user_id,product_id,product_num,is_buy,created,updated) values(?,?,?,?,?,?)";
        //获取当前时间并设置
        cart.setCreated(new Timestamp(System.currentTimeMillis()));
        cart.setUpdated(new Timestamp(System.currentTimeMillis()));
        //sql 的参数
        Object[] params = {
                cart.getUserId(),
                cart.getProductId(),
                cart.getProductNum(),
                cart.getIsBuy(),
                cart.getCreated(),
                cart.getUpdated()
        };
        //rowNum表示影响行数,执行SQL
        int rowNum = db.doUpdate(sql,params);
        return rowNum == 1;
    }
    //更新方法
    public boolean update(Cart cart){
        //数据库工具类
        DBUtil db = new DBUtil();
        //获取当前时间并设置
        cart.setUpdated(new Timestamp(System.currentTimeMillis()));
        //sql statement
        String sql = "update cart set user_id=?,product_id=?,product_num=?,is_buy=?,updated=? where id=?";
        //sql 的参数
        Object[] params = {
                cart.getUserId(),
                cart.getProductId(),
                cart.getProductNum(),
                cart.getIsBuy(),
                cart.getUpdated(),
                cart.getId()
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
        String sql = "delete from cart where id=?";
        //sql 的参数
        Object[] params = {id};
        //rowNum表示影响行数,执行SQL
        int rowNum = db.doUpdate(sql,params);
        return rowNum == 1;
    }
    //根据对象删除
    public boolean delete(Cart cart){
        return  delete(cart.getId());
    }
    //根据Id获取对象
    public Cart get(Integer id){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select user_id,product_id,product_num,is_buy,created,updated from cart where id =?";
        //sql 的参数
        Object[] params = {id};
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql,params);
        //查询返回的对象
        Cart cart = new Cart();
        try {
            if (rs.next()){
                cart.setUserId(rs.getInt(1));
                cart.setProductId(rs.getInt(2));
                cart.setProductNum(rs.getInt(3));
                cart.setIsBuy(rs.getInt(4));
                cart.setCreated(rs.getTimestamp(5));
                cart.setUpdated(rs.getTimestamp(6));
                cart.setId(id);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return cart ;
    }
    //统计总条数
    public int getTotal(){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select count(id) from cart";
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
    public List<Cart> list(){
        return list(0,Short.MAX_VALUE);
    }
    /**
     * @param start 开始位置
     * @param count 数量
     * @return start到count范围的对象
     */
    public List<Cart> list(int start ,int count){
        //返回的列表
        List<Cart> list = new ArrayList<Cart>();
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select * from cart order by id limit ?,?";
        Object[] params = {start,count};
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql,params);
        //查询返回的对象
        try {
            while (rs.next()){
                Cart cart = new Cart();
                cart.setId(rs.getInt(1));
                cart.setUserId(rs.getInt(2));
                cart.setProductId(rs.getInt(3));
                cart.setProductNum(rs.getInt(4));
                cart.setIsBuy(rs.getInt(5));
                cart.setCreated(rs.getTimestamp(6));
                cart.setUpdated(rs.getTimestamp(7));
                list.add(cart);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list ;
    }
}
