package com.ishop.servlet;

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

@WebServlet("/delAdmin")
public class DeleteAdminServlet extends HttpServlet{
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            try{
                AdminDao ad = new AdminDaoImpl();
                String paramId = request.getParameter("id");
                Integer id = Integer.parseInt(paramId);
                boolean result = ad.delete(id);
                PrintWriter out = response.getWriter();
//                if (result == true){
//                    //删除成功
//                    request.getRequestDispatcher("sucess.jsp").forward(request,response);
//                }else{
//                    request.getRequestDispatcher("fail.jsp").forward(request,response);
//                }
                String message;
                if(result == true){
                    message = "删除成功!";
                }else{
                    message = "删除失败!";
                }
               out.println(message);
               out.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            doPost(request,response);
        }
    }


