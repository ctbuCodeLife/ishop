package com.ishop.servlet.admin;

import com.ishop.dao.AdminDao;
import com.ishop.dao.impl.AdminDaoImpl;
import com.ishop.pojo.Admin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by tao on 2017/4/22 0022.
 */
@WebServlet(name="AdminLoginServlet",urlPatterns = "/adminLogin")
public class AdminLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       try {
           //获取前台表单传入的数据
           String name = request.getParameter("name");
           String password = request.getParameter("password");

           AdminDao ad = new AdminDaoImpl();
           Admin admin = new Admin();
           //通过用户名和密码获取admin对象
           admin = ad.get(name,password);

           PrintWriter out = response.getWriter();
           String pagePath = "WEB-INF/page/";
           if (admin.getId() != null){
               //找到了
               //设置session
               request.getSession().setAttribute("admin",admin);
               response.sendRedirect("sucess.jsp");
           }else{
               //没找到
              response.sendRedirect("fail.jsp");
           }

       }catch (Exception e){
           e.printStackTrace();
       }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

import com.ishop.dao.AdminDao;
import com.ishop.dao.impl.AdminDaoImpl;
import com.ishop.pojo.Admin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by tao on 2017/4/22 0022.
 */
@WebServlet(name="AdminLoginServlet",urlPatterns = "/adminLogin")
public class AdminLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       try {
           //获取前台表单传入的数据
           String name = request.getParameter("name");
           String password = request.getParameter("password");

           AdminDao ad = new AdminDaoImpl();
           Admin admin = new Admin();
           //通过用户名和密码获取admin对象
           admin = ad.get(name,password);

           PrintWriter out = response.getWriter();
           String pagePath = "WEB-INF/page/";
           if (admin.getId() != null){
               //找到了
               //设置session
               request.getSession().setAttribute("admin",admin);
               response.sendRedirect("sucess.jsp");
           }else{
               //没找到
              response.sendRedirect("fail.jsp");
           }

       }catch (Exception e){
           e.printStackTrace();
       }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

import com.ishop.dao.AdminDao;
import com.ishop.dao.impl.AdminDaoImpl;
import com.ishop.pojo.Admin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by tao on 2017/4/22 0022.
 */
@WebServlet(name="AdminLoginServlet",urlPatterns = "/adminLogin")
public class AdminLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       try {
           //获取前台表单传入的数据
           String name = request.getParameter("name");
           String password = request.getParameter("password");

           AdminDao ad = new AdminDaoImpl();
           Admin admin = new Admin();
           //通过用户名和密码获取admin对象
           admin = ad.get(name,password);

           PrintWriter out = response.getWriter();
           String pagePath = "WEB-INF/page/";
           if (admin.getId() != null){
               //找到了
               //设置session
               request.getSession().setAttribute("admin",admin);
               response.sendRedirect("sucess.jsp");
           }else{
               //没找到
           }

       }catch (Exception e){
           e.printStackTrace();
       }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
