/**
 * Created by myq on 2017/4/23.
 */
function selectGrade(grade) {
    if (grade === "1") {
        //类别等级为1时,父类别没有,禁用父类别
        $("#parentId").attr("disabled", "disable");
    } else {
        $("#parentId").attr("disabled", false);
        mydata = [];
        $.ajax({
            type: "GET",
            url: "/ishop-admin/getTypeByGrade",
            data: {grade: grade},
            dataType: "json",
            success: function (data) {
                //这里获取到数据展示到前台
                if (data !== undefined) {
                    //console.log(data.length)
<<<<<<< Updated upstream
                    //清除之前的数据
                    $("#parentId > option").remove();
=======
<<<<<<< HEAD
                    $("#parentId").remove("#parentid optiion");
=======
                    //清除之前的数据
                    $("#parentId > option").remove();
>>>>>>> dev
>>>>>>> Stashed changes
                    var length = data.length;
                    for (var i = 0; i < length; i++) {
                        console.log(data[i].id + " " + data[i].name);
                        $("#parentId").append("<option  value=" + data[i].parentId + ">" + data[i].name + "</option>");
                    }
                }
            }
        });
    }
}
//增加类别
function addType() {
    //输入非空验证
    var adminEle = ["#grade", "#name", "#parentId", "#describe"];
    for (var i = 0; i < adminEle.length; i++) {
        if ($(adminEle[i]).val() === "") {
            $(adminEle[i]).focus();
            return;
        }
    }
    var grade = $("#grade").val();
    var name = $("#name").val();
    var parentId = $("#parentId").val();
    var describe = $("#describe").val();

    //判断类别是否存在
    $.ajax({
        type: "GET",
        url: "/ishop-admin/getTypeByName",
        data: {name: name},
        dataType: "json",
        success: function (data) {
            //这里获取到数据展示到前台
            if (data === false) {
                //说明类型名不存在可以添加,
                $.ajax({
                    type: "POST",
                    url: "/ishop-admin/addType",
                    data: {
                        grade:grade,
                        name:name,
                        parentId:parentId,
                        describe:describe
                    },
                    dataType: "json",
                    success: function (data) {
                        //这里获取到数据展示到前台
                        alert(data);
                    }
                });
                swal(
                    '添加成功!',
                    '成功添加了一条管理员信息!',
                    'success'
                );
                //2秒后自动跳转
                function autoReturn() {
                    location = "listType.jsp";
                }

                setTimeout(autoReturn, 2000);
            } else {
                //说明管理员名存在,不能添加.
                swal(
                    '',
                    '该类别名已存在,请重新输入!',
                    'warning'
                ).then(function () {
                    $("#name").focus();
                });
            }
        }
    });
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

