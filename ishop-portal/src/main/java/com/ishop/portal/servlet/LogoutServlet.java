package com.ishop.portal.servlet;

import com.ishop.pojo.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by tao on 2017/4/23 0023.
 */
@WebServlet(name = "LogoutServlet",urlPatterns = "/logout")
public class LogoutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            HttpSession session = request.getSession();
            User user = (User)session.getAttribute("user");
            //返回信息
            String msg = "";
            //重定向目录
            String redirctPage = "info.jsp";
            String autoReturnPage = "";
            if (user == null){
                //用户没有登录,自动跳转到login.jsp
                msg = "用户没有登录";
                autoReturnPage = "login.jsp";
            }else {
                //用户注销成功,自动跳转到主页
                msg = "用户注销成功.";
                autoReturnPage = "index.jsp";
                session.removeAttribute("user");
            }
            session.setAttribute("msg",msg);
            session.setAttribute("autoReturn",autoReturnPage);
            response.sendRedirect(redirctPage);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
