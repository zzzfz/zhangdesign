<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/3/18
  Time: 23:30
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
            initApp();
            $('#mode_list').hide();
        })
        //应用列表
        function initApp() {
            $('#app_table').bootstrapTable({
                url:'${pageContext.request.contextPath}/appList',
                type:"GET",
                uniqueId:"appid",
                singleSelect: true, //单选
                search: true, //搜索
                pagination: true,   //是否显示分页条
                pageSize: 5,   //一页显示的行数
                paginationLoop: false,   //是否开启分页条无限循环，最后一页时点击下一页是否转到第一页
                pageList: [5, 10, 20], //选择每页显示多少行，数据过少时可能会没有效果
                columns:[
                    {
                        checkbox: true,
                        width: 50
                    },
                    {
                        title: '序号',
                        formatter: function (value, row, index) {
                            return index+1;
                        },
                        align: 'center',
                        valign: 'middle',
                        width: 60
                    },{
                        field: 'appname',
                        title: '应用名称',
                        valign: 'middle',
                        width: 100
                    },{
                        field: 'appnote',
                        title: '应用简介',
                        valign: 'middle',
                        width: 300
                    },{
                        field: 'appid',
                        title: '应用编号',
                        valign: 'middle',
                        width: 100
                    }
                ]
            });
        }
    //    添加
        function addApp() {
            $.ajax({
                url: "${pageContext.request.contextPath }/appAdd",
                type:"post",
                data: JSON.stringify(
                    {
                        appname: $("#appName").val(),
                        appnote: $("#appNote").val(),
                        appid:"",
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
                }
            });
        }
    //    到修改
        function toappEdit() {
            var apps = $('#app_table').bootstrapTable('getAllSelections');
            if (apps.length !== 0){
                $('#modEdit').modal('show');
            }else {
                alert("请选择要修改的选项！！！");
            }
        }
    //    点击行获取行数据
        $(function () {
            $('#app_table').on('click-row.bs.table', function (e, row, element)
            {
                $('#appNameEdit').val(row.appname);
                $('#appNoteEdit').val(row.appnote);
                $('#appid').val(row.appid);
            });
        })
    //    修改确认
        function editApp() {
            $.ajax({
                url: "${pageContext.request.contextPath }/appEdit",
                type:"PUT",
                data: JSON.stringify(
                    {
                        appname: $("#appNameEdit").val(),
                        appid: $("#appid").val(),
                        appnote: $("#appNoteEdit").val()
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
    //    应用删除
        function delApp() {
            var app=$("#app_table").bootstrapTable('getAllSelections');
            $.ajax({
                url:"${pageContext.request.contextPath }/appDel",
                type:"DELETE",
                data: JSON.stringify({
                    appid:app[0].appid,
                    appname:app[0].appname,
                    appnote:app[0].appnote,
                }),
                contentType: "application/json;charset=UTF-8",
                dataType:"JSON",
                success: function (data) {
                    if (data==200){
                        alert("删除成功");
                        window.location.reload();
                    }else {
                        alert("删除异常");
                    }
                }

            });
        }
    //    去到模块管理
        function mod() {
            var app = $('#app_table').bootstrapTable('getAllSelections');
            if(app.length==1){
                $('#mode_list').show();
                $('#app_list').hide();
                initMode();
            }else {
                alert("请选择需要管理模块的应用!!!!")
            }
        }
        //    点击行获取行数据
        $(function () {
            $('#app_table').on('click-row.bs.table', function (e, row, element)
            {
                $('#theappName').val(row.appname);
                $('#theappNameshow').val(row.appname);

            });
        })
    //      模块列表
        function initMode() {
            var app=$('#app_table').bootstrapTable('getAllSelections');
            $('#mode_table').bootstrapTable({
                url:'${pageContext.request.contextPath}/modeList/'+app[0].appname,
                type:"GET",
                uniqueId:"modeid",
                singleSelect: true, //单选
                search: true, //搜索
                pagination: true,   //是否显示分页条
                pageSize: 5,   //一页显示的行数
                paginationLoop: false,   //是否开启分页条无限循环，最后一页时点击下一页是否转到第一页
                pageList: [5, 10, 20], //选择每页显示多少行，数据过少时可能会没有效果
                columns:[
                    {
                        checkbox: true,
                        width: 50
                    },
                    {
                        title: '序号',
                        formatter: function (value, row, index) {
                            return index+1;
                        },
                        align: 'center',
                        valign: 'middle',
                        width: 60
                    },{
                        field: 'theappname',
                        title: '所属应用',
                        valign: 'middle',
                        width: 100
                    },{
                        field: 'modename',
                        title: '模块名称',
                        valign: 'middle',
                        width: 100
                    },{
                        field: 'modecode',
                        title: '模块代码',
                        valign: 'middle',
                        width: 100
                    },{
                        field: 'modeurl',
                        title: 'URL',
                        valign: 'middle',
                        width: 160
                    },{
                        field: 'modenote',
                        title: '模块简介',
                        valign: 'middle',
                        width: 300
                    },{
                        field: 'modeid',
                        title: '模块编号',
                        valign: 'middle',
                        width: 100
                    }
                ]
            });
        }
    //      模块添加
        function addMode() {
            $.ajax({
                url: "${pageContext.request.contextPath }/modAdd",
                type:"POST",
                data: JSON.stringify(
                    {
                        modename: $("#modeName").val(),
                        modeid: "",
                        modecode: $("#modeCode").val(),
                        modeurl: $("#modeUrl").val(),
                        modenote: $("#modeName").val(),
                        theappname: $("#theappName").val()
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
                }
            });
        }
    //    去到模块修改
        function tomodeEdit() {
            var modes = $('#mode_table').bootstrapTable('getAllSelections');
            if (modes.length !== 0){
                $('#modEditMode').modal('show');
            }else {
                alert("请选择要修改的选项！！！");
            }
        }
    //    点击行获取行数据
        $(function () {
            $('#mode_table').on('click-row.bs.table', function (e, row, element)
            {
                $('#modeNameEdit').val(row.modename);
                $('#modeCodeEdit').val(row.modecode);
                $('#modeId').val(row.modeid);
                $('#modeUrlEdit').val(row.modeurl);
                $('#theappNameEdit').val(row.theappname);
                $('#modeNoteEdit').val(row.modenote);
            });
        })
    //    模块修改
        function editMode() {
            $.ajax({
                url: "${pageContext.request.contextPath }/modEdit",
                type:"PUT",
                data: JSON.stringify(
                    {
                        modename: $("#modeNameEdit").val(),
                        modeid: $("#modeId").val(),
                        modecode: $("#modeCodeEdit").val(),
                        theappname: $("#theappNameEdit").val(),
                        modeurl: $("#modeUrlEdit").val(),
                        modenote: $("#modeNoteEdit").val()
                    }
                ),
                contentType: "application/json;charset=UTF-8",
                dataType: "json",
                success: function (data) {
                    if (data!=null){
                        alert("修改成功");
                        window.location.reload();
                    }
                }
            });
        }
    //    模块删除
        function delMode() {
            var mod=$("#mode_table").bootstrapTable('getAllSelections');
            if(mod.length!=0){
                $.ajax({
                    url:"${pageContext.request.contextPath }/modDel",
                    type:"DELETE",
                    data: JSON.stringify({
                        modeid:mod[0].modeid,
                        modename:mod[0].modename,
                        modecode:mod[0].modecode,
                        modeurl:mod[0].modeurl,
                        theappname:mod[0].theappname
                    }),
                    contentType: "application/json;charset=UTF-8",
                    dataType:"JSON",
                    success: function (data) {
                        if (data==200){
                            alert("删除成功");
                            window.location.reload();
                        }else {
                            alert("删除异常");
                        }
                    }

                });
            }else {
                alert("请选择要删除的模块！！！！！！")
            }
        }
    </script>
</head>
<body style="background-color: #F7F7F7">
<div style="margin: 25px">
    <%--///////////////////////////////////////////////////应用管理////////////////////////////////////////--%>
    <form name="frmapp" method="post" action="#" id="app_list">
        <h1>应用管理</h1>
        <%--btn--%>
        <div>
            <div style="margin-top: 30px">
                <input type="button" name="btnAdd" class="btn" data-toggle="modal" data-target="#modAdd"
                       style="padding: 0px;width: 80px;height: 30px; margin-right: 15px;background-color: #17a2b8"
                       value="添加">
                <input type="button" name="btnEdit" class="btn" onclick="toappEdit()"
                       style="padding: 0px;width: 80px;height: 30px; margin-right: 15px;background-color: #17a2b8"
                       value="修改">
                <input type="button" name="btnDel" class="btn"
                       style="padding: 0px;width: 80px;height: 30px;margin-right: 15px;background-color: #17a2b8" onclick="delApp()"
                       value="删除">
                <input type="button" name="btnMode" class="btn"
                       style="padding: 0px;width: 80px;height: 30px;margin-right: 15px;background-color: #17a2b8" 
                       onclick="mod()"
                       value="模块管理">
            </div>

        </div>
        <%--table--%>
        <div style="height: 350px">
            <table align="center" style="height: 80px" id="app_table" data-click-to-select="true"></table>
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
                                    <span class="input-group-text">应用名称</span>
                                </div>
                                <input type="text" class="form-control" name="txtProject" id="appName">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">应用简介</span>
                                </div>
                                <input type="text" class="form-control" name="txtProportion" id="appNote">
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消
                        </button>
                        <input type="button" class="btn btn-primary" onclick="addApp()" value="添加">
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
                            修改
                        </h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                            &times;
                        </button>
                    </div>
                    <div class="modal-body">
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">应用编码</span>
                                </div>
                                <input type="text" class="form-control"name="txtProportion" id="appid" disabled="disabled">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">应用名称</span>
                                </div>
                                <input type="text" class="form-control" name="txtappName" id="appNameEdit">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">应用简介</span>
                                </div>
                                <input type="text" class="form-control" name="txtappNote" id="appNoteEdit">
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消
                        </button>
                        <input type="button" class="btn btn-primary" onclick="editApp()" value="确认">
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal -->
        </div>
        </div>
    </form>
</div>
<div style="margin: 25px">
    <%--//////////////////////////////模块管理/////////////////////////////////////////////////////////////////--%>
    <form name="frmMode" method="post" action="#" id="mode_list">
        <h1>模块管理</h1>
        <%--btn--%>
        <div>
            <div style="margin-top: 30px">

                <input type="button" name="btnAdd" class="btn" data-toggle="modal" data-target="#modAddMode"
                       style="padding: 0px;width: 80px;height: 30px; margin-right: 15px;background-color: #17a2b8"
                       value="添加">
                <input type="button" name="btnEdit" class="btn" onclick="tomodeEdit()"
                       style="padding: 0px;width: 80px;height: 30px; margin-right: 15px;background-color: #17a2b8"
                       value="修改">
                <input type="button" name="btnDel" class="btn"
                       style="padding: 0px;width: 80px;height: 30px;margin-right: 50px;background-color: #17a2b8" onclick="delMode()"
                       value="删除">
                <form>
                    <div class="input-group mb-3" style="width: 300px;margin-top: 20px;position: absolute">
                        <div class="input-group-prepend">
                            <span class="input-group-text">所属应用</span>
                        </div>
                        <input type="text" class="form-control"name="txtappname" id="theappNameshow" disabled="disabled">
                    </div>
                </form>
            </div>
        </div>
        <%--table--%>
        <div style="height: 350px">
            <table align="center" style="height: 80px" id="mode_table" data-click-to-select="true"></table>
        </div>

        <%--添加模态框--%>
        <div class="modal fade" id="modAddMode" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title" id="modLabelAdd_mode">
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
                                    <span class="input-group-text">所属应用</span>
                                </div>
                                <input type="text" class="form-control"name="txtappname" id="theappName" disabled="disabled">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">模块名称</span>
                                </div>
                                <input type="text" class="form-control" name="txtProject" id="modeName">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">模块代码</span>
                                </div>
                                <input type="text" class="form-control" name="txtProportion" id="modeCode">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">模块URL</span>
                                </div>
                                <input type="text" class="form-control" name="txtProportion" id="modeUrl">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">模块简介</span>
                                </div>
                                <input type="text" class="form-control" name="txtProportion" id="modeNote">
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消
                        </button>
                        <input type="button" class="btn btn-primary" onclick="addMode()" value="添加">
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal -->
        </div>
    </div>

        <%--修改模态框--%>
        <div class="modal fade" id="modEditMode" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <h4 class="modal-title" id="modLabelEdit_mode">
                    修改
                </h4>
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                    &times;
                </button>
            </div>
            <div class="modal-body">
                <form style="display:inline-block;">
                    <div class="input-group mb-3" style="width: 300px;">
                        <div class="input-group-prepend">
                            <span class="input-group-text">所属应用</span>
                        </div>
                        <input type="text" class="form-control"name="txtappname" id="theappNameEdit" disabled="disabled">
                    </div>
                </form>
                <form style="display:inline-block;">
                    <div class="input-group mb-3" style="width: 300px;">
                        <div class="input-group-prepend">
                            <span class="input-group-text">模块编码</span>
                        </div>
                        <input type="text" class="form-control"name="txtappname" id="modeId" disabled="disabled">
                    </div>
                </form>
                <form>
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text">模块名称</span>
                        </div>
                        <input type="text" class="form-control" name="txtProject" id="modeNameEdit">
                    </div>
                </form>
                <form>
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text">模块代码</span>
                        </div>
                        <input type="text" class="form-control" name="txtProportion" id="modeCodeEdit">
                    </div>
                </form>
                <form>
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text">模块URL</span>
                        </div>
                        <input type="text" class="form-control" name="txtProportion" id="modeUrlEdit">
                    </div>
                </form>
                <form>
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text">模块简介</span>
                        </div>
                        <input type="text" class="form-control" name="txtProportion" id="modeNoteEdit">
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消
                </button>
                <input type="button" class="btn btn-primary" onclick="editMode()" value="确认">
            </div>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
        </div>
    </form>
</div>
</body>
</html>
