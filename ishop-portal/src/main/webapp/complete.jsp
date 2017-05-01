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
			ul{
			    list-style: none;
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

			.title H3:nth-child(4){
				background-color: #E8F1F5;
			}
			
			.flex_bottom {
				position: fixed;
				display: flex;
				width: 100%;
				height: 50px;
				bottom: 0px;
				background-color: grey;
			}
			.issue{
				margin-top:20px;
				margin-left:10%;
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
		<title>完成</title>
	</head>

	<body>
		
			<div name="header" class="header">
				<%@include file="head.jsp" %>
			</div>
			<hr color="red"/>
			<div name="title" class="title">
					<h3>购物车</h3>
					<h3>确认下单</h3>
					<h3>付款</h3>
					<h3>完成</h3>
			</div>
			<hr />
			<div class="">
				<div class="">
					<h3 class="text-center">您已完成付款，感谢您的支持！</h3>
				</div>
				<hr />
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
			</div>
			<hr />
		<%@include file="foot.jsp" %>

		<script src="js/jquery.min.js"></script>
		<script type="text/javascript">

		</script>
	</body>

</html>