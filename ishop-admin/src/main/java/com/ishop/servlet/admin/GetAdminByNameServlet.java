package com.ishop.servlet.admin;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
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
@WebServlet(name = "GetAdminByNameServlet",urlPatterns = "/getAdminByName")
public class GetAdminByNameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            AdminDao ad = new AdminDaoImpl();
            String name = request.getParameter("name");
            boolean result = ad.exists(name);
            PrintWriter out = response.getWriter();
            out.println(result);
//            Admin admin = ad.get(name);
//
//            String json = JSON.toJSONString(admin, SerializerFeature.WriteDateUseDateFormat,SerializerFeature.PrettyFormat, SerializerFeature.DisableCircularReferenceDetect);
//            if(admin != null) {
//                request.setAttribute("admin",admin);
//                out.println(json);
//                out.close();
//            }else{
//                //查询失败
//                out.println(false);
//                out.close();
//            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request,response);
    }
}
