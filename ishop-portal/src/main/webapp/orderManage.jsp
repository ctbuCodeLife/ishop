<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" type="text/css" href="css/footer.css" />
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
	</style>
</head>
<body>
	<div name="header" class="header">
		<%@include file="head.txt" %>
	</div>
	<div id="search" class="col-md-4 input-group center">
			<input type="text" class="form-control" placeholder="order ID...">
			<span class="input-group-btn">
        		<button class="btn btn-default" type="button">Go!</button>
     		</span>
		</div>
		<div class="main">
			<table class="table table-striped table-hover table-responsive">
				<tr>
					<th>序号</th>
					<th>订单号</th>
					<th>产品数量</th>
					<th>总额度</th>
					<th>日期</th>
					<th>操作</th>
				</tr>
				<tr>
					<td>1</td>
					<td>2156313</td>
					<td>2</td>
					<td>120.0</td>
					<td>2017-4-20</td>
					<td><a href="">订单详情</a>&nbsp;<input type="submit" id="" name="" value="删除"/></td>
				</tr>
			</table>
		</div>
		<div class="footer">
			<%@include file="footer.txt" %>
		</div>
</body>
</html>