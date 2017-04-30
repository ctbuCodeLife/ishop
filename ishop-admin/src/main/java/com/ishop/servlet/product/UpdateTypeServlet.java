package com.ishop.servlet.product;

import com.ishop.dao.TypeDao;
import com.ishop.dao.impl.TypeDaoImpl;
import com.ishop.pojo.Type;

import javax.persistence.criteria.CriteriaBuilder;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by tao on 2017/5/1 0001.
 */
@WebServlet(name = "UpdateTypeServlet",urlPatterns = "/updateType")
public class UpdateTypeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            //获取参数
            int id = Integer.parseInt(request.getParameter("id"));
            int grade = Integer.parseInt(request.getParameter("grade"));
            String name = request.getParameter("name");
            int parentId = Integer.parseInt(request.getParameter("parentId"));
            String describe = request.getParameter("describe");

            //设置对象
            Type type = new Type();
            type.setId(id);
            type.setGrade(grade);
            type.setName(name);
            type.setParentId(parentId);
            type.setDescribe(describe);

            //执行更新
            TypeDao td = new TypeDaoImpl();
            boolean result = td.update(type);

            //输出结果
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
