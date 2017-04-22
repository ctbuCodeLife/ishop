<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <!-- 包含头部信息用于适应不同设备 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Signin Template for Bootstrap</title>
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <style type="text/css">
    	.center-block{
    		float: none;
    		display: block;
    		margin-left: auto;
    		margin-right: auto;
    	}
    	.glyphicon-registration-mark{
    		float: right;
    	}
    </style>

  </head>
  <body>
    <div id="container" class="container col-md-3 center-block">
      <form class="form-signin" action="" method="post">
        <h2 class="form-signin-heading">Please sign in</h2>
        <label for="inputUsername" class="sr-only">Username</label>
        <input type="text" id="inputUsername" class="form-control" onblur="" placeholder="Username" required autofocus>
        <span id="isUser"></span>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" id="inputPassword" class="form-control" onblur="" placeholder="Password" required>
        <span id="isPwd"></span>
        <div class="other">
            <input type="checkbox" value="remember-me"/> Remember me<a class="glyphicon-registration-mark" href="register.jsp">注册&gt;&gt;</a>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>

    </div>
    <script src="js/jquery-1.2.6.min.js"></script>
    <script type="text/javascript">
        $(function () {

        });
    </script>
  </body>
</html>
    