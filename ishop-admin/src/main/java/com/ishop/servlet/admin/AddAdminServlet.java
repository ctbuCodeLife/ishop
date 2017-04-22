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
@WebServlet(name = "AddAdminServlet",urlPatterns = "/addAdmin")
public class AddAdminServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
           //获取表单提交的参数
            String roleId = request.getParameter("roleId");
            String name = request.getParameter("name");
            String password = request.getParameter("password");
            String realName = request.getParameter("realName");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
           //设置Admin对象
            Admin admin = new Admin();
            admin.setRoleId(Integer.parseInt(roleId));
            admin.setName(name);
            admin.setPassword(password);
            admin.setRealName(realName);
            admin.setEmail(email);
            admin.setPhone(phone);
            //插入数据库
            AdminDao ad = new AdminDaoImpl();
            boolean result = ad.add(admin);
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
