<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 2020/3/9
  Time: 13:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录111</title>

    <meta name="description" content="particles.js is a lightweight JavaScript library for creating particles.">
    <meta name="author" content="Vincent Garreau" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
    <link rel="stylesheet" media="screen" href="/css/style.css">
    <link rel="stylesheet" type="text/css" href="/css/reset.css" />
</head>
<body>
<form name="frmlogin" method="post"
      action="${pageContext.request.contextPath}/login">
    <div id="particles-js">
        <div class="login">
            <div class="login-top">
                登录
            </div>
            <div style="margin-left: 50px;margin-bottom: 30px">
                <p>${message}</p>
            </div>
            <div class="login-center clearfix">
                <div class="login-center-img"><img src="img/name.png" /></div>
                <div class="login-center-input">
                    <input type="text" name="username" value="" placeholder="请输入您的用户名" id="username"
                           onfocus="this.placeholder=''" onblur="this.placeholder='请输入您的用户名'" />
                    <div class="login-center-input-text">用户名</div>
                </div>
            </div>
            <div class="login-center clearfix">
                <div class="login-center-img"><img src="img/password.png" /></div>
                <div class="login-center-input">
                    <input type="password" name="password" value="" placeholder="请输入您的密码" id="password"
                           onfocus="this.placeholder=''" onblur="this.placeholder='请输入您的密码'" />
                    <div class="login-center-input-text">密码</div>
                </div>
            </div>
            <input  class="login-button" style="margin-left: 50px" type="submit" value="登录">
            <%--<div class="login-button">--%>
                <%--登陆--%>
            <%--</div>--%>
        </div>
        <div class="sk-rotating-plane"></div>
    </div>
</form>

<script src="js/particles.min.js"></script>
<script src="js/app.js"></script>

<script type="text/javascript">
    function hasClass(elem, cls) {
        cls = cls || '';
        if (cls.replace(/\s/g, '').length == 0) return false; //当cls没有参数时，返回false
        return new RegExp(' ' + cls + ' ').test(' ' + elem.className + ' ');
    }

    function addClass(ele, cls) {
        if (!hasClass(ele, cls)) {
            ele.className = ele.className == '' ? cls : ele.className + ' ' + cls;
        }
    }

    function removeClass(ele, cls) {
        if (hasClass(ele, cls)) {
            var newClass = ' ' + ele.className.replace(/[\t\r\n]/g, '') + ' ';
            while (newClass.indexOf(' ' + cls + ' ') >= 0) {
                newClass = newClass.replace(' ' + cls + ' ', ' ');
            }
            ele.className = newClass.replace(/^\s+|\s+$/g, '');
        }
    }
    document.querySelector(".login-button").onclick = function(){
        addClass(document.querySelector(".login"), "active")
        setTimeout(function(){
            addClass(document.querySelector(".sk-rotating-plane"), "active")
            document.querySelector(".login").style.display = "none"
        },800)
        setTimeout(function(){
            removeClass(document.querySelector(".login"), "active")
            removeClass(document.querySelector(".sk-rotating-plane"), "active")
            document.querySelector(".login").style.display = "block"
            alert("登录成功")

        },5000)
    }
</script>
</body>
</html>
