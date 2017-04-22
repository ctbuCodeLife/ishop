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
</head>
<body>
<p>登录成功</p>
<a href="admin.jsp">3秒后系统会自动跳转，也可点击本处直接跳</a>
<%=session.getAttribute("admin")%>
</body>
<script type="text/javascript">
    function jumpurl(){
        location='admin.jsp';
    }
    setTimeout('jumpurl()',3000);
</script>
</html>
