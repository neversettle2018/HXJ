<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>ToolingStandard-后台管理</title>

  </head>
   
  <body>
  	<div style="position:absolute;top: 0px;width: 100%;">
    <iframe name="top" src="top" scrolling="no" height="50" width="100%" frameborder="0"></iframe>
    </div>
    <div style="position:absolute;left:0px;top:50px;">
    <iframe name="left" src="left.jsp" scrolling="no" height="770" width="190px" frameborder="0"></iframe>
	</div>
    <iframe id="i" name="right" src="indexinner.jsp" scrolling="no" height="100%" width="100%" frameborder="0"></iframe>

	
    <script language='javascript'>
	history.go(1);  
	</script> 
  </body>
</html>
