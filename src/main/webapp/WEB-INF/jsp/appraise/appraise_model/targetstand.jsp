<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/2/15
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>评价指标维护</title>

    <script src="/js/jquery-3.3.1.js" ></script>
    <link href="/css/bootstrap.css" rel="stylesheet" type="text/css">
    <script src="/js/bootstrap.js"></script>
    <script src="/js/bootstrap-table.js"></script>
    <script src="/js/bootstrap-table-zh-CN.min.js"></script>
    <link href="/css/bootstrap-table.css" rel="stylesheet" type="text/css">

    <script type="text/javascript">
        $(function () {
            initMaintenance();
        })
        //评价指标维护
        function initMaintenance() {
            $('#maintenance_table').bootstrapTable({
                url:'${pageContext.request.contextPath}/targetList',
                type:"GET",
                uniqueId:"targetcode",
                singleSelect: true,
                search: true, //搜索
                locale: 'zh-CN',
                pagination: true,   //是否显示分页条
                pageSize: 5,   //一页显示的行数
                paginationLoop: false,   //是否开启分页条无限循环，最后一页时点击下一页是否转到第一页
                pageList: [5, 10, 20], //选择每页显示多少行，数据过少时可能会没有效果
                columns:[
                    {
                        checkbox: true,
                        width: 1
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
                        field: 'targetname',
                        title: '指标名称',
                        valign: 'middle',
                        sortable: true,
                        width: 200
                    },{
                        field: 'datetype',
                        title: '期间类型',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    },{
                        field: 'getvaluestyle',
                        title: '取值方式',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    },{
                        field: 'getvaluefield',
                        title: '取值字段',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    },
                    {
                        field: 'countstyle',
                        title: '计算方式标示',
                        valign: 'middle',
                        sortable: true,
                        width: 150
                    },
                    {
                        field: 'putvaluesql',
                        title: '取值语句',
                        valign: 'middle',
                        sortable: true,
                        width: 400
                    },{
                        field: 'note',
                        title: '备注',
                        valign: 'middle',
                        width: 250
                    }
                ]
            })
        }

    //    添加
        function targetAdd() {
            var flag = checkAddTarget();
            if (flag == false){
                return ;
            }
            var optDatetype = $("#selDatetype option:selected").text();
            var optGetvaluestyle = $("#selGetvaluestyle option:selected").text();
            var optCountstyle = $("#selcountstyle option:selected").text();
            $.ajax({
                url: "${pageContext.request.contextPath }/targetAdd",
                type:"post",
                data: JSON.stringify(
                    {
                        targetcode: "",
                        datetype: optDatetype,
                        getvaluestyle: optGetvaluestyle,
                        countstyle: optCountstyle,
                        targetname: $("#targetName").val(),
                        getvaluefield: $("#getvaluefield").val(),
                        putvaluesql: $("#putvaluesql").val(),
                        note: $("#note").val()
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
    //    添加校验
        function checkAddTarget(){
            var targetName = $("#targetName").val();
            if (targetName.trim() == ''){
                alert("请输入指标名称！");
                $("#targetName").focus();
                return false;
            }
        }
    //    点击行获取数据回填
        $(function () {
            $('#maintenance_table').on('click-row.bs.table', function (e, row)
            {
                $('#targetCode').val(row.targetcode);
                $('#targetNameEdit').val(row.targetname);
                $('#selDatetypeEdit').val(row.datetype);
                $('#selGetvaluestyleEdit').val(row.getvaluestyle);
                $('#getvaluefieldEdit').val(row.getvaluefield);
                $('#selcountstyleEdit').val(row.countstyle);
                $('#putvaluesqlEdit').val(row.putvaluesql);
                $('#noteEdit').val(row.note);
            });
        })
    //    到修改
        function totargetEdit() {
            var targets = $('#maintenance_table').bootstrapTable('getAllSelections');
            if (targets.length !== 0){
                $('#modEdit').modal('show');
            }else {
                alert("请选择要修改的选项！！！");
            }
        }
    //    修改
        function targetEdit() {
            var flag = checkEditTarget();
            if (flag == false){
                return ;
            }
            var targets = $("#maintenance_table").bootstrapTable('getAllSelections');
            if (targets.length !== 0){
                var optDatetype = $("#selDatetypeEdit option:selected").text();
                var optGetvaluestyle = $("#selGetvaluestyleEdit option:selected").text();
                var optCountstyle = $("#selcountstyleEdit option:selected").text();
                $.ajax({
                    url: "${pageContext.request.contextPath}/targetEdit",
                    type:"PUT",
                    data: JSON.stringify(
                        {
                            targetcode: $("#targetCode").val(),
                            datetype: optDatetype,
                            getvaluestyle: optGetvaluestyle,
                            countstyle: optCountstyle,
                            targetname: $("#targetNameEdit").val(),
                            getvaluefield: $("#getvaluefieldEdit").val(),
                            putvaluesql: $("#putvaluesqlEdit").val(),
                            note: $("#noteEdit").val()
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
    //    修改校验
        function checkEditTarget(){
            var targetName = $("#targetNameEdit").val();
            if (targetName.trim() == ''){
                alert("请输入指标名称！");
                $("#targetNameEdit").focus();
                return false;
            }
        }
    //    删除
        function targetDel() {
            var targets = $("#maintenance_table").bootstrapTable('getAllSelections');
            if (targets.length !==0 ){
                $.ajax({
                    url:"${pageContext.request.contextPath }/targetDel",
                    type:"DELETE",
                    data: JSON.stringify({
                        targetcode: targets[0].targetcode,
                        datetype: targets[0].dataType,
                        getvaluestyle: targets[0].getvaluestyle,
                        countstyle: targets[0].countstyle,
                        targetname: targets[0].targetname,
                        getvaluefield: targets[0].getvaluefield,
                        putvaluesql: targets[0].putvaluesql,
                        note: targets[0].note

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
                alert("请选择要删除的行！！！")
            }

        }

    </script>
</head>
<body style="background-color: #F7F7F7">
    <div style="margin: 25px">
        <!--评价指标维护列表-->
        <form name="frmIndexMaintenance" method="post" action="#" id="maintenance_list">
        <h1 style="font-size: 25px;font-weight: bold">评价指标维护</h1>
            <%--btn--%>
            <div style="margin-top: 20px">
                <button type="button" name="btnAdd" class="btn"
                        style="padding: 0px;width: 150px;height: 30px;margin-right: 15px;background-color: #17a2b8"
                        data-toggle="modal" data-target="#modAdd">
                    <img src="/img/add.png" style="width: 15px">
                    评价指标添加
                </button>
                <button type="button" name="btnEdit" class="btn"
                        style="padding: 0px;width: 150px;height: 30px; margin-right: 15px;background-color: #17a2b8"
                        onclick="totargetEdit()">
                    <img src="/img/edit.png" style="width: 15px">
                    指标信息更改
                </button>
                <button type="button" name="btnDel" class="btn"
                        style="padding: 0px;width: 150px;height: 30px;margin-right: 50px;background-color: #17a2b8" onclick="targetDel()">
                    <img src="/img/del.png" style="width: 15px">
                    评价指标注销
                </button>
            </div>
        <div style="height: 328px">
            <table align="center" style="height: 100px" id="maintenance_table" data-click-to-select="true"></table>
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
                            <%--<div style="border: 1px solid black;height: 80px;padding-top: 20px;padding-left: 300px">--%>
                            <form>
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">指标名称</span>
                                    </div>
                                    <input type="text" class="form-control" name="txtIndexName" id="targetName" >
                                </div>
                            </form>
                            <form>
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">期间类型</span>
                                    </div>
                                    <select class="form-control" id="selDatetype">
                                        <option>年</option>
                                        <option>月</option>
                                        <option>日</option>
                                    </select>
                                </div>
                            </form>
                            <form>
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">取值方式</span>
                                    </div>
                                    <select class="form-control" id="selGetvaluestyle">
                                        <option>自动计算</option>
                                        <option>录入</option>
                                    </select>
                                </div>
                            </form>
                            <form>
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">取值字段</span>
                                    </div>
                                    <input type="text" class="form-control" name="txtValueField" id="getvaluefield">
                                </div>
                            </form>
                            <form>
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">计算方式标示</span>
                                    </div>
                                    <select class="form-control" id="selcountstyle">
                                        <option>直接取值</option>
                                        <option>上下限计算</option>
                                    </select>
                                </div>
                            </form>
                            <form>
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">取值语句</span>
                                    </div>
                                    <input type="text" class="form-control" name="txtValueStatement" id="putvaluesql">
                                </div>
                            </form>
                            <form>
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">备注</span>
                                    </div>
                                    <input type="text" class="form-control" name="note" id="note">
                                </div>
                            </form>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">取消
                            </button>
                            <input type="button" class="btn btn-primary" onclick="targetAdd()" value="添加">
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
                                <span class="input-group-text">指标编码</span>
                            </div>
                            <input type="text" class="form-control" name="txtTarget" id="targetCode" disabled="disabled" >
                        </div>
                    </form>
                    <form>
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text">指标名称</span>
                            </div>
                            <input type="text" class="form-control" name="txtIndexName" id="targetNameEdit" >
                        </div>
                    </form>
                    <form>
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text">期间类型</span>
                            </div>
                            <select class="form-control" id="selDatetypeEdit">
                                <option>年</option>
                                <option>月</option>
                                <option>日</option>
                            </select>
                        </div>
                    </form>
                    <form>
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text">取值方式</span>
                            </div>
                            <select class="form-control" id="selGetvaluestyleEdit">
                                <option>自动计算</option>
                                <option>录入</option>
                            </select>
                        </div>
                    </form>
                    <form>
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text">取值字段</span>
                            </div>
                            <input type="text" class="form-control" name="txtValueField" id="getvaluefieldEdit">
                        </div>
                    </form>
                    <form>
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text">计算方式标示</span>
                            </div>
                            <select class="form-control" id="selcountstyleEdit">
                                <option>直接取值</option>
                                <option>上下限计算</option>
                            </select>
                        </div>
                    </form>
                    <form>
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text">取值语句</span>
                            </div>
                            <input type="text" class="form-control" name="txtValueStatement" id="putvaluesqlEdit">
                        </div>
                    </form>
                    <form>
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text">备注</span>
                            </div>
                            <input type="text" class="form-control" name="note" id="noteEdit">
                        </div>
                    </form>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消
                    </button>
                    <input type="button" class="btn btn-primary" onclick="targetEdit()" value="确认">
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    </div>
        </div>

    </form>
    </div>

</body>
</html>
