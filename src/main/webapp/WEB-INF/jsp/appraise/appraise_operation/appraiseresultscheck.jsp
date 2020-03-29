<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/2/24
  Time: 12:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>评价结果审核</title>
    <script src="/js/jquery-3.3.1.js" ></script>
    <link href="/css/bootstrap.css" rel="stylesheet" type="text/css">
    <script src="/js/bootstrap.js"></script>
    <script src="/js/bootstrap-table.js"></script>
    <link href="/css/bootstrap-table.css" rel="stylesheet" type="text/css">

    <script type="text/javascript">
        $(function () {
            initEvaluationReview();
        })
        //评价结果审核
        function initEvaluationReview() {
            $('#check_table').bootstrapTable({
                url:'${pageContext.request.contextPath}/checkList?clientcode=${clientCode}&month=${month}',
                type:"GET",
                uniqueId:"clientcode",
                singleSelect: true, //单选
                pagination: true,   //是否显示分页条
                pageSize: 6,   //一页显示的行数
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
                        field: 'clientcode',
                        title: '客户简码',
                        valign: 'middle',
                        width: 200
                    },{
                        field: 'clientname',
                        title: '客户名称',
                        valign: 'middle',
                        width: 160
                    },{
                        field: 'autograde',
                        title: '自动等级',
                        valign: 'middle',
                        width: 160
                    },{
                        field: 'humangrade',
                        title: '调整等级',
                        valign: 'middle',
                        width: 160
                    },{
                        field: 'autonum',
                        title: '自动测评（分）',
                        valign: 'middle',
                        width: 160
                    },{
                        field: 'human',
                        title: '人工测评（分）',
                        valign: 'middle',
                        width: 160
                    },{
                        field: 'month',
                        title: '会计区间',
                        valign: 'middle',
                        width: 160
                    }
                ]
            })
        }
        //点击行获取行数据
        $(function () {
            $('#check_table').on('click-row.bs.table', function (e, row)
            {
                $('#clientCode').val(row.clientcode);
                $('#clientName').val(row.clientname);
                $('#month').val(row.month);
                $('#autoGrade').val(row.autograde);
                $('#autoNum').val(row.autonum);
                $('#humanGrade').val(row.humangrade);
                $('#humanNum').val(row.human);
            });
        })

        //去审核
        function toCheck() {
            var clients = $('#check_table').bootstrapTable('getAllSelections');
            if (clients.length !== 0){
                $('#modCheck').modal('show');
            } else {
                alert("请选择要审核的客户！！！")
            }
        }
    //    审核
        function checkSure() {
            $.ajax({
                url: "${pageContext.request.contextPath}/checkSure",
                type:"PUT",
                data: JSON.stringify(
                    {
                        clientcode: $("#clientCode").val(),
                        humangrade: $("#humanGrade").val(),
                        human: $("#humanNum").val()
                    }
                ),
                contentType: "application/json;charset=UTF-8",
                dataType: "json",
                success: function (data) {
                    if (data!=null){
                        alert("审核成功");
                        window.location.reload();
                    }else {
                        alert("审核失败");
                    }
                }
            });
        }
    //    查询
        function query() {
            $("#check_table").bootstrapTable('refresh', {url:'${pageContext.request.contextPath}/checkList?month='+
                    $("#monthQuery").val() +'&clientCode='+$("#clientCodeQuery").val()+''})

        }
    </script>
</head>
<body style="background-color: #F7F7F7">
<div style="margin: 25px">
    <!--评价结果审核列表-->
    <form name="frmCheck" method="post" action="#" id="standard_list">
        <h1 style="font-size: 25px;font-weight: bold">评价结果审核</h1>
        <%--btn--%>
        <div style="height: 50px;margin-bottom: 40px">
            <div style="margin: 10px">
                <div style="margin-top: 30px">
                    <button type="button" name="btnEdit" class="btn" onclick="toCheck()"
                            style="padding: 0px;width: 150px;height: 30px; margin-right: 15px;background-color: #17a2b8">
                        <img src="/img/check.png" style="width: 15px">
                        评价结果审核
                    </button>
                </div>
                <div align="right" style="margin: 10px">
                    <div style="width: 250px;display:inline-block;margin-right: 15px">
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">会计区间</span>
                                </div>
                                <input type="text" class="form-control" name="month" id="monthQuery">
                            </div>
                        </form>
                    </div>
                    <div style="width: 250px;display:inline-block;margin-right: 15px">
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">客户简码</span>
                                </div>
                                <input type="text" class="form-control" name="clientCode" id="clientCodeQuery">
                            </div>
                        </form>
                    </div>
                    <button type="button" class="btn btn-primary"
                            style="background-color: #17a2b8;width: 100px;height: 38px;padding: 0px;color: black"  name="btnQuery" onclick="query()" >
                        <img src="/img/query.png" width="15px">
                        查询
                    </button>
                </div>
            </div>
        </div>

        <div style="height: 358px">
            <table align="center" style="height: 80px" id="check_table" data-click-to-select="true"></table>
        </div>
        <%--审核模态框--%>
        <div class="modal fade" id="modCheck" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title" id="modLabelAdd">
                            评价结果审核
                        </h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                            &times;
                        </button>
                    </div>
                    <div class="modal-body">
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">客户简码</span>
                                </div>
                                <input type="text" class="form-control" name="txtGrade"  id="clientCode" disabled="disabled">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">客户名称</span>
                                </div>
                                <input type="text" class="form-control" name="txtGrade"  id="clientName" disabled="disabled">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">会计区间</span>
                                </div>
                                <input type="text" class="form-control" name="txtGrade"  id="month" disabled="disabled">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">自动等级</span>
                                </div>
                                <input type="text" class="form-control" name="gradeStandard" id="autoGrade" disabled="disabled">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">自动测评（分）</span>
                                </div>
                                <input type="text" class="form-control" name="txtdown" id="autoNum" disabled="disabled">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">调整等级</span>
                                </div>
                                <input type="text" class="form-control" name="txtup" id="humanGrade">
                            </div>
                        </form>
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">人工测评（分）</span>
                                </div>
                                <input type="text" class="form-control" name="txtup" id="humanNum">
                            </div>
                        </form>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消
                        </button>
                        <input type="button" class="btn btn-primary" onclick="checkSure()" value="确认">
                    </div>
                </div><!-- /.modal-content -->
            </div><!-- /.modal -->
        </div>
        </div>

    </form>
</div>
</body>
</html>
