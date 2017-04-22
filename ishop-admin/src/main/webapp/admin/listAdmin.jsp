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
    <title>所有管理员</title>
    <link href="../css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div id="data">
   <table id="adminTable" class="active table table-hover table-striped">
       <tr>
           <th>序号</th>
           <th>权限等级</th>
           <th>用户名</th>
           <th>密码</th>
           <th>真实名字</th>
           <th>邮箱</th>
           <th>电话</th>
           <th>更新时间</th>
           <th>操作</th>
       </tr>
       <tr v-for="admin in mydata">
           <td>{{mydata.indexOf(admin)+1}} <span style="display: none">{{admin.id}}</span></td>
           <td>{{admin.roleId}}</td>
           <td>{{admin.name}}</td>
           <td>{{admin.password}}</td>
           <td>{{admin.realName}}</td>
           <td>{{admin.email}}</td>
           <td>{{admin.phone}}</td>
           <td>{{admin.updated}}</td>
           <td>
               <span style="display: none">{{admin.id}}</span>
               <button onclick="delAdmin(this)">删除</button>
               <%--<a v-bind:href="'delAdmin?id='+admin.id"><button>删除</button></a>--%>
               <a v-bind:href="'updateAdmin.jsp?id='+admin.id"><button>更新</button></a>
       </tr>
   </table>
</div>
<script src="../js/jquery.min.js"></script>
<script src="../js/vue.js"></script>
<script src="../js/admin.js"></script>
<script>
    $(document).ready(function(){
        listAdmin();
    });
</script>

</body>
</html>
