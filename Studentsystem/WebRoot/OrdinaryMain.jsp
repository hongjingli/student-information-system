<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>学生信息管理系统子模块</title>
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
    <center>
    <form action="mainServlet" method="post">
    	<table width="40%"  align="center" cellpadding="0" cellspacing="0">
    		<caption><font color="blue" size="5">欢迎进入学生信息管理系统</font></caption>
    		<caption><font color="blue" size="3">您是普通管理员的身份</font></caption>
    		<tr>
    			<td height="30" align="center"><a href="Insertstu.jsp;">录入学生信息</a></td>
    		</tr>
    		<tr>
    			<td height="30" align="center"><a href="Stu.jsp;">查询学生信息</a></td>
    		</tr>
    		<tr>
    			<td height="30" align="center"><a href="Deletestu.jsp;">删除学生信息</a></td>
    		</tr>
    	</table>
    </form>
  </center>
  <a href="Mainlogin.jsp;">返回登陆界面</a>
  </body>
</html>
