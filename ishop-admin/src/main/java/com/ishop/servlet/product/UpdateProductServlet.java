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

import static java.lang.Integer.parseInt;

/**
 * Created by myq on 2017/4/29.
 */
@WebServlet(name = "UpdateProductServlet")
public class UpdateProductServlet extends HttpServlet {
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
            product.setName(name);
            product.setSubTitle(subTitle);
            product.setTypeId(parseInt(typeId));
            product.setImageSrc(imageSrc);
            product.setInventNumber(parseInt(inventNum));
            product.setIsRecommend(parseInt(isRecommend));
            product.setMonthSellNumber(parseInt(saleNum));
            product.setOrderLink(orderLink);
            BigDecimal bdrealPrice=new BigDecimal(realPrice);
            BigDecimal bdsalePrice=new BigDecimal(salePrice);
            product.setRealPrice(bdrealPrice);
            product.setSellPrice(bdsalePrice);
            //插入数据库
            ProductDao pd = new ProductDaoImpl();
            boolean result = pd.update(product);
            //返回信息给前台01
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
            System.out.println("enter catch");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
