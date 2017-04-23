package com.ishop.servlet.product;

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
import java.math.BigDecimal;

/**
 * Created by myq on 2017/4/23.
 */
@WebServlet(name = "AddProductServlet",urlPatterns = "/addProduct")
public class AddProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            //获取表单提交的参数
            String name = request.getParameter("name");
            String subTitle = request.getParameter("subTitle");
            String typeId = request.getParameter("typeId");
            String imageSrc = request.getParameter("imageSrc");
            String inventNum = request.getParameter("inventNum");
            String saleNum = request.getParameter("saleNum");
            String orderLink = request.getParameter("orderLink");
            String salePrice = request.getParameter("salePrice");
            String realPrice = request.getParameter("realPrice");
            String isRecommend = request.getParameter("isRecommend");
            Product product = new Product();
            product.setImageSrc(imageSrc);
            product.setInventNumber(Integer.parseInt(inventNum));
            product.setIsRecommend(Integer.parseInt(isRecommend));
            product.setMonthSellNumber(Integer.parseInt(saleNum));
            product.setName(name);
            product.setTypeId(Integer.parseInt(typeId));
            product.setOrderLink(orderLink);
            product.setSubTitle(subTitle);
            BigDecimal bdrealPrice=new BigDecimal(realPrice);
            BigDecimal bdsalePrice=new BigDecimal(salePrice);
            product.setSellPrice(bdsalePrice);
            product.setRealPrice(bdrealPrice);
            //插入数据库
            ProductDao pd = new ProductDaoImpl();
            boolean result = pd.add(product);
            //返回信息给前台
            PrintWriter out = response.getWriter();
            //返回信息
            String msg = "";
            if (result == true){
                msg = "添加成功!";
            }else {
                msg = "添加失败!";
            }
            out.println(msg);
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
