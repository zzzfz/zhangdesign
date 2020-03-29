<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/2/25
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>评价信息录入</title>
    <script src="/js/jquery-3.3.1.js"></script>
    <link href="/css/bootstrap.css" rel="stylesheet" type="text/css">
    <script src="/js/bootstrap.js"></script>
    <script src="/js/bootstrap-table.js"></script>
    <link href="/css/bootstrap-table.css" rel="stylesheet" type="text/css">

    <script type="text/javascript">
        $(function () {
            initClientAppraise();
        })

        //评价信息录入表
        function initClientAppraise() {
            $('#clientAppraise_table').bootstrapTable({
                url: '${pageContext.request.contextPath}/inputList?month=${month}&route=${route}',
                type: "GET",
                uniqueId: "clientcode",
                singleSelect: true, //单选
                pagination: true,   //是否显示分页条
                pageSize: 7,   //一页显示的行数
                paginationLoop: false,   //是否开启分页条无限循环，最后一页时点击下一页是否转到第一页
                // pageList: [5, 10, 20], //选择每页显示多少行，数据过少时可能会没有效果
                columns: [
                    {
                        checkbox: true,
                        width: 50
                    },
                    {
                        title: '序号',
                        formatter: function (value, row, index) {
                            return index + 1;
                        },
                        align: 'center',
                        valign: 'middle',
                        width: 60
                    }, {
                        field: 'clientcode',
                        title: '客户简码',
                        valign: 'middle',
                        sortable: true,
                        width: 150
                    }, {
                        field: 'clientname',
                        title: '客户简称',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    }, {
                        field: 'address',
                        title: '经营地址',
                        valign: 'middle',
                        sortable: true,
                        width: 200
                    }, {
                        field: 'storename',
                        title: '店名',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    }, {
                        field: 'route',
                        title: '路线名称',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    }, {
                        field: 'month',
                        title: '会计区间',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    }, {
                        field: 'appraise',
                        title: '评价状态',
                        valign: 'middle',
                        width: 160,
                        formatter: function (value, row, index) {
                            var a = "";
                            if (value == "已评价") {
                                a = '<span style="color: #3ED718">' + value + '</span>';
                            } else if (value == "未评价") {
                                a = '<span style="color:#FF0000">' + value + '</span>';
                            }
                            return a;
                        }
                    }, {
                        field: 'Desc',
                        title: '操作',
                        valign: 'middle',
                        width: 60,
                        events: 'operateEvents',
                        // formatter : operateFormatter()
                        formatter: function (value) {
                            return operateClass(value);
                        }
                    }
                ]
            })
        }

        //点击评价按钮触发事件
        window.operateEvents = {
            'click #btnAppraise': function (e, value, row) {
                $('#clientName').val(row.clientname);
                $('#clientCode').val(row.clientcode);
                $('#month').val(row.month);
                $('#modAppraise').modal('show');
                //获取指标列表
                $.ajax({
                    url: '${pageContext.request.contextPath}/targetList',
                    type: 'GET',
                    data: 0,
                    contentType: "application/json;charset=UTF-8",
                    dataType: "json",
                    async: false,
                    success: function (targetStands) {
                        $("#mod").empty();
                        for (var i = 0; i < targetStands.length; i++) {
                            $("#mod").append('<form>'
                                + '<div  class="input-group mb-3">'
                                + '<div class="input-group-prepend">'
                                + '<span class="input-group-text" id="spa' + i + '">' + targetStands[i].targetname + '</span>'
                                + '<select class="form-control" name="selIntegral" id="sel' + i + '" style="width: 300px">'
                                + '<option value="请选择">请选择</option>'
                                + '</select>'
                                + '</div>'
                                + '</div>'
                                + '</form>');
                        }
                    }
                });
                //获取评分列表
                $.ajax({
                    url: '${pageContext.request.contextPath}/integralList',
                    type: 'GET',
                    data: 0,
                    contentType: "application/json;charset=UTF-8",
                    dataType: "json",
                    success: function (tccIntegralstandards) {

                        for (var i = 0; i < tccIntegralstandards.length; i++) {
                            $("[name='selIntegral']").append("<option value = '" + tccIntegralstandards[i].serialnum + "'>" +
                                tccIntegralstandards[i].intName + "</option>");
                        }
                    }
                });
            }
        }

        // 评价按钮
        function operateClass(value, row, index) {
            return [
                '<button ' +
                'style="width: 100px;background-color: #17a2b8;padding:2px;' +
                'height: 30px;" ' +
                // 'onclick="appraise()" ' +
                'type="button" ' +
                'class="btn btn-primary"' +
                'id="btnAppraise">' +
                '评价</button>&nbsp;', '',
            ]
                .join('');
        }

        //评价确认
        function appraiseSure() {
            //评价结果计算，获取指标
            let d = new Map();
            for (var i = 0; i < $("#mod > form").length; i++) {
                d.set($("#spa" + i).text(), $("#sel" + i).val());
            }
            //map转obj
            let obj = Object.create(null);
            for (let [k, v] of d) {
                obj[k] = v;
            }
            $.ajax({
                url: '${pageContext.request.contextPath}/searchScoreById',
                type: 'POST',
                data: JSON.stringify({
                    "ids": obj,
                    "clientcode": $("#clientCode").val()
                }),
                contentType: "application/json;charset=UTF-8",
                dataType: "json",
                success: function (targetStands) {

                }
            });
            //评价状态改变
            $.ajax({
                url: "${pageContext.request.contextPath}/appraiseSure",
                type: "PUT",
                data: JSON.stringify(
                    {
                        clientcode: $("#clientCode").val(),
                        appraise: "已评价",
                    }
                ),
                contentType: "application/json;charset=UTF-8",
                dataType: "json",
                success: function (data) {
                    if (data != null) {
                        alert("评价成功");
                        window.location.reload();
                    } else {
                        alert("评价失败");
                    }
                }
            });
        }

        //    查询
        function query() {
            $("#clientAppraise_table").bootstrapTable('refresh', {url: '${pageContext.request.contextPath}/inputList?month=' + $("#monthQuery").val() + '&route=' + $("#routeQuery").val() + ''})
        }
    </script>
</head>
<body style="background-color: #F7F7F7">
<div style="margin: 25px">
    <!--评价信息录入-->
    <form name="frmAppraise" method="post" action="#" id="standard_list">
        <h1 style="font-size: 25px;font-weight: bold">评价信息录入</h1>
        <div style="height: 50px">
            <div style="margin: 10px">
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
                                    <span class="input-group-text">路线名称</span>
                                </div>
                                <input type="text" class="form-control" name="route" id="routeQuery">
                            </div>
                        </form>
                    </div>
                    <button type="button" class="btn btn-primary"
                            style="background-color: #17a2b8;width: 100px;height: 38px;padding: 0px;color: black"
                            name="btnQuery" onclick="query()">
                        <img src="/img/query.png" width="15px">
                        查询
                    </button>
                </div>
            </div>
        </div>
        <div style="height: 438px">
            <table align="center" style="height: 80px" id="clientAppraise_table" data-click-to-select="true"></table>
        </div>
        <%--评价模态框--%>
        <div class="modal fade" id="modAppraise" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
             aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h4 class="modal-title" id="modLabelAppraise">
                            评价信息录入
                        </h4>
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                            &times;
                        </button>
                    </div>
                    <div class="modal-body">
                        <div>
                            <form>
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">客户名称</span>
                                    </div>
                                    <input type="text" class="form-control" name="txtClient" id="clientName"
                                           disabled="disabled">
                                </div>
                            </form>
                            <form>
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">客户简码</span>
                                    </div>
                                    <input type="text" class="form-control" name="txtClient" id="clientCode"
                                           disabled="disabled">
                                </div>
                            </form>
                            <form>
                                <div class="input-group mb-3">
                                    <div class="input-group-prepend">
                                        <span class="input-group-text">会计区间</span>
                                    </div>
                                    <input type="text" class="form-control" name="txtClient" id="month"
                                           disabled="disabled">
                                </div>
                            </form>
                        </div>
                        <div id="mod">
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">取消
                            </button>
                            <input type="button" class="btn btn-primary" onclick="appraiseSure()" value="确认">
                        </div>
                    </div><!-- /.modal-content -->
                </div><!-- /.modal -->
            </div>
        </div>
    </form>

</div>
</body>
</html>
