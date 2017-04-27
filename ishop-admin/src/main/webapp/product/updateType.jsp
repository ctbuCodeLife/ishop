<%--
  Created by IntelliJ IDEA.
  User: myq
  Date: 2017/4/23
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>addType</title>
    <link rel="stylesheet" href="<%=request.getContextPath()%>/css/bootstrap.min.css">
    <style type="text/css">
        .container{
            width: 500px;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>商品类别修改</h2>
    <form action="#" method="post" class="form-horizontal">
        <div class="form-group">
            <label for="grade" class="col-sm-3 control-label">类别级别</label>
            <div class="col-sm-9">
                <select name="grade" id="grade" class="form-control">
                    <option value="1" onclick="">一级</option>
                    <option value="2" onclick="">二级</option>
                    <option value="3" onclick="">三级</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label for="name" class="col-sm-3 control-label">类别名</label>
            <div class="col-sm-9">
                <input id="name" type="text" name="name" class="form-control"  placeholder="类别名">
            </div>
        </div>
        <div class="form-group">
            <label for="parentId" class="col-sm-3 control-label">父级类别</label>
            <div class="col-sm-9">
                <input type="hidden">
                <input id="parentId" type="text" name="parentId" class="form-control"  placeholder="父级类别">
            </div>
        </div>
        <div class="form-group">
            <label for="nameDesc" class="col-sm-3 control-label">类别描述</label>
            <div class="col-sm-9">
                <input id="nameDesc" type="text" name="nameDesc" class="form-control"  placeholder="类别描述">
            </div>
        </div>
        <div class="form-group">
            <div class="col-sm-offset-3 col-sm-9">
                <button type="button" onclick="updateType()" class="btn btn-default">修改</button>
            </div>
        </div>
    </form>
</div>
<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/type.js"></script>
</body>
</html>
