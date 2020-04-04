<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/2/26
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>客户分类查询</title>
    <script src="/js/jquery-3.3.1.js" ></script>
    <link href="/css/bootstrap.css" rel="stylesheet" type="text/css">
    <script src="/js/bootstrap.js"></script>
    <script src="/js/bootstrap-table.js"></script>
    <link href="/css/bootstrap-table.css" rel="stylesheet" type="text/css">

    <script type="text/javascript">
        $(function () {
            initClientSort();
        })
        //评价结果查询
        function initClientSort() {
            $('#clientSort_table').bootstrapTable({
                url:'${pageContext.request.contextPath}/clientTypeList?humangrade=${humangrade}&route=${route}',
                type:"GET",
                uniqueId:"clientcode",
                pagination: true,   //是否显示分页条
                pageSize: 8,   //一页显示的行数
                paginationLoop: false,   //是否开启分页条无限循环，最后一页时点击下一页是否转到第一页
                pageList: [5, 10, 20], //选择每页显示多少行，数据过少时可能会没有效果
                columns:[
                    {
                        field: 'humangrade',
                        title: '客户分类',
                        valign: 'middle',
                        width: 160
                    },{
                        field: 'clientname',
                        title: '客户简称',
                        valign: 'middle',
                        width: 160
                    },{
                        field: 'clientcode',
                        title: '客户简码',
                        valign: 'middle',
                        width: 160
                    },{
                        field: 'route',
                        title: '路线名称',
                        valign: 'middle',
                        width: 160
                    }
                ]
            })
        }
    //    查询
        function query() {
            $("#clientSort_table").bootstrapTable('refresh', {url: '${pageContext.request.contextPath}/clientTypeList?humangrade=' + $("#humangrade").val() + '&route=' + $("#route").val() + ''})
        }
    </script>
</head>
<body style="background-color: #F7F7F7">
<div style="margin: 25px">
    <form name="frmStandardMaintenance" method="post" action="#" id="standard_list">
        <h1 style="font-size: 25px;font-weight: bold">客户分类查询</h1>
        <div style="height: 50px">
            <div style="margin: 10px">
                <div align="right" style="margin: 10px">
                    <div style="width: 250px;display:inline-block;margin-right: 15px">
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">客户分类</span>
                                </div>
                                <input type="text" class="form-control" name="humangrade" id="humangrade">
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
        <div style="height: 478px">
            <table align="center" style="height: 100px" id="clientSort_table" data-click-to-select="true"></table>
        </div>

    </form>
</div>
</body>
</html>
