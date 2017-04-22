<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<meta name="Keywords" content="" />
		<meta name="Description" content="" />
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
		<style type="text/css">
			* {
				margin: 0;
				padding: 0;
			}
			ul{
				list-style: none;	
			}
			img[name=commodityImg] {
				width: 50px;
				height: 50px;
			}
			
			.title {
				display: flex;
				flex-direction: row;
				width: 80%;
				height: 50px;
				margin: auto;
			}
			
			.title H3 {
				width: 25%;
				margin: auto auto;
				line-height: 30px;
				vertical-align: middle;
				text-align: center;
			}
			
			.title div:first-child {
				background-color: red;
			}
			
			.main {
				width: 100%;
				height: 500px;
			}
			
			.main table {
				width: 80%;
				text-align: center;
				margin: auto;
			}
			
			.main table thead {
				background-color: bisque;
			}
			
			.main table td {
				width: 20%;
			}
			.flex_bottom {
				position: fixed;
				display: flex;
				width: 100%;
				height: 50px;
				bottom: 0px;
				background-color: grey;
			}
			
			.flex_bottom table {
				width: 100%;
				line-height: 50px;
				vertical-align: middle;
			}
			
			.flex_bottom table td {
				width: 20%;
				text-align: center;
			}
			
			.flex_bottom table td input[type='button'],
			input[type='submit'] {
				line-height: 30px;
				height: 30px;
				vertical-align: middle;
			}
			
			.footer {
				width: 100%;
				height: 70px;
				margin-top: 100px;
				background-color: #dddddd;
			}
		</style>
		<title>确认订单</title>
	</head>

	<body>
		<div name="container" class="container">
			<%@include file="head.txt"%>
			<hr />
			<div class="addr">
				收货地址:
			</div>
			<hr />
			<div name="title" class="title">
				<h3>购物车</h3>
				<h3>确认下单</h3>
				<h3>付款</h3>
				<h3>完成</h3>
			</div>
			<div id='main' name="main" class="main">
				<table id="shopCart" class="table table-hover">
					<thead>
						<tr>
							<td>货品</td>
							<td>单价（元）</td>
							<td>数量</td>
							<td>金额（元）</td>
						</tr>
					</thead>
					<tbody>
						<tr v-for="commodity in allcommodity">
							<td><img name="commodityImg" src='' />{{commodity.name}}</td>
							<td>
								<span>{{commodity.price}}</span>
							</td>
							<td>
								<span class="num">{{commodity.num}}</span>
							</td>
							<td>
								<span class="price">{{commodity.sumprice}}</span>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div id="fix_bottom" class="flex_bottom">
				<form action="" method="post">
					<table>
						<tr>
							<td>数量总计：<span id="num" name="sumNum" >0</span></td>
							<td>货品金额总计（不含运费）：<span id="sumPrice" name="sumPrice">0</span></td>
							<td><input type="submit" value="去付款 " /></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		<%@include file="footer.txt" %>
		<script src="js/jquery-1.2.6.min.js"></script>
		<script src="js/vue.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript">
			var vm = new Vue({
				el: '#shopCart',
				data: {
					allcommodity: [{
						img: 'img/1.jpg',
						name: 'myq',
						price: 10000,
						num: 1,
						sumprice: 10000
					}, {
						img: 'img/2.jpg',
						name: 'hl',
						price: 1000.1,
						num: 1,
						sumprice: 1000.1
					}, {
						img: 'img/3.jpg',
						name: 'lt',
						price: 1,
						num: 1,
						sumprice: 1
					}]
				}
			});
			var num = $(".num");
			var price = $(".price");
			var sumnum = 0;
			var sumPrice;
			for (var i=0;i<num.length;i++) {
				sumnum += num[i].value;
			}
			for (var i=0;i<price.length;i++) {
				sumnum += price[i].value;
			}
			$('#num').value = sumnum;
			$("#sumPrice").value = sumPrice;
		</script>
	</body>

</html>