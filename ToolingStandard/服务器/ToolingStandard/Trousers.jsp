<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link rel="shortcut icon" href="logoicon.ico" />
<link rel="bookmark" href="logoicon.ico" />

<title>工装裤</title>

<link rel="stylesheet" type="text/css" href="css/Ys.css">
<link rel="stylesheet" type="text/css" href="css/component.css">
</head>

<body>
	<!-- header start-->
	<%-- 导入头部代码 --%>
	<jsp:include page="Head.jsp" />
	<%-- 导入导航代码 --%>
	<jsp:include page="Nav.jsp" />
	<div class="banner3">
		<ul class="circle">
			<li class="current"></li>
			<li></li>
			<li></li>
			<li></li>
		</ul>
	</div>

	<h2>工装裤</h2>
	<div class="banner-e">

		<div class="banner-e-1">
			<ul>
				<c:forEach var="t" items="${pageBean.list}">
					<li title="${t.goodsName}"><a
						href="goodsDetail?gid=${t.id}">
							<img src="img/${t.trousersId}" alt="商品图片" width="310"
							height="310" title="${t.goodsName}">
					</a>
						<p class="goodsTitle" title="${t.goodsName}">${t.goodsName}</p>
						<p class="price">￥${t.price}</p></li>
				</c:forEach>
			</ul>
		</div>
	</div>


	<!-- 分页开始 -->
	<div class="fenye">
		<c:choose>
			<c:when test="${pageBean.pageNow==1}">
				<a>首页</a>
				<a>上一页</a>
			</c:when>
			<c:otherwise>
				<a href="trousers?pageNow=1">首页</a>
				<a href="trousers?pageNow=${pageBean.pageNow-1}">上一页</a>
			</c:otherwise>
		</c:choose>

		<!--var定义 -->
		<c:forEach var="i" step="1" begin="1" end="${pageBean.pageCount}">
			<c:choose>
				<c:when test="${pageBean.pageNow eq i}">
	        [${i }]
	        </c:when>
				<c:otherwise>
					<a href="trousers?pageNow=${i}">[${i }]</a>
				</c:otherwise>
			</c:choose>
		</c:forEach>
		<c:choose>
			<c:when test="${pageBean.pageNow eq pageBean.pageCount}">
				<a>下一页</a>
				<a>尾页</a>
			</c:when>
			<c:otherwise>
				<a href="trousers?pageNow=${pageBean.pageNow+1}">下一页</a>
				<a href="trousers?pageNow=${pageBean.pageCount}">尾页</a>
			</c:otherwise>
		</c:choose>

		&nbsp;共有 <a>${pageBean.rowCount}</a>条记录

	</div>
	<!-- 分页结束 -->

	<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;对本品牌评论:</h3>

	<div class="pinglun">
		<c:forEach var="co" items="${comment}">
			<hr>
			<ul>
				<li>
					<p>${co.userName}:</p>
					<p>${co.content}</p>
				</li>
			</ul>
		</c:forEach>
		<hr>
	</div>

	<div class="jiapinglun">
		<div class="neirong">
			<form action="addComment" method="post">
				<div>
					<textarea name="comments.content" class="textar"
						style="font-size:24px"></textarea>
					<input type="hidden" name="comments.userName" value="${logname} ">
				</div>
				<div class="mb2">
					<input id="register" class="act-but submit"
						style="border:none;cursor:pointer;color:#ffffff;width:1000px;"
						type="submit" name="save" value="发表 ">
				</div>
			</form>
		</div>
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
