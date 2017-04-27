<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<!-- 下面这句用于响应移动设备的改变布局，必须写在前面 -->
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
		<meta name="Keywords" content=""/>
		<meta name="Description" content=""/>
		<!--bootstrap核心CSS文件-->
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
		<link rel="stylesheet" href="css/style.css">
		<style type="text/css">
			.login-box{
				width: 40%;
			}
            #msg{
				height: 50px;
				line-height: 50px;
				font-size: 30px;
				display: none;
			}
		</style>
		<title>会员注册</title>
	</head>
	<body>
		<div class="container">
			<%@include file="head.jsp"%>
			<div class="text-center login-box">
				<h2>会员注册</h2>
				<form action="addUser" method="post">
					<div class="row input_item" >
						<div id="msg" class="col-sm-10 col-sm-offset-2" >

						</div>
					</div>
					<div class="row input_item">
						<div class="form-group">
							<label for="name" class="col-sm-2 control-label"></label>
							<div class="col-sm-10">
								<input name="name"type="text" class="form-control" id="name" placeholder="用户名" onblur="checkName()">
							</div>
						</div>
					</div>
					<div class="row input_item">
						<div class="form-group">
							<label for="password" class="col-sm-2 control-label"></label>
							<div class="col-sm-10">
								<input name="password" type="password" class="form-control" id="password" placeholder="密码" >
							</div>
						</div>
					</div>
					<%--<div class="row input_item">--%>
						<%--<div class="form-group">--%>
							<%--<label for="email" class="col-sm-2 control-label"></label>--%>
							<%--<div class="col-sm-10">--%>
								<%--<input name="email" id="email" type="email" class="form-control"  placeholder="邮箱" >--%>
							<%--</div>--%>
						<%--</div>--%>
					<%--</div>--%>
					<div class="row input_item">
						<div class="form-group">
							<label for="phone" class="col-sm-2 control-label"></label>
							<div class="col-sm-10">
								<input name="phone" id="phone" type="tel" class="form-control"  placeholder="手机号" >
							</div>
						</div>
					</div>
					<%--<div class="row input_item">--%>
						<%--<div class="form-group">--%>
							<%--<label for="realName" class="col-sm-2 control-label"></label>--%>
							<%--<div class="col-sm-10">--%>
								<%--<input name="realName" type="text" class="form-control" id="realName" placeholder="真实名字">--%>
							<%--</div>--%>
						<%--</div>--%>
					<%--</div>--%>
                    <div class="row input_item">
                        <div class="form-group">
                            <label for="checkCode" class="col-sm-2 control-label"></label>
                            <div class="col-sm-6">
                                <input id="checkCode" type="text" class="from-control"  placeholder="短信验证码" >
                                <button class="btn btn-danger" onclick="">获取验证码</button>
                            </div>
                        </div>
                    </div>
					<div class="row input_item">
						<input id="submit" name="" type="submit" class="btn-primary col-xs-6 col-xs-offset-3 col-md-10 col-md-offset-2" value="提交" onsubmit="return checkSubmint()"/>
					</div>
				</form>
			</div>
			<%@include file="foot.jsp"%>
		</div>
		<script src="js/jquery.min.js"></script>
	 	<script type="text/javascript">

            function  checkName() {
                var msg = document.getElementById("msg");
                var nameValue = $("#name").val();
                if(nameValue != ""){
                    $.ajax({
                        type:"GET",
                        url:"/ishop-portal/existsUser",
                        data:{name:nameValue},
                        dataType:"json",
                        success:function (data) {
                            //这里获取到数据展示到前台
                            if(data == true){
                                msg.innerHTML = "该用户已存在!";
                                msg.style.display = "block";
                                msg.style.color = "red";
                                $("#name").focus();
                            }else{
                                msg.innerHTML = "可以使用该用户名!";
                                msg.style.display = "block";
                                msg.style.color = "green";
                            }
                        }
                    });
				}
            }
            function checkSubmint() {
                    var name = $("#name").val();
                    if(name == ""){
                        $("#name").focus();
                        return false;
                    }
                    var psssword = $("#password").val();
                    if(password == ""){
                        $("#password").focus();
                        return false;
                    }
                    var email = $("#email").val();
                    if(email == ""){
                        $("#email").focus();
                        return false;
                    }
                    var phone = $("#phone").val()
                    if(phone == "") {
                        $("#phone").focus();
                        return false;
                    }
                    var realName = $("#realName").val();
                    if(realName == ""){
                        $("#realName").focus();
                        return false;
                    }
                return true;
            }
		</script>
	</body>
</html>
