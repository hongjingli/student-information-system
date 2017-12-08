<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加学生信息</title>
    
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
    <form action="servlet/InsertstuServlet1" method="post">
		<table  border="1" align="center" cellpadding="0" cellspacing="0">
			<caption>
			<font color="red" size="5">${ requestScope.message }</font><br/>
			<font color="blue" size="5">添加学生信息</font></caption>
			<tr>
				<td height="50" width="100" align="right" valign="middle">学号：</td>
				<td height="50" colspan="2"><input type="text" name="sid" id="sid" /></td>
				<td height="50" width="100" align="right" valign="middle">姓名：</td>
				<td height="50" colspan="2"><input type="text" name="sname" id="sname"/></td>
			</tr>
			<tr>
				<td height="50" width="100" align="right" valign="middle">学院：</td>
				<td height="50" colspan="2"><input type="text" name="xueyuan" id="xueyuan"/></td>
				<td height="50" width="100" align="right" valign="middle">专业：</td>
				<td height="50" colspan="2"><input type="text" name="zhuanye" id="zhuanye"/></td>
			</tr>
			<tr>
				<td height="50" width="100" align="right" valign="middle">年级：</td>
				<td height="50" colspan="2"><input type="text" name="grade" id="grade"/></td>
				<td height="50" width="100" align="right" valign="middle">班级：</td>
				<td height="50" colspan="2"><input type="text" name="class" id="class"/></td>
			</tr>
			<tr>
				<td height="50" width="100" align="right" valign="middle">联系电话：</td>
				<td height="50" colspan="2"><input type="text" name="phone" id="phone"/></td>
				<td height="50" width="100" align="right" valign="middle">宿舍号：</td>
				<td height="50" colspan="2"><input type="text" name="did" id="did"/></td>
			</tr>
			<tr>
				<td height="50" width="100" align="right" valign="middle">登陆帐号：</td>
				<td height="50" colspan="2"><input type="text" name="uname" id="uname"/></td>
				<td height="50" width="100" align="right" valign="middle">密码：</td>
				<td height="50" colspan="2"><input type="text" name="pwd" id="pwd"/></td>
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
