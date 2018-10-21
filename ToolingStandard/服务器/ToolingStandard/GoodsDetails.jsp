<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>工装裤</title>
<link rel="stylesheet" type="text/css" href="css/Ys.css">
<link rel="stylesheet" type="text/css" href="css/component.css">
<script type="text/javascript" language="javascript" src="jquery-3.3.1/jquery-3.3.1.min.js" ></script>
<script type="text/javascript" language="javascript">
	 $(function(){
         $(".addcar").click(function(){
            var list= $('input:radio[name="goods.goodsSize"]:checked').val();
            if(list==null){
                alert("请选中一个码数!");
                return false;
            }          
         });
     });
</script>
<style type="text/css">
	 *{border:none;margin:0px;padding:0px;}
</style>
<script type="text/javascript">
	function opera(x, y) {
		var rs = new Number(document.getElementById(x).value);
		
		if (y) {
			if(rs<100){
				document.getElementById(x).value = rs + 1;
			}
		} else if( rs >1) {
			document.getElementById(x).value = rs - 1;
		}
		
	}
</script> 
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
	<h2>商品详情</h2>
	<div class="contentbanner">

		<div class="contentbanner1">
		<form action="addGoods">
			<input name="goods.goodsId" type="hidden" value="${gid}">
			<input name="goods.userId" type="hidden" value="${param.userId}">
			<input name="goods.imageUrl" type="hidden" value="${shangping.trousersId}">
			<input name="goods.goodsPrice" type="hidden" value="${shangping.price}">
			<input name="goods.goodsName" type="hidden" value="${shangping.goodsName}">
			
			<img class="goodscimg" alt="商品图片" src="img/${shangping.trousersId}" width="400" height="400">
			<div class="goodscontent">
				<dl>
					<dt>${shangping.goodsName}</dt>
					<dd id="g_money">￥${shangping.price}元</dd>
					<dd class="mui-numbox">
						<button class="minus" type="button" onclick="opera('val', false);">-</button>
						<input class="numbox" name="num" id="val" type="number" min="1" max="100" value="1">
						<button class="minus plus" type="button" onclick="opera('val', true);">+</button>
					</dd>
					<c:forEach var="s" items="${stocks}">
						<dd>
							<input id="${s.size}" type="radio" name="goods.goodsSize" value="${s.size}">
							<label for="${s.size}"></label>
							<span>${s.size}&nbsp;(库存:${s.sizeNum})</span>
						</dd>
					</c:forEach>
					<dd><input id="btnSubmit" class="addcar" type="submit" value="加入购物车"></dd>
				</dl>
			</div>
		</form>
		</div>
	</div>

	<h3>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;评论:</h3>

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
					<textarea name="comments.content"  class="textar"
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
