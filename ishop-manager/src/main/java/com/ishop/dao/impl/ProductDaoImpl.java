package com.ishop.dao.impl;

import com.ishop.dao.ProductDao;
import com.ishop.pojo.Product;
import com.ishop.util.DBUtil;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tao on 2017/4/21 0021.
 */
public class ProductDaoImpl implements ProductDao{
    //添加方法
    public boolean add(Product product){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "insert into product(type_id,`name`,sub_title,image_src,invent_number,month_sell_number,order_link,real_price,sell_price,is_recommend,created,updated) values(?,?,?,?,?,?,?,?,?,?)";
        //获取当前时间并设置
        product.setCreated(new Timestamp(System.currentTimeMillis()));
        product.setUpdated(new Timestamp(System.currentTimeMillis()));
        //sql 的参数
        Object[] params = {
                product.getTypeId(),
                product.getName(),
                product.getSubTitle(),
                product.getImageSrc(),
                product.getInventNumber(),
                product.getMonthSellNumber(),
                product.getOrderLink(),
                product.getRealPrice(),
                product.getSellPrice(),
                product.getIsRecommend(),
                product.getCreated(),
                product.getUpdated()
        };
        //rowNum表示影响行数,执行SQL
        int rowNum = db.doUpdate(sql,params);
        return rowNum == 1;
    }
    //更新方法
    public boolean update(Product product){
        //数据库工具类
        DBUtil db = new DBUtil();
        //获取当前时间并设置
        product.setUpdated(new Timestamp(System.currentTimeMillis()));
        //sql statement
        String sql = "update product set type_id=?,`name`=?,sub_title=?,image_src=?,invent_number=?,month_sell_number=?,order_link=?,real_price=?,sell_price=?,is_recommend=?,updated=? where id=?";
        //sql 的参数
        Object[] params = {
                product.getTypeId(),
                product.getName(),
                product.getSubTitle(),
                product.getImageSrc(),
                product.getInventNumber(),
                product.getMonthSellNumber(),
                product.getOrderLink(),
                product.getRealPrice(),
                product.getSellPrice(),
                product.getIsRecommend(),
                product.getUpdated(),
                product.getId()
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
        String sql = "delete from product where id=?";
        //sql 的参数
        Object[] params = {id};
        //rowNum表示影响行数,执行SQL
        int rowNum = db.doUpdate(sql,params);
        return rowNum == 1;
    }
    //根据对象删除
    public boolean delete(Product product){
        return  delete(product.getId());
    }
    //根据Id获取对象
    public Product get(Integer id){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select type_id,`name`,sub_title,image_src,invent_number,month_sell_number,order_link,real_price,sell_price,is_recommend,created,updated from product where id =?";
        //sql 的参数
        Object[] params = {id};
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql,params);
        //查询返回的对象
        Product product = new Product();
        try {
            if (rs.next()){
                product.setTypeId(rs.getInt(1));
                product.setName(rs.getString(2));
                product.setSubTitle(rs.getString(3));
                product.setImageSrc(rs.getString(4));
                product.setInventNumber(rs.getInt(5));
                product.setMonthSellNumber(rs.getInt(6));
                product.setOrderLink(rs.getString(7));
                product.setRealPrice(rs.getBigDecimal(8));
                product.setSellPrice(rs.getBigDecimal(9));
                product.setIsRecommend(rs.getInt(10));
                product.setCreated(rs.getTimestamp(11));
                product.setUpdated(rs.getTimestamp(12));
                product.setId(id);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return product ;
    }
    //统计总条数
    public int getTotal(){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select count(id) from product";
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
    public List<Product> list(){
        return list(0,Short.MAX_VALUE);
    }
    /**
     * @param start 开始位置
     * @param count 数量
     * @return start到count范围的对象
     */
    public List<Product> list(int start ,int count){
        //返回的列表
        List<Product> list = new ArrayList<Product>();
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select * from product order by id limit ?,?";
        Object[] params = {start,count};
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql,params);
        //查询返回的对象
        try {
            while (rs.next()){
                Product product = new Product();
                product.setId(rs.getInt(1));
                product.setTypeId(rs.getInt(2));
                product.setName(rs.getString(3));
                product.setSubTitle(rs.getString(4));
                product.setImageSrc(rs.getString(5));
                product.setInventNumber(rs.getInt(6));
                product.setMonthSellNumber(rs.getInt(7));
                product.setOrderLink(rs.getString(8));
                product.setRealPrice(rs.getBigDecimal(9));
                product.setSellPrice(rs.getBigDecimal(10));
                product.setIsRecommend(rs.getInt(11));
                product.setCreated(rs.getTimestamp(12));
                product.setUpdated(rs.getTimestamp(13));
                list.add(product);
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
        String sql = "select id from product where id =?";
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
        String sql = "select id from product where `name`=?";
        //sql 的参数
        Object[] params = {name};
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql,params);
        //查询返回的对象
        return  rs != null;
    }
}