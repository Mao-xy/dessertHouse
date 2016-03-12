<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">

<!-- 引入datetimepicker css-->
<link href="bootstrap/css/bootstrap-datetimepicker.min.css" rel="stylesheet">

<!-- 引入 Bootstrap -->
<link href="bootstrap/css/bootstrap.css" rel="stylesheet">
 <!-- jQuery (Bootstrap 的 JavaScript 插件需要引入 jQuery) -->
<script src="bootstrap/js/jquery-1.11.3.min.js"></script>
<!-- 包括所有已编译的插件 -->
<script src="bootstrap/js/bootstrap.min.js"></script>

<link href="css/cityLayout.css" type="text/css" rel="stylesheet">

<!-- 引入自定义css文件 -->
<link rel="stylesheet" type="text/css" href="css/common.css" />
<link rel="stylesheet" type="text/css" href="css/register.css" />
<title>会员注册</title>
</head>
<body>
	<div class="container">
		<section id="content">
			<form action="/member/register" class="form-horizontal" role="form" id="form-register">
				<h1>Register Form</h1>
				<div class="form-group">
					<label for="username" class="control-label col-md-3 col-sm-3">用户名</label>
					<div class="col-sm-9">
						<input type="text" class="form-control" placeholder="用户名" required="" id="username" name="username" />
					</div>
				</div>
				<div class="form-group">
					<label for="password" class="control-label col-md-3">密码</label>
					<div class="col-sm-9">
						<input type="password" class="form-control" placeholder="密码" required="" id="password" name="password" />
					</div>
				</div>
				<div class="form-group">
					<label for="re-password" class="control-label col-md-3">确认密码</label>
					<div class="col-sm-9">
						<input type="password" class="form-control" placeholder="再次输入密码" required="" id="re-password" name="re-password" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-md-3">性别</label>
					<div class="col-sm-9">
						<label><input name="sex" class="form-control" type="radio" value="" checked />男 </label>
						<label><input name="sex" class="form-control" type="radio" value="" />女 </label>
					</div>
				</div>
				<div class="form-group">
					<label for="phone" class="control-label col-md-3">手机号</label>
					<div class="col-sm-9">
						<input type="text" class="form-control" placeholder="手机号" id="phone" name="phone" />
					</div>
				</div>
				<div class="form-group">
					<label for="card" class="control-label col-md-3">银行卡号</label>
					<div class="col-sm-9">
						<input type="text" class="form-control" placeholder="银行卡账号" id="card" name="card" />
					</div>
				</div>
			    <div class="form-group input-area">
					<label for="birthday" class="control-label col-md-3">出生日期</label>
					<div class="input-group date form_date col-md-9" data-date="" data-date-format="yyyy-M-dd" data-link-field="birthday" data-link-format="yyyy-mm-dd">
						<input class="form-control" size="12" type="text" value="" readonly>
						<span class="input-group-addon">
							<span class="glyphicon glyphicon-remove"></span>
						</span>
						<span class="input-group-addon">
							<span class="glyphicon glyphicon-calendar"></span>
						</span>
					</div>
					<input type="hidden" id="birthday" name="birthday" value="null" />
				</div>
				<div class="form-group">
			      <div class="col-sm-offset-3 col-sm-2">
			         <button type="button" class="btn btn-primary" id="register" >注册</button>
			      </div>
			   </div>
			</form><!-- form -->
		</section><!-- content -->
	</div><!-- container -->
	<!-- 引入datetimepicker js -->
	<script type="text/javascript" src="js/bootstrap-datetimepicker.min.js" charset="UTF-8"></script>
	<script type="text/javascript" src="js/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
	<script src="js/public.js"></script>
	
	<script>
        $('.form_date').datetimepicker({
	        language:  'zh-CN',
	        weekStart: 1,
	        todayBtn:  1,
	        autoclose: 1,
	        todayHighlight: 1,
	        startView: 2,
	        minView: 2,
	        forceParse: 0
    	});
        $(function(){
        	$("#register").click(function(){
        		alert("inconsistent");
        		var pwd = $("#password").val();
        		var re = $("#re-password").val();
        		if(pwd==re){
        			$("#form-register").submit();
        		}
        		else{
        			$("#form-register").append("<div class='alert alert-danger'>确认密码与密码不一致，请重新输入</div>");
        		}
        	});
        });
    </script>
</body>
</html>