/**
 * Created by myq on 2017/4/23.
 */
//增加用户
function addUser() {
    //输入非空验证
    alert("进入addUser函数");
    var userEle = ["#inputUsername", "#inputPassword", "#inputPhone", "#inputEmail", "#inputRealname"];
    for (var i = 0; i < userEle.length; i++) {
        if ($(userEle[i]).val() === "") {
            $(userEle[i]).focus();
            return;
        }
    }
    var name = $("#inputUsername").val();
    var password = $("#inputPassword").val();
    var realName = $("#inputRealname").val();
    var email =  $("#inputEmail").val();
    var phone = $("#inputPhone").val();

    $.ajax({
        type:"GET",
        url:"/ishop-admin/getUserByName",
        data:{
            name:name,
        },
        dataType:"json",
        success:function (data) {
            //这里获取到数据展示到前台
            console.log(3);
            if (jQuery.isEmptyObject(data)) {
                //说明管理员名不存在可以添加,
                console.log(4);
                $.ajax({
                    type: "POST",
                    url: "/ishop-admin/addUser",
                    data: {
                        name:name,
                        password:password,
                        realName:realName,
                        email:email,
                        phone:phone
                    },
                    dataType: "json",
                    success: function (data) {
                        //这里获取到数据展示到前台
                        swal(
                            '添加成功!',
                            '成功添加了一条管理员信息!',
                            'success'
                        );
                        //2秒后自动跳转
                       function autoReturn() {
                            location = "listUser.jsp";
                        }
                        setTimeout(autoReturn, 2000);
                    }
                });

            } else {
                //说明管理员名存在,不能添加.
                swal(
                    '',
                    '该管理员名已存在,请重新输入!',
                    'warning'
                ).then(function () {
                    $("#inputUsername").focus();
                });
            }
        }
    });
}
//修改用户
function  updateUser(that) {
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
//删除用户
function delUser(that) {
    swal({
        title: '删除管理员?',
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
            var p = that.parentNode.firstChild;
            var id = p.innerHTML;
            $.ajax({
                type: "GET",
                url: "/ishop-admin/delUser",
                data: {id: id},
                dataType: "json",
                success: function (data) {
                    //这里获取到数据展示到前台
                    // alert(data);
                }
            });
            swal(
                '删除成功!',
                '您已经成功删除用户',
                'success'
            ).then(function () {
                location.reload();
            });
        }
    });
}
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
    var nameValue = $("#name").val();
    var nameEle = document.getElementById("showName");
    var passwordEle = document.getElementById("showPassword");
    var phoneEle = document.getElementById("showPhone");
    var emailEle = document.getElementById("showEmail");
    var realNameEle = document.getElementById("showRealName");
    $.ajax({
        type: "GET",
        url: "/ishop-admin/getUserByName",
        data: {name: nameValue},
        dataType: "json",
        success: function (data) {
            //这里获取到数据展示到前台
            if(data.id === undefined){
                $("#queryUserTable").hide();
                //查询到数据展示到前台
                //没找到数据给出提示
                //提示框
                swal(
                    '查找失败!',
                    '抱歉,没有查找到您要查找的信息',
                    'error'
                )

            }else{
                //显示表格
                $("#queryUserTable").show();
                //显示数据
                nameEle.innerHTML = data.name;
                passwordEle.innerHTML = data.password;
                phoneEle.innerHTML = data.phone;
                emailEle.innerHTML = data.email;
                realNameEle.innerHTML = data.realName;
                //更新更新按钮
                $("#updateBtn").attr("href","updateAdmin.jsp?id="+data.id);
            }
        }
    })
}