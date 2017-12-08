<%@ page language="java" import="java.util.*,javabean.StudentMessage,javabean.Stuquery,java.util.ArrayList" contentType="text/html; charset=UTF-8" %>
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
    <form action="Selectupstu.jsp">
    	<table width="50%" border="1" align="center" cellpadding="0" cellspacing="0">
    		<caption><font color="red" size="5">学生信息管理系统子模块</font></caption>
    		<caption><font color="blue" size="3">请输入学生学号进行查询</font></caption>
    		<tr>
    			<td height="50" width="20%" align="right" valign="middle">学号：</td>
    			<td height="50" colspan="2"><input type="text" name="sid" id="sid"/></td>
    		</tr>

    		<tr>
    			<td height="50" width="30%" align="right" valign="middle"><input type="submit" value="查询" name="login" id="login"/></td>
    			<td height="50" colspan="2"><input type="reset" value="重置" name="reset" id="reset"/></td>
    		</tr> 		
    	</table>
    </form>
  </center>
    <a href="javascript:history.go(-1);">返回上一页</a>
  </body>
</html>
