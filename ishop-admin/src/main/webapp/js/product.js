/**
 * Created by myq on 2017/4/23.
 */
//增加商品
function addProdcut() {
    //输入非空验证
    var productEle = ["#productName", "#productSubTitle","#typeName", "#imageSrc", "#inventNum", "#monthSaleNum", "#orderLink","#salePrice","#realName","#isRecommend"];
    for (var i = 0; i < productEle.length; i++) {
        if ($(productEle[i]).val() === "") {
            $(productEle[i]).focus();
            return;
        }
    }
    alert(2);
    var name = $("#productName").val();
    var subTitle = $("#productSubTitle").val();
    var typeId = $("#typeName").val();
    var imageSrc = $("#imageSrc").val();
    var inventNum =  $("#inventNum").val();
    var saleNum = $("#monthSaleNum").val();
    var orderLink = $("#orderLink").val();
    var salePrice = $("#salePrice").val();
    var realPrice = $("#realPrice").val();
    var isRecommend = $("#isRecommend").val();
    //判断管理员是否存在
    $.ajax({
        type: "GET",
        url: "/ishop-admin/getProductByName",
        data: {name: name},
        dataType: "json",
        success: function (data) {
            //这里获取到数据展示到前台
            if (jQuery.isEmptyObject(data) || data == false) {
                //说明商品名不存在可以添加,
                $.ajax({
                    type: "POST",
                    url: "/ishop-admin/addProduct",
                    data: {
                        name: name,
                        subTitle:subTitle,
                        typeId: typeId,
                        imageSrc:imageSrc,
                        inventNum:inventNum,
                        saleNum:saleNum,
                        orderLink:orderLink,
                        salePrice:salePrice,
                        realPrice:realPrice,
                        isRecommend:isRecommend
                    },
                    dataType: "json",
                    success: function (data) {
                        //这里获取到数据展示到前台
                        swal(
                            '添加成功!',
                            '成功添加了一条商品信息!',
                            'success'
                        );
                        //2秒后自动跳转
                        function autoReturn() {
                            location = "listProduct.jsp";
                        }
                        setTimeout(autoReturn, 2000);
                    }
                });

            } else {
                //说明商品名存在,不能添加.
                swal(
                    '',
                    '该商品已存在,请重新输入!',
                    'warning'
                ).then(function () {
                    $("#name").focus();
                });
            }
        }
    });
    //location.href="listProduct.jsp";
}
//删除商品
function delProduct(that) {
    var p = that.parentNode.firstChild;
    var name = p.innerHTML;
    $.ajax({
        type:"GET",
        url:"/ishop-admin/delProduct",
        data:{name:name},
        dataType:"json",
        success:function (data) {
            //这里获取到数据展示到前台
            alert(data);
        }
    });
    location.reload();
}
//修改商品
function updateProduct() {
    var id = $("#id").val();
    var roleId = $("#roleId").val();
    var name = $("#name").val();
    var password = $("#password").val();
    var realName = $("#realName").val();
    var email =  $("#email").val();
    var phone = $("#phone").val();
    $.ajax({
        type:"GET",
        url:"/ishop-Product/updateProduct",
        data:{
            id:id,
            roleId:roleId,
            name:name,
            password:password,
            realName:realName,
            email:email,
            phone:phone
        },
        dataType:"json",
        success:function (data) {
            //这里获取到数据展示到前台
            alert(data);
        }
    });
    location.href="listProduct.jsp";
}
//查看所有商品
function listProduct() {
    mydata=[];
    $.ajax({
        type:"GET",
        url:"/ishop-admin/listProduct",
        dataType:"json",
        success:function (data) {
            //这里获取到数据展示到前台
            var vm = new Vue({
                el:'#productTable',
                data:{
                    mydata:data
                }
            });
        }
    })
}
//通过name查看商品
function getProductByName() {
    var name = $("#name").val();
    $("#queryProductTable").show();
    $.ajax({
        type:"GET",
        url:"/ishop-product/getProductByName",
        data:{name:name},
        dataType:"json",
        success:function (data) {
            //这里获取到数据展示到前台
            var vm = new Vue({
                el:'#queryProductTable',
                data:{
                    Product:data
                }
            });
        }
    })
}
//通过Id查询商品
function  getProductById() {

}