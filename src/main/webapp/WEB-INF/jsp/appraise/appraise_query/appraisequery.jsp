<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/2/26
  Time: 9:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>评价结果查询</title>

    <script src="/js/jquery-3.3.1.js" ></script>
    <link href="/css/bootstrap.css" rel="stylesheet" type="text/css">
    <script src="/js/bootstrap.js"></script>
    <script src="/js/bootstrap-table.js"></script>
    <link href="/css/bootstrap-table.css" rel="stylesheet" type="text/css">

    <script type="text/javascript">
        $(function () {
            initAppraiseResult();
        })
        //评价结果查询
        function initAppraiseResult() {
            $('#appraiseResult_table').bootstrapTable({
                url:'${pageContext.request.contextPath}/appraiseList?clientcode=${clientCode}&month=${month}&clientname=${clientName}',
                type:"GET",
                uniqueId:"clientcode",
                pagination: true,   //是否显示分页条
                pageSize: 8,   //一页显示的行数
                paginationLoop: false,   //是否开启分页条无限循环，最后一页时点击下一页是否转到第一页
                pageList: [5, 10, 20], //选择每页显示多少行，数据过少时可能会没有效果
                columns:[
                    {
                        title: '序号',
                        formatter: function (value, row, index) {
                            return index+1;
                        },
                        align: 'center',
                        valign: 'middle',
                        width: 50
                    },{
                        field: 'clientcode',
                        title: '客户简码',
                        valign: 'middle',
                        width: 160
                    },{
                        field: 'clientname',
                        title: '客户简称',
                        valign: 'middle',
                        width: 160
                    },{
                        field: 'contribution',
                        title: '贡献度',
                        valign: 'middle',
                        width: 160
                    },{
                        field: 'credit',
                        title: '诚信度',
                        valign: 'middle',
                        width: 160
                    },{
                        field: 'important',
                        title: '重要度',
                        valign: 'middle',
                        width: 160
                    },{
                        field: 'cooperate',
                        title: '配合度',
                        valign: 'middle',
                        width: 160
                    },{
                        field: 'depend',
                        title: '依存度',
                        valign: 'middle',
                        width: 160
                    },{
                        field: 'human',
                        title: '最后得分',
                        valign: 'middle',
                        width: 160
                    },{
                        field: 'month',
                        title: '会计区间',
                        valign: 'middle',
                        width: 160
                    },{
                        field: 'humangrade',
                        title: '客户类别',
                        valign: 'middle',
                        width: 160
                    }
                ]
            })
        }
    //    查询
        function query() {
            $("#appraiseResult_table").bootstrapTable('refresh', {url:'${pageContext.request.contextPath}/appraiseList?month='+
                    $("#month").val() +'&clientName='+$("#clientNameQuery").val()+'&clientCode='+$("#clientCodeQuery").val()+''})

            <%--$("#check_table").bootstrapTable('refresh', {url:'${pageContext.request.contextPath}/checkList?month='+--%>
                    <%--$("#monthQuery").val() +'&clientCode='+$("#clientCodeQuery").val()+''})--%>
        }
    </script>
</head>
<body style="background-color: #F7F7F7">
<div style="margin: 25px">
    <form name="frmAppraiseQuery" method="post" action="#" id="standard_list">
        <h1 style="font-size: 25px;font-weight: bold">评价结果查询</h1>
        <div style="height: 50px">
            <div style="margin: 10px" >
                <div align="right" style="margin: 10px">
                    <div style="width: 250px;display:inline-block;margin-right: 15px">
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">查询月</span>
                                </div>
                                <input type="text" class="form-control" name="month" id="month">
                            </div>
                        </form>
                    </div>
                    <div style="width: 250px;display:inline-block;margin-right: 15px">
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">客户简称</span>
                                </div>
                                <input type="text" class="form-control" name="clientName" id="clientNameQuery">
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
                            style="background-color: #17a2b8;width: 100px;height: 38px;padding: 0px"  name="btnQuery" onclick="query()" >
                        <img src="/img/query.png" width="15px">
                        查询
                    </button>
                    <button type="button" class="btn btn-primary"
                            style="background-color: #17a2b8;width: 100px;height: 38px;padding: 0px"  name="btnQuery" onclick="print()" >
                        <img src="/img/print.png" width="15px">
                        打印
                    </button>
                </div>
            </div>
        </div>
        <div style="height: 438px">
            <table align="center" style="height: 100px" id="appraiseResult_table" data-click-to-select="true"></table>
        </div>

    </form>
</div>
</body>
</html>
