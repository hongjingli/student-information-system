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
	<style> 
	 body{
	background-image:url(background.jpg);
	background-position:top;
	
	}
	</style>
  </head>
  
  <body>
    <center>
    <form>
    	<table width="40%"  align="center" cellpadding="0" cellspacing="0">
    		<br><br><caption><font color="red" size="5">欢迎进入学生信息管理系统</font></caption>
    		<caption><font color="red" size="3">请选择您身份对应的入口</font></caption>
    		<tr>
    			<td>&nbsp;</td>
    		</tr>
    		<tr>
    			<td height="30" align="center"><a href="GLogin.jsp;">管理员入口</a></td>
    		</tr>
    		<tr>
    			<td>&nbsp;</td>
    		</tr>
    		<tr>
    			<td height="30" align="center"><a href="SLogin.jsp;">普通用户入口</a></td>
    		</tr>
    	</table>
    </form>
  </center>
  </body>
</html>
