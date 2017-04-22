<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<meta name="Keywords" content="" />
		<meta name="Description" content="" />
		<link rel="stylesheet" type="text/css" href="css/footer.css" />
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
		<style type="text/css">
			* {
				margin: 0;
				padding: 0;
			}
			ul {
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
			}
			
			.main .totalAmount {
				height: 50px;
				border: 1px solid #C4E3F3;
			}
			
			.main .totalAmount div {
				line-height: 48px;
				padding-left: 100px;
			}
			
			.main .payMethod {
				height: 120px;
				margin-top: 40px;
				border: 1px solid #C4E3F3;
			}
			
			.main .payMethod p {
				margin-left: 100px;
				font-size: 20px;
				line-height: 40px;
			}
			
			.main .payMethod div {
				padding-left: 100px;
				line-height: 50px;
			}
			
			.flex_bottom {
				position: fixed;
				display: flex;
				width: 100%;
				height: 50px;
				opacity: 1.0;
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
		</style>
		<title>付款</title>
	</head>

	<body>
		<div name="container" class="container">
				<%@include file="head.txt"%>
			<hr />
			<div name="title" class="title">
				<h3>购物车</h3>
				<h3>确认下单</h3>
				<h3>付款</h3>
				<h3>完成</h3>
			</div>
			<hr />
			<div id='main' name="main" class="main">
				<div class="totalAmount">
					<div id="orderId1" class="col-md-6">
						订单编号：<span id="orderId"></span>
					</div>
					<div id="orderPrice1" class="col-md-6">
						订单总额：<span id="orderPrice"></span>元
					</div>
				</div>
				<div class="payMethod">
					<p>付款方式</p>
					<div class="col-md-4">
						在线支付：
					</div>
					<div class="col-md-4">
						支付宝支付：
					</div>
					<div class="col-md-4">
						银行卡支付：
					</div>
				</div>
			</div>
			<div class="issue">
				<h4>付款遇到的问题:</h4>
				<ol>
					<li>选择该平台担保交易，有何保障？</li>
					<p>答:在平台进货时，付款选择我平台做担保交易，货款并未直接付给卖家，而是付款到平台收银台，您收到货物签收无误后，再次确认收货时，订单款项才会结算给卖家，相当于货到付款哦。</p>
					<li>不会使用网上支付怎么办？</li>
					<p>答：可以请教自己信赖并且懂的人，或者按照我们的付款方式一步步操作即可。</p>
					<li>支付方式中没有我拥有的怎么办？</li>
					<p>答：我们会大力改善我们的系统，增加更多的支付接口，同时也希望您也可以拥有这次支付方式，以便于付款。</p>
				</ol>
			</div>
			<div id="fix_bottom" class="flex_bottom">
				<form action="" method="post">
					<table>
						<tr>
							<td>订单编号：<span id="orderId">0</span></td>
							<td>订单金额总计（不含运费）：<span id="orderPrice">0</span></td>
							<td><input type="submit" value="确认支付 " /></td>
						</tr>
					</table>
				</form>
			</div>
		</div>

		<%@include file="footer.txt" %>

		<script src="../StaticSource/js/jquery-1.2.6.min.js"></script>
		<script type="text/javascript">
			$("#orderId").value = $("#orderId1").value;
			$("#orderPrice").value = $("#orderPrice1").value;
		</script>
	</body>

</html>