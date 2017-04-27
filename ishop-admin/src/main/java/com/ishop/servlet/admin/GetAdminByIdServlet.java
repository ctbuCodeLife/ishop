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
import java.util.List;

/**
 * Created by tao on 2017/4/22 0022.
 */
@WebServlet(name="GetAdminByIdServlet",urlPatterns = "/getAdmin")
public class GetAdminByIdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            AdminDao ad = new AdminDaoImpl();
            String paramId = request.getParameter("id");
            Integer id = Integer.parseInt(paramId);
            Admin admin = ad.get(id);
            PrintWriter out = response.getWriter();
            //将list的数据转换成JSON返回给前台
            //JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd";
            //SerializerFeature.WriteDateUseDateFormat用来将日期格式化成yyyy-MM-dd的形式
            String json = JSON.toJSONString(admin, SerializerFeature.WriteDateUseDateFormat,SerializerFeature.PrettyFormat, SerializerFeature.DisableCircularReferenceDetect);
            if(admin != null) {
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
