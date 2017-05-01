package com.ishop.portal.servlet.product;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ishop.dao.CartDao;
import com.ishop.dao.impl.CartDaoImpl;
import com.ishop.pojo.Cart;
import com.ishop.pojo.User;
import com.ishop.util.DBUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by tao on 2017/5/2 0002.
 */
@WebServlet(name = "ListCartServlet",urlPatterns = "/listCartByUser")
public class ListCartByUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            Map<String,Object> map = new HashMap<String, Object>() ;
            //获取session对象
            HttpSession session = request.getSession();
            PrintWriter out = response.getWriter();
            User user = (User) session.getAttribute("user");
            if(user == null){
                //未登录,跳转到登录页面
                out.println(false);
                out.close();
            } else{
                //用户已登录
               CartDao cd = new CartDaoImpl();
               String sql = "SELECT cart.id,product.id,product.name,product.image_src,product.order_link,product.real_price,cart.product_num,(real_price*product_num)as totalPrice"+
                " from product,cart"+
                " where cart.user_id=?"+
                " and cart.product_id=product.id";
               Object [] params = {user.getId()};
                DBUtil db  = new DBUtil();
                ResultSet rs = db.doQuery(sql,params);
                out.println("[");
                int i = 1;
               while (rs.next()) {
                   int cartId = rs.getInt(1);
                   int productId = rs.getInt(2);
                   String name = rs.getString(3);
                   String imgSrc = rs.getString(4);
                   String orderLink = rs.getString(5);
                   BigDecimal realPrice = rs.getBigDecimal(6);
                   int productNum  = rs.getInt(7);
                   BigDecimal totalPrice = rs.getBigDecimal(8);

                   map.put("cartId",cartId);
                   map.put("productId",productId);
                   map.put("name",name);
                   map.put("imageSrc",imgSrc);
                   map.put("orderLink",orderLink);
                   map.put("realPrice",realPrice);
                   map.put("productNum",productNum);
                   map.put("totalPrice",totalPrice);
                   String json = JSON.toJSONString(map, SerializerFeature.WriteDateUseDateFormat,SerializerFeature.PrettyFormat, SerializerFeature.DisableCircularReferenceDetect);
                   if(i == 1){
                       out.println(json);
                   }else {
                       out.println(","+json);
                   }
                  i++;
               }
                out.println("]");
               out.close();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
