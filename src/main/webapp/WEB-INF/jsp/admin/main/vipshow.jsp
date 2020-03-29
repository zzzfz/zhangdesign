<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2019/4/24
  Time: 16:20
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
<div>
    <c:import url="userhead.jsp"/>
    <c:import url="vipmenu.jsp"/>
    <div role="main" class="content" >
        <iframe id="usermain" name="useriframe"
                frameborder="0"
                style="position: absolute"
                width="1480" height="680"
                align="middle"
                scrolling="yes"
                src="/userhome"
        >
        </iframe>
    </div>
    <c:import url="userfoot.jsp"/>
</div>
</body>
</html>
