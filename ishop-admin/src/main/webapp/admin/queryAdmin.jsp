 <%--
  Created by IntelliJ IDEA.
  User: tao
  Date: 2017/4/22 0022
  Time: 17:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"
           uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>查询管理员</title>
    <link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="search"></div>
    <form action="" method="post">
        <div class="search">
            <div class="input-group">
                <input id="name" name="name" type="text" class="form-control" placeholder="Search By Username">
                <span class="input-group-btn">
        			<button class="btn btn-default" type="button" onclick="getAdmin()">Go!</button>
     			</span>
            </div>
        </div>
    </form>
    <table id="queryAdminTable" class="active table table-hover table-striped" style="display: none" >
        <tr >
            <th>管理员名</th>
            <th>权限等级</th>
            <th>密码</th>
            <th>电话</th>
            <th>邮箱</th>
            <th>真实姓名</th>
            <th>操作</th>
        </tr>
        <tr >
            <td>{{admin.name}}</td>
            <td>{{admin.roleId}}</td>
            <td>{{admin.password}}</td>
            <td>{{admin.phone}}</td>
            <td>{{admin.email}}</td>
            <td>{{admin.realName}}</td>
            <td>
                <span style="display: none">{{admin.id}}</span>
                <button onclick="delAdmin(this)">删除</button>
                 <a v-bind:href="'updateAdmin.jsp?id='+admin.id"><button>更新</button></a>
            </td>
        </tr>
    </table>
</div>
<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/vue.js"></script>
<script src="<%=request.getContextPath()%>/js/admin.js"></script>
</body>
</html>
