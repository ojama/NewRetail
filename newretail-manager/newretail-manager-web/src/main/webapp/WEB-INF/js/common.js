var common=function(){
	return{
		$tipModal:$("#tipModal"),
		showTip:function(content){
			var that=this;
			if(that.$tipModal.length>0){
				that.$tipModal.find('.modal-body').text(content);
				that.$tipModal.modal('show');
			}else{
				that.builTipModal(content);
				that.$tipModal=$("#tipModal");
				that.$tipModal.modal();
			}
		},
		hideTip:function(time){
			var that=this;
			that.$tipModal.modal('hide');
		},
		confirm:function(content,confirmFun,cacleFun,btnArray,area){
    if(!content) content="您确定删除？"; 
    if(!btnArray) btnArray=['确定', '取消'];
    if(!area) area=['500px', '180px'];
    layer.confirm(content, {
			btn: btnArray, //按钮
			area: area
		}, function(index) {
			layer.close(index);
			if(confirmFun) confirmFun();
		}, function() {
			if(cacleFun) cacleFun();
		});
		},
		builTipModal:function(content){
			var html='';
			html+='<div class="modal fade" id="tipModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">';
			html+='<div class="modal-dialog">';
			html+='<div class="modal-content">';
			html+='<div class="modal-body">';
			html+='<span>'+content+'</span>';
			html+='</div>';
			html+='</div>';
			html+='</div>';
			html+='</div>';
			$('body').append(html);
		},
		fillToPage:function(selectRowData,$fillArea){
			if($fillArea.length<1) $fillArea=$("body");
			for(var p in selectRowData){
				$fillArea.find('[name="'+p+'"]').val(selectRowData[p]);
			}
		},
		buildGrid:function($popupTable,buildGridObj){
			var jsonReader={
				root: "data",  
				page: "currentPage", 
				total: "totalPage",
				records:"totalCount", 
				repeatitems : false      
			}
			$popupTable.jqGrid({
				url:buildGridObj.url?buildGridObj.url:'',
				mtype: buildGridObj.mtype?buildGridObj.mtype:'GET',
				datatype: "json",
				postData:buildGridObj.postData?buildGridObj.postData:{},
				jsonReader:buildGridObj.jsonReader?buildGridObj.jsonReader:jsonReader,  
				height: buildGridObj.height?buildGridObj.height:300,
				width:buildGridObj.width?buildGridObj.width:'auto',
				colNames:buildGridObj.colNames?buildGridObj.colNames:[],
				colModel:buildGridObj.colModel?buildGridObj.colModel:[],
				pager:buildGridObj.pager?buildGridObj.pager:'#grid-pager',
				rowNum:buildGridObj.rowNum?buildGridObj.rowNum:10,
				rowList:buildGridObj.rowList?buildGridObj.rowList:[10],
				gridview:true,
				altRows: true,
				multiboxonly: true,
				multiselect:buildGridObj.multiselect?buildGridObj.multiselect:false,
				viewrecords:!buildGridObj.viewrecords?false:true,
				caption:buildGridObj.caption?buildGridObj.caption:'',  
				autowidth:buildGridObj.autowidth?buildGridObj.autowidth:true,
				onPaging:function(pageBtn){
						var re_records = $popupTable.getGridParam('records');//获取返回的记录数  
            var re_page = $popupTable.getGridParam('page');//获取返回的当前页  
            var re_rowNum= $popupTable.getGridParam('rowNum');//获取每页数  
            var re_total= $popupTable.getGridParam('lastpage');//获取总页数  
            if(pageBtn==="next"){  
            	initJqgrid(re_page+1,re_rowNum);  
            }  
            if(pageBtn==="prev"){  

            }  
          },
          onSelectRow: buildGridObj.onSelectRow?buildGridObj.onSelectRow:function(){},
          ondblClickRow:buildGridObj.ondblClickRow?buildGridObj.ondblClickRow:function(){},
          loadComplete : function() {
          	var table = $popupTable;
          	setTimeout(function(){
          		updatePagerIcons(table);
          	}, 0);
          },
        });
			//浏览导航栏添加功能部分代码
			$popupTable.jqGrid('navGrid',buildGridObj.popupPager,
				{ 	//navbar options
					edit: false,
					add: false,
					del: false,
					search: false,
					refresh: true,
					refreshicon : 'icon-refresh green',
					view: true,
					viewicon : 'icon-zoom-in grey',
				},
				{
						//view record form
						recreateForm: true,
						beforeShowForm: function(e){
							var form = $(e[0]);
							form.closest('.ui-jqdialog').find('.ui-jqdialog-title').wrap('<div class="widget-header" />')
						}
					}
					);

		}

	};
}();


function updatePagerIcons(table) {
	var replacement = 
	{
		'ui-icon-seek-first' : 'icon-double-angle-left bigger-140',
		'ui-icon-seek-prev' : 'icon-angle-left bigger-140',
		'ui-icon-seek-next' : 'icon-angle-right bigger-140',
		'ui-icon-seek-end' : 'icon-double-angle-right bigger-140'
	};
	$('.ui-pg-table:not(.navtable) > tbody > tr > .ui-pg-button > .ui-icon').each(function(){
		var icon = $(this);
		var $class = $.trim(icon.attr('class').replace('ui-icon', ''));

		if($class in replacement) icon.attr('class', 'ui-icon '+replacement[$class]);
	})
}
$(function(){
	$('.date-picker').datepicker({autoclose:true}).next().on(ace.click_event, function(){
		$(this).prev().focus();
	});
	
})
