package com.ishop.util;

import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by tao on 2017/4/19 0019.
 */
public class DBUtilTest {
    @Test
    public  void  testConnet(){
        assertNotNull(DBUtil.getConnection());
    }
}
