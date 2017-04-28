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
@WebServlet(name = "DeleteUserServlet",urlPatterns = "/delUser")
public class DeleteUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            UserDao ud = new UserDaoImpl();
            String paramId = request.getParameter("id");
            Integer id = Integer.parseInt(paramId);
            boolean result = ud.delete(id);
            PrintWriter out = response.getWriter();
            String message="";
            if(result == true){
                message = "delect sucess!";
            }else{
                message = "delete failure!";
            }
            out.println(message);
            out.close();
            System.out.print(1111);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
