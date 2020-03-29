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
    <script src="/js/jquery-3.3.1.js" ></script>
    <link href="/css/bootstrap.css" rel="stylesheet" type="text/css">
    <script src="/js/bootstrap.js"></script>
    <link href="/css/portal.css" rel="stylesheet" type="text/css">
</head>
<body>
<div class="header">
    <div >
        <img src="/img/time.png" style="height: 25px;width: 25px;float: left;margin-left: 15px;margin-top: 15px;">
    </div>
    <div style="float: left;margin-left: 15px;margin-top: 10px;font-size: 18px">
        <p id="date"></p>
        <span id="mytime"></span>
    </div>
    <div class="headertext" style="display:inline-block;">
        <%--<img src="/img/yan.png" style="margin-right: 15px; height: 35px;width: 35px;margin-top: 0px">--%>
        <a style="font-size: 30px;margin-right: 25px">客户评价管理系统</a>
        <%--<c:set var="userLogin" value="${sessionScope.USER_SESSION}" />--%>
        <%--${userLogin.userId}--%>
        <a style="font-size: 15px" href="${pageContext.request.contextPath}/logout">
            退出
        </a>
        <img src="/img/logout.png" style="height: 25px;width: 25px">
    </div>
</div>

<script>
    var d = new Date();
    var days = ["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"];
    document.getElementById("date").innerHTML = days[d.getDay()];
</script>
<script type="text/javascript">
    function showTime() {
        nowtime = new Date();
        year = nowtime.getFullYear();
        month = nowtime.getMonth() + 1;
        date = nowtime.getDate();
        document.getElementById("mytime").innerText = year + "年" + month + "月" + date + " " + nowtime.toLocaleTimeString();
    }
    setInterval("showTime()", 1000);
</script>

</body>
</html>
