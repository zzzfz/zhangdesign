<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/2/17
  Time: 13:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>评分标准维护</title>
    <script src="/js/jquery-3.3.1.js" ></script>
    <link href="/css/bootstrap.css" rel="stylesheet" type="text/css">
    <script src="/js/bootstrap.js"></script>
    <script src="/js/bootstrap-table.js"></script>
    <link href="/css/bootstrap-table.css" rel="stylesheet" type="text/css">

    <script type="text/javascript">
        $(function () {
            initStandard();
        })
        //评分标准维护
        function initStandard() {
            $('#standard_table').bootstrapTable({
                url:'${pageContext.request.contextPath}/valueList',
                type:"GET",
                uniqueId:"valuecode",
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
                        field: 'targetname',
                        title: '评价指标名称',
                        valign: 'middle',
                        sortable: true,
                        width: 200
                    },{
                        field: 'scorevalue',
                        title: '分值',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    },{
                        field: 'valuename',
                        title: '分值标准名称',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    },{
                        field: 'upperLimit',
                        title: '上限',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    },{
                        field: 'lowLimit',
                        title: '下限',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    },{
                        field: 'valuecode',
                        sortable: true,
                        title: '分值标准编码',
                        valign: 'middle',
                        width: 160
                    }
                ]
            })
        }
        //到添加
        function tovalueAdd() {
            $('#modAdd').modal('show');
            $.ajax({
                url: '/targetList',
                type: 'GET',
                data: 0,
                contentType:"application/json;charset=UTF-8",
                dataType:"json",
                success: function (targetStands) {
                    for (var i = 0; i<targetStands.length ; i++){
                        $("#selTargetName").append("<option value = '"+ targetStands[i].id +"'>"+
                            targetStands[i].targetname +"</option>");
                    }
                }
            });
        }
        //添加
        function valuestandAdd() {
            var options = $("#selTargetName option:selected").text();
            $.ajax({
                url: "${pageContext.request.contextPath }/valueAdd",
                type:"post",
                data: JSON.stringify(
                    {
                        valuecode: "",
                        targetname: options,
                        scorevalue: $("#grade").val(),
                        valuename: $("#gradeStandard").val(),
                        upperLimit: $("#upperlimit").val(),
                        lowLimit: $("#bottomlimit").val()

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
        //点击行获取数据回填
        $(function () {
            $('#standard_table').on('click-row.bs.table', function (e, row)
            {
                $('#valueCode').val(row.valuecode);
                //targetName不回填
                //！！！！！
                $('#selTargetNameEdit').val(row.targetname);
                $('#gradeEdit').val(row.scorevalue);
                $('#gradeStandardEdit').val(row.valuename);
                $('#bottomlimitEdit').val(row.lowLimit);
                $('#upperlimitEdit').val(row.upperLimit);
            });
        })
        //到修改
        function tovalueEdit(){
            var values = $('#standard_table').bootstrapTable('getAllSelections');
            if (values.length !== 0){
                $('#modEdit').modal('show');
                $.ajax({
                    url: '/targetList',
                    type: 'GET',
                    data: 0,
                    contentType:"application/json;charset=UTF-8",
                    dataType:"json",
                    success: function (targetStands) {
                        for (var i = 0; i<targetStands.length ; i++){
                            $("#selTargetNameEdit").append("<option value = '"+ targetStands[i].id +"'>"+
                                targetStands[i].targetname +"</option>");
                        }
                    }
                });
            }else {
                alert("请选择要修改的选项！！！");
            }
        }
        //修改
        function valuestandEdit() {
            // var values = $('#standard_table').bootstrapTable('getAllSelections');
            var options = $("#selTargetNameEdit option:selected").text();
            $.ajax({
                url: "${pageContext.request.contextPath}/valueEdit",
                type:"PUT",
                data: JSON.stringify(
                    {
                        targetname: options,
                        scorevalue: $("#gradeEdit").val(),
                        valuename: $("#gradeStandardEdit").val(),
                        upperLimit: $("#upperlimitEdit").val(),
                        lowLimit: $("#bottomlimitEdit").val(),
                        valuecode:$("#valueCode").val()
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
        //删除
        function valuestandDel() {
            var values = $('#standard_table').bootstrapTable('getAllSelections');
            if (values.length !== 0){
                $.ajax({
                    url:"${pageContext.request.contextPath }/valueDel",
                    type:"DELETE",
                    data: JSON.stringify({
                        targetname:values[0].targetname,
                        scorevalue:values[0].scorevalue,
                        valuename:values[0].valuename,
                        upperLimit:values[0].upperLimit,
                        lowLimit:values[0].lowLimit,
                        valuecode:values[0].valuecode
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
                alert("请选择要修改的选项！！！");
            }
        }
    </script>
</head>
<body style="background-color: #F7F7F7">
<div style="margin: 25px">
    <!--评分标准维护列表-->
    <form name="frmStandardMaintenance" method="post" action="#" id="standard_list">
        <h1 style="font-size: 25px;font-weight: bold">评分标准维护</h1>
        <%--btn--%>
        <div>
            <div style="margin-top: 30px">
                <button type="button" name="btnAdd" class="btn"
                        style="padding: 0px;width: 150px;height: 30px; margin-right: 15px;background-color: #17a2b8" onclick="tovalueAdd()">
                    <img src="/img/add.png" style="width: 15px">
                    评分标准添加
                </button>

                <button type="button" name="btnEdit" class="btn" onclick="tovalueEdit()"
                        style="padding: 0px;width: 150px;height: 30px; margin-right: 15px;background-color: #17a2b8">
                    <img src="/img/edit.png" style="width: 15px">
                    评分信息更改
                </button>
                <button type="button" name="btnDel" class="btn"
                        style="padding: 0px;width: 150px;height: 30px;margin-right: 50px;background-color: #17a2b8" onclick="valuestandDel()"
                        value="删除">
                    <img src="/img/del.png" style="width: 15px">
                    评分标准注销
                </button>

            </div>
        </div>
        <%--table--%>
        <div style="height: 328px">
            <table align="center" style="height: 100px" id="standard_table" data-click-to-select="true"></table>
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
                                    <span class="input-group-text">评价指标名称</span>
                                </div>
                                <select class="form-control" id="selTargetName">
                                <option value ="请选择">请选择</option>
                                </select>
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">分值</span>
                                </div>
                                <input type="text" class="form-control" name="txtGrade"  id="grade">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">分值标准名称</span>
                                </div>
                                <input type="text" class="form-control" name="gradeStandard" id="gradeStandard">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">下限</span>
                                </div>
                                <input type="text" class="form-control" name="txtdown" id="bottomlimit">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">上限</span>
                                </div>
                                <input type="text" class="form-control" name="txtup" id="upperlimit">
                            </div>
                        </form>

                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消
                        </button>
                        <input type="button" class="btn btn-primary" onclick="valuestandAdd()" value="添加">
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
                                    <span class="input-group-text">分值标准编码</span>
                                </div>
                                <input type="text" class="form-control" name="txtValueCode" id="valueCode" disabled="disabled" >
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">评价指标名称</span>
                                </div>
                                <select class="form-control" id="selTargetNameEdit">
                                    <option value ="请选择">请选择</option>
                                </select>
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">分值</span>
                                </div>
                                <input type="text" class="form-control" name="txtGrade"  id="gradeEdit">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">分值标准名称</span>
                                </div>
                                <input type="text" class="form-control" name="gradeStandard" id="gradeStandardEdit">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">下限</span>
                                </div>
                                <input type="text" class="form-control" name="txtdown" id="bottomlimitEdit">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">上限</span>
                                </div>
                                <input type="text" class="form-control" name="txtup" id="upperlimitEdit">
                            </div>
                        </form>

                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消
                        </button>
                        <input type="button" class="btn btn-primary" onclick="valuestandEdit()" value="确认">
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal -->
        </div>
        </div>
    </form>
</div>
</body>
</html>
