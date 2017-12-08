<%@ page language="java" import="java.util.*,javabean.XY,javabean.XueYuan,java.util.ArrayList" contentType="text/html; charset=UTF-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>学院信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <% XueYuan xy = new XueYuan();
  	 List<XY> clist = xy.allXYs();
  	 pageContext.setAttribute("cuslist",clist);
   %>
  <body>
  
   <table width="90%" border="1" align="center" cellpadding="0" cellspacing="0">
   <caption>
   <font color="red" size="5">${ requestScope.message }</font><br />
   <font color="blue" size="5">学院信息显示与删除</font></caption> 
  <tr>
    <td>学院名称</td>    
    <td>专业名称</td>
  </tr>
	<c:forEach var="cus" items="${cuslist}" varStatus="item">
    <tr>
   	<td>${cus.xueyuan}</td>
   	<td>${cus.zhuanye}</td>
   	<td><a href="servlet/delectXYServlet?s=${cus.zhuanye}">删除</a></td>
   	</tr>
   	</c:forEach>
</table>

 <a href="javascript:history.go(-1);">返回上一页</a>
  </body>
</html>
