<%--
  Created by IntelliJ IDEA.
  User: myq
  Date: 2017/4/22
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <title>userModify</title>
    <style type="text/css">
        .container{
            width: 500px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>用户修改</h2>
        <form action="" method="post" class="form-horizontal">
            <div class="form-group">
                <label for="inputUsername" class="col-sm-2 control-label">用户名</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="inputUsername" placeholder="Username">
                </div>
            </div>
            <div class="form-group">
                <label for="inputPassword" class="col-sm-2 control-label">密码</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" id="inputPassword" placeholder="Password">
                </div>
            </div>
            <div class="form-group">
                <label for="inputPhone" class="col-sm-2 control-label">电话</label>
                <div class="col-sm-10">
                    <input type="tel" class="form-control" id="inputPhone" placeholder="Phone">
                </div>
            </div>
            <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">邮箱</label>
                <div class="col-sm-10">
                    <input type="email" class="form-control" id="inputEmail3" placeholder="Email">
                </div>
            </div>
            <div class="form-group">
                <label for="inputRealname" class="col-sm-2 control-label">真实姓名</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="inputRealname" placeholder="Realname">
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">修改</button>
                </div>
            </div>
        </form>
    </div>
    <script src="js/jquery.min.js"></script>
    <script src="js/vue.js"></script>
    <script>
        $(document).ready(function(){
            var id = location.search.split("=")[1];
            $.ajax({
                    type:"GET",
                    url:"/ishop-admin/getAdmin",
                    data:{id:id},
                    dataType:"json",
                    success:function (data) {
                        //这里获取到数据展示到前台
                        console.log(data);
                        //mydata=data;
//                        var vm = new Vue({
//                            el:'#userTable',
//                            data:{
//                                mydata:data
//                            }
//                        });
                    }

                }
            );

        })
    </script>
</body>
</html>
