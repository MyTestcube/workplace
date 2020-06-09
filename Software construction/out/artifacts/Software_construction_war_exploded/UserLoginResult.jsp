<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/12
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<% System.err.println("utf-8"); %>
<jsp:useBean id="checkBean" class="beans.UserCheckBean" scope="page" />
<jsp:setProperty name="checkBean" property="*" />
<html>
<head><title>登录结果</title></head>
<body>
<%
    if (checkBean.check()) {
%>
<span style="color: blue; "><%=checkBean.getUsername()%></span>
，您好！欢迎光临本系统。
<%
} else {
%>
登录失败！请单击
<a href="UserLogin.jsp">此处</a>重新登录。
<%
    }
%>
</body>
</html>
