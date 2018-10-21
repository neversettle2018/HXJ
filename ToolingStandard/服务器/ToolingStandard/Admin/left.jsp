<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<title>ToolingStandard-后台管理</title>
    <link rel="stylesheet" type="text/css" href="css/common.css"/>
    <link rel="stylesheet" type="text/css" href="css/main.css"/>
    <script type="text/javascript" src="js/modernizr.min.js"></script>
  </head>
  
  <body>
    <div class="container clearfix">
    <div class="sidebar-wrap">
        <div class="sidebar-title">
            <h1>菜单</h1>
        </div>
        <div class="sidebar-content">
            <ul class="sidebar-list">
                <li>
                    <span><i class="icon-font">&#xe003;</i>商品管理</span>
                    <ul class="sub-menu">
                        <li><a href="addgoods" target="right"><i class="icon-font">&#xe008;</i>商品上架</a></li>
                        <li><a href="showAllGoods" target="right"><i class="icon-font">&#xe006;</i>商品下架与修改</a></li>
                        <%--
                        <li><a href="indexinner.jsp" target="right"><i class="icon-font">&#xe012;</i>XXXX</a></li>
                        <li><a href="bannermanage.jsp" target="right"><i class="icon-font">&#xe033;</i>XXXX</a></li>
                        --%>
                    </ul>
                </li>
                 <li>
                    <span><i class="icon-font">&#xe018;</i>订单管理</span>
                    <ul class="sub-menu">
                        <li><a href="showOrderInfo" target="right"><i class="icon-font">&#xe017;</i>订单状态修改</a></li>
                        <%-- 
                        <li><a href="indexinner.jsp" target="right"><i class="icon-font">&#xe046;</i>XXXX</a></li>
                        <li><a href="indexinner.jsp" target="right"><i class="icon-font">&#xe004;</i>XXXX</a></li>
                        <li><a href="indexinner.jsp" target="right"><i class="icon-font">&#xe005;</i>XXXX</a></li>
                    	--%>
                    </ul>
                </li>
                <%--
                <li>
                    <span><i class="icon-font">&#xe018;</i>XX管理</span>
                    <ul class="sub-menu">
                        <li><a href="listallmerchant.jsp" target="right"><i class="icon-font">&#xe017;</i>XXXX</a></li>
                        <li><a href="indexinner.jsp" target="right"><i class="icon-font">&#xe046;</i>XXXX</a></li>
                    </ul>
                </li>
                --%>
            </ul>
        </div>
    </div>
    
    
    <!--/main-->
 </div >
  </body>
</html>
