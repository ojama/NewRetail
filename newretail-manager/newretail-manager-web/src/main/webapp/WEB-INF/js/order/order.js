var orderPage = function() {
	return {
		$addForm : $("#addForm"),
		$mainCon : $("#mainCon"),
		$searchForm : $("#searchForm"),
		$grid_selector : $('#grid-table'),
		pager_selector : '#grid-pager',
		
		onTapAdd : function() {// 新增
			var that = this;
			that.$addForm.show();
			that.$mainCon.hide();
			that.$searchForm.hide();
		},
		onTapSave : function() {// 保存
			var that = this;
			common.showTip('正在保存中...');
			setTimeout(function() {
				common.hideTip();
			}, 1000);
		},
		onTapBack : function() {// 返回
			var that = this;
			that.$addForm.hide();
			that.$mainCon.show();
			that.$searchForm.show();
		},
		viewDetail : function(rowId) {// 查看详情
			$('#modal_goodsList').empty();
			var that = this;
			var rowData = that.$grid_selector.jqGrid('getRowData', rowId);//根据行id获取每行的数据
			//显示数据到模态框
			$("#modal_orderCode").text(rowData.orderCode);
			$("#modal_orderTime").text(rowData.orderTime);
			$("#modal_payStatus").text(rowData.payStatus);
			$("#modal_deliverStatus").text(rowData.deliverStatus);
			$("#modal_orderStatus").text(rowData.orderStatus);
			$("#modal_receiverName").text(rowData.receiverName);
			$("#modal_receiverPhone").text(rowData.receiverPhone);
			$("#modal_deliverAddress").text(rowData.deliverAddress);
			$.ajax({
				async:false,
				type:"post",
				url:"/order/getGoodsList.do",
				data:{"orderCode":rowData.orderCode},
				dataType:"json",
				success:function(json){
					if(json.status==200){
						orderPage.toShowGoodsInfo(json.data);
					}
				},
				error:function(){
					alert("程序有问题");
				}
				
			});
			$("#modal_orderAmount").text(rowData.orderAmount);
			var userIdentify = $("#flagVaule").val();
			if(userIdentify==2 && rowData.orderStatus=='已下单'){
				$('#confimBtn').removeClass("hidden");
				$('#reconfimBtn').addClass("hidden");
				$('#confimBtn').click(function(){orderPage.toReconfirm(rowData.orderCode)});
			}else{
				$('#confimBtn').addClass("hidden");
				$('#reconfimBtn').addClass("hidden");
			}			
			$("#myModalDetail").modal('show');//调用模态框
		},
		toShowGoodsInfo:function(data){//显示订单的所有商品信息	
			var template = "";
			for(var i=0;i<data.length;i++){
				template = template +'<tr>'
				+'<td>'+data[i].goodsName+'</td>'
				+'<td><b class="green">$'+data[i].goodsPrice+'</b></td>'
				+'<td>'+data[i].goodsNum+'</td>'
				+'<td>$'+data[i].goodsPrice*data[i].goodsNum+'</td>'			
				+'</tr>';
			}
			template = template +'<tr><td colspan="4">订单总金额：<span id="modal_orderAmount"></span></td></tr>';
			$('#modal_goodsList').append(template);			
		},
		toReconfirm : function(orderCode){//再次确认
			$('#confimBtn').addClass("hidden");
			$('#reconfimBtn').removeClass("hidden");
			$('#reconfimBtn').click(function(){orderPage.toChooseMethod(orderCode)});
			
		},
		toChooseMethod : function(orderCode) {// 选择配送方式
			$("#myModalDetail").modal('hide');
			$("#updateStatusModal").modal('show');
			$('#confimBtn2').click(function(){orderPage.toUpdateStatus(orderCode)});			
		},
		
		toUpdateStatus:function(orderCode){//更新状态
			$.ajax({
				type:"post",
				data:{orderCode:orderCode},
				url:"/order/updateOrderStatus.do",
				success:function(json){
					if(json.status==200){
						$("#updateStatusModal").modal('hide');
						alert(json.msg);
						query();
					}else{
						$("#updateStatusModal").modal('hide');
						alert(json.msg);
					}
				}
			});
		},
		initMainGrid :function() {//初始化表格
			var orderCode = $('#orderCode').val();
			var orderTime = $('#orderTime').val();
			var orderStatus = $('#orderStatus').val();
			var deliverStatus = $('#deliverStatus').val();
			var deliverType = $('#deliverType').val();
			
			$('#grid-table').jqGrid({		
				datatype : "json",
				postData : {
					"orderCode" : orderCode,
					"orderTime" : orderTime,
					"orderStatus" : orderStatus,
					"deliverStatus" : deliverStatus,
					"deliverType" : deliverType,
				},
				url : '#',//初始化时不访问
				mtype : 'post',
				height : 400,
				autowidth:true ,
				colNames : [ 'ID','订单号', '下单时间', '支付状态', '配送状态', '订单状态', '订单金额', '操作','订单ID','商家ID','配送地址','收货人联系方式','配送方式','配送人ID','收货人','收货人ID' ],
				colModel : [
				        {
				        	name : 'id',
							index : 'id',
							width : 100,
							align: 'center',
				        },
						{
							name : 'orderCode',
							index : 'orderCode',
							width : 100,
							align: 'center',
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
								return "<button class=\"btn btn-xs btn-info\" onclick=\"orderPage.viewDetail("
										+ rows.id+ ")\">查看</button>"
							}
						},						
						{
							name : 'orderId',
							index : 'orderId',
							hidden : true,
							width : 150
						}, 
						{
							name : 'merchantId',
							index : 'merchantId',
							hidden : true,
							width : 150
						}, {
							name : 'deliverAddress',
							index : 'deliverAddress',
							hidden : true,
							width : 150
						}, {
							name : 'receiverPhone',
							index : 'receiverPhone',
							hidden : true,
							width : 150
						}, {
							name : 'deliverType',
							index : 'deliverType',
							hidden : true,
							width : 150
						}, {
							name : 'deliverId',
							index : 'deliverId',
							hidden : true,
							width : 150
						},
						{
							name : 'receiverId',
							index : 'receiverId',
							hidden : true,
							width : 150
						},
						{
							name : 'receiverName',
							index : 'receiverName',
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
				caption : '订单列表',
				ondblClickRow : function(id) {

				},
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
				    	orderPage.updatePagerIcons(table);
				      }, 0);
			    },
			});
		},
		updatePagerIcons :function(table){//更新页面控件图标
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
	}//return 结束

}();

//多条件查询数据
function query(){//数据进行重新加载
	$("#grid-table").jqGrid('clearGridData');
	var orderCode = $('#orderCode').val();
	var orderTime = $('#orderTime').val();
	var orderStatus = $('#orderStatus').val();
	var deliverStatus = $('#deliverStatus').val();
	var deliverType = $('#deliverType').val();
	$('#grid-table').jqGrid('setGridParam', {
		datatype : "json",
		postData : {
			"orderCode" : orderCode,
			"orderTime" : orderTime,
			"orderStatus" : orderStatus,
			"deliverStatus" : deliverStatus,
			"deliverType" : deliverType,
		},		
		mtype : 'post',
		url: '/order/getOrderList.do',		
	}).trigger('reloadGrid');
}


$(document).ready(function(){	//初始化
	orderPage.initMainGrid();
	$('#queryBtn').click(function(){query()});
})
