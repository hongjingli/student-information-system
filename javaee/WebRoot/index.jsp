<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>学生信息管理系统</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body background="images/back.jpg">
    <table border="0" width="100%" height="173">
    <tr>
    	<td height="40" align="center">
    	&nbsp;<img src="images/login.jpg"></td>
    <tr>
    	<td width="100%" height="34">
    	<p align="center"><font size="6"><b>学生信息管理系统</b></font></p>
    	</td>
    </tr>
    <tr>
    	<td width="100%" height="21">
    	<p align="center">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    	----李鸿境制作</p></td>
    </tr>
    </table>
    <table align="center" border="0">
    <tr align="center"><td>系统登录</td></tr>
    <form action="servlet/loginservlet" method="post">
    <tr><td>用户名：<input type="text" name="uname"></td></tr>
    <tr><td>密&nbsp;&nbsp;码：<input type="password" name="pwd"></td></tr>
    <tr><td>身&nbsp;份：
    <select name="urole">
    	<option value="1">超级管理员</option>
    	<option value="2">普通管理员</option>
    </select>
    </td></tr>
    <tr align="left"><td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="submit" value="登录">&nbsp;
    &nbsp;&nbsp;<a href="Student.jsp">学生入口</a>
    </td></tr>
    </form>
    </table>
  </body>
</html>
