<%@ page language="java" import="java.util.*,javabean.Student,javabean.Stuquery,java.util.ArrayList" contentType="text/html; charset=utf-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>学生管理界面</title>
    
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
 <%  
 	 Stuquery st =new Stuquery();
  	 String id = request.getParameter("id");
  	 System.out.println(id);
  	 List<Student> clist = st.query(id);
  	 pageContext.setAttribute("cuslist",clist);
   %>
   
   <table width="90%" border="1" align="center" cellpadding="0" cellspacing="0">
   <caption>
   <font color="blue" size="5">需要修改学生的信息</font></caption> 
  <tr>
    <td>学号：</td>    
    <td>姓名：</td>
    <td>专业：</td>
    <td>班级：</td>    
    <td>学院：</td>
    <td>联系电话：</td>
    <td>宿舍楼号：</td>    
    <td>宿舍号：</td>
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
   	</tr>
   	</c:forEach>
</table>
<form action="servlet/RestuServlet?pid=<%=id%>" method="post">

<table width="500" height="300"align="center"border="2"cellpadding="0"cellspacing="0">

<tr>
<td colspan="4"align="center"><h3>更改学生信息</h3></td>
</tr>
<tr>
<td align="center">学号：</td><td><input type="text" name="s1"/></td>
<td align="center">姓名：</td><td><input type="text" name="s2"></td>
</tr>


<tr>
<td align="center">专业：</td><td ><input type="text"name="s3"/></td>
<td align="center">班级：</td><td><input type="text"name="s4"/></td>

</tr>
<tr>
<td align="center">学院：</td><td><input type="text"name="s5"/></td>
<td align="center">联系号码:</td><td><input type="text"name="s6"></td> 
</tr>
<tr>
<td align="center">宿舍楼号：</td><td><input type="text"name="s7"/></td>
<td align="center">宿舍号:</td><td><input type="text"name="s8"></td> 
</tr>


<tr><td colspan="4"align="center"><input type="submit"value="确定"/></td></tr>

</table>

</form>
 <a href="javascript:history.go(-1);">返回上一页</a>
  </body>
</html>

