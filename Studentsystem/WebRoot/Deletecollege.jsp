<%@ page language="java" import="java.util.*,javabean.MajorCollegeMessage,javabean.College,java.util.ArrayList" contentType="text/html; charset=UTF-8" %>
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
  <% College stu = new College();
  	 List<MajorCollegeMessage> clist = stu.allXY();
  	 pageContext.setAttribute("cuslist",clist);
  %>
  <body>
	<center>
    <form action="servlet/DeletecollegeServlet" method="post">
		<table  border="1" align="center" cellpadding="0" cellspacing="0">
			<caption><font color="blue" size="5">学院信息</font></caption>
			<c:forEach var="cus" items="${cuslist}" varStatus="item">
			<tr>
				<td height="50" width="100" align="center" valign="middle">学院：</td>
				<td height="50" width="100" align="center" valign="middle">学院简介：</td>
				<td height="50" width="100" align="center" valign="middle">院长：</td>
				<td height="50" width="100" align="center" valign="middle">办公室：</td>
			</tr>
			<tr>
				<td height="50" width="100" valign="middle">${cus.xueyuan}</td>
				<td height="50" width="100" valign="middle">${cus.xjianjie}</td>
				<td height="50" width="100" valign="middle">${cus.yuanzhang}</td>
				<td height="50" width="100" valign="middle">${cus.office}</td>
			</tr>
			</c:forEach>
		</table>
		<table  border="1" align="center" cellpadding="0" cellspacing="0">
			<caption><font color="red" size="5">${ requestScope.message }</font></caption>
			<caption><font color="blue" size="5">删除学院信息</font></caption>
			<tr>
				<td height="50" width="100" align="right" valign="middle">学院：</td>
				<td height="50" colspan="2"><input type="text" name="xueyuan" id="xueyuan" /></td>
			</tr>
		</table>
		<table>
			<tr>
				<td><input type="submit" name="delete" id="delete" value="删除" /></td>
				<td><input type="reset" name="reset" id="reset" value="重置" /></td>
			</tr>    
    	</table>
    </form> 
    </center>
    <a href="javascript:history.go(-1);">返回上一页</a>
  </body>
</html>
