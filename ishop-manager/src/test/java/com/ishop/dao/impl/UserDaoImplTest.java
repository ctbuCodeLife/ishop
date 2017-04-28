package com.ishop.dao.impl; 

import com.ishop.dao.UserDao;
import com.ishop.pojo.User;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/** 
* UserDaoImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 23, 2017</pre> 
* @version 1.0 
*/ public class UserDaoImplTest {

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: add(User user) 
* 
*/ 
@Test
public void testAdd() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: update(User user) 
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
public void testDeleteId() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: delete(User user) 
* 
*/ 
@Test
public void testDeleteUser() throws Exception { 
//TODO: Test goes here...
    UserDao ud = new UserDaoImpl();
    boolean result = ud.delete(1);
    assertTrue(result);
} 

/** 
* 
* Method: get(Integer id) 
* 
*/ 
@Test
public void testGetId() throws Exception { 
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
    UserDao ud = new UserDaoImpl();
    List<User> list = new ArrayList<User>();
    list = ud.list();
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

/** 
* 
* Method: exists(Integer id) 
* 
*/ 
@Test
public void testExistsId() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: exists(String name) 
* 
*/ 
@Test
public void testExistsName() throws Exception { 
//TODO: Test goes here...
    UserDao ud = new UserDaoImpl();
    String name = "";
    System.out.println(ud.exists(name));
} 

/** 
* 
* Method: get(String name, String password) 
* 
*/ 
@Test
public void testGetForNamePassword() throws Exception { 
//TODO: Test goes here... 
} 


} 

import com.ishop.dao.UserDao;
import com.ishop.pojo.User;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/** 
* UserDaoImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 23, 2017</pre> 
* @version 1.0 
*/ public class UserDaoImplTest {

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: add(User user) 
* 
*/ 
@Test
public void testAdd() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: update(User user) 
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
public void testDeleteId() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: delete(User user) 
* 
*/ 
@Test
public void testDeleteUser() throws Exception { 
//TODO: Test goes here...
    UserDao ud = new UserDaoImpl();
    boolean result = ud.delete(1);
    assertTrue(result);
} 

/** 
* 
* Method: get(Integer id) 
* 
*/ 
@Test
public void testGetId() throws Exception { 
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
    UserDao ud = new UserDaoImpl();
    List<User> list = new ArrayList<User>();
    list = ud.list();
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

/** 
* 
* Method: exists(Integer id) 
* 
*/ 
@Test
public void testExistsId() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: exists(String name) 
* 
*/ 
@Test
public void testExistsName() throws Exception { 
//TODO: Test goes here...
    UserDao ud = new UserDaoImpl();
    String name = "";
    System.out.println(ud.exists(name));
} 

/** 
* 
* Method: get(String name, String password) 
* 
*/ 
@Test
public void testGetForNamePassword() throws Exception { 
//TODO: Test goes here... 
} 


} 

import com.ishop.dao.UserDao;
import com.ishop.pojo.User;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

/** 
* UserDaoImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 23, 2017</pre> 
* @version 1.0 
*/ public class UserDaoImplTest {

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: add(User user) 
* 
*/ 
@Test
public void testAdd() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: update(User user) 
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
public void testDeleteId() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: delete(User user) 
* 
*/ 
@Test
public void testDeleteUser() throws Exception { 
//TODO: Test goes here...
    //测试成功
//    UserDao ud = new UserDaoImpl();
//    boolean result = ud.delete(1);
//    assertTrue(result);
} 

/** 
* 
* Method: get(Integer id) 
* 
*/ 
@Test
public void testGetId() throws Exception { 
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
    UserDao ud = new UserDaoImpl();
    List<User> list = new ArrayList<User>();
    list = ud.list();
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

/** 
* 
* Method: exists(Integer id) 
* 
*/ 
@Test
public void testExistsId() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: exists(String name) 
* 
*/ 
@Test
public void testExistsName() throws Exception { 
//TODO: Test goes here...
    UserDao ud = new UserDaoImpl();
    String name = "";
    System.out.println(ud.exists(name));
} 

/** 
* 
* Method: get(String name, String password) 
* 
*/ 
@Test
public void testGetForNamePassword() throws Exception { 
//TODO: Test goes here... 
} 


} 
