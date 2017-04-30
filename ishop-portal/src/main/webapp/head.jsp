<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<nav class="navbar navbar-default .navbar-fixed-top">
    <div class="">
        <div id="nav_left" class="col-md-6">
            <ul style="line-height: 35px;">
            <c:if test="${not empty sessionScope.user}">
            <li>
                <a id="username" class="navbar-brand" href="#">当前用户:${sessionScope.user.name}</a>
                &nbsp;&nbsp;
                <a href="logout" >注销</a>
            </li>
            </c:if>
            <c:if test="${ empty sessionScope.user}">
            <li>
                <a href="login.jsp">登录</a>
                 &nbsp;&nbsp;
                 <a href="register.jsp " >注册</a>
            </li>
            </c:if>
            </ul>
        </div>
        <div id="nav_right">
            <ul class="nav nav-pills">
                <li>
                    <a href="index.jsp" aria-controls="basic" role="tab" data-toggle="tab">首页</a>
                </li>
                <li>
                    <a href="personalInfo.jsp" aria-controls="basic" role="tab" data-toggle="tab">个人信息</a>
                </li>
                <li>
                    <a href="shopCar.jsp" aria-controls="welcome" role="tab" data-toggle="tab">购物车</a>
                </li>
                <li>
                    <a href="callService.jsp" aria-controls="welcome" role="tab" data-toggle="tab">联系客服</a>
                </li>
                <li>
                    <a href="orderManage.jsp" aria-controls="factsheet" role="tab" data-toggle="tab">订单管理</a>
                </li>
                <li>
                    <a href="manageContent.jsp" aria-controls="jobdesc" role="tab" data-toggle="tab">评论管理</a>
                </li>
                <li>
                    <a href="favorites.jsp" aria-controls="invoice" role="tab" data-toggle="tab">收藏夹</a>
                </li>
            </ul>
        </div>
    </div>
</nav>