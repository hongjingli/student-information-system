<%@ page language="java" import="java.util.*,javabean.Student,javabean.Stuquery,java.util.ArrayList" contentType="text/html; charset=UTF-8" %>
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
  <form action="Studentquery.jsp">
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr><td><caption><font color="back" size="5"><b>欢迎你进入学生系统!</b></font></caption></td></tr>
  <tr>
    <td>
    <p>学号：<input type="text" name="id"></p>
    </td>
    <td>
    <p>姓名：<input type="text" name="name"></p>
    </td> 
    <td>
    <p>宿舍：<input type="text" name="dorid"></p>
    </td> 
    <td>
    <p>联系电话：<input type="text" name="phone"></p>
    </td> 
    <td>
    <input type="submit" value="查询">
    </td> 
  </tr>  
</table>
</form>
 <a href="javascript:history.go(-1);">返回上一页</a>
  </body>
</html>
