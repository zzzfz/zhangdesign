<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/2/16
  Time: 15:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>评价项目比重</title>
    <script src="/js/jquery-3.3.1.js" ></script>
    <link href="/css/bootstrap.css" rel="stylesheet" type="text/css">
    <script src="/js/bootstrap.js"></script>
    <script src="/js/bootstrap-table.js"></script>
    <script src="/js/bootstrap-table-zh-CN.min.js"></script>
    <link href="/css/bootstrap-table.css" rel="stylesheet" type="text/css">

    <script type="text/javascript">
        $(function () {
            initProportion();
        })
        //评价项目比重
        function initProportion() {
            $('#proportion_table').bootstrapTable({
                url:'${pageContext.request.contextPath}/proList',
                type:"GET",
                uniqueId:"projectproportionid",
                singleSelect: true, //单选
                search: true, //搜索
                pagination: true,   //是否显示分页条
                pageSize: 5,   //一页显示的行数
                locale: 'zh-CN',
                paginationLoop: false,   //是否开启分页条无限循环，最后一页时点击下一页是否转到第一页
                pageList: [5, 10, 20], //选择每页显示多少行，数据过少时可能会没有效果
                columns:[
                    {
                        checkbox: true,
                        width: 50
                    },
                    {
                        field: 'projectname',
                        title: '项目名称',
                        valign: 'middle',
                        sortable: true,
                        width: 200
                    },{
                        field: 'proportion',
                        title: '比重',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    }
                ]
            })
        }
    //    添加
        function addpro() {
            var flag = checkAdd();
            if (flag == false){
                return ;
            }
            $.ajax({
                url: "${pageContext.request.contextPath }/proAdd",
                type:"post",
                data: JSON.stringify(
                    {
                        projectname: $("#projectName").val(),
                        projectproportionid:"",
                        proportion: $("#proportion").val()
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
        //添加的表单校验
        function checkAdd() {
            var proName = $("#projectName").val();
            if (proName.trim() == ''){
                alert("请输入项目名称！");
                $("#projectName").focus();
                return false;
            }
            var proportion = $("#proportion").val();
            if (proportion.trim() == ''){
                alert("请输入项目比重！");
                $("#proportion").focus();
                return false;
            }
            return true;
        }
        //到修改
        function toproEdit(){
            var proportions = $('#proportion_table').bootstrapTable('getAllSelections');
            if (proportions.length !== 0){
                $('#modEdit').modal('show');
            }else {
                alert("请选择要修改的选项！！！");
            }
        }
        //点击行获取行数据回填
        $(function () {
            $('#proportion_table').on('click-row.bs.table', function (e, row, element)
            {
                $('#projectNameEdit').val(row.projectname);
                $('#proportionEdit').val(row.proportion);
                $('#projectproportionid').val(row.projectproportionid);
            });
        })
        //修改确认
        function editpro() {
            var flag = checkEdit();
            if (flag == false){
                return ;
            }
            var proportions = $('#proportion_table').bootstrapTable('getAllSelections');
            if (proportions.length !== 0){
                $.ajax({
                    url: "${pageContext.request.contextPath}/proEdit",
                    type:"PUT",
                    data: JSON.stringify(
                        {
                            projectname: $("#projectNameEdit").val(),
                            proportion: $("#proportionEdit").val(),
                            projectproportionid: $("#projectproportionid").val()
                        }
                    ),
                    contentType: "application/json;charset=UTF-8",
                    dataType: "json",
                    success: function (data) {
                        if (data!=null){
                            alert("修改成功");
                            window.location.reload();
                        }else {
                            alert("修改失败");
                        }
                    }
                });
            } else {
                alert("请选择要修改的选项！！！")
            }

        }
        //修改界面校验
        function checkEdit() {
            var proName = $("#projectNameEdit").val();
            if (proName.trim() == ''){
                alert("项目名称不能为空！");
                $("#projectName").focus();
                return false;
            }
            var proportion = $("#proportionEdit").val();
            if (proportion.trim() == ''){
                alert("项目比重不能为空！");
                $("#proportion").focus();
                return false;
            }
            return true;
        }
        //删除
        function delpro() {
            var proportions=$("#proportion_table").bootstrapTable('getAllSelections');
            if (proportions.length !== 0){
                $.ajax({
                    url:"${pageContext.request.contextPath }/proDel",
                    type:"DELETE",
                    data: JSON.stringify({
                        projectproportionid:proportions[0].projectproportionid,
                        proportion:proportions[0].proportion,
                        projectname:proportions[0].projectname
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
            } else {
                alert("请选择要删除的行！！！")
            }

        }
    </script>
</head>
<body style="background-color: #F7F7F7">
    <div style="margin: 25px">
        <%--评价项目比重表--%>
        <form name="frmProportion" method="post" action="#" id="proportion_list">
            <h1 style="font-size: 25px;font-weight: bold">评价项目比重</h1>
            <%--btn--%>
            <div>
                <div style="margin-top: 30px">
                    <button type="button" name="btnAdd" class="btn" data-toggle="modal" data-target="#modAdd"
                            style="padding: 0px;width: 150px;height: 30px; margin-right: 15px;
                           background-color: #17a2b8;">
                        <img src="/img/add.png" style="width: 15px">
                           评价项目添加
                    </button>
                    <button type="button" name="btnEdit" class="btn" onclick="toproEdit()"
                            style="padding: 0px;width: 150px;height: 30px; margin-right: 15px;background-color: #17a2b8">
                        <img src="/img/edit.png" style="width: 15px">
                        项目信息变更
                    </button>
                    <button type="button" name="btnDel" class="btn"
                            style="padding: 0px;width: 150px;height: 30px;margin-right: 50px;background-color: #17a2b8"
                            onclick="delpro()">
                        <img src="/img/del.png" style="width: 15px">
                        评价项目注销
                    </button>
                </div>
            </div>
            <%--table--%>
            <div style="height: 350px">
                <table align="center" style="height: 80px" id="proportion_table" data-click-to-select="true"></table>
            </div>

            <%--添加模态框--%>
            <div class="modal fade" id="modAdd" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4 class="modal-title" id="modLabelAdd">
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
                                            <span class="input-group-text">项目名称</span>
                                        </div>
                                        <input type="text" class="form-control" name="txtProject" id="projectName">
                                    </div>
                                </form>
                                <form>
                                    <div class="input-group mb-3">
                                        <div class="input-group-prepend">
                                            <span class="input-group-text">比重</span>
                                        </div>
                                        <input type="text" class="form-control" name="txtProportion" id="proportion">
                                    </div>
                                </form>
                            <%--项目编码：--%>
                            <%--<input type="text" style="margin-right: 100px" name="txtProportion" id="projectproportionid" disabled="disabled">--%>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">取消
                            </button>
                            <input type="button" class="btn btn-primary" onclick="addpro()" value="添加">
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
                    <%--<div style="border: 1px solid black;height: 80px;padding-top: 20px;padding-left: 300px">--%>
                    <form>
                         <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text">项目编码</span>
                            </div>
                            <input type="text" class="form-control"name="txtProportion" id="projectproportionid" disabled="disabled">
                        </div>
                    </form>
                    <form>
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text">项目名称</span>
                            </div>
                            <input type="text" class="form-control" name="txtProject" id="projectNameEdit">
                        </div>
                    </form>
                    <form>
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text">比重</span>
                            </div>
                            <input type="text" class="form-control" name="txtProportion" id="proportionEdit">
                        </div>
                    </form>
                    <%--项目编码：--%>
                    <%--<input type="text" style="margin-right: 100px" name="txtProportion" id="projectproportionid" disabled="disabled">--%>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消
                    </button>
                    <input type="button" class="btn btn-primary" onclick="editpro()" value="确认">
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    </div>
            </div>
        </form>
    </div>

</div>
</body>
</html>
