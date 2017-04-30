package com.ishop.dao.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ishop.dao.AdminDao;
import com.ishop.pojo.Admin;;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
/**
 * Created by tao on 2017/4/21 0021.
 */
public class AdminDaoImplTest {
    @Test
    public  void testadd(){
//        Admin admin = new Admin();
//        admin.setRoleId(2);
//        admin.setRealName("testAdmin");
//        AdminDao ad  = new AdminDaoImpl();
//        assertTrue(ad.add(admin));
    }
    @Test
    public void testUpdate(){
//        String roleId = 3;
//        String name =
//        String password =;
//        String realName = ;
//        String email = ;
//        String phone = ;
//        //设置Admin对象
//        Admin admin = new Admin();
//        admin.setRoleId(Integer.parseInt(roleId));
//        admin.setName(name);
//        admin.setPassword(password);
//        admin.setRealName(realName);
//        admin.setEmail(email);
//        admin.setPhone(phone);
//        //插入数据库
//        AdminDao ad = new AdminDaoImpl();
//        boolean result = ad.update(admin);
//        admin.setPhone("18787381223");
//        admin.setId(4);//此id为testAdmin用户id,
//        AdminDao ad = new AdminDaoImpl();
//        assertTrue(ad.update(admin));
    }
    @Test
    public void testDelete(){
       // 白盒测试,可以删除,测试过程不可逆
//        AdminDao ad = new AdminDaoImpl();
//        int id = 8;
//        assertTrue(ad.delete(id));
    }
    @Test
    public void testGetById(){
        int id = 2;//此id为root的id;
        AdminDao ad  = new AdminDaoImpl();
        Admin admin = ad.get(id);
        System.out.println(admin);
        assertNotNull(admin);
    }
    @Test
    public void testgetTotal(){
        int count = 0;
        AdminDao ad = new AdminDaoImpl();
        count = ad.getTotal();
        assertTrue(count > 0);
    }
    @Test
    public void testlist(){
        List<Admin> list = new ArrayList<Admin>();
        AdminDao ad = new AdminDaoImpl();
        list = ad.list();
        //将list的数据转换成JSON返回给前台
        //JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
        //SerializerFeature.WriteDateUseDateFormat用来将日期格式化成yyyy-MM-dd的形式
        String json = JSON.toJSONString(list,SerializerFeature.WriteDateUseDateFormat,SerializerFeature.PrettyFormat, SerializerFeature.DisableCircularReferenceDetect);
        System.out.println(json);
        assertNotNull(list);
    }
    @Test
    public  void testExistsById(){
        //int id = 2;//此id为root的id
//        Integer id = new Integer(2);
//        AdminDao ad = new AdminDaoImpl();
//        assertTrue(ad.exists(id));
    }
    @Test
    public  void testExistsByName(){
        String name = "root";
        AdminDao ad = new AdminDaoImpl();
        assertTrue(ad.exists(name));
    }
    //根据登录名和密码获取对象
    @Test
    public  void testGetNameAndPassword(){
        String name = "root";
        String password = "123456";
        AdminDao ad = new AdminDaoImpl();
        assertNotNull(ad.get(name,password));
    }
    @Test
    public void testGetByName(){
        String name = "root";
        AdminDao ad = new AdminDaoImpl();
        Admin admin = ad.get(name);
        System.out.println(admin);
        assertNotNull(admin);
    }

}
