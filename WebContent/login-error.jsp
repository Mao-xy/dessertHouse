<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<!-- 引入 Bootstrap -->
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
 <!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="bootstrap/js/jquery-1.11.3.min.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="bootstrap/js/bootstrap.min.js"></script>

<!-- 引入自定义css文件 -->
<link rel="stylesheet" type="text/css" href="css/common.css" />
<link rel="stylesheet" type="text/css" href="css/login.css" />

<title>登录失败</title>
</head>
<body>
<div class="container">
	<section id="content">
	<form>
		<h1>Login Error</h1>
		<div id="prompt">
			<h3><span class="glyphicon glyphicon-remove"></span>
			用户id或密码错误，请重新登陆</h3>
		</div>
		<div id="newLink">
			<a href="/login.jsp">点击这里回到登录界面</a>，或<a href="/register.jsp">注册新的会员账户。</a>
		</div>	
	</form>
	</section><!-- content -->
	<script>
		$(function(){
			
		});
	</script>
</div><!-- container -->
</body>
</html>