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
    <link href="/css/bootstrap-table.css" rel="stylesheet" type="text/css">

    <script type="text/javascript">
        $(function () {
            initClassifiedFluctuation();
        })
        //分类波动查询
        function initClassifiedFluctuation() {
            $('#classifiedFluctuation_table').bootstrapTable({
                url:'${pageContext.request.contextPath}/',
                type:"GET",
                uniqueId:"classifiedFluctuationId",
                pagination: true,   //是否显示分页条
                pageSize: 5,   //一页显示的行数
                paginationLoop: false,   //是否开启分页条无限循环，最后一页时点击下一页是否转到第一页
                pageList: [5, 10, 20], //选择每页显示多少行，数据过少时可能会没有效果
                columns:[
                    {
                        field: 'clientName',
                        title: '客户简称',
                        valign: 'middle',
                        width: 160
                    },{
                        field: 'queryMonthlyIntegral',
                        title: '查询月积分',
                        valign: 'middle',
                        width: 160
                    },{
                        field: 'compareMonthlyIntegral',
                        title: '对照月积分',
                        valign: 'middle',
                        width: 160
                    },{
                        field: 'queryMonthlySort',
                        title: '查询月客户分类',
                        valign: 'middle',
                        width: 160
                    },{
                        field: 'compareMonthlySort',
                        title: '对照月客户分类',
                        valign: 'middle',
                        width: 160
                    },{
                        field: 'bursarMonth',
                        title: '会计区间',
                        valign: 'middle',
                        width: 160
                    }
                ]
            })
        }
    </script>
</head>
<body style="background-color: #F7F7F7">
<div style="margin: 25px">
    <form name="frmStandardMaintenance" method="post" action="#" id="standard_list">
        <h1 style="font-size: 25px;font-weight: bold">分类波动查询</h1>
        <div style="height: 50px">
            <div style="margin: 10px">
                <div align="right" style="margin: 10px">
                    选择路线：
                    <label style="margin-left: 25px"><input type="radio" name="rdoRoute" style="margin-right: 20px" value="" id="telephoneTraffic"/>
                        话务路线</label>
                    <label style="margin-left: 25px"><input type="radio" name="rdoRoute" style="margin-right: 20px" value="" id="inspect"/>
                        稽查路线</label>
                    <label style="margin-left: 25px"><input type="radio" name="rdoRoute" style="margin-right: 20px" value="" id="goods"/>
                        送货路线</label>
                    <label style="margin-left: 25px"><input type="radio" name="rdoRoute" style="margin-right: 20px" value="" id="visit"/>
                        拜访路线</label>
                    <label style="margin-left: 25px"><input type="radio" name="rdoRoute" style="margin-right: 20px" value="" id="all"/>
                        全部路线</label>
                </div>
            </div>
        </div>
        <div style="height: 50px">
            <div style="margin: 10px">
                <div align="right" style="margin: 10px">
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
                                    <span class="input-group-text">客户名称</span>
                                </div>
                                <input type="text" class="form-control" name="txtClientName" id="clientName">
                            </div>
                        </form>
                    </div>
                    <div style="width: 250px;display:inline-block;margin-right: 15px">
                        <form>
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">客户简码</span>
                                </div>
                                <input type="text" class="form-control" name="txtClientCode" id="ClientCode">
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
            <table align="center" style="height: 100px" id="classifiedFluctuation_table" data-click-to-select="true"></table>
        </div>

    </form>
</div>
</body>
</html>
