package com.ishop.temp;

import com.ishop.pojo.User;
import com.ishop.util.Page;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by tao on 2017/4/22 0022.
 */
public class AdminServlet extends BaseBackServlet {

    public String add(HttpServletRequest request, HttpServletResponse response, Page page) {

        return null;
    }


    public String delete(HttpServletRequest request, HttpServletResponse response, Page page) {
        return null;
    }


    public String edit(HttpServletRequest request, HttpServletResponse response, Page page) {
        return null;
    }


    public String update(HttpServletRequest request, HttpServletResponse response, Page page) {
        return null;
    }


    public String list(HttpServletRequest request, HttpServletResponse response, Page page) {
        List<User> us = userDao.list(page.getStart(),page.getCount());
        int total = userDao.getTotal();
        page.setTotal(total);

        request.setAttribute("us", us);
        request.setAttribute("page", page);

        return "admin/listUser.jsp";
    }
}
