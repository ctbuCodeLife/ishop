package com.ishop.dao.impl;

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
    public  void testSave(){
        Admin admin = new Admin();
        admin.setRoleId(2);
        admin.setRealName("testAdmin");
        AdminDao ad  = new AdminDaoImpl();
        assertTrue(ad.save(admin));
    }
    @Test
    public void testUpdate(){
        Admin admin = new Admin();
        admin.setPhone("18787381223");
        admin.setId(2);//此id为root用户id,
        AdminDao ad = new AdminDaoImpl();
        assertTrue(ad.update(admin));
    }
    @Test
    public void testDelete(){

    }
    @Test
    public void testGetById(){
        int id = 2;//此id为root的id;
        AdminDao ad  = new AdminDaoImpl();
        assertNotNull(ad.get(id));
    }
    @Test
    public void testCountAll(){
        int count = 0;
        AdminDao ad = new AdminDaoImpl();
        count = ad.countAll();
        assertTrue(count > 0);
    }
    @Test
    public void testListAll(){
        List<Admin> list = new ArrayList<Admin>();
        AdminDao ad = new AdminDaoImpl();
        list = ad.listAll();
        assertNotNull(list);
    }
    @Test
    public  void testExistsById(){
        //int id = 2;//此id为root的id
        Integer id = new Integer(2);
        AdminDao ad = new AdminDaoImpl();
        assertTrue(ad.exists(id));
    }
    public  void testExistsByName(){
        String name = "root";
        AdminDao ad = new AdminDaoImpl();
        assertTrue(ad.exists(name));
    }
    //根据登录名和密码获取对象
    public  void testGetNameAndPassword(){
        String name = "root";
        String password = "123456";
        AdminDao ad = new AdminDaoImpl();
        assertNotNull(ad.get(name,password));
    }
}
