<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
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
		<style type="text/css">
			.container{
				width: 40%;
				margin-top: 10%;
			}

		</style>
		<title>会员注册</title>
	</head>
	<body>
		<div class="container">
			<div class="text-center">
				<h1>会员注册</h1>
				<form action="" method="post">
					<div class="form-group">
						<label for="username" class="col-sm-2 control-label">用户名</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="username" placeholder="username">
						</div>
					</div>
					<div class="form-group">
					<label for="password" class="col-sm-2 control-label">密码</label>
						<div class="col-sm-10">
							<input type="password" class="form-control" id="password" placeholder="Password">
						</div>
					</div>
					<div class="form-group">
						<label for="repassword" class="col-sm-2 control-label">重复密码</label>
						<div class="col-sm-10">
							<input type="password" class="form-control" id="repassword" onblur="pwdCheck()" placeholder="rePassword">
						</div>
					</div>
					<span id="isPwd"></span>
					<div class="">
						<p>显示密码<input id="show_pwd" name="show_pwd" type="checkbox" /></p>
					</div>
					<div class="row">
						验证模块
					</div>
					<div class="row">
						<input id="" name="" type="submit" class="btn-primary col-xs-6 col-xs-offset-3 col-md-4 col-md-offset-5" value="提交"/>
					</div>
				</form>
			</div>
		</div>
		<script src="js/jquery-1.2.6.min.js"></script>
	 	<script type="text/javascript">
				var pwd1 = document.getElementById("password");
            	var pwd2 = document.getElementById("repassword");
				$("#show_pwd").click ( function () {
                    if (this.checked) {
                        pwd1.type = "text"
                        pwd2.type = "text";
                    } else {
                        pwd1.type = "password";
                        pwd2.type = "password";
                    }
                });
				function pwdCheck(){
					if($("#password").val()==$("#repassword").val()&&$("#password").val()!=""){
					    $("#isPwd").html("<font color='green'>密码验证成功！</font>");

					}else {
                        $("#isPwd").html("<font color='red'>密码有误！</font>");
					}
                }
		</script>
	</body>
</html>
