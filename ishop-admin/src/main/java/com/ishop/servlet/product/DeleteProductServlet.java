package com.ishop.servlet.product;

import com.ishop.dao.ProductDao;
import com.ishop.dao.impl.ProductDaoImpl;

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
@WebServlet(name = "DeleteProductServlet",urlPatterns = "/delProduct")
public class DeleteProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            ProductDao pd = new ProductDaoImpl();
            String paramId = request.getParameter("id");
            Integer id = Integer.parseInt(paramId);
            boolean result = pd.delete(id);
            PrintWriter out = response.getWriter();
            out.println(result);
            out.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
