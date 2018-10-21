<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>商品上架</title>

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
				<form action="upload" method="post" id="myform"
					name="myform" enctype="multipart/form-data">
					<div style="margin: 0 auto;">
						<span>商品名称</span><input type="text" name="ware.goodsName">
						<span>商品价格</span><input type="text" name="ware.price">
						<span>商品分类</span> 
						<select name="ware.category.categoryId">
							<c:forEach var="c" items="${Categorys}">
									<option value="${c.categoryId}">${c.categoryName}</option>
							</c:forEach>
						</select>
						<span>商品预览图</span><input type="file" name="image"> 
						<input type="submit" value="上架商品">
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
