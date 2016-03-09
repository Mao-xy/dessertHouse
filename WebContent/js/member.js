$(function(){
	/*
	 * 修改name
	 */
	$(document).on("click","#btn_username",function(){
		$("#span_username").replaceWith('<input id="username" type="text" value="">');
		$(this).replaceWith('<button class="btn btn-default" id="confirm_username">保存修改</button>');
	});
	$(document).on("click","#confirm_username",function(){
		var name = $("#username").val();
		$.ajax({
			url :'../api/modify_username',	 	
			type:'post', 																
			dataType:'json', 													
			data:{username:name},													
			success:function(data, textStatus){
				$("#username").replaceWith('<span id="span_username">'+data.username+'</span>');
				$("#confirm_username").replaceWith('<button class="btn btn-default" id="btn_username">修改</button>');
				$("#currentName").html(data.username);
			} 
		});
	});
	
	/*
	 * 修改密码
	 */
	$(document).on("click","#btn_password",function(){
		$("#span_password").replaceWith('<input id="password" type="password" value="">');
		$(this).replaceWith('<button class="btn btn-default" id="confirm_password">保存修改</button>');
	});
	$(document).on("click","#confirm_password",function(){
		var password = $("#password").val();
		$.ajax({
			url :'../api/modify_password',	 	
			type:'post', 																
			dataType:'json', 													
			data:{pwd:password},													
			success:function(data, textStatus){
				$("#password").replaceWith('<span id="span_password">*******</span>');
				$("#confirm_password").replaceWith('<button class="btn btn-default" id="btn_password">修改</button>');
			} 
		});
	});
	
	/*
	 * 修改生日
	 */
	$("#btn_birthday").click(function(){
		//使用datetimepicker
		$("#span_birthday").replaceWith('<input id="password" type="text" value="">');
		$(this).html("保存修改");
	});
	
	/*
	 * 修改电话号码
	 */
	$(document).on("click","#btn_phone",function(){
		$("#span_phone").replaceWith('<input id="phone" type="text" value="">');
		$(this).replaceWith('<button class="btn btn-default" id="confirm_phone">保存修改</button>');
	});
	$(document).on("click","#confirm_phone",function(){
		var phone = $("#phone").val();
		$.ajax({
			url :'../api/modify_phone',	 	
			type:'post', 																
			dataType:'json', 													
			data:{phone:phone},													
			success:function(data, textStatus){
				$("#phone").replaceWith('<span id="span_phone">'+data.phone+'</span>');
				$("#confirm_phone").replaceWith('<button class="btn btn-default" id="btn_phone">修改</button>');
			} 
		});
	});
	
	/*
	 * 修改银行卡号
	 */
	$(document).on("click","#btn_card",function(){
		$("#span_card").replaceWith('<input id="card" type="text" value="">');
		$(this).replaceWith('<button class="btn btn-default" id="confirm_card">保存修改</button>');
	});
	$(document).on("click","#confirm_card",function(){
		var card = $("#card").val();
		$.ajax({
			url :'../api/modify_card',	 	
			type:'post', 																
			dataType:'json', 													
			data:{card:card},													
			success:function(data, textStatus){
				$("#card").replaceWith('<span id="span_card">'+data.card+'</span>');
				$("#confirm_card").replaceWith('<button class="btn btn-default" id="btn_card">修改</button>');
				$("#modal_card").html(card);
			} 
		});
	});
	
	/*
	 * 修改居住地
	 */
	$(document).on("click","#btn_address",function(){
		$("#span_address").replaceWith('<input id="address" type="text" value="">');
		$(this).replaceWith('<button class="btn btn-default" id="confirm_address">保存修改</button>');
	});
	$(document).on("click","#confirm_address",function(){
		var address = $("#address").val();
		$.ajax({
			url :'../api/modify_address',	 	
			type:'post', 																
			dataType:'json', 													
			data:{address:address},													
			success:function(data, textStatus){
				$("#address").replaceWith('<span id="span_address">'+data.address+'</span>');
				$("#confirm_address").replaceWith('<button class="btn btn-default" id="btn_address">修改</button>');
			} 
		});
	});
	
	/*
	 * 兑换积分
	 */
	$(document).on("click","#btn_points",function(){
		$("#span_points").replaceWith('<lable id="lable_points" for="points">兑换积分数</lable><input id="points" type="text" value="" placeholder="请输入50的倍数">');
		$(this).replaceWith('<button class="btn btn-default" id="confirm_points">确认兑换</button>');
	});
	$(document).on("click","#confirm_points",function(){
		var points = $("#points").val();
		var before = $("#hidden_points").html();
		if(points>before)
			alert("兑换积分数不可超过"+before+".");
		else if(points<50)
			alert("兑换积分数不可少于50.");
		else
			$.ajax({
				url :'../api/exchange_points',	 	
				type:'post', 																
				dataType:'json', 													
				data:{points:points},													
				success:function(data, textStatus){
					$("#lable_points").remove();
					$("#points").replaceWith('<span id="span_points">'+data.points+'</span>');
					$("#confirm_points").replaceWith('<button class="btn btn-default" id="btn_points">兑换积分</button>');
					$("#span_balance").html(data.balance);
					$("#modal_balance").html(data.balance);
				} 
			});
	});
	
	/*
	 * 充值
	 */
	$("#confirm-recharge").click(function(){
		var money = $("#recharge-money").val();
		alert(money);
		$.ajax({
			url :'../api/recharge',	 	
			type:'post', 																
			dataType:'json', 													
			data:{money:money},													
			success:function(data, textStatus){
				$("#span_balance").html(data.balance);
				$("#modal_balance").html(data.balance);
				$("#rechargeModal").modal('hide');
			} 
		});
	});
	
	$("#status_change").click(function(event) {
		if($(this).html=="停用账户"){
			//应使用警告框
			alert("确定要停用账户吗？");
		}
		else{
			//检查是否填写了所有的个人信息，然后提示完成所有个人信息。若已完成，则变为充值功能--模态框
			if($("#span_card").html()=="未设置"||$("#span_birthday").html()=="未设置"){
				alert("请先完善银行账号和出生日期的设置。");
			}
			else{
				$("#rechargeModdal").show();
			}
			
		}
	});
});