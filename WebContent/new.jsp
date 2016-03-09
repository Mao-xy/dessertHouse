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

<title>会员注册</title>
</head>
<body>
	<div class="container">
		<form action="member/register" class="form-horizontal" role="form" id="form-register">
			<h1>Register Form</h1>
			<div class="form-group">
				<label for="username" class="control-label col-md-3 col-sm-3">用户名</label>
				<div class="col-sm-9">
					<input type="text" class="form-control" placeholder="用户名" required="required" id="username" name="username" />
				</div>
			</div>
			<div class="form-group">
				<label for="password" class="control-label col-md-3">密码</label>
				<div class="col-sm-9">
					<input type="password" class="form-control" placeholder="密码" required="required" id="password" name="password" />
				</div>
			</div>
			<div class="form-group">
				<label for="re-password" class="control-label col-md-3">确认密码</label>
				<div class="col-sm-9" id="for-repwd">
					<input type="password" class="form-control" placeholder="再次输入密码" required="required" id="re-password"/>
				</div>
			</div>
			<div class="form-group">
				<label class="control-label col-md-3">性别</label>
				<div class="col-sm-9">
					<label><input name="sex" class="form-control" type="radio" value="1" checked="checked"  />男 </label>
					<label><input name="sex" class="form-control" type="radio" value="0" />女 </label>
				</div>
			</div>
			<div class="form-group">
				<label for="phone" class="control-label col-md-3">手机号</label>
				<div class="col-sm-9">
					<input type="text" class="form-control" placeholder="手机号" id="phone" name="phone" required="required" />
				</div>
			</div>
			<div class="form-group">
				<label for="start1" class="control-label col-md-3">居住地</label>
				<div class="col-sm-9">
					<input name="address" id="start1" autocomplete="off" type="text" value="请选择/输入城市名称" class=
					"city_input  inputFocus proCityQueryAll proCitySelAll form-control" required="required" >
				</div>
			</div>
		    <!--弹出省省市-->
			<div class="provinceCityAll">
			  <div class="tabs clearfix">
			    <ul class="">
			      <li><a href="javascript:" class="current" tb="hotCityAll">热门城市</a></li>
			      <li><a href="javascript:" tb="provinceAll">省份</a></li>
			      <li><a href="javascript:" tb="cityAll" id="cityAll">城市</a></li>
			      <li><a href="javascript:" tb="countyAll" id="countyAll">区县</a></li>
			    </ul>
			  </div>
			  <div class="con">
			    <div class="hotCityAll invis">
			      <div class="pre"><a></a></div>
			      <div class="list">
			        <ul>
			          <!--<li><a href="javascript:"  class="current">南京</a></li> -->
			        </ul>
			      </div>
			      <div class="next"><a class="can"></a></div>
			    </div>
			    <div class="provinceAll invis">
			      <div class="pre"><a></a></div>
			      <div class="list">
			        <ul>
			          <!-- <li><a href="javascript:"  class="current">江西省</a></li> -->
			        </ul>
			      </div>
			      <div class="next"><a class="can"></a></div>
			    </div>
			    <div class="cityAll invis">
			      <div class="pre"><a></a></div>
			      <div class="list">
			        <ul>
			          <!--<li><a href="javascript:"  class="current">南京</a></li> -->
			        </ul>
			      </div>
			      <div class="next"><a class="can"></a></div>
			    </div>
			    <div class="countyAll invis">
			      <div class="pre"><a></a></div>
			      <div class="list">
			        <ul>
			        </ul>
			      </div>
			      <div class="next"><a class="can"></a></div>
			    </div>
			  </div>
			</div>
			<div class="form-group">
		      <div class="col-sm-offset-3 col-sm-2">
		         <button type="submit" class="btn btn-primary" id="register" >注册</button>
		      </div>
		   </div>
		</form><!-- form -->
		<div class="alert alert-success">完成注册后请先前往“我的信息”，完善个人信息并激活账户。</div>
		<script src="js/jquery-1.6.2.min.js"></script>
		<script src="js/public.js"></script>
		
		<script>
	        $(function(){
	        	$("#re-password").change(function(){
	        		var pwd = $("#password").val();
	        		var re = $("#re-password").val();
	        		if(pwd!=re){
	        			$("#for-repwd").append("<div class='alert alert-danger' id='alert'>确认密码与密码不一致，请重新输入</div>");
	        		}
	        		else{
	        			$("#alert").remove();
	        		}
	        	});
	        });
	    </script>
	</div>
</body>
</html>