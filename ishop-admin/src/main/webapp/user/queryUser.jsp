<%--
  Created by IntelliJ IDEA.
  User: myq
  Date: 2017/4/22
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="<%=request.getContextPath()%>css/bootstrap.min.css">
    <title>userQuery</title>
    <style type="text/css">
        .container{
            width: 700px;
            height:600px;
        }
        .search{
            width: 300px;
            margin: auto;
        }
    </style>
</head>
<body>
<div class="container">
    <form action="" method="post">
        <div class="search">
            <div class="input-group">
                <input id="name" name="name" type="text" class="form-control" placeholder="Search By Username">
                <span class="input-group-btn">
        			<button class="btn btn-default" type="button" onclick="getUser()">Go!</button>
     			</span>
            </div>
        </div>
    </form>
    <table id="user" class="active table table-hover table-striped">
        <tr>
            <th>用户名</th>
            <th>密码</th>
            <th>电话</th>
            <th>邮箱</th>
            <th>真实姓名</th>
            <th>操作</th>
        </tr>
        <form action="" method="post">
            <tr v-for="user in mydata">
                <td>{{user.name}}</td>
                <td>{{user.password}}</td>
                <td>{{user.phone}}</td>
                <td>{{user.email}}</td>
                <td>{{user.realname}}</td>
                <td>
                    <span style="display: none">{{user.id}}</span>
                    <button onclick="delUser(this)">删除</button>
                    <a v-bind:href="'updateUser.jsp?id='+user.id"><button>更新</button></a>
                </td>
            </tr>
        </form>
    </table>
</div>

<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/vue.js"></script>
<script src="<%=request.getContextPath()%>/js/user.js"></script>
    <script type="text/javascript">

    </script>
</body>
</html>
