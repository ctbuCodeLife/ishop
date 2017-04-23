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
		<link rel="stylesheet" href="css/style.css">
		<style type="text/css">
			.container{
				width: 40%;
			}
            #msg{
				height: 50px;
				background: #62c462;
				color: red;
				display: none;
			}
		</style>
		<title>会员注册</title>
	</head>
	<body>
	<%@include file="head.txt"%>
		<div class="container">
			<div class="text-center">
				<h1>会员注册</h1>
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
					<div class="row input_item">
						<div class="form-group">
							<label for="email" class="col-sm-2 control-label"></label>
							<div class="col-sm-10">
								<input name="email" id="email" type="email" class="form-control"  placeholder="邮箱" >
							</div>
						</div>
					</div>
					<div class="row input_item">
						<div class="form-group">
							<label for="phone" class="col-sm-2 control-label"></label>
							<div class="col-sm-10">
								<input name="phone" id="phone" type="tel" class="form-control"  placeholder="电话" >
							</div>
						</div>
					</div>
					<div class="row input_item">
						<div class="form-group">
							<label for="realName" class="col-sm-2 control-label"></label>
							<div class="col-sm-10">
								<input name="realName" type="text" class="form-control" id="realName" placeholder="真实名字">
							</div>
						</div>
					</div>
					<div class="row input_item">
						验证模块
					</div>
					<div class="row input_item">
						<input id="" name="" type="submit" class="btn-primary col-xs-6 col-xs-offset-3 col-md-4 col-md-offset-5" value="提交"/>
					</div>
				</form>
			</div>
		</div>
	<%@include file="footer.txt"%>
		<script src="js/jquery.min.js"></script>
	 	<script type="text/javascript">
			$("#name").blur(function () {
                var name = $("#name").val();
                if(name == ""){
                    $("#name").focus();
                }
            })
			$("#password").blur(function () {
                var psssword = $("#password").val();
                if(password == ""){
                    $("#password").focus();
                }

			})
            $("#email").blur(function () {
                var email = $("#email").val();
                if(email == ""){
                    $("#email").focus();
                }

            })
            $("#phone").blur(function () {
                var phone = $("#phone").val()
                if(phone == ""){
                    $("#phone").focus();
                }
            })
            $("#realName").blur(function () {
                var realName = $("#realName").val();
                if(realName == ""){
                    $("#realName").focus();
                }
            })
            function  checkName() {
                var msg = document.getElementById("msg");
                var nameValue = $("#name").val();
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
                          msg.focus();
					  }
                    }
                });

            }
		</script>
	</body>
</html>
