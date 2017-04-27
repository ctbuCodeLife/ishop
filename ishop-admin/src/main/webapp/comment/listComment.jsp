<%--
  Created by IntelliJ IDEA.
  User: myq
  Date: 2017/4/23
  Time: 18:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>所有评论</title>
    <link href="<%=request.getContextPath()%>/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div id="data">
    <table id="commentTable" class="active table table-hover table-striped">
        <tr>
            <th>序号</th>
            <th>商品id</th>
            <th>会员id</th>
            <th>密码</th>
            <th>真实名字</th>
            <th>邮箱</th>
            <th>电话</th>
            <th>更新时间</th>
            <th>操作</th>
        </tr>
        <tr v-for="comment in mydata">
            <td>{{mydata.indexOf(comment)+1}} <span style="display: none">{{comment.id}}</span></td>
            <td>{{comment.roleId}}</td>
            <td>{{comment.name}}</td>
            <td>{{comment.password}}</td>
            <td>{{comment.realName}}</td>
            <td>{{comment.email}}</td>
            <td>{{comment.phone}}</td>
            <td>{{comment.updated}}</td>
            <td>
                <span style="display: none">{{comment.id}}</span>
                <button onclick="delcomment(this)">删除</button>
                <a v-bind:href="'updateComment.jsp?id='+comment.id"><button>更新</button></a>
            </td>
        </tr>
    </table>
</div>
<script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/js/vue.js"></script>
<script src="<%=request.getContextPath()%>/js/comment.js"></script>
<script>
    function listComment() {
        mydata=[];
        $.ajax({
            type:"GET",
            url:"/ishop-admin/listComment",
            dataType:"json",
            success:function (data) {
                //这里获取到数据展示到前台
                var vm = new Vue({
                    el:'#Table',
                    data:{
                        mydata:data
                    }
                });
            }
        })
    }
    $(document).ready(function(){
        listComment();
    });
</script>

</body>
</html>

