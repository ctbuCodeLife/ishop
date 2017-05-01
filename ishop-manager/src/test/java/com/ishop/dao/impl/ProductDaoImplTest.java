package com.ishop.dao.impl; 

import com.ishop.dao.ProductDao;
import com.ishop.pojo.Product;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;

/** 
* ProductDaoImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 29, 2017</pre> 
* @version 1.0 
*/ 
public class ProductDaoImplTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: add(Product product) 
* 
*/ 
@Test
public void testAdd() throws Exception { 
//TODO: Test goes here... 
} 

/** 
* 
* Method: update(Product product) 
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
* Method: delete(Product product) 
* 
*/ 
@Test
public void testDeleteProduct() throws Exception { 
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
* Method: getByName(String name) 
* 
*/ 
@Test
public void testGetByName() throws Exception { 
//TODO: Test goes here...
    ProductDao pd = new ProductDaoImpl();
    String name ="复古印花羽绒服";
    Product product = pd.get(name);
    assertNotNull(product);
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
}
    @Test
    public void testListByTypeID() throws Exception {
    //测试成功
//        ProductDao pd = new ProductDaoImpl();
//        int typeId = 16;
//        List<Product> list = new ArrayList<Product>();
//        list = pd.list(typeId);
//        System.out.println(list);
//        assertNotNull(list);
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
} 


} 
