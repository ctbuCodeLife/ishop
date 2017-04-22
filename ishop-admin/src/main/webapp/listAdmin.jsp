<%--
  Created by IntelliJ IDEA.
  User: tao
  Date: 2017/4/22 0022
  Time: 3:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>list_admin.jsp</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div id="data">
   <table id="userTable" class="active table table-hover table-striped">
       <tr>
           <th>序号</th>
           <th>用户名</th>
           <th>密码</th>
           <th>真实名字</th>
           <th>邮箱</th>
           <th>电话</th>
           <th>创建时间</th>
           <th>更新时间</th>
           <th>操作</th>
       </tr>
       <tr v-for="user in mydata">
           <td>{{mydata.indexOf(user)+1}} <span style="display: none">{{user.id}}</span></td>
           <td>{{user.name}}</td>
           <td>{{user.password}}</td>
           <td>{{user.realName}}</td>
           <td>{{user.email}}</td>
           <td>{{user.phone}}</td>
           <td>{{user.created}}</td>
           <td>{{user.updated}}</td>
           <td>
               <a v-bind:href="'delAdmin?id='+user.id"><button>删除</button></a>
               <a v-bind:href="'userModify.jsp?id='+user.id"><button>更新</button></a>
       </tr>
   </table>
</div>
<script src="js/jquery.min.js"></script>
<script src="js/vue.js"></script>
<script>
    $(document).ready(function(){
        mydata=[];
        $.ajax({
                type:"GET",
                url:"/ishop-admin/listAdmin",
                dataType:"json",
                success:function (data) {
                    //这里获取到数据展示到前台
                    //mydata=data;
                    var vm = new Vue({
                        el:'#userTable',
                        data:{
                            mydata:data
                        }
                    });
                }

            }
        );

    })
</script>

</body>
</html>
