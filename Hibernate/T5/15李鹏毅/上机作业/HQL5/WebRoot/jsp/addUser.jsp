<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addUser.jsp' starting page</title>
    
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
       <s:form action="user!add" method="post" namespace="/">
   		<s:textfield label="姓名" required="true" name="emp.ename"> </s:textfield>
   		<s:radio label="性别" list="#{'M':'男','F':'女'}" required="true" name="emp.sex"></s:radio>
   		<s:textfield label="生日" name="emp.birthday"></s:textfield>
   		<s:textfield label="部门" required="true" name="emp.dept.did"> </s:textfield>
   		<s:submit value="添加"></s:submit>
   </s:form>
  </body>
</html>
