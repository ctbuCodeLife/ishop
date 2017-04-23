/**
 * Created by myq on 2017/4/23.
 */
//增加商品类型
function  addType() {
}
//删除商品类型
function  delType() {
    
}
//更改商品类型
function  updateType() {
    
}
//查询所有商品类型
function  listType(grade) {
    $mydata=[];
    $.ajax({
        type:"GET",
        url:"/ishop-admin/listType",
        data:{
          grade:grade
        },
        dataType:"json",
        success:function (data) {
            //这里获取到数据展示到前台
            var vm = new Vue({
                el:'#typeTable',
                data:{
                    mydata:data
                }
            });
        }
    })
}

