<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<link rel="shortcut icon" href="logoicon.ico" />
<link rel="bookmark" href="logoicon.ico" />

<title>我的购物车</title>

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
	<h2>我的购物车</h2>
	<table class="car" style="margin: 0 auto; height: auto;">
		<tr style="height:50px;">
			<th>商品预览</th>
			<th>商品名称</th>
			<th>商品价格</th>
			<th>数量</th>
			<th>尺寸</th>
			<th>操作</th>
		</tr>
		<c:forEach var="g" items="${shoppingCart}">
			<form action="updateGoodsNum" method="post">
				<tr title="${g.goodsName}">
					<input name="gid" type="hidden" value="${g.id}" />
					
					<td><img src="img/${g.imageUrl}" alt="商品预览图" width="150"
						height="150"></td>
					<td><span>${g.goodsName}</span></td>
					<td>¥${g.goodsPrice}元</td>
					<td><input id="goodsNum" name="num" type="number" value="${g.goodsNum}"
						min="1" max="100" style="text-align: center;"></input></td>
					<td>${g.goodsSize}</td>
					<td><input type="submit" value="修改数量"> <a
						href="delGoods?goods.id=${g.id}"
						onclick="return confirm('亲！真的不要我了吗？')">删除</a></td>
				</tr>
			</form>
		</c:forEach>
	</table>
	<div class="by">
		<p>总数量：${totalNum}</p>
		<p id="p1"><a href="removeShoppingCart" onclick="return confirm('亲！真的不要我们了吗？')">清空购物车</a>&nbsp;&nbsp;&nbsp;&nbsp;<a href="index.jsp">继续购物</a></p>
		<a href="OrdersConfirm.jsp"><div class="by1">结算：<span>￥${totalPrice}</span></div></a>
	</div>

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
