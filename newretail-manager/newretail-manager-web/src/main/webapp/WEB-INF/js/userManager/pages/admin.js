var admin=function(){
	var pageId='#admin_page ';
	var service=adminService.getInstance();
	var fieldsSetting=new Array();
	var fieldsDisplayName=new Array();
	
	
	function init(){
		console.log("im user");
		getTableSetting();
		console.log(fieldsSetting);
		console.log(fieldsDisplayName);//userManger/getAdminList
		dataGridUtils.loadDataGrid(pageId,{},'userManager/getAdminList',fieldsSetting,fieldsDisplayName);//selectId,data,ur
		console.log(22);//#adminMangerDataGrid",{},''
		//dataGridUtils.initMainGrid();
		buttonBindEvent();
	}
	
	function buttonBindEvent(){
		$(pageId+' #add').bind('click',function(){
			$(pageId+"#adminAddForm").modal('show');
		});
		$(pageId+' #edit').bind('click',function(){
			var id=$(pageId+'#managerDataGrid').jqGrid('getGridParam','selrow');
			getAdminData(id);
		});
		$(pageId+'#adminAddForm #btnSave').bind('click',function(){
			var password=$("#adminAddForm #password").val();
			var name=$("#adminAddForm #name").val();
			var username=$("#adminAddForm #username").val();
			var param={
					'username':username,
					'password':password,
					'name':name,
			};
			var callback=function(resultVo){
				if(resultVo.status==200){
					$(pageId+"#adminAddForm").modal('hide');
					reloadDataGrid();
				}else{
					alert(resultVo.msg||'系统异常');
				}
				
			};
			service.addAdmin(param,callback);
		});
		
		$(pageId+'#adminUpdateForm #btnUpdate').bind('click',function(){
			var id=$("#adminUpdateForm #id").val();
			var password=$("#adminUpdateForm #password").val();
			var username=$("#adminUpdateForm #username").val();
			var name=$("#adminUpdateForm #name").val();
			var param={
					'id':id,
					'username':username,
					'password':password,
					'name':name,
			};
			var callback=function(resultVo){
				if(resultVo.status==200){
					reloadDataGrid();
					$(pageId+"#adminUpdateForm").modal('hide');
				}else{
					alert(resultVo.msg||'系统异常');
				}
				
			};
			service.updateAdmin(param,callback);
		});
		
		$(pageId+' #query').bind('click',function(){
			var id=$(pageId+'#managerDataGrid').jqGrid('getGridParam','selrow');
			getAdminDataInfo(id);
		});
		
		$(pageId+' #delete').bind('click',function(){
			var id=$(pageId+'#managerDataGrid').jqGrid('getGridParam','selrow');
			delAdmin(id);
		});
		
		$(pageId+' #fresh').bind('click',function(){
			reloadDataGrid();
		});
		
		
	}
	function getAdminDataInfo(id){
		var param={'id':id};
		var callback=function(resultVo){
			if(resultVo.status==200){
				var data=resultVo.data;
				var name=data.name;
				var username=data.username;
				var password=data.password;
				var createTime=data.createTime;
				var updateTime=data.updateTime;
				var authenticationStatus=data.authenticationStatus;
				$("#adminDataInfo #name").html(name);
				$("#adminDataInfo #username").html(username);
				$("#adminDataInfo #password").html(password);
				$("#adminDataInfo #createTime").html(createTime);
				$("#adminDataInfo #updateTime").html(updateTime);
				$(pageId+"#adminDataInfo").modal('show');
			}else{
				alert(resultVo.msg||'系统异常');
			}
		}
		service.queryDataInfo(param,callback);
	}
	function getAdminData(id){
		var param={'id':id};
		var callback=function(resultVo){
			if(resultVo.status==200){
				var data=resultVo.data;
				var password=data.password;
				var username=data.username;
				var name=data.name;
				$(pageId+"#adminUpdateForm #id").val(id);
				$(pageId+"#adminUpdateForm #password").val(password);
				$(pageId+"#adminUpdateForm #username").val(username);
				$(pageId+"#adminUpdateForm #name").val(name);
				$(pageId+"#adminUpdateForm").modal('show');
			}else{
				alert(resultVo.msg||'系统异常');
			}
		}
		service.queryDataInfo(param,callback);
	}
		
	function getTableSetting(){//
		var tds=$("#admin_page  #mainCon #managerDataGrid td");
		for(var i=0;i<tds.length;i++){
			var field={};
			var $td=$(tds[i]);
			var name=$td.attr('fieldName');
			var index=$td.attr('fieldName');
			var displayName=$td.attr('displayName');
			var width=$td.attr('width');
			field.name=name;
			field.index=index;
			field.width=width;
			fieldsSetting[i]=field;
			fieldsDisplayName[i]=displayName;
		}
		$("#admin_page  #mainCon #managerDataGrid").html('');
	}
	
	
	function delAdmin(id){
		var param={id:id};
		var callback=function(resultVo){
			if(resultVo.status==200){
				reloadDataGrid();
			}else{
				alert(resultVo.msg||'系统异常');
			}
		}
		service.delAdmin(param,callback);
	}
	
	function reloadDataGrid(){ // 去查询数据
	 	$(pageId+'#managerDataGrid').jqGrid('clearGridData');
		$(pageId+'#managerDataGrid').trigger('reloadGrid');
	}
	
	function bindEvent(){
		$("#user").bind('click',function(){
		});
	}
	var exports={
		'init':init	,
	};
	return exports;
}();
$(function(){
	admin.init();
});