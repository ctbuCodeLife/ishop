<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
=======
<%--
  Created by IntelliJ IDEA.
  User: tao
  Date: 2017/4/22 0001
  Time: 0:12
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
>>>>>>> dev
<html>

<head>
    <meta charset="utf-8" />
    <!-- 下面这句用于响应移动设备的改变布局，必须写在前面 -->
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" />
    <meta name="Keywords" content="" />
    <meta name="Description" content="" />
    <!--bootstrap核心CSS文件-->
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
    <link rel="stylesheet" type="text/css" href="css/banner.css" />
    <link rel="stylesheet" type="text/css" href="css/left_nav.css"/>
    <link rel="stylesheet" type="text/css" href="css/footer.css"/>
    <!-- JQuery文件,务必在bootstrap.min.js 之前引入 -->
    <script src="js/jquery-1.2.6.min.js" defer></script>

    <style type="text/css">
        ul {
            list-style: none;
        }

        #nav_left ul {
            vertical-align: middle;
        }

        #nav_left ul li {
            vertical-align: middle;
        }

        #nav_left ul li:last-child {
            line-height: 40px;
        }

        #main_left {
            position: relative;
        }

        #main_middle {
            height: 445px;
            margin-right: 2rem;
        }
        #search{
            margin:auto;
            margin-bottom: 25px;
        }
        #main_right {
            height: 445px;
        }

        #footer {
            text-align: center;
            vertical-align: middle;
        }
        .copy{
            font-size: 16px;
            text-align: center;
            padding: 10px 0 20px;
            color: #9ea7b4;
        }
    </style>
    <title></title>
</head>

<body>
<div class="container-fluid">
    <%@include file="nav.txt"%>
    <div id="main" class="col-md-2 main">
        <div id="main_left" class="ul_product_type">
            <div class='button' id='b1'>
                <p>A</p>
            </div>
            <div class='button' id='b2'>
                <p>B</p>
            </div>
            <div class='button' id='b3'>
                <p>C</p>
            </div>
            <div class='button' id='b4'>
                <p>D</p>
            </div>
            <div class='button' id='b5'>
                <p>E</p>
            </div>
            <div class='infoBox' id='i1'>
                <p>AAAA</p>
            </div>
            <div class='infoBox' id='i2'>
                <p>BBBB</p>
            </div>
            <div class='infoBox' id='i3'>
                <p>CCCC</p>
            </div>
            <div class='infoBox' id='i4'>
                <p>DDDD</p>
            </div>
            <div class='infoBox' id='i5'>
                <p>EEEE</p>
            </div>
            <div class='button' id='bmain'>
                <p>主题市场</p>
            </div>
        </div>
    </div>
    <div id='main_middle' class="col-md-7">
        <form action="" method="post">
            <div id="search" class="col-md-7 input-group">
                <input name="shopType" type="text" class="form-control" placeholder="Search shopType">
                <span class="input-group-btn">
        				<button class="btn btn-default" type="button">Go!</button>
     				</span>
            </div>
        </form>
        <div id="container">
            <div id="list" style="left: -700px;">
                <img src="img/5.png" alt="1" />
                <img src="img/1.png" alt="1" />
                <img src="img/2.png" alt="2" />
                <img src="img/3.png" alt="3" />
                <img src="img/4.png" alt="4" />
                <img src="img/5.png" alt="5" />
                <img src="img/1.png" alt="5" />
            </div>
            <div id="buttons">
                <span index="1" class="on"></span>
                <span index="2"></span>
                <span index="3"></span>
                <span index="4"></span>
                <span index="5"></span>
            </div>
            <a href="javascript:;" id="prev" class="arrow">&lt;</a>
            <a href="javascript:;" id="next" class="arrow">&gt;</a>
        </div>
    </div>
    <div id="main_right" class="col-md-2">
        <h2>销量排行榜</h2>
        <table id='sortTop10' class="table table-striped table-hover table-condensed">
            <tr><th>排名</th><th>编号</th><th>货名</th><th>单价</th></tr>
            <tr v-for="commodity in allcommodity">
                <td>{{commodity.sort}}</td>
                <td>{{commodity.sales}}</td>
                <td>{{commodity.name}}</td>
                <td>{{commodity.price}}</td>
            </tr>
        </table>
    </div>
</div>

<%@include file="footer.txt" %>

<div id="footer" class="navbar-fixed-bottom">
    <div id="copyright" class="copy">
        <span><a href="http://www.litao.work">李涛</a></span>
        <b>|</b>
        <span><a href="http://www.muyiquan.cn">牟一全的博客</a></span>
        <b>|</b>
        <span>邓嘉欣</span>
        <b>|</b>
        <span>侯兰</span>
        <b>|</b>
        <span><a href="https://taobao.com">淘宝</a></span>
        <b>|</b>
        <span><a href="https://www.tmall.com">天猫</a></span>
        <b>|</b>
        <span><a href="https://www.jd.com">京东</a></span>
        <b>|</b>
        <span><a href="https://github.com">Githup</a></span>
        <b>|</b>
        <span><a href="http://www.jsbin.com ">在线代码共享</a></span>
        <b>|</b>
        <span><a href="">待扩展</a></span>
        <b>|</b>
        <span><a href="">待扩展</a></span>
        <b>|</b>
        <span><a href="">待扩展</a></span>
    </div>
</div>
<script src="js/vue.js"></script>
<script type="text/javascript">
    var vm = new Vue({
        el:'#sortTop10',
        data:{
            allcommodity:[{
                sort:1,
                sales:100,
                name:'牛板筋',
                price:2.5,
            },{
                sort:1,
                sales:100,
                name:'牛板筋',
                price:2.5
            },{
                sort:1,
                sales:100,
                name:'牛板筋',
                price:2.5
            },{
                sort:1,
                sales:100,
                name:'牛板筋',
                price:2.5
            },{
                sort:1,
                sales:100,
                name:'牛板筋',
                price:2.5
            },{
                sort:1,
                sales:100,
                name:'牛板筋',
                price:2.5
            },{
                sort:1,
                sales:100,
                name:'牛板筋',
                price:2.5
            },{
                sort:1,
                sales:100,
                name:'牛板筋',
                price:2.5
            },{
                sort:1,
                sales:100,
                name:'牛板筋',
                price:2.5
            },{
                sort:1,
                sales:100,
                name:'牛板筋',
                price:2.5
            },{
                sort:1,
                sales:100,
                name:'牛板筋',
                price:2.5
            },{
                sort:1,
                sales:100,
                name:'牛板筋',
                price:2.5
            },{
                sort:1,
                sales:100,
                name:'牛板筋',
                price:2.5
            }]
        }
    });
</script>
<script src="js/left_nav.js" type="text/javascript" charset="utf-8"></script>
<script src="js/banner.js" type="text/javascript" charset="utf-8"></script>
<script type="text/javascript">

    window.onload = function() {
        fadeMenu();
        banner();
    };
</script>
</body>
<<<<<<< HEAD

</html>
=======
<p>登录成功</p>
</html>
>>>>>>> dev
