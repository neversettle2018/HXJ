<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
  	<link rel="shortcut icon" href="logoicon.ico"/>
	<link rel="bookmark" href="logoicon.ico"/>
	
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
					<form action="register" name="f" method="post">
						<div class="ipt">
							<div class="input_outer">
								<span class="u_user"></span> <input name="users.userName"
									id="username" class="text" style="color: #FFFFFF !important"
									type="text" placeholder="请输入账户">
							</div>
							<span id="showResult"></span>
						</div>

						<div class="ipt">
							<div class="input_outer">
								<span class="us_uer"></span> <input name="users.userPassword"
									id="password1" class="text"
									style="color: #FFFFFF !important; position:absolute; z-index:100;"
									value="" type="password" placeholder="请输入密码">
							</div>
							<span id="showResult2"></span>
						</div>

						<div class="ipt">
							<div class="input_outer">
								<span class="us_uer"></span> <input name="password2"
									id="password2" class="text"
									style="color: #FFFFFF !important; position:absolute; z-index:100;"
									value="" type="password" placeholder="请确定密码">
							</div>
							<span id="showResult3"></span>
						</div>

						<div class="ipt">
							<div class="input_outer">
								<span class="qq_uer"></span> <input name="users.userPhone"
									id="phone" class="text"
									style="color: #FFFFFF !important; position:absolute; z-index:100;"
									value="" type="text" maxlength="11" placeholder="请输入手机号码">
							</div>
							<span id="showResult4"></span>
						</div>

						<div class="mb2">
							<input id="register" class="act-but submit"
								style="border:none;cursor:pointer;color:#ffffff;width:330px;"
								type="submit" name="save" value="同意协议并注册 ">
						</div>
						<a href="login.jsp" style=" margin-left: 150px; color: white;">已有账号？马上登录</a>
					</form>
				</div>
			</div>
		</div>
	</div>
	<script src="${pageContext.request.contextPath}/js/TweenLite.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/EasePack.min.js"></script>
	<script src="${pageContext.request.contextPath}/js/rAF.js"></script>
	<script src="${pageContext.request.contextPath}/js/demo-1.js"></script>
	<script src="${pageContext.request.contextPath}/js/verification.js"></script>
	<script
		src="${pageContext.request.contextPath}/jquery-3.3.1/jquery-3.3.1.js"></script>
	<script type="text/javascript">
		$(function() {
			var flag1 = false;
			var flag2 = false;
			var flag3 = false;
			$("#username").blur(function() {
				ver();
			});
			$("#password1").blur(function() {
				verpas();
			});
	
			$("#password2").focus(function() {
				$("#showResult3").html("");
			}).blur(function() {
				verpas();
			});
			$("#phone").blur(function() {
				verphone();
			});
			$('.submit').click(function() {
				if (flag1 && flag2 && flag3) {
					$('form').submit();
					alert("欢迎注册");
				} else {
					alert("请检查信息");
					return false;
				}
			});
			function ver() {
				var username = $.trim($("#username").val());
				var url = "${pageContext.request.contextPath}/checkusername";
				var t = {
					"users.userName" : username,
					"time" : new Date()
				};
				$.post(url, t, function(data) {
					if (data == "用户名可用") {
						$("#showResult").html(data);
						flag1 = true;
					} else {
						$("#showResult").html(data);
						flag1 = false;
					}
				});
			}
			function verpas() {
				var userPassword1 = $.trim($("#password1").val());
				var userPassword2 = $.trim($("#password2").val());
				if(userPassword1!="" && userPassword2!=""){
				if (userPassword1 != userPassword2) {
					$("#showResult3").html("<font color='red'>您两次输入密码不一致，请重新输入</font>");
					flag2 = false;
				} else {
					$("#showResult3").html("");
					flag2 = true;
				}
				}else{
					$("#showResult3").html("<font color='red'>密码不能为空</font>");
				}
			}
			function verphone() {
				var phone = $.trim($("#phone").val());
				if (phone == "") {
					$("#showResult4").html("<font color='red'>手机号码不能为空</font>");
					flag3 = false;
				} else if (!$("#phone").val().match(/^1[34578]\d{9}$/)) {
					$("#showResult4").html("<font color='red'>您输入的手机格式错误，请重新输入</font>");
					flag3 = false;
				} else {
					$("#showResult4").html("");
					flag3 = true;
				}
			}
		});
	</script>
</body>
</html>
