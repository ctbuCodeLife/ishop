package com.ishop.portal.servlet.product;

import com.ishop.dao.CartDao;
import com.ishop.dao.impl.CartDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by tao on 2017/5/2 0002.
 */
@WebServlet(name = "DeleteCartServlet",urlPatterns = "/deleteCart")
public class DeleteCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int id = Integer.parseInt(request.getParameter("id"));
            CartDao cd = new CartDaoImpl();
            boolean result = cd.delete(id);
//            PrintWriter out = response.getWriter();
//            out.println(result);
//            out.close();
            //获取session对象
            HttpSession session = request.getSession();
            //提示页面
            String redirectPath = "info.jsp";
            String autoReturnPath = "";
            String msg = "";//返回信息
            if (result == true){
                //删除成功,跳转到shopCar.jsp
                msg = "删除购物车成功,3秒后自动跳转到购物车页面";
                autoReturnPath = "shopCar.jsp";
            }else{
                //删除失败,跳转到shopCar.jsp
                msg = "删除购物车失败,3秒后自动跳转到购物车页面";
                autoReturnPath = "shopCar.jsp";
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
