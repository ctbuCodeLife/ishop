package com.ishop.dao.impl; 

import com.ishop.dao.CollectDao;
import com.ishop.pojo.Collect;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;


public class CollectDaoImplTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: add(Collect collect) 
* 
*/ 
@Test
public void testAdd() throws Exception {
    //测试成功
//    Collect collect = new Collect();
//    CollectDao cd = new CollectDaoImpl();
//
//    collect.setUserId(1);
//    collect.setProductId(2);
//
//    boolean result = cd.add(collect);
//    assertTrue(result);
} 


/** 
* 
* Method: update(Collect collect) 
* 
*/ 
@Test
public void testUpdate() throws Exception {

} 

/** 
* 
* Method: delete(Integer id) 
* 
*/ 
@Test
public void testDeleteId() throws Exception {
    //测试成功
//    Collect cart = new Collect();
//    CollectDao cd = new CollectDaoImpl();
//    int id = 1;
//    boolean result = cd.delete(1);
//    assertTrue(result);
}

/** 
* 
* Method: delete(Collect collect) 
* 
*/ 
@Test
public void testDeleteCollect() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: get(Integer id) 
* 
*/ 
@Test
public void testGet() throws Exception {
    //测试成功
    Collect collect = new Collect();
    CollectDao cd = new CollectDaoImpl();
    int id = 2;
    collect = cd.get(id);
    System.out.println(collect);
    assertNotNull(collect);
}

/** 
* 
* Method: getTotal() 
* 
*/ 
@Test
public void testGetTotal() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: list() 
* 
*/ 
@Test
public void testList() throws Exception {
    //测试成功
    Collect collect = new Collect();
    CollectDao cd = new CollectDaoImpl();
    List<Collect> list = new ArrayList<Collect>();
    list = cd.list();
    System.out.println(list);
    assertNotNull(list);
}

/** 
* 
* Method: list(int start, int count) 
* 
*/ 
@Test
public void testListForStartCount() throws Exception { 
//TODO: Test goes here... 
} 


} 
