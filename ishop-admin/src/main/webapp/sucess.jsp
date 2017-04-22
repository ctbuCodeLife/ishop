<%--
  Created by IntelliJ IDEA.
  User: tao
  Date: 2017/4/22 0022
  Time: 2:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录成功</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/dashboard.css" rel="stylesheet">
    <link href="css/sucess.css" rel="stylesheet" >
</head>
<body>
<%@include file="nav.txt" %>
<div class="loginBoole">
    <p>
        登录成功！正在进入我的ishop
        <br>
        如果您的浏览器没有自动跳转，<a href="admin.jsp">请点击这里</a>
    </p>
</div>

<%@include file="footer.txt" %>
</body>
<script type="text/javascript">
    function jumpurl(){
        location='admin.jsp';
    }
    setTimeout('jumpurl()',3000);
</script>
</html>
