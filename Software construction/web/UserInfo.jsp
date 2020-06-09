<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/12
  Time: 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="myUserBean" class="beans.UserBean" scope="page"/>
<html>
<head>
    <title>用户信息</title>
</head>
<body>
    <jsp:setProperty name="myUserBean" property="username" value="admin"/>
    <jsp:setProperty name="myUserBean" property="password" value="12345"/>
    用户名：
    <jsp:getProperty name="myUserBean" property="username"/><br> 
    密码：
    <jsp:getProperty name="myUserBean" property="password"/><br>
    <br>
</body>
</html>
