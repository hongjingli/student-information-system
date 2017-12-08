<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>欢迎你，超级管理员！</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <%session.setAttribute("username", request.getParameter("uname")); %>
    <table width="100%" border="1" cellspacing="0" cellpadding="0">
    <tr><td><caption><font color="back" size="5"><b>欢迎你进入超级管理员系统!</b></font></caption></td></tr>
  <tr>
    <td align="left" valign="middle">
    <p><a href="addXY.jsp">录入学院信息</a></p></td>
  </tr>
   <tr>
    <td align="left" valign="middle">&nbsp;</td>
  </tr>
  <tr>
    <td align="left" valign="middle">
    <p><a href="queryXY.jsp">查询或删除学院信息</a></p></td>
  </tr>
   <tr>
    <td align="left" valign="middle">&nbsp;</td>
  </tr>
  <tr>
    <td align="left" valign="middle">
    <p><a href="UpXY.jsp">修改学院信息</a></p></td>
  </tr>
  <tr>
    <td align="left" valign="middle">&nbsp;</td>
  </tr>
  <tr>
    <td align="left" valign="middle">
    <p><a href="addstu.jsp">录入学生信息</a></p></td>
  </tr>
   <tr>
    <td align="left" valign="middle">&nbsp;</td>
  </tr>
  <tr>
    <td align="left" valign="middle">
    <p><a href="DeStu.jsp">学生信息操作</a></p></td>
  </tr>
   <tr>
    <td align="left" valign="middle">&nbsp;</td>
  </tr>
  <tr>
    <td align="left" valign="middle">
    <p><a href="UpStu.jsp">修改学生信息</a></p></td>
  </tr>
   <tr>
    <td align="left" valign="middle">&nbsp;</td>
  </tr>
  <tr>
    <td align="left" valign="middle">
    <p><a href="addoadmin.jsp">添加普通管理员</a></p></td>
  </tr>
   <tr>
    <td align="left" valign="middle">&nbsp;</td>
  </tr>
  <tr>
    <td align="left" valign="middle">
    <a href="deoadmin.jsp">删除普通管理员</a></td>
  </tr>
   <tr>
    <td align="left" valign="middle">&nbsp;</td>
  </tr>
  <tr>
    <td align="left" valign="middle">
    <a href="Upoadmin.jsp">修改普通管理员</a></td>
  </tr>
   <tr>
    <td align="left" valign="middle">&nbsp;</td>
  </tr>
  <tr>
    <td align="left" valign="middle">
    <a href="repwd.jsp">修改密码</a></td>
  </tr>
</table>
  </body>
</html>
