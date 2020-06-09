<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/15
  Time: 9:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>职工增加</title>
</head>
<body>
<p>职工增加</p>
<form method="post" action="ZgZj0.jsp" >
    编号：<input name="bh" type="text" id="bh"/><br>
    姓名：<input name="xm" type="text" id="xm"/><br>
    性别：<input type="radio" name="xb" value="男" checked="checked"/>男
    <input type="radio" name="xb" value="女"/>女<br>
    部门：<input name="bm" type="text" id="bm"/><br>
    出生日期：<input name="csrq" type="text"id="csrq"/><br>
    基本工资：<input name="jbgz" type="text" id="jbgz"/><br>
    岗位津贴：<input name="gwjt" type="text" id="gwjt"/><br>
    <input name="submit" type="submit" value="确定"/>
    <input name="reset" type="reset" value="重置"/>
</form>
</body>
</html>
