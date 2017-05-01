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
    swal({
        title: '删除商品?',
        text: "删除后就不可恢复!",
        type: 'error',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: '确认删除',
        cancelButtonText: "取消"
    }).then(function (isConfirm) {
        if (isConfirm) {
            //执行删除操作
            var p = that.parentNode.firstElementChild;
            var id = p.innerHTML;
            $.ajax({
                type: "GET",
                url: "/ishop-admin/delProduct",
                data: {id: id},
                dataType: "json",
                success: function (data) {
                    //这里获取到数据展示到前台
                    if(data === true){
                        swal(
                            '删除成功!',
                            '您已经成功删除商品',
                            'success'
                        ).then(function () {
                            location.reload();
                        });
                    }else {
                        swal(
                            '删除失败!',
                            '删除商品失败',
                            'success'
                        )
                    }
                }
            });

        }
    });
}
//修改商品
function updateProdcut() {
    //输入非空验证
    var productEle = ["#productName", "#productSubTitle","#typeName", "#imageSrc", "#inventNum", "#monthSaleNum", "#orderLink","#salePrice","#realName","#isRecommend"];
    for (var i = 0; i < productEle.length; i++) {
        if ($(productEle[i]).val() === "") {
            $(productEle[i]).focus();
            return;
        }
    }
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
    $.ajax({
        type: "GET",
        url: "/ishop-admin/updateProduct",
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
        }
    });
    //提示框
    swal(
        '更新成功!',
        '成功更新了一条商品信息!',
        'success'
    ).then(function () {
        location.href = "ListProduct.jsp";
    });
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