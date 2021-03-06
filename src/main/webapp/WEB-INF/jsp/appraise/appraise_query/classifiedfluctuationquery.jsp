<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/2/26
  Time: 16:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>分类波动查询</title>
    <script src="/js/jquery-3.3.1.js" ></script>
    <link href="/css/bootstrap.css" rel="stylesheet" type="text/css">
    <script src="/js/bootstrap.js"></script>
    <script src="/js/bootstrap-table.js"></script>
    <script src="/js/bootstrap-table-zh-CN.min.js"></script>
    <link href="/css/bootstrap-table.css" rel="stylesheet" type="text/css">

    <script type="text/javascript">
        $(function () {
            // initClassifiedFluctuation();
        })
        //分类波动查询
        function initClassifiedFluctuation() {
            let queryMonth = $("#queryMonth").val() == "" ? null : $("#queryMonth").val();
            let compareMonth = $("#compareMonth").val() == "" ? null : $("#compareMonth").val();
            let clientName = $("#clientName").val() == "" ? null : $("#clientName").val();
            $('#classifiedFluctuation_table').bootstrapTable({
                url:'${pageContext.request.contextPath}/clazz/'+queryMonth+'/'+compareMonth+'/'+clientName,
                type:"GET",
                // uniqueId:"classifiedFluctuationId",
                pagination: true,   //是否显示分页条
                pageSize: 5,   //一页显示的行数
                locale: 'zh-CN',
                paginationLoop: false,   //是否开启分页条无限循环，最后一页时点击下一页是否转到第一页
                pageList: [5, 10, 20], //选择每页显示多少行，数据过少时可能会没有效果
                columns:[
                    {
                        field: 'clientName',
                        title: '客户简称',
                        valign: 'middle',
                        width: 160
                    },{
                        field: 'queryHumanNum',
                        title: '查询月积分',
                        valign: 'middle',
                        formatter: function (value, row, index) {
                            if (value != null){
                                return value;
                            } else {
                                return row.queryAutoNum;
                            }
                        },
                        width: 160
                    },{
                        field: 'compareHumanNum',
                        title: '对照月积分',
                        valign: 'middle',
                        formatter: function (value, row, index) {
                            if (value != null){
                                return value;
                            } else {
                                return row.compareAutoNum;
                            }
                        },
                        width: 160
                    },{
                        field: 'queryHumanType',
                        title: '查询月客户分类',
                        valign: 'middle',
                        formatter: function (value, row, index) {
                            if (value != null){
                                return value;
                            } else {
                                return row.queryAutoType;
                            }
                        },
                        width: 160
                    },{
                        field: 'compareHumanType',
                        title: '对照月客户分类',
                        valign: 'middle',
                        formatter: function (value, row, index) {
                            if (value != null){
                                return value;
                            } else {
                                return row.compareAutoType;
                            }
                        },
                        width: 160
                    }
                ]
            })
        }

        function query() {
            initClassifiedFluctuation();
        }
    </script>
</head>
<body style="background-color: #F7F7F7">
<div style="margin: 25px">
    <form name="frmStandardMaintenance" method="post" action="#" id="standard_list">
        <h1 style="font-size: 25px;font-weight: bold">分类波动查询</h1>
        <div style="height: 50px">
            <div style="margin: 10px">
                <div align="center" style="margin: 20px">
                    <span>
                        说明：输入需要作比较查询月和对照月，则可以查看两个月份客户分数和等级的波动情况。
                    </span>
                </div>
                <div align="center" style="margin: 10px">
                    <div style="width: 250px;display:inline-block;margin-right: 15px">
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">查询月</span>
                                </div>
                                <input type="text" class="form-control" name="txtQueryMonth" id="queryMonth">
                            </div>
                        </form>
                    </div>
                    <div style="width: 250px;display:inline-block;margin-right: 15px">
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">对照月</span>
                                </div>
                                <input type="text" class="form-control" name="txtCompareMonth" id="compareMonth">
                            </div>
                        </form>
                    </div>
                    <div style="width: 250px;display:inline-block;margin-right: 15px">
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">客户简称</span>
                                </div>
                                <input type="text" class="form-control" name="txtClientName" id="clientName">
                            </div>
                        </form>
                    </div>
                    <button type="button" class="btn btn-primary"
                            style="background-color: #17a2b8;width: 100px;height: 38px;padding: 0px"  name="btnQuery" onclick="query()" >
                        <img src="/img/query.png" width="15px">
                        查询
                    </button>
                </div>
            </div>
        </div>
        <div style="height: 428px;margin-top: 50px">
            <table align="center" style="height: 100px" id="classifiedFluctuation_table" data-click-to-select="true"></table>
        </div>

    </form>
</div>
</body>
</html>
