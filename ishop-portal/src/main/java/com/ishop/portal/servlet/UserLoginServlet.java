package com.ishop.portal.servlet;

import com.ishop.dao.UserDao;
import com.ishop.dao.impl.UserDaoImpl;
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
 * Created by tao on 2017/4/23 0023.
 */
@WebServlet(name = "UserLoginServlet",urlPatterns = "/userLogin")
public class UserLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            //获取前台表单传入的数据
            String name = request.getParameter("name");
            String password = request.getParameter("password");

            UserDao ad = new UserDaoImpl();
            User  user= new User();
            //通过用户名和密码获取user对象
            user = ad.get(name,password);
            //获取session对象
            HttpSession session = request.getSession();
            //提示页面
            String redirectPath = "info.jsp";
            String autoReturnPath = "";
            String msg = "";//返回信息
            if (user.getId() != null){
                //登录成功,跳转到index,jsp
                //设置session
                session.setAttribute("user",user);
                msg = "登录成功,3秒后自动跳转到首页";
                autoReturnPath = "index.jsp";
            }else{
                //没找到
                msg = "登录失败,请确定用户名和密码是否输入正确!3秒后自动跳转到登录页面";
                autoReturnPath = "login.jsp";
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
