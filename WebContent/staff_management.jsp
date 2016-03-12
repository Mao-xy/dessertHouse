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
<!-- 引入datetimepicker css-->
<link href="<%=request.getContextPath() %>/bootstrap/css/bootstrap-datetimepicker.min.css" rel="stylesheet">

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
						<div id="toolbar" class="btn-group">
				            <button type="button" class="btn btn-default" data-toggle="modal" 
   data-target="#addModal">
				                <span class="glyphicon glyphicon-ok" aria-hidden="true"></span>增加
				            </button>
				            <button id="btn_delete" type="button" class="btn btn-default">
				                <span class="glyphicon glyphicon-remove" aria-hidden="true"></span>删除
				            </button>
					    </div>
						<table id="staff-table">
						</table>
					</div>
				</div>
			</div>
		</div><!--/.row-->	
		<!-- 模态框（Modal） -->
		<div class="modal fade" id="addModal" tabindex="-1" role="dialog" 
		   aria-labelledby="myModalLabel" aria-hidden="true">
		   <div class="modal-dialog">
		      <div class="modal-content">
		         <div class="modal-header">
		            <button type="button" class="close" 
		               data-dismiss="modal" aria-hidden="true">
		                  &times;
		            </button>
		            <h4 class="modal-title" id="myModalLabel">
		              添加员工
		            </h4>
		         </div>
		         <div class="modal-body">
		            <!-- form -->
		            <form class="form-horizontal" role="form">
					   <div class="form-group">
					      <label for="name" class="col-sm-2 control-label">姓名</label>
					      <div class="col-sm-10 input-group">
					         <input type="text" class="form-control" id="name" 
					            placeholder="Name" required="required">
					      </div>
					   </div>
					   <div class="form-group">
					      <label for="sex" class="col-sm-2 control-label">性别</label>
					      <div class="col-sm-10 input-group">
					         <input type="text" class="form-control" id="sex" 
					            placeholder="Sex" required="required">
					      </div>
					   </div>
					   <div class="form-group">
							<label for="birthday" class="control-label col-sm-2">出生日期</label>
							<div class="input-group date form_date col-sm-10" data-date="" data-date-format="yyyy-M-dd" data-link-field="birthday" data-link-format="yyyy-mm-dd">
								<input class="form-control" type="text" value="" readonly>
								<span class="input-group-addon">
									<span class="glyphicon glyphicon-remove"></span>
								</span>
								<span class="input-group-addon">
									<span class="glyphicon glyphicon-calendar"></span>
								</span>
							</div>
							<input type="hidden" id="birthday" name="birthday" value='' required="required"/>
					   </div>
					   <div class="form-group">
					      <label for="phone" class="col-sm-2 control-label">联系方式</label>
					      <div class="col-sm-10 input-group">
					      	 <span class="input-group-addon">025-</span>
					         <input type="text" class="form-control" id="phone" 
					            placeholder="Contact" required="required">
					      </div>
					   </div>
					   <div class="form-group">
					      <label for="card" class="col-sm-2 control-label">银行帐号</label>
					      <div class="col-sm-10 input-group">
					         <input type="text" class="form-control" id="card" 
					            placeholder="Account" required="required">
					      </div>
					   </div>
					   <div class="form-group">
					      <label for="shop" class="col-sm-2 control-label">所属店面</label>
					      <div class="col-sm-10 input-group">
					         <input type="text" class="form-control" id="shop" 
					            placeholder="Work In" required="required">
					      </div>
					   </div>
					   <div class="form-group">
					      <label for="salary" class="col-sm-2 control-label">月薪</label>
					      <div class="col-sm-10 input-group">
					         <input type="text" class="form-control" id="salary" 
					            placeholder="Salary" required="required">
					      </div>
					   </div>
					   <div class="form-group">
					      <label for="post" class="col-sm-2 control-label">职位</label>
					      <div class="col-sm-10 input-group">
					         <input type="text" class="form-control" id="post" 
					            placeholder="Post" required="post">
					      </div>
					   </div>
					   <div class="form-group">
							<label for="joining_time" class="control-label col-sm-2">入职时间</label>
							<div class="input-group date form_date col-sm-10" data-date="" data-date-format="yyyy-M-dd" data-link-field="joining_time" data-link-format="yyyy-mm-dd">
								<input class="form-control" type="text" value="" readonly>
								<span class="input-group-addon">
									<span class="glyphicon glyphicon-remove"></span>
								</span>
								<span class="input-group-addon">
									<span class="glyphicon glyphicon-calendar"></span>
								</span>
							</div>
							<input type="hidden" id="joining_time" name="joining_time" value='' required="required"/>
					   </div>
					</form>
		            <!-- form ends -->
		         </div>
		         <div class="modal-footer">
		            <button type="button" class="btn btn-default" 
		               data-dismiss="modal">关闭
		            </button>
		            <button type="button" class="btn btn-primary" id="btn-add">
		               确认
		            </button>
		         </div>
		      </div><!-- /.modal-content -->
		</div><!-- /.modal -->
		
	</div><!--/.main-->

	<script src="<%=request.getContextPath() %>/staff/js/jquery-1.11.1.min.js"></script>
	<script src="<%=request.getContextPath() %>/staff/js/bootstrap.min.js"></script>
	<script src="<%=request.getContextPath() %>/staff/js/bootstrap-table.js"></script>
	<script src="<%=request.getContextPath() %>/staff/js/bootstrap-table-editable.js"></script>
	<script src="http://rawgit.com/vitalets/x-editable/master/dist/bootstrap3-editable/js/bootstrap-editable.js"></script>
	<!-- 引入datetimepicker js -->
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/bootstrap-datetimepicker.min.js" charset="UTF-8"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/js/bootstrap-datetimepicker.zh-CN.js" charset="UTF-8"></script>
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
			
			$("#btn-add").click(function(){
				var name=$("#name").val();
				var sex= $("#sex").val();
				var birthday= $("#birthday").val();
				var phone= $("#phone").val();
				var card= $("#card").val();
				var shop_id=$("#shop_id").val();
				var salary=$("#salary").val();
				var post=$("#post").val();
				var joining_time=$("#joining_time").val();
				
				if((name=='')||(sex=='')||(birthday='')||(phone='')||(card='')||(shop_id=='')
						||(salary=='')||(post=='')||(joining_time=='')){
					alert("请填写完整信息");
					return false;
				}
				$.ajax({
    				url :'<%=request.getContextPath() %>/admin/addStaff',	 	
    				type:'get', 	
    				dataType:'json', 													
    				data:{
    					name:name,
    					sex:sex,
    					birthday:birthday,
    					phone:phone,
    					card:card,
    					shop_id:shop_id,
    					salary:salary,
    					post:post,
    					joining_time:joining_time
    				},													
    				success:function(data, textStatus){
    					$('#addModal').modal('hide');
    					alert("操作已成功!");
    					$("#staff-table").bootstrapTable('refresh',{silent: true} );
    				} 
    			});
			 });
	    	 $("#btn-delete").click(function(){
	    		var id = getIdSelections();
	    		if(id==""){
	    			alert("请选择要删除的店面。");
	    		}
	    		else{
	    			var str = '';
	    			for(var i=0;i<id.length;i++){
	    				str = str + id[i].toString()+'+';
	    			}
	    			<%-- $.ajax({
	    				url :'<%=request.getContextPath() %>/admin/removeShop',	 	
	    				type:'get', 	
	    				dataType:'json', 													
	    				data:{
	    					id: str
	    				},													
	    				success:function(data, textStatus){
	    					alert("操作已成功!");
	    					$("#shop-table").bootstrapTable('refresh',{silent: true} );
	    				} 
	    			}); --%>
	    		}
	    	});
	    	 
	    	 $("input").blur(function(){
	    		  if($(this).val()==''){
	    			  $(this).parents(".form-group").addClass("has-error");
		    		  $(this).attr('placeholder','此字段不可为空');
	    		  }else{
	    			  $(this).parents(".form-group").removeClass("has-error");
	    		  }
	    	 });
	    	 
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
	    	 
		});
 
		var TableInit = function () {
			 var oTableInit = new Object();
			 //初始化Table
			 oTableInit.Init = function () {
			  $('#staff-table').bootstrapTable({
			   url: '<%=request.getContextPath() %>/admin/allStaff',   //请求后台的URL（*）
			   method: 'get',      //请求方式（*）
			   toolbar: '#toolbar',    //工具按钮用哪个容器
			   striped: true,      //是否显示行间隔色
			   cache: false,      //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
			   pagination: true,     //是否显示分页（*）
			   sortable: true,      //是否启用排序
			   sortOrder: "desc",     //排序方式
			   queryParams: {},//传递参数（*）,0表示未审批，详见Configure
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
			   uniqueId: "id",      //每一行的唯一标识，一般为主键列
			   showToggle:true,     //是否显示详细视图和列表视图的切换按钮
			   cardView: false,     //是否显示详细视图
			   detailView: false,     //是否显示父子表
			   editable: true,
			   onEditableSave: function (field, row, oldValue, $el) {
					var id = row.shop_id;
					var value = '';
					if($.trim(field)=='name'){
						value = row.name;
					}else if($.trim(field)=='phone'){
						value = row.owner;
					}else if($.trim(field)=='card'){
						value = row.phone;
					}else if($.trim(field)=='shop_name'){
						value = row.phone;
					}else if($.trim(field)=='salary'){
						value = row.phone;
					}else if($.trim(field)=='postInString'){
						value = row.phone;
					}
					$.ajax({
						url: '<%=request.getContextPath() %>/admin/modifyStaff',	 	
						type:'get', 	
						dataType:'json', 													
						data:{
							id: id,
							field:field,
							value: value
						},
						error:function(){
							alert("error");
						}
					}); 
			      	return true;
		       },
			   columns: [{
				 checkbox: true 
			   },{
			      field: 'staff_id',
			      title: '职工编号',
			      align: 'center'
			    }, {
			      field: 'name',
			      title: '姓名',
			      align: 'center',
			      editable: {
	                  type: 'text',
	                  title: 'Staff Name',
	                  validate: function (value) {
	                      value = $.trim(value);
	                      if (!value) {
	                          return 'This field is required';
	                      }
	                  }
	             },
			    },{
			      field: 'sexInString',
			      title: '性别',
			      align: 'center',
			    }, {
			      field: 'phone',
			      title: '联系方式',
			      align: 'center',
			      editable: {
	                  type: 'text',
	                  title: 'Contact',
	                  validate: function (value) {
	                      value = $.trim(value);
	                      if (!value) {
	                          return 'This field is required';
	                      }
	                  }
	             },
			    },{
			      field: 'birthday',
			      title: '出生日期',
			      align: 'center'
			    },{
			      field: 'card',
			      title: '银行账号',
			      align: 'center',
			      editable: {
	                  type: 'text',
	                  title: 'Account',
	                  validate: function (value) {
	                      value = $.trim(value);
	                      if (!value) {
	                          return 'This field is required';
	                      }
	                  }
	             },
			    },{
			      field: 'shop_name',
			      title: '所属店面',
			      align: 'center',
			      editable: {
	                  type: 'text',
	                  title: 'Work In',
	                  validate: function (value) {
	                      value = $.trim(value);
	                      if (!value) {
	                          return 'This field is required';
	                      }
	                  }
	             },
			    },{
			      field: 'salary',
			      title: '月薪',
			      align: 'center',
			      editable: {
	                  type: 'text',
	                  title: 'Salary',
	                  validate: function (value) {
	                      value = $.trim(value);
	                      if (!value) {
	                          return 'This field is required';
	                      }
	                  }
	             },
			    },{
			      field: 'postInString',
			      title: '职位',
			      align: 'center',
			      editable: {
	                  type: 'text',
	                  title: 'Post',
	                  validate: function (value) {
	                      value = $.trim(value);
	                      if (!value) {
	                          return 'This field is required';
	                      }
	                  }
	             },
		         },{
			      field: 'joining_time',
			      title: '入职时间',
			      align: 'center'
		         },{
			        field: 'operate',
				    title: '操作',
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
		            '<a class="remove" href="javascript:void(0)" title="Remove">',
		            '<i class="glyphicon glyphicon-remove"></i>',
		            '</a>'
		        ].join('');
		    }
		
		    window.operateEvents = {
		        'click .remove': function (e, value, row, index) {
		        	$.ajax({
	    				url: '<%=request.getContextPath() %>/admin/modifyStaff',	 	
	    				type:'get', 	
	    				dataType:'json', 													
	    				data:{
	    					id: row.shop_id
	    				},													
	    				success:function(data, textStatus){
	    					alert("操作已成功!");
	    					$("#shop-table").bootstrapTable('refresh',{silent: true} );
	    				} 
	    			});
		        }
		    };
		    
		    function getIdSelections() {
	    	    return $.map($("#staff-table").bootstrapTable('getSelections'), function (row) {
	    	    	return row.staff_id;
	    	 	});
	    	}
	</script>	
</body>

</html>
