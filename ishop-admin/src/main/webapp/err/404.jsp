<%--
  Created by IntelliJ IDEA.
  User: tao
  Date: 2017/4/26 0026
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>页面找不到</title>
</head>
<body>
<%@include file="../head.jsp"%>
<div class="main">
    <p>抱歉,您访问的页面失联了</p>
    <p>您可以返回<<a href="${pageContext.request.contextPath }/index.jsp">首页</a></p>
</div>

</body>
</html>
