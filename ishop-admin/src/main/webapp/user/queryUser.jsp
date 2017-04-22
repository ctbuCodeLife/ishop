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
    <link rel="stylesheet" href="../css/bootstrap.min.css">
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
    <div class="search"></div>
    <%@include file="../getUserForm.txt"%>
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
            <tr v-for="user in allUser">
                <td>{{user.name}}</td>
                <td>{{user.password}}</td>
                <td>{{user.phone}}</td>
                <td>{{user.email}}</td>
                <td>{{user.realname}}</td>
                <td><input type="submit" name="del" id="del" value="删除" /></td>
            </tr>
        </form>
    </table>
</div>

    <script src="../js/vue.js"></script>
    <script type="text/javascript">
        var vm = new Vue({
            el:'#user',
            data: {
                allUser: [{
                    name: "myq",
                    password: "12346",
                    phone: "123465789",
                    email: "15454@qq.com",
                    realname: "牟一全"
                }, {
                    name: "myq",
                    password: "12346",
                    phone: "123465789",
                    email: "15454@qq.com",
                    realname: "牟一全"
                }]
            }
        });
    </script>
</body>
</html>
