<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/2/25
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>评价结果计算</title>
    <script src="/js/jquery-3.3.1.js" ></script>
    <link href="/css/bootstrap.css" rel="stylesheet" type="text/css">
    <script src="/js/bootstrap.js"></script>
    <script src="/js/bootstrap-table.js"></script>
    <link href="/css/bootstrap-table.css" rel="stylesheet" type="text/css">
    <script type="text/javascript">
        $(function () {
            initAppraiseResult();
        })
        function initAppraiseResult() {
            $('#appraiseResult_table').bootstrapTable({
                url:'${pageContext.request.contextPath}/countList?month=${month}&route=${route}',
                type:"GET",
                uniqueId:"clientcode",
                singleSelect: true, //单选
                pagination: true,   //是否显示分页条
                pageSize: 7,   //一页显示的行数
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
                        sortable: true,
                        width: 150
                    },{
                        field: 'clientname',
                        title: '客户简称',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    },{
                        field: 'address',
                        title: '经营地址',
                        valign: 'middle',
                        sortable: true,
                        width: 200
                    },{
                        field: 'storename',
                        title: '店名',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    },{
                        field: 'route',
                        title: '路线名称',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    },{
                        field: 'month',
                        title: '会计区间',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    },{
                        field: 'autograde',
                        title: '自动测评等级',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    },{
                        field: 'autonumber',
                        title: '自动测评分数',
                        valign: 'middle',
                        sortable: true,
                        width: 160
                    }
                ]
            })
        }
    //    查询
        function query() {
            $("#appraiseResult_table").bootstrapTable('refresh', {url:'${pageContext.request.contextPath}/countList?month='+ $("#month").val() +'&route='+$("#route").val()+''})
        }
    </script>

</head>
<body style="background-color: #F7F7F7">

<div style="margin: 25px">
    <!--评价结果-->
    <form name="frmCount" method="post" action="#" id="standard_list">
        <h1 style="font-size: 25px;font-weight: bold">评价结果列表</h1>
        <div style="height: 50px;margin-bottom: 40px">
            <div style="margin: 10px">
                <%--btn--%>
                <div>
                    <div style="margin-top: 30px">
                        <button type="button" name="btnAdd" class="btn"
                                style="padding: 0px;width: 150px;height: 30px; margin-right: 15px;background-color: #17a2b8" data-toggle="modal" data-target="#modStr">
                            <img src="/img/produce.png" style="width: 15px">
                            评价结果计算
                        </button>
                    </div>
                </div>
                <div align="right" style="margin: 10px">
                    <div style="width: 250px;display:inline-block;margin-right: 15px">
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">会计区间</span>
                                </div>
                                <input type="text" class="form-control" name="month" id="month">
                            </div>
                        </form>
                    </div>
                    <div style="width: 250px;display:inline-block;margin-right: 15px">
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">路线名称</span>
                                </div>
                                <input type="text" class="form-control" name="route" id="route">
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
        <div style="height: 430px">
            <table align="center" style="height: 80px" id="appraiseResult_table" data-click-to-select="true"></table>
        </div>
    </form>
    <%--评价结果计算--%>
    <div class="modal fade" id="modStr" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="modLabelStr">
                        评价结果计算
                    </h4>
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">
                        &times;
                    </button>
                </div>
                <div class="modal-body">
                    <form>
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text">会计区间</span>
                            </div>
                            <input type="text" class="form-control" name="txtMonth" id="monthStr"
                                   placeholder="请输入会计区间，如“200805”" >
                        </div>
                    </form>

                </div>
                <%--<div class="modal-body">--%>
                    <%--<form>--%>
                        <%--<div class="input-group mb-3">--%>
                            <%--<div class="input-group-prepend">--%>
                                <%--<span class="input-group-text">评价方式：</span>--%>
                            <%--</div>--%>
                            <%--<select class="form-control" id="selAppraiseWay">--%>
                                <%--<option value ="请选择">请选择</option>--%>
                                <%--<option value ="人数">人数</option>--%>
                                <%--<option value ="人数百分比">人数百分比</option>--%>
                                <%--<option value ="得分上限下限">得分上限下限</option>--%>
                            <%--</select>--%>
                        <%--</div>--%>
                    <%--</form>--%>
                <%--</div>--%>
                <div class="modal-body">
                    <form>
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <span class="input-group-text">评价公式：</span>
                            </div>
                            <select class="form-control" id="selFormula">
                                <option value ="请选择">请选择</option>
                                <option value ="1">客户价值=（客户诚信度＋客户依存度）x客户月均销量1/2x（条均价）1/2/100</option>
                                <option value ="2">客户价值=客户诚信度x（客户月均销量x条均价）1/2x（1＋客户依存度）</option>
                            </select>
                        </div>
                    </form>

                </div>

                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">取消
                    </button>
                    <input type="button" class="btn btn-primary" onclick="appraiseStr()" value="生成客户评价结果">
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal -->
    </div>
    </div>

</div>
</body>
</html>
