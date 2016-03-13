$("#btn_delete").click(function(){
	var id = getIdSelections();
	if(id==""){
		alert("请选择要删除的项目。");
	}
	else{
		var str = '';
		for(var i=0;i<id.length;i++){
			str = str + id[i].toString()+'+';
		}
		var url = 'http://localhost:8080/dessertHouse/mainserver/deletePlan';
		$.ajax({
			url :url,	 	
			type:'get', 	
			dataType:'json', 													
			data:{
				id: str
			},													
			success:function(data, textStatus){
				alert("已成功删除!");
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