<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page language="java" import="java.util.*" %>
<%@ page language="java" import="desserthouse.VO.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>甜品预定</title>

<link href="<%=request.getContextPath() %>/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/staff/css/bootstrap-table.css" rel="stylesheet">
<link href="<%=request.getContextPath() %>/staff/css/styles.css" rel="stylesheet">

<!--[if lt IE 9]>
<script src="<%=request.getContextPath() %>/staff/js/html5shiv.js"></script>
<script src="<%=request.getContextPath() %>/staff/js/respond.min.js"></script>
<![endif]-->
<style>
#date-select{
	height:50px;
	width:200px;
	margin-left:30px;
}
#alert{
	height:50px;
	width:auto;
}
</style>
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
							<li><a href="<%=request.getContextPath() %>/logout/member"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
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
			<li class="parent ">
				<a href="#">
					<span class="glyphicon glyphicon-list"></span> 甜品预定 <span data-toggle="collapse" href="#sub-item-1" class="icon pull-right"><em class="glyphicon glyphicon-s glyphicon-plus"></em></span> 
					<input type="hidden" id="shop" value="<% ShopVO shop = (ShopVO)session.getAttribute("shop");out.print(shop.getShop_id()); %>"/>
				</a>
				<ul class="children collapse" id="sub-item-1">
					<li>
						<a class="" href="#">
							<span class="glyphicon glyphicon-share-alt"></span> 总店
						</a>
					</li>
					<li>
						<a class="" href="#">
							<span class="glyphicon glyphicon-share-alt"></span> 分店一
						</a>
					</li>
					<li>
						<a class="" href="#">
							<span class="glyphicon glyphicon-share-alt"></span> 分店二
						</a>
					</li>
				</ul>
			</li>
			<li><a href="#"><span class="glyphicon glyphicon-stats"></span> 消费记录查看</a></li>
			<li role="presentation" class="divider"></li>
			<li><a href="<%=request.getContextPath() %>/memberHome.jsp"><span class="glyphicon glyphicon-home"></span> 首页</a></li>
		</ul>
		<div class="attribution">Made By <a href="#">Mao Xueying</a></div>
	</div><!--/.sidebar-->
			
	<div class="col-sm-9 col-sm-offset-3 col-lg-10 col-lg-offset-2 main">			
		<div class="row">
			<ol class="breadcrumb">
				<li><a href="#"><span class="glyphicon glyphicon-home"></span></a></li>
				<li>会员</li>
				<li class="active">甜品预定</li>
			</ol>
		</div><!--/.row-->
		
		<div class="row">
			
		</div><!--/.row-->
		
		<div class="row">
			<div class="col-lg-12">
				<h1 class="page-header"><% MemberVO member = (MemberVO)session.getAttribute("member"); out.print(member.getName()); %>，你好</h1>
			</div>
		</div><!--/.row-->
		
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">可预定列表</div>
					<div class="panel-body">
						<div class="row">
							<div class="form-group form-inline col-lg-4">
								<label>选择日期</label>
								<select class="form-control" id="date-select">
								<% 
									ArrayList<String> a = (ArrayList<String>)session.getAttribute("available");
									for(String str:a){
										out.print("<option value='"+str+"'>"+str+"</option>");
									}
								%>
								</select>
							</div>
							<div class="col-lg-8">
								<div class="alert bg-primary alert-dismissable" role="alert" id="alert">
									<button type="button" class="close" data-dismiss="alert" aria-hidden="true">
								      &times;
								   </button>
									<span class="glyphicon glyphicon-info-sign"></span> 您可以预定本周和下周的甜品。 
								</div>
							</div>
						</div>
						<table id="commod-table">
						</table>
						<input type="hidden" id="reserve-id"/>
						<hr/>
						<div class="row">
							<form class="form-inline" role="form">
								<div class="row">
									<div class="form-group col-lg-offset-1 col-lg-3">
									    <label class="col-sm-5 control-label" for="total">总额</label>
									    <div class="col-sm-7">
									    	<input type="hidden" id=""/>
									    	<p class="form-control-static static"><span id="total">0.0</span>元</p>
									    </div>
									</div>
									<div class="form-group col-lg-3">
									    <label class="col-sm-5 control-label" for="reserve-date">预定日期</label>
									    <div class="col-sm-7 ">
									      <p class="form-control-static static" id="reserve-date"></p>
									    </div>
									</div>
									<div class="form-group col-lg-3">
									    <label class="col-sm-5 control-label" for="reserve-shop">预定店面</label>
									    <div class="col-sm-7">
									      <p class="form-control-static static" id="reserve-shop"><%=shop.getName() %></p>
									    </div>
									</div>
									<div class="form-group col-lg-2">
									    <button type="button" class="btn btn-primary" id="confirm">确认预定</button>
									 </div>
							  	</div>
							</form>
						</div>
					</div>
				</div>
			</div>
		</div><!--/.row-->	
		
	</div><!--/.main-->

	<script src="<%=request.getContextPath() %>/staff/js/jquery-1.11.1.min.js"></script>
	<script src="<%=request.getContextPath() %>/staff/js/bootstrap.min.js"></script>
	<script src="<%=request.getContextPath() %>/staff/js/bootstrap-table.js"></script>
	<script>
		$(function(){
			$("#reserve-date").html($("#date-select").children('option:selected').val());
			$("#confirm").click(function(){
				$.ajax({
					url :'<%=request.getContextPath() %>/reserve/addReserve',	 	
					type:'post', 																
					dataType:'json', 													
					data:{
						member_id: '<%=member.getMember_id() %>',
						shop_id: '<%=shop.getShop_id() %>',
						total: $("#total").html(),
						reserve_date: $("#reserve-date").html()
						},													
					success:function(data, textStatus){
						alert("预定成功！");
						$("#reserve-id").val(data);
					} 
				});
				/*
				增加预定商品
				*/
			   // var info = JSON.stringify($("#commod-table").bootstrapTable('getData'));
				var info = $("#commod-table").bootstrapTable('getData');
			    var arr = new Array();
			    var reserve_id = $("#reserve-id");
			    for( i=0;i<info.length;i++)  
			    {
			    }
			    
			});
		});
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
			 
		});
			 
			 
		var TableInit = function () {
		 var oTableInit = new Object();
		 //初始化Table
		 oTableInit.Init = function () {
		  $('#commod-table').bootstrapTable({
		   url: '<%=request.getContextPath() %>/reserve/saleable',   //请求后台的URL（*）
		   method: 'get',      //请求方式（*）
		//   toolbar: '#toolbar',    //工具按钮用哪个容器
		   striped: true,      //是否显示行间隔色
		   cache: false,      //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
		   pagination: true,     //是否显示分页（*）
		   sortable: false,      //是否启用排序
		   sortOrder: "asc",     //排序方式
		   queryParams: oTableInit.queryParams,//传递参数（*）
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
		   uniqueId: "ID",      //每一行的唯一标识，一般为主键列
		   showToggle:true,     //是否显示详细视图和列表视图的切换按钮
		   cardView: false,     //是否显示详细视图
		   detailView: false,     //是否显示父子表
		   columns: [ {
		    field: 'commod_id',
		    title: '商品编号',
		    align:	'center',
		    class: 'id'
		   }, {
		    field: 'commod_name',
		    title: '商品名称',
		    align:	'center',
		    class: 'name'
		   }, {
		    field: 'price',
		    title: '商品单价',
		    align:	'center',
		    class: 'price'
		   }, {
		    field: 'amount',
		    title: '库存',
		    align:	'center',
		    class: 'amount'
		   }, {
		    field: 'number',
		    title: '预定数量',
		    align:	'center'
		   }
		   ]
		  });
		 };
		 
		 //得到查询的参数
		 oTableInit.queryParams = function (params) {
		  var temp = { //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
		   'date': $("#date-select").children('option:selected').val(), 
		   'shop_id':$("#shop").val()
		  };
		  return temp;
		 };
		 return oTableInit;
		};
		
		$(function(){
			$("#date-select").change(function(){
				$("#commod-table").bootstrapTable('refresh',{silent: true} );
				$("#reserve-date").html($("#date-select").children('option:selected').val());
				$("#total").html("0.0");
			});
		});
		function plusClick(obj){
			
			//减少库存
			var amount = parseInt($(obj).parents("tr").find(".amount").html());
			if(amount==0){
				alert("库存不足，请选购其他商品。");
				return false;
			}
			else{
				$(obj).parents("tr").find(".amount").html(amount-1);
				//$("#commod-table").bootstrapTable('updateCell',{index:1,field:'amount',value:amount-1});
			}
			//预定数量+1
			var number = $(obj).nextAll(".number").html();
			$(obj).nextAll(".number").html(parseInt(number)+1);
			number = number+1;
			/*传递的预定数量统一index: the row index.
				field: the field name
				value: the new field value*/
			//$(obj).nextAll(".reserve_number").val(number);
			//price
			var price = parseFloat($(obj).parents("tr").find(".price").html());
			var total = parseInt($("#total").html());
			total = total + price;
			//total金额+
			$("#total").html(total);
		}
		function minusClick(obj){
			var number = $(obj).prevAll(".number").html();
			if(number==0){
				alert("预定数量不可少于0");
			}
			else{
				$(obj).prevAll(".number").html(parseInt(number)-1);
				number = number-1;
				//传递的预定数量统一
				//$(obj).nextAll(".reserve_number").val(number);
				//增加库存
				var amount = parseInt($(obj).parents("tr").find(".amount").html());
				$(obj).parents("tr").find(".amount").html(amount+1);
				//price
				var price = parseFloat($(obj).parents("tr").find(".price").html());
				var total = parseInt($("#total").html());
				total = total - price;
				//total金额+
				$("#total").html(total);
				
			}
		}
	</script>	
</body>
</html>
