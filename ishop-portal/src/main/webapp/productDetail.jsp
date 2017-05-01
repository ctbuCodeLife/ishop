<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
		<title>产品详情</title>
		<style type="text/css">
			*{
				margin: 0;
				padding: 0;
			}
			ul{
				list-style: none;
				margin-left: 5%;
			}
			.dt-title{
				width: 100%;
				height: 50px;
				margin-top: 0;
				border: 1px solid #666;
			}
			.dt-title ul{
				display: flex;
				flex-direction:row;
				font-size: 15px;
			}
			.dt-title ul li{
				line-height: 50px; 
				vertical-align: center;
			}
			.main{
				display: flex;
				flex-direction:row;
				width: 90%;
				height: 35rem;
				margin-left: 5%;
			}
			.main .dt-img{
				width: 300px;
				height: 430px;
				margin-left: 10%;
				overflow: hidden;
			}
			.main .dt-product{
				width: 500px;
				height: 95%;
				margin-left: 15%;
				
			}
			.main .dt-product p{
				margin-top: 5px;
			}
			
			.addShopCar{
				margin-top:1%;
				margin-left: 10%;	
			}
			#number{
				float: left;
				width: 40px;
				height: 40px;
				font-size: 30px;
			}
			.addShopCar button{
				float: left;
				width: 80px;
				height: 40px;
			}
		</style>
	</head>
	<body>
		<div name="header" class="header">
			<%@include file="head.jsp" %>
		</div>
		<div class="dt-title">
			<ul name="dtNav" class="dt-nav">
				<li><a href="">首页</a></li>
				<li>&gt;</li>
				<li><a href="">一级标题</a></li>
				<li>&gt;</li>
				<li><a href="">二级标题</a></li>
			</ul>
		</div>
		<br />
		<div class="main">
			<div  class="dt-img">
				<img id="deImg" src="" alt="" width="100%" height="100%"/>
			</div>
			<form action="addShopCart" method="post">
				<div class="dt-product">
					<input id="productId" name="productId" type="hidden" value=""/>
					<input id="" name="" type="hidden" value=""/>
				<h3 id="name"></h3>
				<div name="dtProduct" class="">
					<p><b>某某特价</b><a href="">降价通知！</a></p>
					<p>原价：￥<s><span id="realPrice"></span></s></p>
					<p>售价：￥<span id="salePrice"></span></p>
				</div>
				<div name="dtProductDiscount">
					<p><b>优惠</b></p>
				</div>
				<div name="dtSendAddr">
					<p><b>配送至</b></p>
					<span>地址：</span>
					<select name="">
						<option value="">选择地址</option>
						<option value="">重庆市</option>
						<option value="">北京市</option>
					</select>
					<p>是否有货:<span>是</span></p>
				</div>
				<div class="dtArriveTime">
					<p><b>预计到达时间</b></p>
					<p>北京时间:<span></span></p>
				</div>
				<div class="addShopCar">
					<input id="number" name="number" type="number" value="1" />
					<button>加入购物车</button>
				</div>
			</div>
			</form>
			
		</div>
		<div class="footer">
			<%@include file="foot.jsp" %>
		</div>
		<script src="js/jquery.min.js"></script>
		<script type="text/javascript">
			window.onload = function () {
                var id = location.search.split("=")[1];
                $.ajax({
                    type: "GET",
                    url: "/ishop-portal/getProductById",
                    data: {id: id},
                    dataType: "json",
                    success: function (data) {
                        //这里获取到数据展示到前台
						$("#deImg").attr('src',data.imageSrc);
						$("#realPrice").text(data.realPrice);
						$("#salePrice").text(data.sellPrice);
                        $("#sellPrice").val(data.sellPrice);
						$("#productId").val(data.id);
						$("#name").text(data.name);
                    }
                });
            }
		</script>
	</body>
</html>