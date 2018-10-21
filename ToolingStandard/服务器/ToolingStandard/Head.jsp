<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
  	<link rel="shortcut icon" href="logoicon.ico"/>
	<link rel="bookmark" href="logoicon.ico"/>
	
	<title>头部</title>
	
  	<link rel="stylesheet" type="text/css" href="css/component.css">
	<link rel="stylesheet" type="text/css" href="css/Ys.css">
    
  </head>
  
  <body>
    <div class="header">
		<div class="header-inner">
			<a href="index.jsp" target="_blank"><div class="logo"></div></a>
			<div class="nav">
				<ul>
					<li><a href="index.jsp">首页</a></li>
					<li><a href="boutique">精品</a></li>
					<li><a href="tops">工装衣</a></li>
					<li><a href="trousers">工装裤</a></li>
					<li><a href="About.jsp">经营范围</a></li>
				</ul>
			</div>
			
			<div class="user-btn">
			<c:choose>
			  <c:when test="${logname!=null}">
				<a>欢迎您:</a>
				<s:property value="#session.logname" />
				<a href="exit" class="user-login">退出</a>
			  </c:when>
			  <c:otherwise>
				<a href="login.jsp" class="user-login">登录</a>
            	<a href="register.jsp" class="user-reg">注册</a>
              </c:otherwise>
			</c:choose>
			</div>
		</div>
	</div>
  </body>
</html>
