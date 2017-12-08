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
  	 List<StudentMessage> clist = st.query2(sid);
  	 pageContext.setAttribute("cuslist",clist);
   %>
    <center>
    <form action="servlet/UpdatestuServlet" method="post">
		
		<table  border="1" align="center" cellpadding="0" cellspacing="0">
			<caption><font color="blue" size="5">学生信息</font></caption>
			<c:forEach var="cus" items="${cuslist}" varStatus="item">
			<tr>
				<td height="50" width="100" align="center" valign="middle">学号：</td>
				<td height="50" width="100" align="center" valign="middle">姓名：</td>
				<td height="50" width="100" align="center" valign="middle">学院：</td>
				<td height="50" width="100" align="center" valign="middle">专业：</td>
				<td height="50" width="100" align="center" valign="middle">年级：</td>
				<td height="50" width="100" align="center" valign="middle">班级：</td>
				<td height="50" width="100" align="center" valign="middle">联系电话：</td>
				<td height="50" width="100" align="center" valign="middle">宿舍号：</td>
				<td height="50" width="100" align="center" valign="middle">登陆帐号：</td>
				<td height="50" width="100" align="center" valign="middle">密码：</td>
			</tr>
			<tr>
				
				<td height="50" width="100" valign="middle">${cus.sid}</td>
				<td height="50" width="100" valign="middle">${cus.sname}</td>
				<td height="50" width="100" valign="middle">${cus.xueyuan}</td>
				<td height="50" width="100" valign="middle">${cus.zhuanye}</td>
				<td height="50" width="100" valign="middle">${cus.grade}</td>
				<td height="50" width="100" valign="middle">${cus.sclass}</td>
				<td height="50" width="100" valign="middle">${cus.phone}</td>
				<td height="50" width="100" valign="middle">${cus.did}</td>
				<td height="50" width="100" valign="middle">${cus.uname}</td>
				<td height="50" width="100" valign="middle">${cus.pwd}</td>
			</tr>
			</c:forEach>
		</table>
		<table  border="1" align="center" cellpadding="0" cellspacing="0">
			<caption><font color="red" size="5">${ requestScope.message }</font></caption>
			<caption><font color="blue" size="5">修改学生信息</font></caption>
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
				<td><input type="submit" name="update" id="update" value="修改" /></td>
				<td><input type="reset" name="reset" id="reset" value="重置" /></td>
			</tr>    
    	</table>    
    </form>
    </center>
    <a href="javascript:history.go(-1);">返回上一页</a>
  </body>
</html>
