<%@ page language="java" import="java.util.*,javabean.StudentMessage,javabean.Stuquery,java.util.ArrayList" contentType="text/html; charset=utf-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
  
  <body>
     <%  
 	 Stuquery st =new Stuquery();
  	 String sid = request.getParameter("sid");
  	 String phone = request.getParameter("phone");
  	 List<StudentMessage> clist = st.query1(sid,phone);
  	 pageContext.setAttribute("cuslist",clist);
   %>
    <center>
    <form>
		<table  border="1" align="center" cellpadding="0" cellspacing="0">
			
			<caption><font color="blue" size="5">个人信息</font></caption>
			<c:forEach var="cus" items="${cuslist}" varStatus="item">
			<tr>
				<td height="50" width="100" align="right" valign="middle">学号：</td>
				<td height="50" width="100" valign="middle">${cus.sid}</td>
				<td height="50" width="100" align="right" valign="middle">姓名：</td>
				<td height="50" width="100" valign="middle">${cus.sname}</td>
			</tr>
			<tr>
				<td height="50" width="100" align="right" valign="middle">学院：</td>
				<td height="50" width="100" valign="middle">${cus.xueyuan}</td>
				<td height="50" width="100" align="right" valign="middle">专业：</td>
				<td height="50" width="100" valign="middle">${cus.zhuanye}</td>
			</tr>
			<tr>
				<td height="50" width="100" align="right" valign="middle">年级：</td>
				<td height="50" width="100" valign="middle">${cus.grade}</td>
				<td height="50" width="100" align="right" valign="middle">班级：</td>
				<td height="50" width="100" valign="middle">${cus.sclass}</td>
			</tr>
			<tr>
				<td height="50" width="100" align="right" valign="middle">联系电话：</td>
				<td height="50" width="100" valign="middle">${cus.phone}</td>
				<td height="50" width="100" align="right" valign="middle">宿舍号：</td>
				<td height="50" width="100" valign="middle">${cus.did}</td>
			</tr>
			</c:forEach>
		</table>   
    </form>
    </center>
    <a href="javascript:history.go(-1);">返回上一页</a>
  </body>
</html>
