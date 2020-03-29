<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/3/18
  Time: 17:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/js/jquery-3.3.1.js" ></script>
    <link href="/css/bootstrap.css" rel="stylesheet" type="text/css">
    <script src="/js/bootstrap.js"></script>
    <script src="/js/bootstrap-table.js"></script>
    <link href="/css/bootstrap-table.css" rel="stylesheet" type="text/css">
    <script type="text/javascript">
        $(function () {
            initUser();
        })
        //table
        function initUser() {
            $('#user_table').bootstrapTable({
                url:'${pageContext.request.contextPath}/userList',
                type:"GET",
                uniqueId:"userid",
                singleSelect: true, //单选
                search: true, //搜索
                pagination: true,   //是否显示分页条
                pageSize: 5,   //一页显示的行数
                paginationLoop: false,   //是否开启分页条无限循环，最后一页时点击下一页是否转到第一页
                pageList: [5, 10, 20], //选择每页显示多少行，数据过少时可能会没有效果
                columns:[
                    {
                        checkbox:true,
                        width: 50
                    },{
                        title: '序号',
                        formatter: function (value, row, index) {
                            return index+1;
                        },
                        align: 'center',
                        valign: 'middle',
                        width: 60
                    },{
                        field:'username',
                        title:'用户名',
                        align: 'center',
                        valign: 'middle',
                        width:100
                    },{
                        field:'sex',
                        title:'性别',
                        align: 'center',
                        valign: 'middle',
                        width:60
                    },{
                        field:'userid',
                        title:'用户编号',
                        align: 'center',
                        valign: 'middle',
                        width:100
                    },{
                        field:'tel',
                        title:'联系方式',
                        align: 'center',
                        valign: 'middle',
                        width:100
                    },{
                        field:'email',
                        title:'电子邮箱',
                        align: 'center',
                        valign: 'middle',
                        width:100
                    },{
                        field:'password',
                        title:'密码',
                        align: 'center',
                        valign: 'middle',
                        width:100
                    },
                ]
            })
        }
    //    添加
        function addUser() {
            var options = $("#selsex option:selected").text();
            $.ajax({
                url: "${pageContext.request.contextPath }/userAdd",
                type:"post",
                data: JSON.stringify(
                    {
                        username: $("#userName").val(),
                        sex: options,
                        userid: "",
                        tel: $("#tel").val(),
                        email: $("#email").val(),
                        password: $("#password").val()
                    }
                ),
                contentType: "application/json;charset=UTF-8",
                dataType: "json",
                success: function (data) {
                    if (data!=null){
                        alert("添加成功");
                        window.location.reload();
                    }else {
                        alert("添加失败");
                    }
                    <%--$.ajax({--%>
                        <%--url:"${pageContext.request.contextPath }/userLogin",--%>
                        <%--type:"post",--%>
                        <%--data: JSON.stringify(--%>
                            <%--{--%>
                                <%--loginid: "",--%>
                                <%--userid: user.userid,--%>
                                <%--password: $("#password").val()--%>
                                <%--// username: user.username--%>
                            <%--}--%>
                        <%--),--%>
                        <%--contentType: "application/json;charset=UTF-8",--%>
                        <%--dataType: "json",--%>
                        <%--success: function (){--%>
                            <%--alert("添加成功");--%>
                            <%--window.location.reload();--%>
                        <%--},--%>
                        <%--error:function () {--%>
                            <%--alert("添加失败");--%>
                        <%--}--%>
                    <%--})--%>
                },
                error:function () {
                    alert("error");
                }
            });
        }
    //    到修改
        function touserEdit() {
            var users = $('#user_table').bootstrapTable('getAllSelections');
            if (users.length !== 0){
                $('#modEdit').modal('show');
            }else {
                alert("请选择要修改的选项！！！");
            }
        }
    //    点击行数据回填
        $(function () {
            $('#user_table').on('click-row.bs.table', function (e, row, element)
            {
                $('#userNameEdit').val(row.username);
                $('#selsexEdit').val(row.sex);
                $('#userId').val(row.userid);
                $('#emailEdit').val(row.email);
                $('#telEdit').val(row.tel);
                $('#passwordEdit').val(row.password);
            });
        })
    //    修改
        function editUser() {
            var options = $("#selsexEdit option:selected").text();
            $.ajax({
                url: "${pageContext.request.contextPath }/userEdit",
                type:"PUT",
                data: JSON.stringify(
                    {
                        username: $("#userNameEdit").val(),
                        sex: options,
                        userid: $("#userId").val(),
                        tel: $("#telEdit").val(),
                        email: $("#emailEdit").val(),
                        password: $("#passwordEdit").val()
                    }
                ),
                contentType: "application/json;charset=UTF-8",
                dataType: "json",
                success: function (data) {
                    if (data!=null){
                        alert("修改成功");
                        window.location.reload();
                    }else {
                        alert("修改失败")
                    }
                }
            });
        }
    //    删除
        function delUser() {
            var user=$("#user_table").bootstrapTable('getAllSelections');
            $.ajax({
                url:"${pageContext.request.contextPath }/userDel",
                type:"DELETE",
                data: JSON.stringify({
                    username:user[0].username,
                    sex:user[0].sex,
                    userid:user[0].userid,
                    tel:user[0].tel,
                    email:user[0].email,
                    password:user[0].password

                }),
                contentType: "application/json;charset=UTF-8",
                dataType:"JSON",
                success: function (data) {
                    if (data==200){
                        alert("删除成功");
                        window.location.reload();
                        <%--$.ajax({--%>
                            <%--url:"${pageContext.request.contextPath }/loginDel",--%>
                            <%--type:"DELETE",--%>
                            <%--data: JSON.stringify({--%>
                                <%--userId:user[0].userId,--%>
                                <%--password:user[0].password,--%>

                            <%--}),--%>
                            <%--contentType: "application/json;charset=UTF-8",--%>
                            <%--dataType:"JSON",--%>
                            <%--success:function (data) {--%>
                                <%--if (data=="200") {--%>
                                    <%--alert("删除成功");--%>
                                    <%--window.parent.document.getElementById("main").--%>
                                        <%--src="${pageContext.request.contextPath}/toUserList";--%>
                                <%--}--%>
                            <%--}--%>
                        <%--})--%>
                    }else {
                        alert("删除异常");
                    }
                }
            });
        }
    </script>
</head>
<body>
    <div style="margin: 25px">
        <%--////////////////////////////////////人员管理////////////////////////////////////////--%>
        <form name="frmuser" method="post" action="#" id="user_list">
            <h1>人员管理</h1>
            <%--btn--%>
            <div>
                <div style="margin-top: 30px">
                    <input type="button" name="btnAdd" class="btn" data-toggle="modal" data-target="#modAdd"
                           style="padding: 0px;width: 80px;height: 30px; margin-right: 15px;background-color: #17a2b8"
                           value="添加">
                    <input type="button" name="btnEdit" class="btn" onclick="touserEdit()"
                           style="padding: 0px;width: 80px;height: 30px; margin-right: 15px;background-color: #17a2b8"
                           value="修改">
                    <input type="button" name="btnDel" class="btn"
                           style="padding: 0px;width: 80px;height: 30px;margin-right: 15px;background-color: #17a2b8"
                           onclick="delUser()"
                           value="删除">
                </div>

            </div>
            <%--table--%>
            <div style="height: 350px">
                <table align="center" style="height: 80px" id="user_table" data-click-to-select="true"></table>
            </div>

            <%--添加模态框--%>
            <div class="modal fade" id="modAdd" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4 class="modal-title" id="modLabelAdd_app">
                                添加
                            </h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                &times;
                            </button>
                        </div>
                        <div class="modal-body">
                            <form>
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">用户名</span>
                                    </div>
                                    <input type="text" class="form-control" name="txtUsername" id="userName">
                                </div>
                            </form>
                            <form>
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">性别</span>
                                    </div>
                                    <select class="form-control" id="selsex">
                                        <option value ="男">男</option>
                                        <option value ="女">女</option>
                                    </select>
                                </div>
                            </form>
                            <form>
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">联系方式</span>
                                    </div>
                                    <input type="text" class="form-control" name="txtUsername" id="tel">
                                </div>
                            </form>
                            <form>
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">邮箱</span>
                                    </div>
                                    <input type="text" class="form-control" name="txtUsername" id="email">
                                </div>
                            </form>
                            <form>
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">密码</span>
                                    </div>
                                    <input type="text" class="form-control" name="txtUsername" id="password">
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">取消
                            </button>
                            <input type="button" class="btn btn-primary" onclick="addUser()" value="添加">
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal -->
            </div>
            </div>
            <%--修改模态框--%>
            <div class="modal fade" id="modEdit" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4 class="modal-title" id="modLabelEdit">
                                添加
                            </h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                                &times;
                            </button>
                        </div>
                        <div class="modal-body">
                            <form>
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">用户编码</span>
                                    </div>
                                    <input type="text" class="form-control"name="txtuserid" id="userId" disabled="disabled">
                                </div>
                            </form>
                            <form>
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">用户名</span>
                                    </div>
                                    <input type="text" class="form-control" name="txtUsername" id="userNameEdit">
                                </div>
                            </form>
                            <form>
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">性别</span>
                                    </div>
                                    <select class="form-control" id="selsexEdit">
                                        <option value ="男">男</option>
                                        <option value ="女">女</option>
                                    </select>
                                </div>
                            </form>
                            <form>
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">联系方式</span>
                                    </div>
                                    <input type="text" class="form-control" name="txtUsername" id="telEdit">
                                </div>
                            </form>
                            <form>
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">邮箱</span>
                                    </div>
                                    <input type="text" class="form-control" name="txtUsername" id="emailEdit">
                                </div>
                            </form>
                            <form>
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">密码</span>
                                    </div>
                                    <input type="text" class="form-control" name="txtUsername" id="passwordEdit">
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">取消
                            </button>
                            <input type="button" class="btn btn-primary" onclick="editUser()" value="确认">
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal -->
            </div>
            </div>
            </div>
        </form>
    </div>
</body>
</html>
