<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加普通管理员信息</title>
    
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
    <form action="servlet/registerServlet" method="post">
<table width="50%" border="0" align="center" cellpadding="0" cellspacing="0">
	<caption>
		<font color="red" size="5">${ requestScope.message }</font><br />
		<font color="blue" size="5">添加普通管理员</font>
	</caption>
  <tr>
    <td height="50" align="right" valign="middle">普通管理员用户名：</td>
    <td height="50" colspan="2"><input type="text" name="name" id="name"/></td>
  </tr>
  <tr>
    <td height="50" align="right" valign="middle">密码：</td>
    <td height="50" colspan="2"><input type="text" name="password" id="password" /></td>
  </tr>
  <tr>
    <td height="50" align="right" valign="middle">所属学院：</td>
    <td height="50" colspan="2"><input type="text" name="xueyuan" id="xueyuan" /></td>
  </tr>
  <tr>
    <td height="50" align="right" valign="middle"><label>
      <input type="submit" name="add" id="add" value="添加" />
    </label></td>
    <td width="13%" height="50">&nbsp;</td>
    <td width="53%" height="50"><label>
      <input type="reset" name="reset" id="reset" value="重置" />
    </label></td>
  </tr>
  </table>
  
</form>
 <a href="javascript:history.go(-1);">返回上一页</a>

 </body>
</html>
