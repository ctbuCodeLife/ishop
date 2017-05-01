<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<meta name="Keywords" content=""/>
		<meta name="Description" content=""/>
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
				height: 50px;
				margin: auto auto;
				line-height: 30px;
				vertical-align: middle;
				text-align: center;
			}
			.title H3:nth-child(1){
				background-color: #E8F1F5;
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
				background-color: #76E2F4;
			}
			.main table td{
				width: 20%;
			}
			.main table td button{
				width: 70px;
				margin: 0 auto;
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
				width:50%;
				vertical-align: middle;
			}
			input[type="number"]{
				width: 50px;
			}
		</style>
		<title>购物车</title>
	</head>
	<body>
		<div name="container" class="container">
			<%@include file="head.jsp"%>
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
					<tbody id="tbody">
						<tr v-for="cart in mydata">
							<td>
                                <input id="cartId" name="cartId" type="hidden" v-model="cart.cartId">
                                <input id="productId" name="productId" type="hidden" v-model="cart.productId">
                                <input name="select" class="check" type="checkbox" />
                                <a v-bind:href="cart.orderLink">
                                    <img v-bind:src='cart.imageSrc' v-bind:alt="cart.name" width="50px" height="70px"/>
                                </a>
                               </td>
							<td class="verticalMiddle">
								<span name="price">{{cart.realPrice}}</span>
							</td>
							<td class="verticalMiddle">

								<span name="num"><input id="" type="number" onchange="sumPrice()" v-model="cart.productNum"></span>
							</td>
							<td class="verticalMiddle">
								<span name="sumPrice">{{cart.totalPrice}}</span>
							</td>
							<td class="verticalMiddle"><a class="btn btn-default" v-bind:href="'deleteCart?id='+cart.cartId">删除</a></td>
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
		</div>
		<script src="js/jquery.min.js"></script>
		<script src="js/vue.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript">
			$(document).ready(function () {
                var vm = new Vue({
                    el:'#shopCart',
                    data:{
                        mydata:[]
                    }
                });
                $.ajax({
                    type:"GET",
                    url:"/ishop-portal/listCartByUser",
                    dataType:"json",
                    success:function (data) {
                        //这里获取到数据展示到前台
                        console.log(data);
                        vm.mydata = data;
                    }
                });
                var productId = 0;
                function findProductById(productId) {
                    $.ajax({
                        type:"GET",
                        url:"/ishop-portal/getProductById",
                        data:{id:productId},
                        dataType:"json",
                        success:function (data) {
                            //这里获取到数据展示到前台
                            console.log(data);
//                        vm.mydata = data;
                        }
                    });
                }
                //findProductById(1);

			});

			function sumPrice() {
				var arrPrice = $("#tbody>.price");
				console.log(arrPrice.length);
				var arrNum = $("#tbody>.num");
				var arrSunPrice = $("#tbody>.sumPrice");
				for(var i=0;i<arrNum.length;i++){
				    arrSunPrice[i].text(arrPrice[i].text()*arrNum[i].text());
				    console.log( arrSunPrice[i].text());
				}
            }
			$(function(){
				//全选与全不选
				$('#selectAll').click(function(){
					if (this.checked) {
						$('input[name=\'select\']').prop("checked",true);
					} else{
						$('input[name=\'select\']').prop("checked",false);
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
    