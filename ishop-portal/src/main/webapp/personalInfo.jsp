<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
		<meta name="Keywords" content=""/>
		<meta name="Description" content=""/>
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
		<link rel="stylesheet" href="css/style.css">
		<title>personalInfo</title>
		<style type="text/css">
			*{
				margin: 0;
				padding: 0;
			}
			ul{
				list-style: none;
			}
			a{
				text-decoration: none;
			}
			.text-center{
				text-align: center;
			}
		
			.nav_main{
				display: flex;
				width: 100%;
				height: 50px;
				vertical-align: middle;
				background-color: bisque;
			}
			.nav_main .nav_left{
				font-size: 200%;
				margin-left:10% ;
			}
			.nav_main ul li{
				width: 100px;
				float: left;
				line-height: 50px;
				text-align: center;
				vertical-align: middle;
				font-family: "微软雅黑";
				font-size: 120%;
			}
			.nav_main ul li ul{
				display: none;
			}
			.nav_main ul li ul li{
				line-height: 25px;
				font-size: 20%;
				background-color: #fff;
			}
			.nav_main ul li:hover{
				background-color: gray;
			}
			.nav_main ul li:hover ul{
				display: block;
			}
			.nav_main .nav_right{
				font-family: "微软雅黑";
				font-size: 120%;
				line-height: 50px;
				margin-left: 30%;
			}
			.main{
				display: -webkit-flex;/*Safari*设置flex之后子元素的float,clear,vertical-align属性失效*/
				display: flex;
				width: 100%;
				height: 500px;
			}
			.main .main_left{
				width: 15%;
				margin: 2%;
				margin-left: 7%;
			}
			.main .main_left .user_avatar{
				width: 60%;
				height: 25%;
				margin: auto;
				margin-top: 3%;
			}
			.main .main_left .all_function{
				width: 60%;
				height: 70%;
				margin: auto;
				margin-top: 6%;	
			}
			.main .main_left .all_function ul{
			}
			.main .main_left .all_function li{
				margin-left: 10%;
				margin-top: 5%;
				font-size: 100%;
			}
			.main .main_right{
				width: 60%;
				margin: 2%;
			}
			.main .main_right table{
				width: 80%;
				margin: 5%;
				border: 1px solid black;
                background-color: #fff;
			}
			.main .main_right table tr{
				margin-top: 5%;
			}
            .mt{
                display: block;
                padding: 10px;
            }
            .mc{
                overflow: visible;
            }
			.footer{
				margin-top: 0;
			}
		</style>
	</head>
	<body>
	<%@include file="head.jsp"%>
		<div class="container">
			<div class="nav_main">
				<div class="nav_left">
					会员中心
				</div>
				<ul>
					<li><a href="">首页</a></li>
					<li>
						账户设置
						<ul>
							<li><a href="">安全设置</a></li>
							<li><a href="">个人资料</a></li>
							<li><a href="">收货地址</a></li>
							<li><a href="">支付宝绑定设置</a></li>
							<li><a href="">隐私设置</a></li>
							<li><a href="">更多</a></li>
						</ul>
					</li>
					<li><a href="">信息</a></li>
				</ul>
				<div class="nav_right">
					待扩展
				</div>
			</div>
			<div class="main">
				<div class="main_left">
					<div class="user_avatar">
						<img src="" alt="user_avatar">
					</div>
					<div class="all_function">
						<ul>
							<li><a href="">基本信息</a></li>
							<li><a href="">收货地址</a></li>
							<li><a href="">我的收藏</a></li>
							<li><a href="">评价管理</a></li>
							<li><a href="">其他</a></li>
							<li><a href="">其他</a></li>
						</ul>
					</div>
				</div>
				<div class="main_right">
					<div class="mt">
						<p>基本信息</p>
					</div>
					<div class="mc">
						<div class="user-set">
							<form action="" method="post" class="form-horizontal">
								<div class="item">
									<span class="">用户名</span>
                                    <div>
                                        <strong class="fl">李滔</strong>
                                    </div>
								</div>
								<div class="form-group">
									<label for=""></label>
									<input id="" name="" type="text">
								</div>
							</form>
						</div>
					</div>

							<%--<table name="base_info" class="text-center">--%>
								<%--<tr>--%>
									<%--<th colspan="2"><h2>基本信息</h2></th>--%>
								<%--</tr>--%>
								<%--<tr>--%>
									<%--<td>会员名</td>--%>
									<%--<td>牟一全</td>--%>
								<%--</tr>--%>
								<%--<tr>--%>
									<%--<td>性别</td>--%>
									<%--<td>男</td>--%>
								<%--</tr>--%>
								<%--<tr>--%>
									<%--<td>生日</td>--%>
									<%--<td>1996.6.1</td>--%>
								<%--</tr>--%>
								<%--<tr>--%>
									<%--<td>居住地</td>--%>
									<%--<td>重庆市南岸区</td>--%>
								<%--</tr>--%>
								<%--<tr>--%>
									<%--<td>联系方式</td>--%>
									<%--<td>15523031521</td>--%>
								<%--</tr>--%>
							<%--</table>--%>
							<%--<table name="info_safe" class="text-center">--%>
								<%--<tr>--%>
									<%--<th colspan="2"><h2>安全信息</h2></th>--%>
								<%--</tr>--%>
								<%--<tr>--%>
									<%--<td>安全等级</td>--%>
									<%--<td>高</td>--%>
								<%--</tr>--%>
								<%--<tr>--%>
									<%--<td>绑定手机</td>--%>
									<%--<td>15523031521</td>--%>
								<%--</tr>--%>
								<%--<tr>--%>
									<%--<td>绑定邮箱</td>--%>
									<%--<td>84210278@qq.com</td>--%>
								<%--</tr>--%>
								<%--<tr>--%>
									<%--<td>密码问题</td>--%>
									<%--<td>已设置</td>--%>
								<%--</tr>--%>
								<%--<tr>--%>
									<%--<td>待定</td>--%>
									<%--<td>****</td>--%>
								<%--</tr>--%>
								<%--<tr>--%>
									<%--<td>***</td>--%>
									<%--<td>****</td>--%>
								<%--</tr>--%>
							<%--</table>--%>
				</div>
			</div>
			<hr />
			<div class="footer">
				<%@include file="foot.jsp" %>
			</div>
		</div>

	</body>
</html>
    