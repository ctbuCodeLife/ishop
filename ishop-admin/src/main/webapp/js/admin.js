//增加管理员
function addAdmin() {
    var roleId = $("#roleId").val();
    var name = $("#name").val();
    var password = $("#password").val();
    var realName = $("#realName").val();
    var email =  $("#email").val();
    var phone = $("#phone").val();
    $.ajax({
        type:"GET",
        url:"/ishop-admin/addAdmin",
        data:{
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
    location.href="listAdmin.jsp";
}
//删除管理员
function delAdmin(that) {
    var p = that.parentNode.firstChild;
    var id = p.innerHTML;
    $.ajax({
        type:"GET",
        url:"/ishop-admin/delAdmin",
        data:{id:id},
        dataType:"json",
        success:function (data) {
            //这里获取到数据展示到前台
            alert(data);
        }
    });
    location.reload();
}
//修改管理员
function updateAdmin() {
    var roleId = $("#roleId").val();
    var name = $("#name").val();
    var password = $("#password").val();
    var realName = $("#realName").val();
    var email =  $("#email").val();
    var phone = $("#phone").val();
    $.ajax({
        type:"GET",
        url:"/ishop-admin/updateAdmin",
        data:{
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
    location.href="listAdmin.jsp";
}
//查看所有管理员
function listAdmin() {
    mydata=[];
    $.ajax({
        type:"GET",
        url:"/ishop-admin/listAdmin",
        dataType:"json",
        success:function (data) {
            //这里获取到数据展示到前台
            var vm = new Vue({
                el:'#adminTable',
                data:{
                    mydata:data
                }
            });
        }
    })
}
//通过id查看admin
function getAdmin() {
    var name = $("#name").val();
    $("#queryAdminTable").show();
    $.ajax({
        type:"GET",
        url:"/ishop-admin/getAdminByName",
        data:{name:name},
        dataType:"json",
        success:function (data) {
            //这里获取到数据展示到前台
            var vm = new Vue({
                el:'#queryAdminTable',
                data:{
                    admin:data
                }
            });
        }
    })
}


