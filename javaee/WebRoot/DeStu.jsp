<%@ page language="java" import="java.util.*,javabean.Student,javabean.StudentDao,java.util.ArrayList" contentType="text/html; charset=UTF-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'queryXY.jsp' starting page</title>
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
  <% StudentDao stu = new StudentDao();
  	 List<Student> clist = stu.allstu();
  	 pageContext.setAttribute("cuslist",clist);
  	  %>
  <body>
  
   <table width="90%" border="1" align="center" cellpadding="0" cellspacing="0">
   <caption>
   <font color="red" size="5">${ requestScope.message }</font><br />
   <font color="blue" size="5">学生信息显示与删除</font></caption> 
  <tr>
    <td>学号</td>    
    <td>姓名</td>
    <td>专业</td>
    <td>班级</td>
    <td>学院</td>
    <td>联系电话</td>
    <td>宿舍楼号</td>
    <td>宿舍号</td>
    <td>操作</td>
  </tr>
  <c:forEach var="cus" items="${cuslist}" varStatus="item">
   <tr>
   	<td>${cus.id}</td>
   	<td>${cus.name}</td>
   	<td>${cus.zhuanye}</td>
   	<td>${cus.classs}</td>
   	<td>${cus.xueyuan}</td>
   	<td>${cus.phone}</td>
   	<td>${cus.dorid}</td>
   	<td>${cus.did}</td>
   	<td><a href="servlet/DestuServlet?s=${cus.id}">删除</a></td>
   	</tr>
   	</c:forEach>
</table>

 <a href="javascript:history.go(-1);">返回上一页</a>
  </body>
</html>

