package com.ishop.servlet.product;

import com.ishop.dao.TypeDao;
import com.ishop.dao.impl.TypeDaoImpl;

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
@WebServlet(name = "DelTypeServlet",urlPatterns = "/delType")
public class DelTypeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       TypeDao td = new TypeDaoImpl();
        String paramId = request.getParameter("id");
        Integer id = Integer.parseInt(paramId);
        boolean result = td.delete(id);
        PrintWriter out = response.getWriter();
        out.println(result);
        out.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
