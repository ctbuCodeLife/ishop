package com.ishop.portal.servlet.user;

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
@WebServlet(name = "GeUserByNameServlet",urlPatterns = "/getUserByName")
public class GeUserByNameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            UserDao ad = new UserDaoImpl();
            String name = request.getParameter("name");
            User admin = ad.get(name);
            PrintWriter out = response.getWriter();
            String json = JSON.toJSONString(admin, SerializerFeature.WriteDateUseDateFormat,SerializerFeature.PrettyFormat, SerializerFeature.DisableCircularReferenceDetect);
            if(admin != null) {
                request.setAttribute("admin",admin);
                out.println(json);
                out.close();
            }else{
                out.println("获取失败!");
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

