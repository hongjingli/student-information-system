<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加专业信息</title>
    
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
    <form action="servlet/InsertmajorServlet" method="post">
		<table  border="1" align="center" cellpadding="0" cellspacing="0">
			<caption><font color="red" size="5">${ requestScope.message }</font></caption>
			<caption><font color="blue" size="5">添加专业信息</font></caption>
			<tr>
				<td height="50" width="100" align="right" valign="middle">专业名称：</td>
				<td height="50" colspan="2"><input type="text" name="zhuanye" id="zhuanye"/></td>
				<td height="50" width="100" align="right" valign="middle">专业简介：</td>
				<td height="50" colspan="2"><input type="text" name="jianjie" id="jianjie"/></td>
			</tr>
			<tr>
				<td height="50" width="100" align="right" valign="middle">专业人数：</td>
				<td height="50" colspan="2"><input type="text" name="mcount" id="mcount"/></td>
				<td height="50" width="100" align="right" valign="middle">班级数量：</td>
				<td height="50" colspan="2"><input type="text" name="ccount" id="ccount"/></td>
			</tr>
		</table>
		<table>
			<tr>
				<td><input type="submit" name="insert" id="insert" value="添加" /></td>
				<td><input type="reset" name="reset" id="reset" value="重置" /></td>
			</tr>    
    	</table>
    </form> 
    </center>
    <a href="javascript:history.go(-1);">返回上一页</a>
  </body>
</html>
