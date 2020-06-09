<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/12
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登录</title>
</head>
<body>
<div align="center">
    <form action="UserLoginResult.jsp" method="post">
        用户登录<br><br>
        <table>
            <tr><td align="right">用户名：</td>
                <td><input type="text" name="username"></td></tr>
            <tr><td align="right">密码：</td>
                <td><input type="password" name="password"></td></tr>
        </table>
        <br>
        <input type="submit" value="登录">
    </form>
</div>
</body>
</html>
