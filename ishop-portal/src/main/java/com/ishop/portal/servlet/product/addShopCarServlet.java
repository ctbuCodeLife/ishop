package com.ishop.portal.servlet.product;

import com.ishop.dao.CartDao;
import com.ishop.dao.impl.CartDaoImpl;
import com.ishop.pojo.Cart;
import com.ishop.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by myq on 2017/5/2.
 */
@WebServlet(name = "addShopCarServlet",urlPatterns = "/addShopCart")
public class addShopCarServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            //获取session对象
            HttpSession session = request.getSession();
            //提示页面
            String redirectPath = "info.jsp";
            String autoReturnPath = "";
            String msg = "";//返回信息

            User user = (User) session.getAttribute("user");
            if(user == null){
                //未登录,跳转到登录页面
                msg = "您还未登录,请登陆后在加入购物车!3秒后自动跳转到登录页面";
                autoReturnPath = "login.jsp";
            } else{
                //用户已登录
                //获取表单提交的参数
                String productId = request.getParameter("productId");
                String number = request.getParameter("number");
                Cart cart = new Cart();
                cart.setUserId(user.getId());
                cart.setProductId(Integer.parseInt(productId));
                cart.setProductNum(Integer.parseInt(number));
                cart.setIsBuy(0);
                //插入数据库
                CartDao cd = new CartDaoImpl();
                boolean result = cd.add(cart);
                if(result == true){
                    //添加购物车成功,跳转会商品详情页
                    msg = "添加购物车成功,3秒后跳转会商品详情页.";
                    autoReturnPath = "productDetail.jsp?id="+productId;
                }else{
                    //添加购物车失败,跳转会商品详情页
                    //添加购物车成功,跳转会商品详情页
                    msg = "添加购物车失败,3秒后跳转会商品详情页.";
                    autoReturnPath = "productDetail.jsp?id="+productId;
                }
            }
            response.sendRedirect(redirectPath);
            session.setAttribute("msg",msg);
            session.setAttribute("autoReturn",autoReturnPath);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
