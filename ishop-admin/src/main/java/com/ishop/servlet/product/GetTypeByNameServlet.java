package com.ishop.servlet.product;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ishop.dao.TypeDao;
import com.ishop.dao.impl.TypeDaoImpl;
import com.ishop.pojo.Type;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by tao on 2017/4/28 0028.
 */
@WebServlet(name = "GetTypeByNameServlet",urlPatterns = "/getTypeByName")
public class GetTypeByNameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            TypeDao ad = new TypeDaoImpl();
            String name = request.getParameter("name");
            Type type = ad.get(name);
            PrintWriter out = response.getWriter();
            //将list的数据转换成JSON返回给前台
            //JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd";
            //SerializerFeature.WriteDateUseDateFormat用来将日期格式化成yyyy-MM-dd的形式
            String json = JSON.toJSONString(type, SerializerFeature.WriteDateUseDateFormat,SerializerFeature.PrettyFormat, SerializerFeature.DisableCircularReferenceDetect);
            if(type != null) {
                out.println(json);
                out.close();
            }else{
                out.println(false);
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
