<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" %>
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
  <%session.setAttribute("username", request.getParameter("username")); %>
  <body>
    <center>
    <form action="servlet/LoginServlet1" method="post">
    	<table width="50%" border="1" align="center" cellpadding="0" cellspacing="0">
    		<br><br><caption><font color="red" size="5">学生信息管理系统子模块</font></caption>
    		<caption><font color="red" size="5">管理员登陆</font></caption>
    		<tr>
    			<td height="50" width="20%" align="right" valign="middle">用户名：</td>
    			<td height="50" colspan="2"><input type="text" name="username" id="username"/></td>
    		</tr>
    		<tr>
    			<td height="50" width="30%" align="right" valign="middle">密码：</td>
    			<td height="50" colspan="2"><input type="password" name="password" size="21"/></td>
    		</tr>
    		<tr>
    			<td height="50" width="30%" align="right" valign="middle">身份：</td>
    			<td><select name="urole">
    					<option value="1">超级管理员</option>
    					<option value="2">普通管理员</option>
    				</select>
    			</td>
    		</tr>
    		<tr>
    			<td height="50" width="30%" align="right" valign="middle"><input type="submit" value="登陆" name="login" id="login"/></td>
    			<td height="50" colspan="2"><input type="reset" value="重置" name="reset" id="reset"/></td>
    		</tr> 		
    	</table>
    </form>
  </center>
    <a href="javascript:history.go(-1);">返回上一页</a>
  </body>
</html>
