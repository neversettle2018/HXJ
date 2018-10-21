<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<link rel="shortcut icon" href="logoicon.ico" />
<link rel="bookmark" href="logoicon.ico" />

<title>订单确认</title>

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
	<h2>订单确认</h2>

	<form action="confirmOrder" method="post">
		<table class="car" style="margin: 0 auto; height: auto;">
			<tr style="height:50px;">
				<td style="width:500px;">真实姓名</td>
				<td><input name="orderInfo.orderUserName" type="text" style="width:200;height: 26px;font-size: 16px;font-family: '微软雅黑'">*</td>
			</tr>
			<tr style="height:50px;">
				<td style="width:500px;">收件手机号码</td>
				<td><input name="orderInfo.phone" type="text" maxlength="11" style="width:200;height: 26px;font-size: 16px;font-family: '微软雅黑'">*</td>
			</tr>
			<tr style="height:50px;">
				<td style="width:500px;">收货地址</td>
				<td><input name="orderInfo.address" type="text" style="width:200;height: 100px;margin:15px 0;font-size: 16px;font-family: '微软雅黑'">*</td>
			</tr>
		</table>
		<div class="by">
			<input type="submit" class="by1" value="确认订单">
		</div>
	</form>



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
