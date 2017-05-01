<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
        <title>商品列表页</title>
		<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css" />
        <link rel="stylesheet" href="css/style.css">

		<style type="text/css">
			ul {
				list-style: none;
			}
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
                width: 90%;
                margin-left: 5%;
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
			.product-Template .product-all .product{
				width: 200px;
				height: 350px;
				margin-top: 10px;
				margin-left: 30px;
				border: 1px solid #999;
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

			.product-Template .product-all .product p{
                color: #000;
				margin-bottom: 4px;
			}
			.product-Template .product-all .product .img-box{
                margin-left: 0;
            }
            .product-Template .product-all .product .img-box img{
				width: 198px;
				height: 230px;
				overflow: hidden;
			}
            .product em{
                font-size: 20px;
                font-weight: 700;
                font-family: Tahoma,Arial,Helvetica,sans-serif;
                color: #F40;
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
			<div class="product-nav" id="typeGrade">
				<ul id="typeGrade1" class="nav nav-tabs">
					<li role="presentation" class="" v-for="type in typeData" onclick="selectGrade2(this)">
                        <span style="display: none;">{{type.id}}</span>
						<a href="#" v-if="type.grade == 1">{{type.name}}</a>
					</li>
				</ul>
                <ul  id="typeGrade2" class="nav nav-tabs" style="display: none">

                </ul>
                <ul  id="typeGrade3" class="nav nav-tabs" style="display: none">

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
			<div id="productList" class="product-all" >
				<div name="product" class="product" v-for="product in mydata">
                    <a v-bind:href="product.orderLink">
					<p class="text-center">{{product.name}}</p>
                    <%--<div class="img-box">--%>
                        <img v-bind:src="product.imageSrc" v-bind:alt="product.name"  width="198" height="230"/>

                        <p class="text-center">原价：<s>￥{{product.realPrice}}</s></p>
                        <p class="text-center">售价：<em>￥{{product.sellPrice}}</em></p>
                        <a v-bind:href="product.orderLink" ><p class="text-center">查看详情</p></a>
                    </a>
                    <%--</div>--%>
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
        var typeData = [];
        var vm = new Vue({
            el:'#productList',
            data:{
                mydata:[]
            }
        });
        $(document).ready(function () {
            $.ajax({
                type:"GET",
                url:"/ishop-portal/listProduct",
                dataType:"json",
                success:function (data) {
                    //这里获取到数据展示到前台
                   vm.mydata = data;
                }
            });

            $.ajax({
                type:"GET",
                url:"/ishop-portal/listType",
                dataType:"json",
                success:function (data) {
                    //这里获取到数据展示到前台
                    var vm = new Vue({
                        el: '#typeGrade',
                        data: {
                            typeData: data
                        }
                    });
                    typeData = data;
                }
            });

        });
        function  selectGrade2(that) {
            var obj = that.firstElementChild.innerHTML;
            $("#typeGrade2 > li").remove();
            for(var i = 0; i < typeData.length; i++){
                if(obj == typeData[i].parentId){
                    $("#typeGrade2").append('<li role="presentation"  onclick="selectGrade3(this)"><span style="display: none">'+typeData[i].id+'</span> <a href="#">'+typeData[i].name+'</a> </li>');
                    $("#typeGrade2").css("display","block");
                }
            }
        }
        function  selectGrade3(that) {
            var obj = that.firstElementChild.innerHTML;
            $("#typeGrade3 > li").remove();
            for(var i = 0; i < typeData.length; i++){
                if(obj == typeData[i].parentId){
                    $("#typeGrade3").append('<li role="presentation" ><span style="display: none">'+typeData[i].id+'</span> <a href="#" onclick="listByType('+typeData[i].id+')">'+typeData[i].name+'</a> </li>');
                    $("#typeGrade3").css("display","block");
                }
            }
        }
        function listByType(typeId) {
            vm.mydata= [];
            $.ajax({
                type:"GET",
                url:"/ishop-portal/listProductByType",
                data:{typeId:typeId},
                dataType:"json",
                success:function (data) {
                    //这里获取到数据展示到前台
                    vm.mydata = data;
                }
            });
        }

    </script>
</html>