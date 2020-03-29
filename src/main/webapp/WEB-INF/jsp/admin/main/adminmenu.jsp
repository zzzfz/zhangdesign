<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/3/18
  Time: 20:12
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
        <img src="/img/vip.png" style="margin-left: 60px;margin-top: 15px;height: 55px;width: 55px"></br></br>
        <a style="color: white;margin-left: 60px;">后台管理员</a>
    </div>
    <div id="firstpane" class="menu_list" style="position: absolute;">
        <p class="menu_head current"
           style="width: 230px;font-size: 20px;background-color: #263238;color: white;border: 0px">基础设置</p>
        <div style="display:block;width: 230px" class=menu_body >
            <a href="/app" target="useriframe">应用管理</a>
            <a href="/user" target="useriframe">人员管理</a>
        </div>
        <p class="menu_head"
           style="width: 230px;font-size: 20px;background-color: #263238;color: white;border: 0px">授权管理</p>
        <div style="display:none;width: 230px" class=menu_body >
            <a href="/appraiseCount" target="useriframe">角色管理</a>
            <a href="/resultsCheck" target="useriframe">权限管理</a>
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
</div>
</body>
</html>
