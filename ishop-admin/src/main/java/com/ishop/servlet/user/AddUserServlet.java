package com.ishop.servlet.user;

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
 * Created by myq on 2017/4/22 0022.
 */
@WebServlet(name = "AddUserServlet",urlPatterns = "/addUser")
public class AddUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            System.out.print("enter AddUserServlet.java");
            //获取表单提交的参数
            String name = request.getParameter("name");
            String password = request.getParameter("password");
            String realName = request.getParameter("realName");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            //设置User对象
            User user = new User();
            user.setName(name);
            user.setPassword(password);
            user.setRealName(realName);
            user.setEmail(email);
            user.setPhone(phone);
            //插入数据库
            UserDao ud = new UserDaoImpl();
            boolean result;
            if (ud.add(user)) {
                result = true;
            } else result = false;
            System.out.print(result);
            //返回信息给前台
            PrintWriter out = response.getWriter();
            //返回信息
            out.println(result);
            out.close();
            System.out.print("exit AddUserServlet.java");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
