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
      <table width="100%" border="0" cellspacing="0" cellpadding="0">
    <tr><td><caption><font color="back" size="5"><b>欢迎你进入学生系统!</b></font></caption></td></tr>  
</table>
 <%  
 	 Stuquery st =new Stuquery();
  	 String id = request.getParameter("id");
  	 System.out.println(id);
  	 //id = new String(id.getBytes("ISO-8859-1"),"utf-8");
  	 String name = request.getParameter("name");
  	 
  	 name = new String(name.getBytes("ISO-8859-1"),"utf-8");
  	 boolean f = name.equals(new String("".getBytes("ISO-8859-1"),"utf-8"));
  	 System.out.println("name--->" + f);
  	 String dorid = request.getParameter("dorid");
	 //dorid = new String(dorid.getBytes("ISO-8859-1"),"utf-8");
  	 String phone = request.getParameter("phone");
	 //phone = new String(phone.getBytes("ISO-8859-1"),"utf-8");
  	 List<Student> clist = st.query(id, name, dorid, phone);
  	 pageContext.setAttribute("cuslist",clist);
   %>
   <table width="90%" border="1" align="center" cellpadding="0" cellspacing="0">
   <caption>
   <font color="blue" size="5">查询的信息</font></caption> 
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
 <a href="javascript:history.go(-1);">返回上一页</a>
  </body>
</html>
