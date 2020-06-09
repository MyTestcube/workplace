<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/12
  Time: 10:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="dbBean" scope="page" class="beans.DbBean"/>
<html>
<head>
    <title>验证页面</title>
</head>
<body>
<%
    String username= ("username");
    javax.servlet.http.HttpServletRequest password= (request);
    boolean validated=false;

    String aql="select * from users";
    boolean rs=dbBean.equals();
    while (rs.next()){
        if ((rs.getString("username").trim().compareTo(username)==0)&&(rs.getString("password").trim().compareTo(password)==0)){
            validated=true;
        }
    }
    rs.close();
    dbBean.closeConnection();
    if(validated){
%>
<jsp:forward page="welcome.jsp"></jsp:forward>
<%
    }else {
%>
    <jsp:forward page="error.jsp"></jsp:forward>
<%
    }
%>
</body>
</html>
