<%--
  Created by IntelliJ IDEA.
  User: tao
  Date: 2017/4/22 0022
  Time: 2:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
<head>
    <title>提示页面</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <link href="css/dashboard.css" rel="stylesheet">
    <link href="css/info.css" rel="stylesheet" >
    <style type="text/css">
        ul{
            list-style: none;
        }
        .footer{
            margin-top: 450px;
        }
    </style>
</head>
<body>
<%@include file="head.jsp" %>
<div class="loginBoole">
    <p>
        ${sessionScope.msg}
        <br>
        如果您的浏览器没有自动跳转，<a href="${sessionScope.autoReturn}">请点击这里</a>
    </p>
</div>

<%@include file="foot.jsp" %>
</body>
<script type="text/javascript">
    function jumpurl(){
        location='${sessionScope.autoReturn}';
    }
    setTimeout('jumpurl()',3000);
</script>
</html>
