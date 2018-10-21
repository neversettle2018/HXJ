<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>商品列表</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<link rel="stylesheet" type="text/css" href="css/common.css" />
<link rel="stylesheet" type="text/css" href="css/main.css" />
<script type="text/javascript" src="js/libs/modernizr.min.js"></script>

</head>

<body>
	<div class="main-wrap">
		<div class="result-wrap">
			<div class="result-content">
					<table class="insert-tab" width="100%">
						<tbody>
							<tr>
							  <th>商品Id</th>
							  <th>商品图片</th>
							  <th>商品名称</th>
							  <th>商品价格</th>
							  <th>商品分类</th>
							  <th>操作</th>
							</tr>
							<c:forEach var="g" items="${Goods}">
							<form action="" method="post" id="myform" name="myform">
							<tr title="">
								<td>${g.id}</td>
								<td><img src="../img/${g.trousersId}" alt="商品图片" width="40" height="40" ></td>
								<td>${g.goodsName}</td>
								<td>${g.price}</td>
								<td>${g.category.categoryName}</td>
								<td>
								  <a href="showGoodsSingle?goodsId=${g.id}">管理</a>
								  &nbsp;&nbsp;&nbsp;
								  <a href="delGoods?goodsId=${g.id}" onclick="return confirm('确定要下架该商品？')">下架</a>
								</td>
							</tr>
							</form>
							</c:forEach>
						</tbody>
					</table>
			</div>
		</div>

	</div>
	<script type="text/javascript">
		//调整高度使浏览器产生滚动条
		parent.document.getElementById("i").height = 0;
		parent.document.getElementById("i").height = document.body.scrollHeight;
	</script>
</body>
</html>
