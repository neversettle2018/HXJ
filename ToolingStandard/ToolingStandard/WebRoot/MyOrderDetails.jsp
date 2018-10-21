<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>我的订单</title>
	<link rel="stylesheet" type="text/css" href="css/Ys.css">
  </head>
  
  <body>
  	<!-- header start-->
	<%-- 导入头部代码 --%>
	<jsp:include page="Head.jsp" />
	<%-- 导入导航代码 --%>
	<jsp:include page="Nav.jsp" />
    <div class="banner4">
		<ul class="circle">
			<li class="current"></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>
    <h2>订单内容</h2>
	<table class="car" style="margin: 0 auto; height: auto;">
		<tr style="height:50px;">
			<th>订单编号</th>
			<th>商品名称</th>
			<th>商品规格</th>
			<th>商品数量</th>
			<th>商品价格</th>
		</tr>
		<c:forEach var="od" items="${orderDetails}">
			<form action="" method="post">
				<tr style="height:30px;">
					<td>${od.orderInfo.orderNo}</td>
					<td><span>${od.goodsName}</span></td>
					<td>${od.goodsSize}</td>
					<td>${od.goodsNum}</td>
					<td>${od.price}</td>
				</tr>
			</form>
		</c:forEach>
	</table>
	<div class="by">
		<p id="p2"><a href="getUserOrderInfo">返回</a></p>
	</div>
</body>
</html>
