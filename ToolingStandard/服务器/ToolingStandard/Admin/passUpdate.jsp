<%@ page language="java" import="java.util.*,Dao.*,entity.*,servlet.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>管理员修改密码</title>

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
				<form action="servlet/updateType" method="post" id="myform" name="myform">
					<table class="insert-tab" width="100%">
						<tbody>
							<tr>
								<th><i class="require-red">*</i>原密码：</th>
								<td>
									<input class="common-text required" name="oldpass" size="20" type="text">
								</td>
							</tr>
							<tr>
								<th><i class="require-red">*</i>新密码：</th>
								<td>
									<input class="common-text required" name="newpass" size="20" type="text">
								</td>
							</tr>
							<tr>
								<th><i class="require-red">*</i>新密码：</th>
								<td>
									<input class="common-text required" name="newpass2" size="20" type="text">
								</td>
							</tr>
							<tr>
								<th></th>
								<td>
									<input class="btn btn-primary btn6 mr10" value="修改" type="submit"> 
								</td>
							</tr>
						</tbody>
					</table>
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