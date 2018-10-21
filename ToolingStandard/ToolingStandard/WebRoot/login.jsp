<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<link rel="shortcut icon" href="logoicon.ico" />
<link rel="bookmark" href="logoicon.ico" />

<title>ToolingStandard</title>

<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<link rel="stylesheet" type="text/css" href="css/component.css" />

</head>
<body>
	<div class="container demo-1">
		<div class="content">
			<div id="large-header" class="large-header">
				<canvas id="demo-canvas"></canvas>
				<div class="logo_box">
					<h3>Tooling Standard 欢迎您</h3>
					<form action="login" name="f" method="post">

						<div class="ipt">
							<div class="input_outer">
								<span class="u_user"></span> <input name="logname" class="text"
									id="username" style="color: #FFFFFF !important" type="text"
									placeholder="请输入账户">
							</div>
							<span id="showResult"></span>
						</div>


						<div class="ipt">
							<div class="input_outer">
								<span class="us_uer"></span> <input name="logpass" class="text"
									id="password"
									style="color: #FFFFFF !important; position:absolute; z-index:100;"
									value="" type="password" placeholder="请输入密码">
							</div>
							<span id="showResult5"></span>
						</div>


						<div class="mb2">
							<input id="my_button" class="act-but submit"
								style="border:none;cursor:pointer;color: #FFFFFF;width:330px"
								type="submit" name="save" value="登录 ">
						</div>
						<a href="register.jsp" style=" margin-left: 150px; color: white;">还没有账号？马上注册</a>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- /container -->
	<script src="${pageContext.request.contextPath}/js/TweenLite.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/EasePack.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/rAF.js"></script>
	<script src="${pageContext.request.contextPath}/js/demo-1.js"></script>
	<script
		src="${pageContext.request.contextPath}/jquery-3.3.1/jquery-3.3.1.js"></script>
	<script type="text/javascript">
		$(function() {
			var flag1 = false;
	
			$("#username").focus(function() {
				$("#showResult5").html("");
			}).blur(function() {
				vernull();
			});
			$("#password").focus(function() {
				$("#showResult5").html("");
			}).blur(function() {
				vernull();
			});
			$('.submit').click(function() {
				if (flag1) {
					$('.submit').submit();
				} else {
					alert("请检查信息");
					return false;
				}
			});
			function vernull() {
				var username = $.trim($("#username").val());
				var password = $.trim($("#password").val());
				if (username != "" && password != "") {
					flag1 = true;
				} else {
					$("#showResult5").html("<font color='red'>用户名或密码不能为空</font>");
					flag1 = false;
				}
			}
		});
	</script>
</body>
</html>
