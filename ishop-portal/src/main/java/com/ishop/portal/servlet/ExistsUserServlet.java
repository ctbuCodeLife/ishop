package com.ishop.portal.servlet;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ishop.dao.UserDao;
import com.ishop.dao.impl.UserDaoImpl;
import com.ishop.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by tao on 2017/4/23 0023.
 */
@WebServlet(name = "ExistsUserServlet",urlPatterns = "/existsUser")
public class ExistsUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            UserDao ad = new UserDaoImpl();
            String name = request.getParameter("name");
            boolean result = ad.exists(name);
            System.out.println(result);
            PrintWriter out = response.getWriter();
            if(result == true) {
                //用户存在
                out.println("true");
                out.close();
            }else{
                out.println("false");
                out.close();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
