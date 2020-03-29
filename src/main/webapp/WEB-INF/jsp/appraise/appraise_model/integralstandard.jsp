<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/2/23
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>积分标准维护</title>

    <script src="/js/jquery-3.3.1.js" ></script>
    <link href="/css/bootstrap.css" rel="stylesheet" type="text/css">
    <script src="/js/bootstrap.js"></script>
    <script src="/js/bootstrap-table.js"></script>
    <link href="/css/bootstrap-table.css" rel="stylesheet" type="text/css">

    <script type="text/javascript">
        $(function () {
            initIntegralStandard();
        })
        //积分标准维护
        function initIntegralStandard() {
            $('#integralStandard_table').bootstrapTable({
                url:'${pageContext.request.contextPath}/integralList',
                type:"GET",
                uniqueId:"serialnum",
                singleSelect: true,
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
                        field: 'serialnum',
                        title: '积分编码',
                        valign: 'middle',
                        width: 200
                    },
                    {
                        field: 'intName',
                        title: '名称',
                        valign: 'middle',
                        sortable: true,
                        width: 200
                    },{
                        field: 'bottomLimit',
                        title: '下限',
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
                        field: 'integral',
                        title: '分数',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    },{
                        field: 'note',
                        title: '备注',
                        valign: 'middle',
                        width: 160
                    }
                ]
            })
        }
    //    添加
        function integralAdd() {
            var flag = checkAddIntegral();
            if (flag == false){
                return ;
            }
            $.ajax({
                url: "${pageContext.request.contextPath }/integralAdd",
                type:"post",
                data: JSON.stringify(
                    {
                        serialnum: "",
                        intName: $("#intname").val(),
                        bottomLimit: $("#bottomlimit").val(),
                        upperLimit: $("#upperlimit").val(),
                        integral: $("#integral").val(),
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
        function checkAddIntegral(){
            var intName = $("#intname").val();
            if (intName.trim() == ''){
                alert("请输入积分名称！");
                $("#intname").focus();
                return false;
            }
            var integral = $("#integral").val();
            if (integral.trim() == ''){
                alert("请输入积分分值！");
                $("#integral").focus();
                return false;
            }
            var bottomLimit = $("#bottomlimit").val();
            if (bottomLimit.trim() == ''){
                alert("请输入下限分数！");
                $("#bottomLimit").focus();
                return false;
            }
            var upperLimit = $("#upperlimit").val();
            if (upperLimit.trim() == ''){
                alert("请输入上限分数！");
                $("#upperimit").focus();
                return false;
            }

            return true;
        }
    //    点击行获取行数据并回填
        $(function () {
            $('#integralStandard_table').on('click-row.bs.table', function (e, row, element)
            {
                $('#serialnum').val(row.serialnum);
                $('#intnameEdit').val(row.intName);
                $('#bottomlimitEdit').val(row.bottomLimit);
                $('#upperlimitEdit').val(row.upperLimit);
                $('#integralEdit').val(row.integral);
                $('#noteEdit').val(row.note)

            });
        })
    //    到修改
        function tointegralEdit() {
            var integrals = $('#integralStandard_table').bootstrapTable('getAllSelections');
            if (integrals.length !== 0){
                $('#modEdit').modal('show');
            }else {
                alert("请选择要修改的选项！！！");
            }
        }
    //    修改
        function integralEdit() {
            var flag = checkEditIntegral();
            if (flag == false){
                return ;
            }
            var integrals = $('#integralStandard_table').bootstrapTable('getAllSelections');
            if (integrals.length !== 0){
                $.ajax({
                    url: "${pageContext.request.contextPath}/integralEdit",
                    type:"PUT",
                    data: JSON.stringify(
                        {
                            serialnum: $("#serialnum").val(),
                            intName: $("#intnameEdit").val(),
                            bottomLimit: $("#bottomlimitEdit").val(),
                            upperLimit: $("#upperlimitEdit").val(),
                            integral: $("#integralEdit").val(),
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
        function checkEditIntegral(){
            var intName = $("#intnameEdit").val();
            if (intName.trim() == ''){
                alert("请输入积分名称！");
                $("#intnameEdit").focus();
                return false;
            }
            var integral = $("#integralEdit").val();
            if (integral.trim() == ''){
                alert("请输入积分分值！");
                $("#integralEdit").focus();
                return false;
            }
            var bottomLimit = $("#bottomlimitEdit").val();
            if (bottomLimit.trim() == ''){
                alert("请输入下限分数！");
                $("#bottomLimit").focus();
                return false;
            }
            var upperLimit = $("#upperlimitEdit").val();
            if (upperLimit.trim() == ''){
                alert("请输入上限分数！");
                $("#upperimitEdit").focus();
                return false;
            }

            return true;
        }
    //    删除
        function integralDel() {
            var integrals = $('#integralStandard_table').bootstrapTable('getAllSelections');
            if (integrals.length !== 0){
                $.ajax({
                    url:"${pageContext.request.contextPath }/integralDel",
                    type:"DELETE",
                    data: JSON.stringify({
                        serialnum:integrals[0].serialnum,
                        intName:integrals[0].intName,
                        bottomLimit:integrals[0].bottomLimit,
                        upperLimit:integrals[0].upperLimit,
                        integral:integrals[0].integral,
                        note:integrals[0].note
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
    <!--积分标准维护列表-->
    <form name="frmIntegralStandardMaintenance" method="post" action="#" id="IntegralStandard_list">
        <h1 style="font-size: 25px;font-weight: bold">积分标准维护</h1>
        <%--btn--%>
        <div style="margin-top: 20px">
            <button  type="button" name="btnAdd" class="btn"
                     style="padding: 0px;width: 150px;height: 30px; margin-right: 15px;background-color: #17a2b8"
                     data-toggle="modal" data-target="#modAdd">
                <img src="/img/add.png" style="width: 15px">
                积分标准添加
            </button>
            <button type="button" name="btnEdit" class="btn"
                    style="padding: 0px;width: 150px;height: 30px; margin-right: 15px;background-color: #17a2b8"
                    data-toggle="modal" data-target="#modEdit" onclick="tointegralEdit()">
                <img src="/img/edit.png" style="width: 15px">
                积分信息修改
            </button>
            <button type="button" name="btnDel" class="btn"
                    style="padding: 0px;width: 150px;height: 30px;margin-right: 50px;background-color: #17a2b8" onclick="integralDel()">
                <img src="/img/del.png" style="width: 15px">
                积分信息注销
            </button>
        </div>
        <%--table--%>
        <div style="height: 328px">
            <table align="center" style="height: 100px" id="integralStandard_table" data-click-to-select="true"></table>
        </div>

        <%--添加的模态框--%>
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
                                    <span class="input-group-text">名称</span>
                                </div>
                                <input type="text" class="form-control" name="txtStandardName" id="intname" >
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">分数</span>
                                </div>
                                <input type="text" class="form-control" name="txtGrade"  id="integral">
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
                        <input type="button" class="btn btn-primary" onclick="integralAdd()" value="添加">
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
                                    <span class="input-group-text">积分标准编码</span>
                                </div>
                                <input type="text" class="form-control" name="txtIntegralStandard" id="serialnum" disabled="disabled" >
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">名称</span>
                                </div>
                                <input type="text" class="form-control" name="txtStandardName" id="intnameEdit" >
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">分数</span>
                                </div>
                                <input type="text" class="form-control" name="txtGrade"  id="integralEdit">
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
                        <input type="button" class="btn btn-primary" onclick="integralEdit()" value="确认">
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal -->
        </div>
        </div>

    </form>
</div>
</body>
</html>
