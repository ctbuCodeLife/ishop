package com.ishop.portal.servlet.product;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ishop.dao.OrderDao;
import com.ishop.dao.impl.OrderDaoImpl;
import com.ishop.pojo.Order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by myq on 2017/5/2.
 */
@WebServlet(name = "listOrderServlet",urlPatterns = "/listOrder")
public class listOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            int userId = Integer.parseInt(request.getParameter("userId"));
            OrderDao ord = new OrderDaoImpl();
            List<Order> list = ord.list();
            for(int i=0;i<list.size();i++){
                if (list.get(i).getUserId()!=userId){
                    list.remove(i);
                }
            }
            PrintWriter out = response.getWriter();
            //将list的数据转换成JSON返回给前台
            //JSON.DEFFAULT_DATE_FORMAT = "yyyy-MM-dd";
            //SerializerFeature.WriteDateUseDateFormat用来将日期格式化成yyyy-MM-dd的形式
            String json = JSON.toJSONString(list, SerializerFeature.WriteDateUseDateFormat,SerializerFeature.PrettyFormat, SerializerFeature.DisableCircularReferenceDetect);
            if(list != null) {
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
