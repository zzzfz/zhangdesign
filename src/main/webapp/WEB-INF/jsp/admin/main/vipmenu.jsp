<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/4/24
  Time: 21:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.3.1.js"></script>
    <script src="/js/jquery-3.3.1.js" ></script>
    <link href="/css/bootstrap.css" rel="stylesheet" type="text/css">
    <script src="/js/bootstrap.js"></script>
    <script src="/js/bootstrap-table.js"></script>
    <link href="/css/bootstrap-table.css" rel="stylesheet" type="text/css">
    <link href="/css/lrtk.css" rel="stylesheet" type="text/css">
    <script src="/js/html5.js"></script>
</head>
<body>
<div style="background-color: #263238;width: 230px;position: absolute">
    <div class="logo">
        <img src="/img/userIcon.png" style="margin-left: 60px;margin-top: 15px;height: 55px;width: 55px">
    </div>
    <div id="firstpane" class="menu_list" style="position: absolute;">
        <p class="menu_head current"
           style="width: 230px;font-size: 20px;background-color: #263238;color: white;border: 0px" >
            <img src="/img/main.png" style="width: 15px">
            主页
        </p>
        <p class="menu_head current"
           style="width: 230px;font-size: 20px;background-color: #263238;color: white;border: 0px">
            <img src="/img/mode.png" style="width: 15px">
            评价模型</p>
        <div style="display:block;width: 230px" class=menu_body >
            <a href="/proportion" target="useriframe" style="margin-left: 20px">评价项目比重</a>
            <a href="/maintenance" target="useriframe" style="margin-left: 20px">评价指标维护</a>
            <a href="/standard" target="useriframe" style="margin-left: 20px">评分标准维护</a>
            <a href="/indexProportion" target="useriframe" style="margin-left: 20px">指标比重维护</a>
            <a href="/integralStandard" target="useriframe" style="margin-left: 20px">积分标准维护</a>
            <a href="/clientCategory" target="useriframe" style="margin-left: 20px">客户类别维护</a>
        </div>
        <p class="menu_head"
           style="width: 230px;font-size: 20px;background-color: #263238;color: white;border: 0px">
            <img src="/img/operate.png" style="width: 15px">
            评价操作</p>
        <div style="display:none;width: 230px" class=menu_body >
            <a href="/appraiseInput" target="useriframe" style="margin-left: 20px">评价信息录入</a>
            <a href="/appraiseCount" target="useriframe" style="margin-left: 20px">评价结果计算</a>
            <a href="/resultsCheck" target="useriframe" style="margin-left: 20px">评价结果审核</a>
        </div>
        <p class="menu_head"
           style="width: 230px;font-size: 20px;background-color: #263238;color: white;border: 0px">
            <img src="/img/menu_query.png" style="width: 15px">
            评价查询</p>
        <div style="display:none;width: 230px" class=menu_body >
            <a href="/appraisequery" target="useriframe" style="margin-left: 20px">评价结果查询</a>
            <a href="/clientsortquery" target="useriframe" style="margin-left: 20px">客户分类查询</a>
            <a href="/classifiedfluctuation" target="useriframe" style="margin-left: 20px">分类波动查询</a>
        </div>
    </div>

    <script type=text/javascript>
        $(document).ready(function(){
            $("#firstpane .menu_body:eq(0)").show();
            $("#firstpane p.menu_head").click(function(){
                $(this).addClass("current").next("div.menu_body").slideToggle(300).siblings("div.menu_body").slideUp("slow");
                $(this).siblings().removeClass("current");
            });
            $("#secondpane .menu_body:eq(0)").show();
            $("#secondpane p.menu_head").mouseover(function(){
                $(this).addClass("current").next("div.menu_body").slideDown(500).siblings("div.menu_body").slideUp("slow");
                $(this).siblings().removeClass("current");
            });

        });
    </script>
    <%--<div class="lefter">--%>
        <%--<div class="logo">--%>
            <%--管理系统--%>
        <%--</div>--%>
        <%--<div class="menu">--%>
            <%--<c:forEach var="right" items="${rights}" varStatus="vstatus">--%>
                <%--<a  href="${right.modeUrl}" target="useriframe">--%>
                        <%--${right.modeName}--%>
                <%--</a>--%>
            <%--</c:forEach>--%>
        <%--</div>--%>
    <%--</div>--%>
</div>
</body>
</html>
