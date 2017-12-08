<%@ page language="java" import="java.util.*,javabean.OrdinaryMessage,javabean.Ordinary,java.util.ArrayList" contentType="text/html; charset=UTF-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>学生信息管理系统子模块</title>
    <meta http-equiv=ContentType content="text/html;charset=GBK">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <% Ordinary stu = new Ordinary();
  	 List<OrdinaryMessage> clist = stu.alladmin();
  	 pageContext.setAttribute("cuslist",clist);
  %>
  <body>
	<center>
    <form action="servlet/GuanliyuanServlet" method="post">
		<table  border="1" align="center" cellpadding="0" cellspacing="0">
			<caption><font color="blue" size="5">普通管理员信息</font></caption>
			<c:forEach var="cus" items="${cuslist}" varStatus="item">
			<tr>
				<td height="50" width="100" align="right" valign="middle">管理员：</td>
				<td height="50" width="100" valign="middle">${cus.uname}</td>
				<td height="50" width="100" align="right" valign="middle">密码：</td>
				<td height="50" width="100" valign="middle">${cus.pwd}</td>
			</tr>
			</c:forEach>
		</table>
		<table  border="1" align="center" cellpadding="0" cellspacing="0">
			<caption><font color="red" size="5">${ requestScope.message }</font></caption>
			<tr>
				<td height="50" width="100" align="right" valign="middle">管理员：</td>
				<td height="50" colspan="2"><input type="text" name="uname" id="uname"/></td>
			</tr>
			<tr>	
				<td height="50" width="100" align="right" valign="middle">密码：</td>
				<td height="50" colspan="2"><input type="text" name="pwd" id="pwd"/></td>
			</tr>
		</table>
		<table>
			<tr>
				<td><input type="submit" name="add" id="delete" value="删除" /></td>
			</tr>    
    	</table>
    </form> 
    </center>
    <a href="javascript:history.go(-1);">返回上一页</a>
  </body>
</html>
