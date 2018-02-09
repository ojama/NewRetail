var page = function() {
	return {
		$addForm : $("#addForm"),
		$mainCon : $("#mainCon"),
		$searchForm : $("#searchForm"),
		$grid_selector : $('#grid-table'),
		pager_selector : '#grid-pager',
		// 新增
		onTapAdd : function() {
			var that = this;
			that.$addForm.show();
			that.$mainCon.hide();
			that.$searchForm.hide();
		},
		// 保存
		onTapSave : function() {
			var that = this;
			common.showTip('正在保存中...');
			setTimeout(function() {
				common.hideTip();
			}, 1000);
		},
		// 返回
		onTapBack : function() {
			var that = this;
			that.$addForm.hide();
			that.$mainCon.show();
			that.$searchForm.show();
		},
		// 查看详情
		viewDetail : function(rowId) {
			var that = this;
			var rowData = that.$grid_selector.jqGrid('getRowData', rowId);//根据行id获取每行的数据
			//显示数据到模态框
			$("#modal_orderCode").text("orderCode");
			$("#modal_orderTime").text(rowData.orderTime);
			$("#modal_payStatus").text(rowData.payStatus);
			$("#modal_deliverStatus").text(rowData.deliverStatus);
			$("#modal_orderStatus").text(rowData.orderStatus);
			$("#modal_userName").text("userName");
			$("#modal_receiverPhone").text("receiverPhone");
			$("#modal_deliverAddress").text("deliverAddress");
			$("#modal_orderAmount").text(rowData.orderAmount);
			
			
			
			//调用模态框
			$("#myModalDetail").modal('show');
			
			
		},
		// 确认订单
		toConfirm : function(obj) {
			var that = this, html = '', $currModal = $(obj).parents('.modal');
			html += '<div class="">请选择配送方式：';
			html += '<select class="select-sm"><option value="AL">编码</option><option value="AK">名称</option></select>';
			html += '</div>';
			$currModal.find('.modal-body').html(html);
			$(obj).attr('onclick', '');
		}
	}//return 结束

}();

//多条件查询数据
function query(){
	$('#grid-table').jqGrid('clearGridData');
	//$('#grid-table').jqGrid('setGridParam', {url: 'xxxx/xxxx?id='+id}).trigger('reloadGrid');
	var orderCode = $('#orderCode').val();
	var orderTime = $('#orderTime').val();
	var orderStatus = $('#orderStatus').val();
	var deliverStatus = $('#deliverStatus').val();
	var deliverType = $('#deliverType').val();
	console.log(orderCode +"#####"+ orderTime +"#####"+ orderStatus +"#####"+ deliverStatus +"#####"+ deliverType);
	
	$('#grid-table').jqGrid({		
		datatype : "json",
		postData : {
			"orderCode" : orderCode,
			"orderTime" : orderTime,
			"orderStatus" : orderStatus,
			"deliverStatus" : deliverStatus,
			"deliverType" : deliverType,
			"merchantId"　:　"1"
		},
		url : '/order/getOrderList.do',
		mtype : 'post',
		height : 400,
		autowidth:true ,
		colNames : [ '订单号', '下单时间', '支付状态', '配送状态', '订单状态', '订单金额', '操作','商家ID','配送员ID','配送地址序列','配送方式','用户ID' ],
		colModel : [		         
				{
					name : 'orderCode',
					index : 'orderCode',
					width : 100,
					align: 'center',			
					key : true
				},
				{
					name : 'orderTime',
					index : 'orderTime',
					align: 'center',
					width : 100
				},
				{
					name : 'payStatus',
					index : 'payStatus',
					align: 'center',
					width : 50 ,
					align: 'center',
					formatter: function(cellvalue, options, rowObject){//对数据进行格式化						
						if(cellvalue=='0'){
							return "待支付";
						}
						if(cellvalue=='1'){
							return "已支付";
						}
						if(cellvalue=='2'){
							return "待退款";
						}
						if(cellvalue=='3'){
							return "已退款";
						}
						return "";
					}
				},
				{
					name : 'deliverStatus',
					index : 'deliverStatus',
					width : 50 ,
					align: 'center',
					formatter: function(cellvalue, options, rowObject){										
						if(cellvalue=='1'){
							return "待发货";
						}
						if(cellvalue=='2'){
							return "已发货";
						}
						if(cellvalue=='3'){
							return "已签收";
						}
						return "";
					}
				},
				{
					name : 'orderStatus',
					index : 'orderStatus',
					align: 'center',
					width : 50,
					formatter: function(cellvalue, options, rowObject){										
						if(cellvalue=='0'){
							return "已下单";
						}
						if(cellvalue=='1'){
							return "已确认";
						}
						if(cellvalue=='2'){
							return "交易中";
						}
						if(cellvalue=='3'){
							return "订单取消中";
						}
						if(cellvalue=='4'){
							return "交易结束";
						}
						if(cellvalue=='5'){
							return "订单取消";
						}
						return "";
					}
				},
				{
					name : 'orderAmount',
					index : 'orderAmount',
					align: 'center',
					width : 50
				},
				{
					name : 'myac',
					index : '',
					width : 80,
					fixed : true,
					sortable : false,
					resize : false,
					formatter : function(value, grid, rows, state) {
						return "<button class=\"btn btn-xs btn-info\" onclick=\"page.viewDetail("
								+ rows.orderCode+ ")\">查看</button>"
					}
				}, 
				{
					name : 'merchantId',
					index : 'merchantId',
					hidden : true,
					width : 150
				}, {
					name : 'receiverId',
					index : 'receiverId',
					hidden : true,
					width : 150
				}, {
					name : 'deliverAddressSeq',
					index : 'deliverAddressSeq',
					hidden : true,
					width : 150
				}, {
					name : 'deliverType',
					index : 'deliverType',
					hidden : true,
					width : 150
				}, {
					name : 'userId',
					index : 'userId',
					hidden : true,
					width : 150
				},

		],
		jsonReader:{
				root: "data",  
				page: "currentPage", 
				total: "totalPage",
				records:"totalCount", 
				repeatitems : false      
		},
		rowNum : 10,
		rowList : [ 10, 20, 30 ],
		pager : $('#grid-pager'),
		viewrecords : true,
		gridview:true,
		altRows: true,
		multiselect : true,
		multiboxonly : true,
		rowList : [ 10, 20, 30 ],
		caption : '订单列表',
		ondblClickRow : function(id) {

		},
		caption:'',  		
		onPaging:function(pageBtn){
				var re_records = $('#grid-table').getGridParam('records');//获取返回的记录数  
	            var re_page = $('#grid-table').getGridParam('page');//获取返回的当前页  
	            var re_rowNum= $('#grid-table').getGridParam('rowNum');//获取每页数  
	            var re_total= $('#grid-table').getGridParam('lastpage');//获取总页数  
	            if(pageBtn==="next"){  
	            	initJqgrid(re_page+1,re_rowNum);  
	            }  
	            if(pageBtn==="prev"){  
	
	            }  
		},
	    onSelectRow:function(){},	   
	    loadComplete :function() {
		    var table = $('#grid-table');
		    setTimeout(function(){
		      		updatePagerIcons(table);
		      }, 0);
	    },
	});
}

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

$(document).ready(function(){	
	$('#queryBtn').click(function(){query()});
})
