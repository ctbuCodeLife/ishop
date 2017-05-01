package com.ishop.portal.servlet.user;

import com.ishop.dao.UserDao;
import com.ishop.dao.impl.UserDaoImpl;
import com.ishop.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by tao on 2017/4/23 0023.
 */
@WebServlet(name = "AddUserServlet",urlPatterns = "/addUser")
public class AddUserServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        try{
            //获取表单提交的参数
            String name = request.getParameter("name");
            String password = request.getParameter("password");
//            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
//            String realName = request.getParameter("realName");
            //设置User对象
            User user = new User();
//            user.setName(name);
            user.setPassword(password);
//            user.setRealName(realName);
//            user.setEmail(email);
            user.setPhone(phone);
            //插入数据库
            UserDao ad = new UserDaoImpl();
            boolean result = ad.add(user);
            //获取数据库中的user
            user = ad.get(user.getName());
            //提示信息的页面
            String redirectPage = "info.jsp";
            //自动跳转目录
            String autoReturnPage ;
            //获取session
            HttpSession session = request.getSession();
            //返回的提示信息
            String msg;
            if (result == true) {
                //注册成功
                msg = "注册成功,正在自动登录,3秒后跳转到主页.";
                autoReturnPage = "index.jsp";
                session.setAttribute("user",user);
            }else {
                msg = "注册失败!3秒后跳转到注册界面!";
                autoReturnPage = "register.jsp";
            }
            session.setAttribute("msg",msg);
            session.setAttribute("autoReturn",autoReturnPage);
            response.sendRedirect(redirectPage);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
