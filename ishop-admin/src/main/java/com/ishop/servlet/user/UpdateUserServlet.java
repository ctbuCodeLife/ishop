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
 * Created by tao on 2017/4/22 0022.
 */
@WebServlet(name = "UpdateUserServlet",urlPatterns = "/updateUser")
public class UpdateUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            //获取表单提交的参数
            String id = request.getParameter("id");
            String name = request.getParameter("name");
            String password = request.getParameter("password");
            String realName = request.getParameter("realName");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            //设置User对象
            User user = new User();
            user.setId(Integer.parseInt(id));
            user.setName(name);
            user.setPassword(password);
            user.setRealName(realName);
            user.setEmail(email);
            user.setPhone(phone);
            //插入数据库
            UserDao ud = new UserDaoImpl();
            boolean result = ud.update(user);
            //返回信息给前台
            PrintWriter out = response.getWriter();
            //返回信息
            String msg = "";
            if (result == true){
                msg = "添加成功!";
            }else {
                msg = "添加失败!";
            }
            out.println(msg);
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
