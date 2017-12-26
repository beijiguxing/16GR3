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
    
    <title>My JSP 'listUser.jsp' starting page</title>
    
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
    <a href="<s:url value='user!toAdd'/>">添加新用户</a>
  <table border ="1">
  <tr>
  <td>角色ID</td><td>角色名</td><td>角色操作</td>
  <td>操作1</td><td>操作2</td> <td>账户</td><td>密码</td> 	
  <s:iterator value="list" var="role" >
  <tr>
  	<td><s:property value="#role.rid" /></td>
  	<td><s:property value="#role.rname" /></td>
  	<td><s:property value="#role.memo" /></td>
  	<td><s:a href="user!toUpdate?role.rid=%{#role.rid}">修改</s:a></td>
  	<td><s:a href="user!delete?role.rid=%{#role.rid}">删除</s:a></td>

  		  <s:iterator value="#role.users" var="user">
	  	<td><s:property value="#user.uname" /></td>
  		<td><s:property value="#user.upwd" /></td>
  		</s:iterator>
	 
	  </tr>
	  </s:iterator>
	  </tr>
	  


	    </table>
  </body>
</html>
