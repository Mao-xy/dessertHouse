<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<!-- 引入 Bootstrap -->
<link href="<%=request.getContextPath() %>/bootstrap/css/bootstrap.css" rel="stylesheet">
 <!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="<%=request.getContextPath() %>/bootstrap/js/jquery-1.11.3.min.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="<%=request.getContextPath() %>/bootstrap/js/bootstrap.min.js"></script>

<!-- 引入自定义css文件 -->
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/common.css" />
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/login.css" />

<title>用户登录</title>
</head>
<body>
<div class="container">
	<section id="content">
		<form id="form-login">
			<h1>Login Form</h1>
			<div id="for-id">
				<input type="text" placeholder="UserId" required="" id="userid" name="userid" />
			</div>
			<div id="for-pwd">
				<input type="password" placeholder="Password" required="" id="password" name="password" />
			</div>
			<div>
				<input type="button" class="btn btn-primary" id="login" value="登 录" />
				<a href="register.jsp" id="register" style="font-size:15px;" >注 册</a>
			</div>
		</form><!-- form -->
	</section><!-- content -->
	<script>
		$(function(){
			$("#login").click(function(){
				var id = $("#userid").val();
				var password = $("#password").val();
				if(!isNaN(id)){
					if(id.length==7){
						$("#form-login").attr("action","<%=request.getContextPath() %>/login/member");
						$("#form-login").submit();
					}
					else{
						$("#userid").val("请输入正确的id");
						$("#userid")[0].focus();
					}
				}
				else{
					var prefix = id.substr(0,3);
					if((prefix=="ADM"||prefix=="MAN"||prefix=="MSR"||prefix=="SER")&&id.length==7){
						$("#form-login").attr("action","<%=request.getContextPath() %>/login/staff");
						$("#form-login").submit();
					}
					else{
						$("#userid").val("请输入正确的id");
						$("#userid")[0].focus();
					}
					
				}
			});
		});
	</script>
</div><!-- container -->
</body>
</html>