$("#btn_agree").click(function(){
	var id = getIdSelections();
	if(id==""){
		alert("请选择要审批的计划。");
	}
	else{
		var str = '';
		for(var i=0;i<id.length;i++){
			str = str + id[i].toString()+'+';
		}
		var url = 'http://localhost:8080/dessertHouse/manager/check';
		$.ajax({
			url :url,	 	
			type:'get', 	
			dataType:'json', 													
			data:{
				id: str,
				type: 'agree'
			},													
			success:function(data, textStatus){
				alert("已批准!");
				$("#plan-table").bootstrapTable('refresh',{silent: true} );
			} 
		});
	}
});
$("#btn_disagree").click(function(){
	var id = getIdSelections();
	if(id==""){
		alert("请选择要审批的计划。");
	}
	else{
		var str = '';
		for(var i=0;i<id.length;i++){
			str = str + id[i].toString()+'+';
		}
		var url = 'http://localhost:8080/dessertHouse/manager/check';
		$.ajax({
			url :url,	 	
			type:'get', 	
			dataType:'json', 													
			data:{
				id: str,
				type: 'disagree'
			},													
			success:function(data, textStatus){
				alert("已驳回!");
				$("#plan-table").bootstrapTable('refresh',{silent: true} );
			} 
		});
	}
});
function getIdSelections() {
    return $.map($("#plan-table").bootstrapTable('getSelections'), function (row) {
    return row.plan_id;
    });
}