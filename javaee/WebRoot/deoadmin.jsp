<%@ page language="java" import="java.util.*,javabean.ouser,javabean.Jlogin,java.util.ArrayList" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ page import="java.sql.*"%>
<%@ page import="javabean.DBconntion"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'queryXY.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <% Jlogin l = new Jlogin();
  	 List<ouser> clist = l.allstu();
  	 pageContext.setAttribute("cuslist",clist);
  	  %>
  <body>
  
   <table width="90%" border="0" align="center" cellpadding="0" cellspacing="0">
   <caption>
   <font color="red" size="5">${ requestScope.message }</font><br />
   <font color="blue" size="5">普通管理员信息</font></caption> 
  <tr>
    <td>用户名：</td>    
    <td>密码：</td>
    <td>所属学院：</td>
    <td>操作</td>
  </tr>
   <c:forEach var="cus" items="${cuslist}" varStatus="item">
   <tr>
   	<td>${cus.userName}</td>
   	<td>${cus.password}</td>
   	<td>${cus.xueyuan}</td>
   	<td><a href="servlet/deoadminServlet?s=${cus.userName}&s1=${cus.password}">删除</a></td>
   	</tr>
   	</c:forEach>
</table>

 <a href="javascript:history.go(-1);">返回上一页</a>
  </body>
</html>
