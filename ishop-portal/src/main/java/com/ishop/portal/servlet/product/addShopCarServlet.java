package com.ishop.portal.servlet.product;

import com.ishop.dao.CartDao;
import com.ishop.dao.impl.CartDaoImpl;
import com.ishop.pojo.Cart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by myq on 2017/5/2.
 */
@WebServlet(name = "addShopCarServlet",urlPatterns = "/addShopCart")
public class addShopCarServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            //获取表单提交的参数
            String userId = request.getParameter("userId");
            String productId = request.getParameter("productId");
            String number = request.getParameter("number");
            Cart cart = new Cart();
            cart.setUserId(Integer.parseInt(userId));
            cart.setProductId(Integer.parseInt(productId));
            cart.setProductNum(Integer.parseInt(number));
            cart.setIsBuy(0);
            //插入数据库
            CartDao cd = new CartDaoImpl();
            boolean result = cd.add(cart);
            //返回信息给前台
            PrintWriter out = response.getWriter();
            //返回信息
            out.println(result);
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
