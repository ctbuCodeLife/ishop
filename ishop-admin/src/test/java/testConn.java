import com.ishop.util.DBUtil;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Created by tao on 2017/4/22 0022.
 */
public class testConn {
    @Test
    public  void  testConnet(){
        assertNotNull(DBUtil.getConnection());
    }
}
