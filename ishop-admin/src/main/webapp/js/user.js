/**
 * Created by myq on 2017/4/23.
 */
//增加用户
function addUser() {
    var name = $("#name").val();
    var password = $("#password").val();
    var realName = $("#realName").val();
    var email =  $("#email").val();
    var phone = $("#phone").val();
    $.ajax({
        type:"GET",
        url:"/ishop-admin/addUser",
        data:{
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
    location.href="listAdmin.jsp";
}
//删除用户
function  delUser(that) {
    var p = that.parentNode.firstChild;
    var id = p.innerHTML;
    alert(id);
    $.ajax({
        type:"GET",
        url:"/ishop-admin/delUser",
        data:{id:id},
        dataType:"json",
        success:function (data) {
            //这里获取到数据展示到前台
            alert(data);
        }
    });
    location.reload();
}
//修改用户
function  updateUser() {
    var name = $("#name").val();
    var password = $("#password").val();
    var realName = $("#realName").val();
    var email =  $("#email").val();
    var phone = $("#phone").val();
    $.ajax({
        type:"GET",
        url:"/ishop-admin/updateUser",
        data:{
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
}
)}
//查询所有用户
function listUser(){
    mydata=[];
    $.ajax({
            type:"GET",
            url:"/ishop-admin/listUser",
            dataType:"json",
            success:function (data) {
                //这里获取到数据展示到前台
                //mydata=data;
                var vm = new Vue({
                    el:'#userTable',
                    data:{
                        mydata:data
                    }
                });
            }

        }
    );

}
//通过name查看User
function getUserByName() {
    var name = $("#name").val();
    $("#queryAdminTable").show();
    $.ajax({
        type:"GET",
        url:"/ishop-admin/getUserByName",
        data:{name:name},
        dataType:"json",
        success:function (data) {
            //这里获取到数据展示到前台
            var vm = new Vue({
                el:'#queryUserTable',
                data:{
                    admin:data
                }
            });
        }
    })
}