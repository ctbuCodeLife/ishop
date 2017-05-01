<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
		<title></title>
		<style type="text/css">
			ul {
				list-style: none;
			}
			#nav_left {}
			
			#nav_right {}
			
			#nav_left ul {
				vertical-align: middle;
				list-style: none;
			}
			
			#nav_left ul li {
				vertical-align: middle;
			}
			
			#nav_left ul li:last-child {
				line-height: 40px;
			}
			
			#nav_right ul {
				list-style: none;
			}
			
			.center {
				margin: auto;
			}
			
			.product-Template {
				width: 80%;
				margin-left: 10%;
			}
			.product-Template .product-sort{
				display: flex;
				flex-direction: row;
				flex-flow: row;
			}
			.product-Template .product-sort div{
				width:85px;
				margin-left:10px ;
				text-align: center;
				border: 1px solid blanchedalmond;
			}
			.product-Template .product-sort button{
				background-color: #fff;
				border: 0;
				
			}
			/*flex布局简单引用-详情查看阮一峰的flex布局教程*/
			.product-Template .product-all{
				display: flex;
				display: -webkit-flex;
				flex-direction: row;
				flex-wrap: wrap; /*flex-flow为属性direction和wrap的简写方式flex-flow:row wrap;*/
				justify-content: flex-start;/*项目在主轴上的对齐方式，有五个值，默认值为flex-start*/
				align-items: center;/*项目在交叉轴上的对齐方式，也有五个值*/
				align-content: center;/*属性定义了多根轴线的对齐方式。如果项目只有一根轴线，该属性不起作用。*/
			}
			.product-Template .product-all div{
				width: 200px;
				height: 330px;
				margin-top: 10px;
				margin-left: 30px;
				border: 1px solid #000;
				order: 1;/*属性定义项目的排列顺序。数值越小，排列越靠前，默认为0。*/
				flex-grow: 0;/*(是在剩余空间的基础上)属性定义项目的放大比例，默认为0，即如果存在剩余空间，也不放大。*/
				flex-shrink:1 ;/*属 性定义了项目的缩小比例，默认为1，即如果空间不足，该项目将缩小。(负值无效)*/
				flex-basis: inherit;/*属性定义了在分配多余空间之前，项目占据的主轴空间（main size）。
				浏览器根据这个属性，计算主轴是否有多余空间。它的默认值为auto，即项目的本来大小。
				它可以设为跟width或height属性一样的值（比如350px），则项目将占据固定空间。*/
				flex: none;/*flex属性是flex-grow, flex-shrink 和 flex-basis的简写，默认值为0 1 auto。*/
				/*该属性有两个快捷值：auto (1 1 auto) 和 none (0 0 auto)。*/
				/*建议优先使用这个属性，而不是单独写三个分离的属性，因为浏览器会推算相关值。*/
				align-self: auto;
				/*align-self属性允许单个项目有与其他项目不一样的对齐方式，可覆盖align-items属性。
				 * 默认值为auto，表示继承父元素的align-items属性，如果没有父元素，则等同于stretch。*/
			}
			.product-Template .product-all div p{
				margin-bottom: 4px;
			}
			.product-Template .product-all div img{
				width: 198px;
				height: 230px;
			}
            #ulFlex{
                display: flex;
                flex-direction: row;
                flex-wrap: wrap;
                justify-content: flex-start;
            }
		</style>
	</head>
	<body>
		<div class="head">
			<%@include file="head.jsp"%>
		</div>
		<form action="" method="post">
			<div id="search" class="col-md-4 input-group center">
			<input type="text" class="form-control" placeholder="Search keywords...">
			<span class="input-group-btn">
        		<button class="btn btn-default" type="button">Go!</button>
     		</span>
		</div>
		</form>
		<div class="product-Template">
			<div class="product-nav">
				<ul id="productType1" class="nav nav-tabs">
					<li role="presentation" class="active">
						<a href="#">一级类别</a>
					</li>
					<li role="presentation">
						<a href="#">一级类别</a>
					</li>
					<li role="presentation">
						<a href="#">一级类别</a>
					</li>
					<li role="presentation">
						<a href="#">一级类别</a>
					</li>
					<li role="presentation">
						<a href="#">一级类别</a>
					</li>
					<li role="presentation">
						<a href="#">一级类别</a>
					</li>
					<li role="presentation">
						<a href="#">一级类别</a>
					</li>
					<li role="presentation">
						<a href="#">一级类别</a>
					</li>
					<li role="presentation">
						<a href="#">一级类别</a>
					</li>
					<li role="presentation">
						<a href="#">一级类别</a>
					</li>
					<li role="presentation">
						<a href="#">一级类别</a>
					</li>
					<li role="presentation">
						<a href="#">一级类别</a>
					</li>
				</ul>
				<ul id="productType2" class="nav nav-tabs">
					<li>
						<a href="">二级类别</a>
					</li>
					<li>
						<a href="">二级类别</a>
					</li>
					<li>
						<a href="">二级类别</a>
					</li>
					<li>
						<a href="">二级类别</a>
					</li>
					<li>
						<a href="">二级类别</a>
					</li>
					<li>
						<a href="">二级类别</a>
					</li>
					<li>
						<a href="">二级类别</a>
					</li>
					<li>
						<a href="">二级类别</a>
					</li>
					<li>
						<a href="">二级类别</a>
					</li>
					<li>
						<a href="">二级类别</a>
					</li>
					<li>
						<a href="">二级类别</a>
					</li>
					<li>
						<a href="">二级类别</a>
					</li>
				</ul>
			</div>
			<div class="product-sort btn-group">
				<div id="sortBySales">
					<button>销量</button>
				</div>
				<div id="sortByTime">
					<button>上架日期</button>
				</div>
				<div id="sortByMoney">
					<button>价格</button>
				</div>
				<div id="selectArea">
					<select name="" class="">
						<option value="">选择地区</option>
						<option value="">重庆市</option>
						<option value="">上海市</option>
						<option value="">北京市</option>
						<option value="">天津市</option>
					</select>
				</div>
			</div>
			<div class="product-all">
				<div name="product" class="product">
					<p class="text-center">商品名</p>
					<a href=""><img src="img/4.png"/></a>
					<p>原价：<span></span></p>
					<p>售价：<span></span></p>
					<a href="">查看详情</a>
				</div>
				<div name="product" class="product">
					<p class="text-center">商品名</p>
					<a href=""><img src="img/4.png"/></a>
					<p>原价：<span></span></p>
					<p>售价：<span></span></p>
					<a href="">查看详情</a>
				</div>
				<div name="product" class="product">
					<p class="text-center">商品名</p>
					<a href=""><img src="img/4.png"/></a>
					<p>原价：<span></span></p>
					<p>售价：<span></span></p>
					<a href="">查看详情</a>
				</div>
				<div name="product" class="product">
					<p class="text-center">商品名</p>
					<a href=""><img src="img/4.png"/></a>
					<p>原价：<span></span></p>
					<p>售价：<span></span></p>
					<a href="">查看详情</a>
				</div>
				<div name="product" class="product">
					<p class="text-center">商品名</p>
					<a href=""><img src="img/4.png"/></a>
					<p>原价：<span></span></p>
					<p>售价：<span></span></p>
					<a href="">查看详情</a>
				</div>
				<div name="product" class="product">
					<p class="text-center">商品名</p>
					<a href=""><img src="img/4.png"/></a>
					<p>原价：<span></span></p>
					<p>售价：<span></span></p>
					<a href="">查看详情</a>
				</div>
				<div name="product" class="product">
					<p class="text-center">商品名</p>
					<a href=""><img src="img/4.png"/></a>
					<p>原价：<span></span></p>
					<p>售价：<span></span></p>
					<a href="">查看详情</a>
				</div>
				<div name="product" class="product">
					<p class="text-center">商品名</p>
					<a href=""><img src="img/4.png"/></a>
					<p>原价：<span></span></p>
					<p>售价：<span></span></p>
					<a href="">查看详情</a>
				</div>
				<div name="product" class="product">
					<p class="text-center">商品名</p>
					<a href=""><img src="img/4.png"/></a>
					<p>原价：<span></span></p>
					<p>售价：<span></span></p>
					<a href="">查看详情</a>
				</div>
				<div name="product" class="product">
					<p class="text-center">商品名</p>
					<a href=""><img src="img/4.png"/></a>
					<p>原价：<span></span></p>
					<p>售价：<span></span></p>
					<a href="">查看详情</a>
				</div>
				<div name="product" class="product">
					<p class="text-center">商品名</p>
					<a href=""><img src="img/4.png"/></a>
					<p>原价：<span></span></p>
					<p>售价：<span></span></p>
					<a href="">查看详情</a>
				</div>
				<div name="product" class="product">
					<p class="text-center">商品名</p>
					<a href=""><img src="img/4.png"/></a>
					<p>原价：<span></span></p>
					<p>售价：<span></span></p>
					<a href="">查看详情</a>
				</div>
				<div name="product" class="product">
					<p class="text-center">商品名</p>
					<a href=""><img src="img/4.png"/></a>
					<p>原价：<span></span></p>
					<p>售价：<span></span></p>
					<a href="">查看详情</a>
				</div>
			</div>
		</div>

		<div class="footer">
			<%@include file="foot.jsp" %>
		</div>
	</body>
    <script src="<%=request.getContextPath()%>/js/jquery.min.js"></script>
    <script src="<%=request.getContextPath()%>/js/vue.js"></script>
    <script>
        $(document).ready(function () {
            var mydata=[];
            $.ajax({
                type:"GET",
                url:"http://127.0.0.1:9090/ishop-admin/listProduct",
                dataType:"json",
                success:function (data) {
                    //这里获取到数据展示到前台
                    console.log(data);
                    var vm = new Vue({
                        el:'#productList',
                        data:{
                            mydata:data
                        }
                    });
                }
            })
        });
    </script>
</html>