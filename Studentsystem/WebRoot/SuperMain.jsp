<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>学生信息管理系统子模块</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <%session.setAttribute("username", request.getParameter("username")); %>
  <body>
    <center>
    <form action="mainServlet" method="post">
    	<table width="70%"  align="center" cellpadding="0" cellspacing="0">
    		<caption><font color="red" size="5">欢迎进入学生信息管理系统</font></caption>
    		<caption><font color="red" size="3">您是超级管理员的身份</font></caption>
    		<tr>
    			<td height="30" align="center"><a href="Insertcollege.jsp;">录入学院信息</a></td>
    			<td height="30" align="center"><a href="Insertmajor.jsp;">录入专业信息</a></td>
    			<td height="30" align="center"><a href="Insertclass.jsp;">录入班级信息</a></td>
    			<td height="30" align="center"><a href="Insertstu.jsp;">录入学生信息</a></td>
    			<td height="30" align="center"><a href="SGuanliyuan.jsp;">管理普通管理员</a></td>
    		</tr>
    		<tr>
    			<td height="30" align="center"><a href="Col.jsp;">查询学院信息</a></td>
    			<td height="30" align="center"><a href="Maj.jsp;">查询专业信息</a></td>
    			<td height="30" align="center"><a href="Cla.jsp;">查询班级信息</a></td>
    			<td height="30" align="center"><a href="Stu.jsp;">查询学生信息</a></td>
    			<td height="30" align="center"><a href="Newpwd.jsp;">修改密码</a></td>
    		</tr>
    		<tr> 
    			<td height="30" align="center"><a href="Deletecollege.jsp;">删除学院信息</a></td>
    			<td height="30" align="center"><a href="Deletemajor.jsp;">删除专业信息</a></td>
    			<td height="30" align="center"><a href="Deleteclass.jsp;">删除班级信息</a></td>
    			<td height="30" align="center"><a href="Deletestu.jsp;">删除学生信息</a></td>
    		</tr>		
    	</table>
    </form>
  </center>
  <a href="Mainlogin.jsp;">返回登陆界面</a>
  </body>
</html>
