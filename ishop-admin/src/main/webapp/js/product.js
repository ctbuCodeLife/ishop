/**
 * Created by myq on 2017/4/23.
 */
//增加商品
function addProdcut() {
    var name = $("#productName").val();
    var subTitle = $("#productSubTitle").val();
    var typeId = $("#typeName").val();
    var imageSrc = $("#imageSrc").val();
    var inventNum =  $("#inventNum").val();
    var saleNum = $("#monthSaleNum").val();
    var orderLink = $("#orderLink").val();
    var salePrice = $("#salePrice").val();
    var realPrice = $("#realName").val();
    var isRecommend = $("#isRecommend").val();
    $.ajax({
        type:"GET",
        url:"/ishop-product/addProduct",
        data:{
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
        dataType:"json",
        success:function (data) {
            //这里获取到数据展示到前台
            alert(data);
        }
    });
    location.href="listProduct.jsp";
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
                el:'productTable',
                data:{
                    mydata:data
                }
            });
        }
    })
}
//通过id查看商品
function getProduct() {
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