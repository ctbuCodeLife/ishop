package com.ishop.servlet.product;

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
 * Created by myq on 2017/4/23.
 */
@WebServlet(name = "AddTypeServlet",urlPatterns = "/addType")
public class AddTypeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            //获取参数
            String parentId = request.getParameter("parentId");
            String name = request.getParameter("name");
            String describe = request.getParameter("describe");
            String grade = request.getParameter("grade");
            //设置对象
            Type type = new Type();
            type.setParentId(Integer.parseInt(parentId));
            type.setName(name);
            type.setDescribe(describe);
            type.setGrade(Integer.parseInt(grade));
            //插入数据
            TypeDao td = new TypeDaoImpl();
            boolean result = td.add(type);
            //返回数据给前台
            PrintWriter out = response.getWriter();
            out.println(result);
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
