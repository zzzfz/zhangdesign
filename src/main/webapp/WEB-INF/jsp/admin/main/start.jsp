<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/6/30
  Time: 9:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/js/jquery-3.3.1.js" ></script>
    <link href="/css/bootstrap.css" rel="stylesheet" type="text/css">
    <script src="/js/bootstrap.js"></script>
    <script src="/js/bootstrap-table.js"></script>
    <script src="/js/echarts.js" type="text/javascript"></script>
    <link href="/css/bootstrap-table.css" rel="stylesheet" type="text/css">
    <script type="text/javascript">
        // 饼图—每个分类中有多少人数
        $(function () {
            option = {
                tooltip: {
                    trigger: 'item',
                    formatter: '{a} <br/>{b}: {c} ({d}%)'
                },
                legend: {
                    orient: 'vertical',
                    left: 10,
                    data: ['一类客户', '二类客户', '三类客户', '四类客户', '五类客户']
                },
                series: [
                    {
                        name: '总数',
                        type: 'pie',
                        radius: ['50%', '70%'],
                        avoidLabelOverlap: false,
                        label: {
                            show: false,
                            position: 'center'
                        },
                        emphasis: {
                            label: {
                                show: true,
                                fontSize: '30',
                                fontWeight: 'bold'
                            }
                        },
                        labelLine: {
                            show: false
                        },
                        data: [
                            {value: 335, name: '一类客户'},
                            {value: 310, name: '二类客户'},
                            {value: 234, name: '三类客户'},
                            {value: 135, name: '四类客户'},
                            {value: 1548, name: '五类客户'}
                        ]
                    }
                ]
            };

            let myChart = echarts.init(document.getElementById("modelType"));
            myChart.setOption(option);
        });

        //折线图—每个月客户的得分平均分
        $(function () {
            option = {
                xAxis: {
                    type: 'category',
                    data: ['202001', '202002', '202003']
                },
                yAxis: {
                    type: 'value'
                },
                series: [{
                    data: [820, 1330, 1320],
                    type: 'line',
                    smooth: true
                }]
            };

            let myChart = echarts.init(document.getElementById("modelNum"));
            myChart.setOption(option);
        });

        //堆叠折线图—每个月各个评价项目的平均分
        $(function () {
            option = {
                legend: {},
                tooltip: {},
                dataset: {
                    source: [
                        ['product', '贡献度', '诚信度', '重要度', '依存度',  '配合度'],
                        ['202001', 43.3, 85.8, 93.7, 93.7, 93.7],
                        ['202002', 83.1, 73.4, 55.1, 93.7, 93.7],
                        ['202003', 86.4, 65.2, 82.5, 93.7, 93.7],
                        // ['Walnut Brownie', 72.4, 53.9, 39.1]
                    ]
                },
                xAxis: {type: 'category'},
                yAxis: {},
                // Declare several bar series, each will be mapped
                // to a column of dataset.source by default.
                series: [
                    {type: 'bar'},
                    {type: 'bar'},
                    {type: 'bar'},
                    {type: 'bar'},
                    {type: 'bar'}
                ]
            };

            let myChart = echarts.init(document.getElementById("modelProjectNum"));
            myChart.setOption(option);
        });
    </script>
</head>
<body style="background-color: #F7F7F7">

<%--客户分类占比--%>
<div style="position:absolute;top: 50px;left: 50px;background-color: white;
    width: 700px; height: 600px;border: darkgrey solid 1px;border-radius: 5px;box-shadow:0 0 10px darkgray">
    <div align="center" style="font-weight: bold;font-size: 20px;margin-top: 10px">
        <span>客户分类占比</span>
    </div>
    <div id="modelType"
         style="width: 700px; height: 600px">
    </div>
</div>

<%--每月客户评价得分波动--%>
<div style="position:absolute;top: 50px;left: 780px;background-color: white;
    width: 650px; height: 290px;border: darkgrey solid 1px;border-radius: 5px;box-shadow:0 0 10px darkgray">
    <div align="center" style="font-weight: bold;font-size: 20px;margin-top: 10px">
        <span>每月客户评价得分波动</span>
    </div>
    <div id="modelNum"
         style="width: 650px; height: 280px">
    </div>
</div>

<%--每月评价项目得分波动--%>
<div style="position:absolute;top: 360px;left: 780px;background-color: white;
    width: 650px; height: 290px;border: darkgrey solid 1px;border-radius: 5px;box-shadow:0 0 10px darkgray">
    <div align="center" style="font-weight: bold;font-size: 20px;margin-top: 10px">
        <span>每月评价项目得分波动</span>
    </div>
    <div id="modelProjectNum"
         style="width: 650px; height: 245px">
    </div>
</div>
</body>
</html>
