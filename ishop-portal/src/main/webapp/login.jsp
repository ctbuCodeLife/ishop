<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>用户登录</title>
    <!--根据设备的宽度调整缩放比例   -->
    <meta name="viewport" content="width=device-width,initial-scale=1" />
    <!--引入bootstrap的CSS文件 -->
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css" />
    <!--引入jquery的js文件-->
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
    <!-- 引入自定义css文件 style.css -->
    <link rel="stylesheet" href="css/style.css" type="text/css" />
</head>

<body>
<div class="container">
    <!-- 头部DIV -->
    <%@include file="head.jsp"%>
    <div class="container"
         style="width:100%;height:460px;background:#FF2C4C url('img/regist.jpg') ;background-size:cover">
        <div class="row">
            <div class="col-md-6">
                <div style="width:460px;border:1px solid #E7E7E7;padding:20px 0 20px 30px;border-radius:5px;margin-top:60px;background:#fff;">
                    <span>会员登录&nbsp;&nbsp;USER LOGIN</span>

                    <div>&nbsp;</div>
                    <form method="post" action="userLogin" class="form-horizontal">

                        <div class="form-group">
                            <label for="name" class="col-sm-2 control-label">用户名</label>
                            <div class="col-sm-6">
                                <input id="name" name="name" type="text" class="form-control"
                                       placeholder="请输入用户名">
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="password" class="col-sm-2 control-label">密码</label>
                            <div class="col-sm-6">
                                <input id="password" name="password" type="password" class="form-control"
                                       placeholder="请输入密码">
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="col-sm-offset-2 col-sm-10">
                                <div class="checkbox">
                                    <label> <input type="checkbox"> 自动登录
                                    </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <label> <input
                                        type="checkbox"> 记住用户名
                                </label>
                                </div>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="row">
                                <input type="submit" class="col-sm-offset-2 col-sm-3 btn btn-success" value="登录" name="submit">
                                <input type="reset" class="col-sm-offset-1  col-sm-3  btn btn-danger"  value="重置" name="submit">
                            </div>
                        </div>
                    </form>
                </div>
            </div>
            <div class="col-md-6"></div>
        </div>
    </div>

    <%@ include file="foot.jsp"%>
</div>
</body>

</html>