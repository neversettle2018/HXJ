<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" href="logoicon.ico" />
<link rel="bookmark" href="logoicon.ico" />
<title>ToolingStandard-后台页面</title>
<link rel="stylesheet" type="text/css" href="../css/normalize.css" />
<link rel="stylesheet" type="text/css" href="../css/demo.css" />
<!--必要样式-->
<link rel="stylesheet" type="text/css" href="../css/component.css" />
</head>
<body>
	<div class="container demo-1">
		<div class="content">
			<div id="large-header" class="large-header">
				<canvas id="demo-canvas"></canvas>
				<div class="logo_box">
					<h3>Tooling Standard 管理员登录</h3>
					<form action="adminlogin" name="f" method="post" >
						<div class="input_outer">
							<span class="u_user"></span> <input name="adminlogname" class="text"
								style="color: #FFFFFF !important" type="text"
								placeholder="请输入账户">
						</div>
						<div class="input_outer">
							<span class="us_uer"></span> <input name="adminlogpass" class="text"
								style="color: #FFFFFF !important; position:absolute; z-index:100;"
								value="" type="password" placeholder="请输入密码">
						</div>
						<div class="mb2">
							<input id="my_button" class="act-but submit"
								style="border:none;cursor:pointer;color: #FFFFFF;width:330px"
								type="submit" name="save" value="登录 ">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- /container -->
	<script src="../js/TweenLite.min.js"></script>
	<script src="../js/EasePack.min.js"></script>
	<script src="../js/rAF.js"></script>
	<script src="../js/demo-1.js"></script>
</body>
</html>
