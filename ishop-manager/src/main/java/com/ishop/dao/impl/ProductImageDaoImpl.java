package com.ishop.dao.impl;

import com.ishop.dao.ProductImageDao;
import com.ishop.pojo.ProductImage;
import com.ishop.util.DBUtil;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tao on 2017/4/21 0021.
 */
public class ProductImageDaoImpl implements ProductImageDao {
    //保存方法
    public boolean save(ProductImage productImage){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement

        String sql = "insert into product_image(product_id,image_type,image_name,image_link) values(?,?,?,?)";
        //设置图片链接
        String image_link = "img/product/"+productImage.getImageName();
        productImage.setImageLink(image_link);
        //sql 的参数
        Object[] params = {
                productImage.getProductId(),
                productImage.getImageType(),
                productImage.getImageName(),
                productImage.getImageLink(),
        };
        //rowNum表示影响行数,执行SQL
        int rowNum = db.doUpdate(sql,params);
        return rowNum == 1;
    }
    //更新方法
    public boolean update(ProductImage productImage){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "update product_image set product_id=?,image_type=?,image_name=?,image_link=?, id=?";
        //sql 的参数
        Object[] params = {
                productImage.getProductId(),
                productImage.getImageType(),
                productImage.getImageName(),
                productImage.getImageLink(),
                productImage.getId()
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
        String sql = "delete from product_image where id=?";
        //sql 的参数
        Object[] params = {id};
        //rowNum表示影响行数,执行SQL
        int rowNum = db.doUpdate(sql,params);
        return rowNum == 1;
    }
    //根据对象删除
    public boolean delete(ProductImage productImage){
        return delete(productImage.getId());
    }
    //根据Id获取对象
    public ProductImage get(Integer id){
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select product_id,image_type,image_name,image_link from product_image where id =?";
        //sql 的参数
        Object[] params = {id};
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql,params);
        //查询返回的对象
        ProductImage productImage = new ProductImage();
        try {
            if (rs.next()){
                productImage.setProductId(rs.getInt(1));
                productImage.setImageType(rs.getString(2));
                productImage.setImageName(rs.getString(3));
                productImage.setImageLink(rs.getString(4));
                productImage.setId(id);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return productImage ;

    }
    //统计总条数
    public int countAll(){

        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select count(id) from `product_image`";
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
    public List<ProductImage> listAll(){
        //返回的列表
        List<ProductImage> list = new ArrayList<ProductImage>();
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select * from productImage";
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql);
        try {
            while (rs.next()){
                ProductImage productImage = new ProductImage();
                productImage.setId(rs.getInt(1));
                productImage.setProductId(rs.getInt(2));
                productImage.setImageType(rs.getString(3));
                productImage.setImageName(rs.getString(4));
                productImage.setImageLink(rs.getString(5));
                list.add(productImage);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list ;
    }
    //根据商品id找到所有类型为imageType的图片
    public List<ProductImage> listProductImage(Integer productId,String imageType){
        //返回的列表
        List<ProductImage> list = new ArrayList<ProductImage>();
        //数据库工具类
        DBUtil db = new DBUtil();
        //sql statement
        String sql = "select id,image_name,image_link from product_image where product_id=? and image_type=?";
        //参数
        Object[] params = {productId,imageType};
        //rs表示查询结果集,执行SQL
        ResultSet rs = db.doQuery(sql,params);
        try {
            while (rs.next()){
                ProductImage productImage = new ProductImage();
                productImage.setId(rs.getInt(1));
                productImage.setProductId(productId);
                productImage.setImageType(imageType);
                productImage.setImageName(rs.getString(2));
                productImage.setImageLink(rs.getString(3));
                list.add(productImage);
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
        String sql = "select id from product_image where id=?";
        //sql 的参数
        Object[] params = {id};
        //rowNum表示影响行数,执行SQL
        int rowNum = db.doUpdate(sql,params);
        return rowNum == 1;
    }

}
