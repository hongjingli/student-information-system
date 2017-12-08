<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改学生信息</title>
    
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
  <form action="reXY.jsp">
  
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr colspan ="3"><td><caption><font color="back" size="5"><b>输入你需要修改学院的信息(2个都必须输入,应为都是主键)</b></font></caption></td>
    <td></td><td></td></tr>
  <tr>
    <td>
    <p>学院名称：<input type="text" name="s1"></p>
    </td>
    <td>
    <p>专业名称：<input type="text" name="s2"></p>
    </td> 
    <td>
    <input type="submit" value="确定">
    </td> 
  </tr>  
</table>
</form>
 <a href="javascript:history.go(-1);">返回上一页</a>
  </body>
</html>
