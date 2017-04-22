<%--
  Created by IntelliJ IDEA.
  User: myq
  Date: 2017/4/22
  Time: 8:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="css/footer.css" />
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
    <title>评论管理</title>
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
        .main table tr td{
            line-height: 25px;
            vertical-align: middle;
        }
        #develop{
            width: 100%;
            height: 70px;
            margin-bottom: 0px;
            background-color: #dddddd;
        }
    </style>
</head>
<body>
<div name="header" class="header">
    <%@include file="head.txt" %>
</div>
<div id="search" class="col-md-4 input-group center">
    <input type="text" class="form-control" placeholder="comment id...">
    <span class="input-group-btn">
        		<button class="btn btn-default" type="button">Go!</button>
    </span>
</div>
<div class="main">
    <table id="allComment" class="table table-striped table-hover table-responsive">
        <tr>
            <th>序号</th>
            <th>商品编号</th>
            <th>评论编号</th>
            <th>星级评价</th>
            <th>详细评论</th>
            <th>操作</th>
        </tr>
        <tr v-for="comment in allComment">
                <td>{{allComment.indexOf(comment)+1}}</td>
                <td>{{comment.orderId}}</td>
                <td name="commentId">{{comment.Id}}</td>
                <td>{{comment.grade}}</td>
                <td>
                    <textarea name=dtComment"" readonly="readonly">{{comment.content}}
					</textarea>
                </td>
                <td><a href="">评论详情</a>&nbsp;<input type="submit"  name="" value="删除"/></td>
        </tr>
    </table>
</div>
<div class="footer">
    <%@include file="footer.txt" %>
</div>
<script src="js/vue.js"></script>
<script type="text/javascript">
 var vm = new   Vue({
     el:'#allComment',
     data:{
         allComment:[{
             orderId:1,
             Id:1,
             grade:"五星",
             content:"dasdasdadasdsad" +
             "asdad"
         },{
             orderId:1,
             Id:1,
             grade:"五星",
             content:"dasdasdadasdsad" +
             "asdad"
         }]
     }
 });
</script>
</body>
</html>
