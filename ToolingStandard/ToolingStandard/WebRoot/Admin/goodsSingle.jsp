<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>修改商品</title>

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
				<form action="updateUpload" method="post" id="myform"
					name="myform" enctype="multipart/form-data">
					<div style="margin: 0 auto;">
						<input type="hidden" name="ware.id" value="${ware.id}">
						<input type="hidden" name="ware.trousersId" value="${ware.trousersId}">
						<span>商品名称</span><input name="ware.goodsName" type="text" value="${ware.goodsName}">
						<span>商品图片</span><img width="120" height="120" alt="商品图片" src="../img/${ware.trousersId}">
						<span>商品图片上传</span><input type="file" name="image"> 
						<span>商品价格</span><input name="ware.price" type="text" value="${ware.price}">
						<span>商品分类</span> 
						<select name="ware.category.categoryId">
							<c:forEach var="c" items="${Categorys}">
								<c:if test="${ware.category.categoryId==c.categoryId}">
									<option selected="selected" value="${c.categoryId}">${c.categoryName}</option>
								</c:if>
								<c:if test="${ware.category.categoryId!=c.categoryId}">
									<option value="${c.categoryId}">${c.categoryName}</option>
								</c:if>
							</c:forEach>
						</select>
						<input type="submit" value="修改">&nbsp;<input type="button" onclick="history.go(-1)" value="返回"></button>
						<%--<input type="text" value="${ware.category.categoryId}"> --%>
					</div>
				</form>
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
