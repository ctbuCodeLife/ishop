<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<meta name="Keywords" content=""/>
		<meta name="Description" content=""/>
		<link rel="stylesheet" type="text/css" href="css/footer.css" />
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css"/>
		<style type="text/css">
			*{
				margin: 0;
				padding: 0;
			}
			ul{
				list-style: none;
			}
			img[name=commodityImg]{
				width: 50px;
				height: 50px;
			}
			.title{
				display: flex;
				flex-direction: row;
				width: 80%;
				height: 50px;
				margin: auto;
			}
			.title H3{
				width: 25%;
				margin: auto auto;
				line-height: 30px;
				vertical-align: middle;
				text-align: center;
			}
			.title div:first-child{
				background-color: red;
			}
			.main{
				width: 100%;
				height: 500px;
			}
			.main table{
				width: 80%;
				text-align: center;
				margin: auto;
			}
			.main table thead{
				background-color: bisque;
			}
			.main table td{
				width: 20%;
				
			}
			.flex_bottom{
				position: fixed;
				display: flex;
				width: 100%;
				height: 50px;
				bottom: 0px;
				background-color: grey;
			}
			.flex_bottom table{
				width: 100%;
				line-height: 50px;
				vertical-align: middle;
			}
			.flex_bottom table td{
				width: 20%;
				text-align: center;
			}
			.flex_bottom table td input[type='button'],input[type='submit']{
				line-height: 30px;
				height: 30px;
				vertical-align: middle;
			}
		</style>
		<title>购物车</title>
	</head>
	<body>
		<div name="container" class="container">
			<%@include file="head.txt"%>
			<hr color="red"/>
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
							<td>操作</td>
						</tr>
					</thead>
					<tbody>
						<tr v-for="commodity in allcommodity">
							<td><input name="select" class="check" type="checkbox" value="" /><img name="commodityImg" src=''/>{{commodity.name}}</td>
							<td class="verticalMiddle">
								<span>{{commodity.price}}</span>
							</td>
							<td class="verticalMiddle">
								<span>{{commodity.num}}</span>
							</td>
							<td class="verticalMiddle">
								<span>{{commodity.sumprice}}</span>
							</td>
							<td class="verticalMiddle"><button name="del">删除</button></td>
						</tr>
					</tbody>
				</table>
			</div>
			<hr />
			<div id="fix_bottom" class="flex_bottom">
				<form action="" method="post">
					<table>
						<tr>
							<td><input id="selectAll" type="checkbox"  value="" />全选</td>
							<td><input id="delSelect" type="button" value="删除所选" /></td>
							<td>数量总计：<span>0</span></td>
							<td>货品金额总计（不含运费）：<span>0</span></td>
							<td><input type="submit" value="确认下单 "/></td>
						</tr>
					</table>
					
				</form>
			</div>
			<%@include file="footer.txt" %>
		</div>
		<script src="js/jquery-1.2.6.min.js"></script>
		<script src="js/vue.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript">
			var vm = new Vue({
				el:'#shopCart',
				data:{
					allcommodity:[{
						img:'img/1.jpg',
						name:'myq',
						price:10000,
						num:1,
						sumprice:10000
					},{
						img:'img/2.jpg',
						name:'hl',
						price:1000.1,
						num:1,
						sumprice:1000.1
					},{
						img:'img/3.jpg',
						name:'lt',
						price:1,
						num:1,
						sumprice:1
					}]
				}
			});
			
			$(function(){
				
				//全选与全不选
				$('#selectAll').click(function(){
					if (this.checked) {
						$('input[name=\'select\']').attr('checked',true);
					} else{
						$('input[name=\'select\']').attr('checked',false);
					}
				});
				//删除所选
				$('#delSelect').click(function(){
					var arrDel = $('input[name=\'select\']:checked');
					
				});
			});
		</script>
	</body>
</html>
    