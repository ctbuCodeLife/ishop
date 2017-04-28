package com.ishop.dao.impl; 

import com.ishop.dao.TypeDao;
import com.ishop.pojo.Type;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/** 
* TypeDaoImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 28, 2017</pre> 
* @version 1.0 
*/ 
public class TypeDaoImplTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: add(Type type) 
* 
*/ 
@Test
public void testAdd() throws Exception { 
//TODO: Test goes here...
    //测试成功
//    Type type = new Type();
//    type.setParentId(1);
//    type.setName("test");
//    type.setDescribe("hh");
//    type.setGrade(2);
//    TypeDao td = new TypeDaoImpl();
//    boolean result = td.add(type);
//    assertTrue(result);
} 

/** 
* 
* Method: update(Type type) 
* 
*/ 
@Test
public void testUpdate() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: delete(Integer id) 
* 
*/ 
@Test
public void testDelete() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: get(Integer id) 
* 
*/ 
@Test
public void testGet() throws Exception { 
//TODO: Test goes here... 
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
//TODO: Test goes here...
    TypeDao td = new TypeDaoImpl();
    List<Type> list = td.list();
    for(Type type : list){
        System.out.println(type);
    }
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

/** 
* 
* Method: exists(Integer id) 
* 
*/ 
@Test
public void testExists() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: parentList(int grade) 
* 
*/ 
@Test
public void testParentList() throws Exception { 
//TODO: Test goes here...
    TypeDao td = new TypeDaoImpl();
    List<Type> list= new ArrayList<Type>();
    int childGrade = 2;
    list = td.getParentList(2);
    for(Type t : list){
        System.out.println(t);
    }
    assertNotNull(list);
} 


} 
