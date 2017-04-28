package com.ishop.servlet.product;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ishop.dao.ProductDao;
import com.ishop.dao.impl.ProductDaoImpl;
import com.ishop.pojo.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by myq on 2017/4/28.
 */
@WebServlet(name = "GetProductByNameServlet",urlPatterns = "/getProductByName")
public class GetProductByNameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try{
            ProductDao pd = new ProductDaoImpl();
            String name = request.getParameter("name");
            PrintWriter out = response.getWriter();
            //getByName方法还没写
            Product product = pd.getByName(name);

            String json = JSON.toJSONString(product, SerializerFeature.WriteDateUseDateFormat,SerializerFeature.PrettyFormat, SerializerFeature.DisableCircularReferenceDetect);
            if(product != null) {
                // request.setAttribute("admin",admin);
                out.println(json);
                out.close();
            }else{
                //查询失败
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
