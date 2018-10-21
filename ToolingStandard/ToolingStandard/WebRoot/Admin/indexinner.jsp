<%@ page language="java" import="java.util.*,java.text.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>ToolingStandard-后台管理</title>
    
	<link rel="stylesheet" type="text/css" href="css/common.css"/>
    <link rel="stylesheet" type="text/css" href="css/main.css"/>
    <script type="text/javascript" src="js/modernizr.min.js"></script>

  </head>
  <body>
    <!--/sidebar-->
    <div class="main-wrap">
        <div class="result-wrap">
            <div class="result-title">
                <h1>快捷操作</h1>
            </div>
            <div class="result-content">
                <div class="short-wrap">
                    <a href="merchantaudit.jsp"><i class="icon-font">&#xe001;</i>审核商家发布</a>
                    <a href="listalluser.jsp"><i class="icon-font">&#xe005;</i>查看用户信息</a>
                    <a href="bannermanage.jsp"><i class="icon-font">&#xe048;</i>修改轮播信息</a>
                    <a href="indexinner.jsp"><i class="icon-font">&#xe041;</i>发现板块</a>
            	</div>
        	</div>
        	<div class="result-wrap">
            <div class="result-title">
                <h1>系统基本信息</h1>
            </div>
            <div class="result-content">
                <ul class="sys-info-list">
                    <li>
                        <label class="res-lab">本地IP</label><span class="res-info"></span>
                    </li>
                    <li>
                        <label class="res-lab">请求方式</label><span class="res-info"></span>
                    </li>
                    <li>
                        <label class="res-lab">上传附件限制</label><span class="res-info">3M</span>
                    </li>
                    <li>
                        <label class="res-lab">当前系统时间</label>
                        <span class="res-info" id="time"> 
	                        <script >
					        document.getElementById('time').innerHTML = new Date().toLocaleString('chinese',{hour12:false})
					                + ' 星期' + '日一二三四五六'.charAt(new Date().getDay());
					        setInterval(
					                "document.getElementById('time').innerHTML=new Date().toLocaleString('chinese',{hour12:false})+' 星期'+'日一二三四五六'.charAt(new Date().getDay());",
					                1000);
						    </script>
					    </span>
                    </li>
                    <li>
                        <label class="res-lab">服务器域名/IP</label><span class="res-info"></span>
                    </li>
                    <li>
                        <label class="res-lab">请求服务器的端口</label><span class="res-info"></span>
                    </li>
                </ul>
            </div>
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
