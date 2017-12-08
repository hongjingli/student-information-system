<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>欢迎你，管理员！</title>
    
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
    <tr><td><caption><font color="back" size="5"><b>欢迎你进入管理员系统,!</b></font></caption></td></tr>
  <tr>
    <td align="left" valign="middle">
    <p><a href="addstu.jsp">录入学生信息</a></p></td>
  </tr>
   <tr>
    <td align="left" valign="middle">&nbsp;</td>
  </tr>
  <tr>
    <td align="left" valign="middle">
    <p><a href="Stu.jsp">管理学生信息</a></p></td>
  </tr>
  <tr>
    <td align="left" valign="middle">&nbsp;</td>
  </tr>
  <tr>
    <td align="left" valign="middle">
    <p><a href="aUpStu.jsp">修改学生信息</a></p></td>
  </tr>
  <tr>
    <td align="left" valign="middle">&nbsp;</td>
  </tr>
  <tr>
    <td align="left" valign="middle">
    <p><a href="readmin.jsp">修改个人资料</a></p></td>
  </tr>
   
</table>
  </body>
</html>
