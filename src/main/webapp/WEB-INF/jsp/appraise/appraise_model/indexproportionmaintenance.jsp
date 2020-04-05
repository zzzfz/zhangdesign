<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/2/17
  Time: 17:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>指标比重维护</title>

    <script src="/js/jquery-3.3.1.js" ></script>
    <link href="/css/bootstrap.css" rel="stylesheet" type="text/css">
    <script src="/js/bootstrap.js"></script>
    <script src="/js/bootstrap-table.js"></script>
    <script src="/js/bootstrap-table-zh-CN.min.js"></script>
    <link href="/css/bootstrap-table.css" rel="stylesheet" type="text/css">

    <script type="text/javascript">
        $(function () {
            initIndexProportion();
        })
        //指标比重维护
        function initIndexProportion() {
            $('#indexProportion_table').bootstrapTable({
                url:'${pageContext.request.contextPath}/targetproList',
                type:"GET",
                uniqueId:"targetprocode",
                singleSelect: true, //单选
                locale: 'zh-CN',
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
                        field: 'projectname',
                        title: '项目名称',
                        valign: 'middle',
                       sortable: true,
                        width: 200
                    },{
                        field: 'targetname',
                        title: '指标名称',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    },{
                        field: 'targetproportion',
                        title: '比重（%）',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    },{
                        field: 'note',
                        title: '备注',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    },{
                        field: 'targetprocode',
                        title: '指标比重编码',
                        sortable: true,
                        valign: 'middle',
                        width: 160
                    }
                ]
            })
        }

    //    获取项目名称到option
        function toindexAdd() {
            $('#modAdd').modal('show');
            //项目名称
            $.ajax({
                url: '/proList',
                type: 'GET',
                data: 0,
                contentType:"application/json;charset=UTF-8",
                dataType:"json",
                success: function (tccProjectProportions) {
                    for (var i = 0; i<tccProjectProportions.length ; i++){
                        $("#selProjectName").append("<option value = '"+ tccProjectProportions[i].id +"'>"+
                            tccProjectProportions[i].projectname +"</option>");
                    }
                }
            });
            //指标名称
            $.ajax({
                url: '/targetList',
                type: 'GET',
                data: 0,
                contentType:"application/json;charset=UTF-8",
                dataType:"json",
                success: function (targetStands) {
                    for (var i = 0; i<targetStands.length ; i++){
                        $("#selIndexName").append("<option value = '"+ targetStands[i].id +"'>"+
                            targetStands[i].targetname +"</option>");
                    }
                }
            });
        }
    //    添加
        function indexAdd() {
            var flag = checkAddIndex();
            if (flag == false){
                return ;
            }
            var optProName = $("#selProjectName option:selected").text();
            var optTarName = $("#selIndexName option:selected").text();
            $.ajax({
                url: "${pageContext.request.contextPath }/targetproAdd",
                type:"post",
                data: JSON.stringify(
                    {
                        targetprocode: "",
                        projectname:optProName,
                        targetname: optTarName,
                        targetproportion: $("#proportion").val(),
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
        function checkAddIndex() {
            var proName = $("#selProjectName").val();
            if (proName.trim() == '请选择'){
                alert("请选择项目名称！");
                $("#selProjectName").focus();
                return false;
            }
            var tarName = $("#selIndexName").val();
            if (tarName.trim() == '请选择'){
                alert("请选择项目比重！");
                $("#selIndexName").focus();
                return false;
            }
            var tarPriportion = $("#proportion").val();
            if (tarPriportion.trim() == ''){
                alert("请输入指标比重！");
                $("#proportion").focus();
                return false;
            }
            return true;
        }
    //    到修改
        function toindexEdit() {
            var indexs = $('#indexProportion_table').bootstrapTable('getAllSelections');
            if (indexs.length !== 0){
                $('#modEdit').modal('show');
                //项目名称
                $.ajax({
                    url: '/proList',
                    type: 'GET',
                    data: 0,
                    contentType:"application/json;charset=UTF-8",
                    dataType:"json",
                    success: function (tccProjectProportions) {
                        $("#selProjectNameEdit").empty();
                        for (var i = 0; i<tccProjectProportions.length ; i++){
                            $("#selProjectNameEdit").append("<option value = '"+ tccProjectProportions[i].id +"'>"+
                                tccProjectProportions[i].projectname +"</option>");
                        }
                    }
                });
                // 指标名称
                $.ajax({
                    url: '/targetList',
                    type: 'GET',
                    data: 0,
                    contentType:"application/json;charset=UTF-8",
                    dataType:"json",
                    success: function (targetStands) {
                        $("#selIndexNameEdit").empty();
                        for (var i = 0; i<targetStands.length ; i++){
                            $("#selIndexNameEdit").append("<option value = '"+ targetStands[i].id +"'>"+
                                targetStands[i].targetname +"</option>");
                        }
                    }
                });
            }else {
                alert("请选择要修改的选项！！！");
            }
        }
    //    点击行获取行数据回填
        $(function () {
            $('#indexProportion_table').on('click-row.bs.table', function (e, row)
            {
               $('#targetproCode').val(row.targetprocode);
               $('#selProjectNameEdit').val(row.projectname);
               $('#selIndexNameEdit').val(row.targetname);
               $('#proportionEdit').val(row.targetproportion);
               $('#noteEdit').val(row.note);
            });
        })
    //    修改
        function indexEdit() {
            var flag = checkEditIndex();
            if (flag == false){
                return ;
            }
            var optProName = $("#selProjectNameEdit option:selected").text();
            var optTarName = $("#selIndexNameEdit option:selected").text();
            $.ajax({
                url: "${pageContext.request.contextPath}/targetproEdit",
                type:"PUT",
                data: JSON.stringify(
                    {
                        targetprocode:$("#targetproCode").val(),
                        projectname:optProName,
                        targetname: optTarName,
                        targetproportion: $("#proportionEdit").val(),
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
        }
        //修改校验
        function checkEditIndex() {
            var proName = $("#selProjectNameEdit").val();
            if (proName.trim() == '请选择'){
                alert("请选择项目名称！");
                $("#selProjectNameEdit").focus();
                return false;
            }
            var tarName = $("#selIndexNameEdit").val();
            if (tarName.trim() == '请选择'){
                alert("请选择项目比重！");
                $("#selIndexName").focus();
                return false;
            }
            var tarPriportion = $("#proportionEdit").val();
            if (tarPriportion.trim() == ''){
                alert("请输入指标比重！");
                $("#proportion").focus();
                return false;
            }
            return true;
        }
    //    删除
        function indexDel() {
            var indexs = $('#indexProportion_table').bootstrapTable('getAllSelections');
            if (indexs.length !== 0) {
                $.ajax({
                    url:"${pageContext.request.contextPath }/targetproDel",
                    type:"DELETE",
                    data: JSON.stringify({
                        projectname:indexs[0].projectname,
                        targetname:indexs[0].targetname,
                        targetproportion:indexs[0].targetproportion,
                        note:indexs[0].note,
                        targetprocode:indexs[0].targetprocode
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
                alert("请选择要删除的选项！！！");
            }
        }
    </script>
</head>
<body style="background-color: #F7F7F7">
<div style="margin: 25px">
    <!--指标比重维护列表-->
    <form name="frmIndexProportionMaintenance" method="post" action="#" id="indexProportion_list">
        <h1 style="font-size: 25px;font-weight: bold">指标比重维护</h1>
        <div>
            <div style="margin-top: 30px">
                <button type="button" name="btnAdd" class="btn"
                        style="padding: 0px;width: 150px;height: 30px; margin-right: 15px;background-color: #17a2b8" onclick="toindexAdd()">
                    <img src="/img/add.png" style="width: 15px">
                    指标比重添加
                </button>

                <button type="button" name="btnEdit" class="btn"
                        style="padding: 0px;width: 150px;height: 30px; margin-right: 15px;background-color: #17a2b8" onclick="toindexEdit()">
                    <img src="/img/edit.png" style="width: 15px">
                    指标比重更改
                </button>
                <button type="button" name="btnDel" class="btn"
                        style="padding: 0px;width: 150px;height: 30px;margin-right: 15px;background-color: #17a2b8"
                        onclick="indexDel()">
                    <img src="/img/del.png" style="width: 15px">
                    指标比重注销
                </button>
            </div>
        </div>
        <div style="height: 350px">
            <table align="center" style="height: 100px" id="indexProportion_table" data-click-to-select="true"></table>
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
                                    <span class="input-group-text">项目名称</span>
                                </div>
                                <select class="form-control" id="selProjectName">
                                    <option value ="请选择">请选择</option>
                                </select>
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">指标名称</span>
                                </div>
                                <select class="form-control" id="selIndexName">
                                    <option value ="请选择">请选择</option>
                                </select>
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
                        <input type="button" class="btn btn-primary" onclick="indexAdd()" value="添加">
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
                                    <span class="input-group-text">指标比重编码</span>
                                </div>
                                <input type="text" class="form-control" name="txttargetproCode" id="targetproCode" disabled="disabled">

                            </div>
                        </form>
                        <%--<div style="border: 1px solid black;height: 80px;padding-top: 20px;padding-left: 300px">--%>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">项目名称</span>
                                </div>
                                <select class="form-control" id="selProjectNameEdit">
                                    <option value ="请选择">请选择</option>
                                </select>
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">指标名称</span>
                                </div>
                                <select class="form-control" id="selIndexNameEdit">
                                    <option value ="请选择">请选择</option>
                                </select>
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
                        <input type="button" class="btn btn-primary" onclick="indexEdit()" value="确认">
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal -->
        </div>
        </div>

    </form>
</div>
</body>
</html>
