<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>总店服务员主页</title>

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
			<li><a href="#"><span class="glyphicon glyphicon-list-alt"></span> 产品计划</a></li>
			<li><a href="#"><span class="glyphicon glyphicon-list-alt"></span> 计划制定</a></li>
			<li><a href="#"><span class="glyphicon glyphicon-envelope"></span> 消息</a></li>
		</ul>
		<div class="attribution">Made By <a href="#">Mao Xueying</a></div>
	</div><!--/.sidebar-->
			
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">			
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#"><span class="glyphicon glyphicon-home"></span></a></li>
				<li class="active">总店服务员</li>
			</ol>
		</div><!--/.row-->
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header"><%=session.getAttribute("staff_name") %>，你好</h1>
			</div>
		</div><!--/.row-->
				
		<div class="row">
			<div class="col-lg-12">
				<h2>通知</h2>
				<div class="alert bg-success alert-dismissable" role="alert" id="alert">
					<button type="button" class="close" data-dismiss="alert" aria-hidden="true">
				      &times;
				   </button>
					<span class="glyphicon glyphicon-check"></span> 您制定的编号为003的产品计划已被批准。</span>  
				</div>
				<!-- 
				<div class="alert bg-warning" role="alert">
					<span class="glyphicon glyphicon-warning-sign"></span> 您制定的编号为005的产品计划未被批准，请及时修改。 <a href="#" class="pull-right"><span class="glyphicon glyphicon-remove"></span></a>
				</div>
				<div class="alert bg-danger" role="alert">
					<span class="glyphicon glyphicon-exclamation-sign"></span> 请尽快制定下周的产品计划。 <a href="#" class="pull-right"><span class="glyphicon glyphicon-remove"></span></a>
				</div>
				-->
			</div>
		</div><!--/.row-->
		
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">产品计划</div>
					<div class="panel-body">
						<div id="toolbar" class="btn-group">
				            <button id="btn_delete" type="button" class="btn btn-default">
				                <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
				            </button>
				        </div>
						<table id="plan-table">
						</table>
					</div>
				</div>
			</div>
		</div><!--/.row-->	
		
	</div><!--/.main-->

	<script src="<%=request.getContextPath() %>/staff/js/jquery-1.11.1.min.js"></script>
	<script src="<%=request.getContextPath() %>/staff/js/bootstrap.min.js"></script>
	<script src="<%=request.getContextPath() %>/staff/js/bootstrap-table.js"></script>
	<script src="<%=request.getContextPath() %>/js/mainserver.js"></script>
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
		$(function () {
 
		 //1.初始化Table
		 var oTable = new TableInit();
		 oTable.Init();
		 oTable.InitSubTable();
	 
	});
	 
	 
	var TableInit = function () {
		 var oTableInit = new Object();
		 //初始化Table
		 oTableInit.Init = function () {
		  $('#plan-table').bootstrapTable({
		   url: '<%=request.getContextPath() %>/mainserver/plan',   //请求后台的URL（*）
		   method: 'post',      //请求方式（*）
		   toolbar: '#toolbar',    //工具按钮用哪个容器
		   striped: true,      //是否显示行间隔色
		   cache: false,      //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
		   pagination: true,     //是否显示分页（*）
		   sortable: true,      //是否启用排序
		   sortOrder: "desc",     //排序方式
		   queryParams: {},//传递参数（*）
		   sidePagination: "client",   //分页方式：client客户端分页，server服务端分页（*）
		   pageNumber:1,      //初始化加载第一页，默认第一页
		   pageSize: 10,      //每页的记录行数（*）
		   pageList: [10, 25, 50, 100],  //可供选择的每页的行数（*）
		   search: true,      //是否显示表格搜索，此搜索是客户端搜索
		   strictSearch: false,
		   showColumns: true,     //是否显示所有的列
		   showRefresh: true,     //是否显示刷新按钮
		   minimumCountColumns: 2,    //最少允许的列数
		   clickToSelect: true,    //是否启用点击选中行
		   uniqueId: "plan_id",      //每一行的唯一标识，一般为主键列
		   showToggle:true,     //是否显示详细视图和列表视图的切换按钮
		   cardView: false,     //是否显示详细视图
		   detailView: true,     //是否显示父子表
		   columns: [{
			 checkbox: true 
		   },{
		    field: 'plan_id',
		    title: '计划编号',
		    align:	'center',
		    class: 'plan_id'
		   }, {
		    field: 'start_date',
		    title: '生效日期',
		    align:	'center',
		    class: 'start_date',
		    sortable: true,      //是否启用排序
		    sortOrder: "desc"     //排序方式
		   }, {
		    field: 'end_date',
		    title: '结束日期',
		    align:	'center',
		    class: 'end_date',
		    sortable: true,      //是否启用排序
		    sortOrder: "desc"     //排序方式
		   }, {
		    field: 'staff_id',
		    title: '制定人',
		    align:	'center',
		    class: 'staff_id'
		   }, {
		    field: 'operation_time',
		    title: '操作时间',
		    align:	'center',
		    class: 'operation_time',
		    sortable: true,      //是否启用排序
		    sortOrder: "desc"     //排序方式
		   },{
		    field: 'status',
		    title: '计划状态',
		    align:	'center',
		    class: 'status'
		   }
		  ],
		   onExpandRow: function (index, row, $detail) {
			   oTableInit.InitSubTable(index, row, $detail);
		   }
		  });
		 };
		 
		//初始化子表格
		oTableInit.InitSubTable = function (index, row, $detail) {
		  var parentid = row.plan_id;
		  var cur_table = $detail.html('<table></table>').find('table');
		  $(cur_table).bootstrapTable({
		    url: '<%=request.getContextPath() %>/mainserver/commodOfPlan',
		    method: 'get',
		    queryParams: { plan_id: parentid },
		    detailView: false,
		    uniqueId: "planlist_id",
		    pagination: true,     //是否显示分页（*）
		    pageSize: 10,
		    sidePagination: "client",   //分页方式：client客户端分页，server服务端分页（*）
			pageNumber:1,      //初始化加载第一页，默认第一页
			pageSize: 10,      //每页的记录行数（*）
		    columns: [{
		      field: 'plan_id',
		      title: '计划编号',
		      align: 'center'
		    }, {
		      field: 'commod_id',
		      title: '商品编号',
		      align: 'center'
		    }, {
		      field: 'commod_name',
		      title: '商品名称',
		      align: 'center',
		      editable: true,
              footerFormatter: nameFormatter
		    }, {
		      field: 'amount',
		      title: '数量',
		      align: 'center',
		      editable: {
                  type: 'text',
                  title: 'Item Amount',
                  validate: function (value) {
                      value = $.trim(value);
                      if (!value) {
                          return 'This field is required';
                      }
                      /* var data = $table.bootstrapTable('getData'),
                          index = $(this).parents('tr').data('index');
                      console.log(data[index]); */
                      return '';
                  }
              },
              footerFormatter: amountFormatter
		    }, {
		      field: 'price',
		      title: '单价',
		      align: 'center',
		      editable: {
                  type: 'text',
                  title: 'Item Price',
                  validate: function (value) {
                      value = $.trim(value);
                      if (!value) {
                          return 'This field is required';
                      }
                      /* var data = $table.bootstrapTable('getData'),
                          index = $(this).parents('tr').data('index');
                      console.log(data[index]); */
                      return '';
                  }
              },
              footerFormatter: priceFormatter
		    },{
	          field: 'operate',
			  title: 'Item Operate',
			  align: 'center',
			  events: operateEvents,
			  formatter: operateFormatter
		    }
		    ]
		  });
		};
		    
		 return oTableInit;
		};
		function operateFormatter(value, row, index) {
	        return [
	            '<a class="like" href="javascript:void(0)" title="Like">',
	            '<i class="glyphicon glyphicon-heart"></i>',
	            '</a>  ',
	            '<a class="remove" href="javascript:void(0)" title="Remove">',
	            '<i class="glyphicon glyphicon-remove"></i>',
	            '</a>'
	        ].join('');
	    }

	    window.operateEvents = {
	        'click .like': function (e, value, row, index) {
	            alert('You click like action, row: ' + JSON.stringify(row));
	        },
	        'click .remove': function (e, value, row, index) {
	        	alert("remove!");
	           /*  $table.bootstrapTable('remove', {
	                field: 'id',
	                values: [row.id]
	            }); */
	        }
	    };
	    function nameFormatter(data) {
	    	alert("nameFormatter:"+data);
	    	return 'Total';
	    }

	    function amountFormatter(data) {
	    	alert("amountFormatter:"+data);
	        return 'data';
	    }

	    function priceFormatter(data) {
	        alert("priceFormatter:"+data);
	    	/* var total = 0;
	        $.each(data, function (i, row) {
	            total += +(row.price.substring(1));
	        });
	        return '$' + total; */
	        return 0;
	    }
	</script>	
</body>

</html>
