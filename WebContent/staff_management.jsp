<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>店员管理</title>

<link href="<%=request.getContextPath() %>/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/staff/css/datepicker3.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/staff/css/bootstrap-table.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/staff/css/styles.css" rel="stylesheet">

<!--[if lt IE 9]>
<script src="<%=request.getContextPath() %>/staff/js/html5shiv.js"></script>
<script src="<%=request.getContextPath() %>/staff/js/respond.min.js"></script>
<![endif]-->

</head>

<body>
	<nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#sidebar-collapse">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"><span>Sakuraisan</span>Dessert</a>
				<ul class="user-menu">
					<li class="dropdown pull-right">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown"><span class="glyphicon glyphicon-user"></span> User <span class="caret"></span></a>
						<ul class="dropdown-menu" role="menu">
							<li><a href="<%=request.getContextPath() %>/logout/staff"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
						</ul>
					</li>
				</ul>
			</div>
							
		</div><!-- /.container-fluid -->
	</nav>
		
	<div id="sidebar-collapse" class="col-sm-3 col-lg-2 sidebar">
		<form role="search">
			<div class="form-group">
				<input type="text" class="form-control" placeholder="Search">
			</div>
		</form>
		<ul class="nav menu">
			<li><a href="<%=request.getContextPath() %>/direct/admin?type=shop"><span class="glyphicon glyphicon-th-list"></span> 店面管理</a></li>
			<li><a href="#"><span class="glyphicon glyphicon-leaf"></span> 职员管理</a></li>
		</ul>
		<div class="attribution">Made By <a href="#">Mao Xueying</a></div>
	</div><!--/.sidebar-->
			
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">			
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#"><span class="glyphicon glyphicon-home"></span></a></li>
				<li>系统管理员</li>
				<li class="active">职员管理</li>
			</ol>
		</div><!--/.row-->
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header"><%=session.getAttribute("staff_name") %>，你好</h1>
			</div>
		</div><!--/.row-->
		
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">职员列表</div>
					<div class="panel-body">
						<table data-toggle="table" data-url="<%=request.getContextPath() %>/staff/tables/data1.json"  data-show-refresh="true" data-show-toggle="true" data-show-columns="true" data-search="true" data-select-item-name="toolbar1" data-pagination="true" data-sort-name="name" data-sort-order="desc">
						    <thead>
						    <tr>
						        <th data-field="state" data-checkbox="true" >Item ID</th>
						        <th data-field="id" data-sortable="true">Item ID</th>
						        <th data-field="name"  data-sortable="true">Item Name</th>
						        <th data-field="price" data-sortable="true">Item Price</th>
						    </tr>
						    </thead>
						</table>
					</div>
				</div>
			</div>
		</div><!--/.row-->	
		
	</div><!--/.main-->

	<script src="<%=request.getContextPath() %>/staff/js/jquery-1.11.1.min.js"></script>
	<script src="<%=request.getContextPath() %>/staff/js/bootstrap.min.js"></script>
	<script src="<%=request.getContextPath() %>/staff/js/easypiechart.js"></script>
	<script src="<%=request.getContextPath() %>/staff/js/easypiechart-data.js"></script>
	<script src="<%=request.getContextPath() %>/staff/js/bootstrap-table.js"></script>
	<script>
		!function ($) {
			$(document).on("click","ul.nav li.parent > a > span.icon", function(){		  
				$(this).find('em:first').toggleClass("glyphicon-minus");	  
			}); 
			$(".sidebar span.icon").find('em:first').addClass("glyphicon-plus");
		}(window.jQuery);

		$(window).on('resize', function () {
		  if ($(window).width() > 768) $('#sidebar-collapse').collapse('show')
		})
		$(window).on('resize', function () {
		  if ($(window).width() <= 767) $('#sidebar-collapse').collapse('hide')
		})
	</script>	
</body>

</html>
