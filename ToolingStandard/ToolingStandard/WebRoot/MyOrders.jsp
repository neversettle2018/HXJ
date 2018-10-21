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
	<h2>订单详情</h2>
	<table class="car" style="margin: 0 auto 200px auto; height: auto;">
		<tr style="height:50px;">
			<th>订单编号</th>
			<th style="width:76px">收货人</th>
			<th style="width:166px">下单时间</th>
			<th style="width:360px">收货地址</th>
			<th>收货手机号</th>
			<th>订单状态</th>
			<th>操作</th>
		</tr>
		<c:forEach var="oi" items="${orderInfos}">
				<tr style="height:50px;">
					<td>${oi.orderNo}</td>
					<td><span>${oi.orderUserName}</span></td>
					<td style="width:166px">${oi.orderTime}</td>
					<td style="width:360px">${oi.address}</td>
					<td>${oi.phone}</td>
					<td>${oi.orderStatus}</td>
					<td>
						<a href="orderDetail?orderNo=${oi.orderNo}">查看</a>
					</td>
				</tr>
		</c:forEach>
	</table>
	<!-- footer start  -->
	<div class="footer">
		<div class="footer-t">
			<div class="footer-inner">
				<dl>
					<dt>设计理念</dt>
					<dd>
						<a href="#">为每一个人打造一套工装标准</a>
					</dd>
					<dd>
						<a href="#">我们致力于打造每一条最好的工装裤</a>
					</dd>
					<dd>
						<a href="#">邮箱：1057148049@qq.com</a>
					</dd>

				</dl>
				<dl>
					<dt>潮流时尚</dt>
					<dd>
						<a href="#">·致我们即将逝去的青春</a>
					</dd>
					<dd>
						<a href="#">·穿上工装裤的那一刻 所有规则统统走开</a>
					</dd>
					<dd>
						<a href="#">·每个男人都应该拥有一条工装裤</a>
					</dd>
				</dl>


				<div class="code">
					<img src="img/code_05.jpg" />
				</div>
			</div>
		</div>
		<div class="footer-b">
			<p>版权所有 2016 - 2017 黄晓杰</p>
		</div>
	</div>
</body>
</html>
