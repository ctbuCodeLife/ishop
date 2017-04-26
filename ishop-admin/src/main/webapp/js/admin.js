//增加管理员
function addAdmin() {
    var roleId = $("#roleId").val();
    var name = $("#name").val();
    var password = $("#password").val();
    var realName = $("#realName").val();
    var email = $("#email").val();
    var phone = $("#phone").val();
    var adminEle = ["#roleId", "#name", "#password", "#realName", "#email", "#phone"];
    for (var i = 0; i < adminEle.length; i++) {
        if ($(adminEle[i]).val() == "") {
            $(adminEle[i]).focus();
            return;
        }
    }
    $.ajax({
        type: "POST",
        url: "/ishop-admin/addAdmin",
        data: {
            roleId: roleId,
            name: name,
            password: password,
            realName: realName,
            email: email,
            phone: phone
        },
        dataType: "json",
        success: function (data) {
            //这里获取到数据展示到前台

        }
    });
    swal(
        '添加成功!',
        '成功添加了一条管理员信息!',
        'success'
    )
//2秒后自动跳转
    function autoReturn() {
        location = "listAdmin.jsp";
    }

    setTimeout(autoReturn, 2000);
}
//删除管理员
function delAdmin(that) {
    swal({
        title: '删除管理员?',
        text: "删除后就不可恢复!",
        type: 'error',
        showCancelButton: true,
        confirmButtonColor: '#3085d6',
        cancelButtonColor: '#d33',
        confirmButtonText: '确认删除',
        cancelButtonText: "取消",
    }).then(function (isConfirm) {
        if (isConfirm) {
            //执行删除操作
            var p = that.parentNode.firstChild;
            var id = p.innerHTML;
            $.ajax({
                type: "GET",
                url: "/ishop-admin/delAdmin",
                data: {id: id},
                dataType: "json",
                success: function (data) {
                    //这里获取到数据展示到前台
                    // alert(data);
                }
            });
            swal(
                '删除成功!',
                '您已经成功删除管理员',
                'success'
            ).then(function (isConfirm) {
                location.reload();
            });
        }
    });
    function autoReturn() {
        location.reload();
    }

    //setTimeout(autoReturn,2000);
}
//修改管理员
function updateAdmin() {
    var id = $("#id").val();
    var roleId = $("#roleId").val();
    var name = $("#name").val();
    var password = $("#password").val();
    var realName = $("#realName").val();
    var email = $("#email").val();
    var phone = $("#phone").val();
    $.ajax({
        type: "GET",
        url: "/ishop-admin/updateAdmin",
        data: {
            id: id,
            roleId: roleId,
            name: name,
            password: password,
            realName: realName,
            email: email,
            phone: phone
        },
        dataType: "json",
        success: function (data) {
            //这里获取到数据展示到前台
            alert(data);
        }
    });
    location.href = "listAdmin.jsp";
}
//查看所有管理员
function listAdmin() {
    mydata = [];
    $.ajax({
        type: "GET",
        url: "/ishop-admin/listAdmin",
        dataType: "json",
        success: function (data) {
            //这里获取到数据展示到前台
            var vm = new Vue({
                el: '#adminTable',
                data: {
                    mydata: data
                }
            });
            $("#queryTable").addClass("show");
        }
    })
}
//通过name查看admin
function getAdmin() {
    var name = $("#name").val();
    $("#queryAdminTable").show();
    $.ajax({
        type: "GET",
        url: "/ishop-admin/getAdminByName",
        data: {name: name},
        dataType: "json",
        success: function (data) {
            //这里获取到数据展示到前台
            var vm = new Vue({
                el: '#queryAdminTable',
                data: {
                    admin: data
                }
            });
        }
    })
}


