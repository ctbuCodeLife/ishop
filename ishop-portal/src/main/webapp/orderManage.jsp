<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
	<title>订单管理</title>
	<style type="text/css">
		ul{
				list-style: none;
			}
			.center{
				margin: auto;
			}
			.main{
				width: 80%;
				height: 400px;
				margin-left: 10%;
				margin-top: 30px;
			}
		#orderTable tr .form-control{
			width: 60px;
			float: left;
		}
	</style>
</head>
<body>
	<div name="header" class="header">
		<%@include file="head.jsp" %>
	</div>
	<div id="search" class="col-md-4 input-group center">
			<input type="text" class="form-control" placeholder="order ID...">
			<span class="input-group-btn">
        		<button class="btn btn-default" type="button">Go!</button>
     		</span>
		</div>
		<div class="main">
			<table id="orderTable" class="table table-striped table-hover table-responsive">
				<tr>
					<th>序号</th>
					<th>订单号</th>
					<th>产品价格</th>
					<th>运费</th>
					<th>总价</th>
					<th>状态</th>
					<th>时间</th>
					<th>操作</th>
				</tr>
				<tr  v-for="order in mydata">
					<td>{{mydata.indexOf(order)+1}}</td>
					<td>{{order.id}}</td>
					<td>{{order.productPrice}}</td>
					<td>{{order.trafficPrice}}</td>
					<td>{{order.totalPrice}}</td>
					<td>{{order.status}}</td>
					<td>{{order.created}}</td>
					<td>
						<span style="display: none">{{order.id}}</span>
						<button class="btn btn-danger" onclick="delOrder(this)">删除</button>
						<a  v-bind:href="'updateProduct.jsp?id='+product.id"><button class="btn btn-default">付款</button></a>
					</td>
				</tr>
			</table>
		</div>
		<div class="footer">
			<%@include file="foot.jsp" %>
		</div>
	<script src="js/jquery.min.js"></script>
	<script src="js/vue.js"></script>
	<script type="text/javascript">
		var id = location.search.split("=")[1];
		$.ajax({
			type: "GET",
			url: "/ishop-portal/listOrder",
			data:{userId:id},
			dataType: "json",
			success: function (data) {
				//这里获取到数据展示到前台
				var vm = new Vue({
					el:'#orderTable',
					data:{
						mydata:data
					}
				});
			}
		});
	</script>
</body>
</html>