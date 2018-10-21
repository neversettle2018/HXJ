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
							  <th>订单编号</th>
							  <th>用户Id</th>
							  <th>用户姓名</th>
							  <th>送货地址</th>
							  <th>送货手机</th>
							  <th>订单状态</th>
							  <th>操作</th>
							</tr>
							<c:forEach var="oi" items="${orderInfos}">
							<form action="" method="post" id="myform" name="myform">
							<tr title="">
								<td>${oi.orderNo}</td>
								<td>${oi.userId}</td>
								<td>${oi.orderUserName}</td>
								<td>${oi.address}</td>
								<td>${oi.phone}</td>
								<td>${oi.orderStatus}</td>
								<td>
								  <a href="Shipments?orderNo=${oi.orderNo}" onclick="return confirm('确认发货？')">发货</a>
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
