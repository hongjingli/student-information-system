<%@ page language="java" import="java.util.*,javabean.XY,javabean.XueYuan,java.util.ArrayList" contentType="text/html; charset=UTF-8" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>修改学院信息</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <% 
  	 String xueyuan = request.getParameter("s1");
  	 xueyuan = new String(xueyuan.getBytes("ISO-8859-1"),"utf-8");
  	 String zhuanye = request.getParameter("s2");
  	 zhuanye = new String(zhuanye.getBytes("ISO-8859-1"),"utf-8");
  	 System.out.print(xueyuan);System.out.print(xueyuan);
  	 XueYuan xy = new XueYuan();
  	 List<XY> clist = xy.query(xueyuan, zhuanye);
  	 pageContext.setAttribute("cuslist",clist);
   %>
  <body>
  
  <table width="90%" border="1" align="center" cellpadding="0" cellspacing="0">
   <caption>
   <font color="blue" size="5">需要修改的学院信息</font></caption> 
  <tr>
    <td>学院名称</td>    
    <td>专业名称</td>
  </tr>
	<c:forEach var="cus" items="${cuslist}" varStatus="item">
    <tr>
   	<td>${cus.xueyuan}</td>
   	<td>${cus.zhuanye}</td>
   	</tr>
   	</c:forEach>
</table>
<br>

     <form action="servlet/reXYServlet?zhuanye=<%=zhuanye%>&&xueyuan=<%=xueyuan%>" method="post">
<table width="50%" border="0" align="center" cellpadding="0" cellspacing="0">
	<caption>
		<font color="red" size="5">${ requestScope.message }</font><br />
		<font color="blue" size="5">修改学院信息</font>
	</caption>
  <tr>
    <td height="50" align="right" valign="middle">学院名称：</td>
    <td height="50" colspan="2"><input type="text" name="xyname" id="xyname"/></td>
  </tr>
  <tr>
    <td height="50" align="right" valign="middle">专业名称：</td>
    <td height="50" colspan="2"><input type="text" name="zyname" id="zyname" /></td>
  </tr>
  <tr>
    <td height="50" align="right" valign="middle"><label>
      <input type="submit" name="add" id="add" value="确定" />
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
