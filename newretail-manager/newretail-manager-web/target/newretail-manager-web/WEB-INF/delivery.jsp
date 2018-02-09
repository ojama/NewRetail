<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta charset="utf-8" />
	<title>用户管理</title>
	<meta name="keywords" content="" />
	<meta name="description" content="" />
	<meta name="viewport" content="width=device-width, initial-scale=1.0" />
	<!-- basic styles -->
	<link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/font-awesome.min.css" />
	
		<!--[if IE 7]>
		  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/font-awesome-ie7.min.css" />
		  <![endif]-->
		  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/ui.jqgrid.css" />
      <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/datepicker.css" />
		  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/ace.min.css" />
		<!--[if lte IE 8]>
		  <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/ace-ie.min.css" />
		  <![endif]-->
		  <!-- ace settings handler -->
		  <script src="${pageContext.request.contextPath}/assets/js/ace-extra.min.js"></script>

		<!--[if lt IE 9]>
		<script src="${pageContext.request.contextPath}/assets/js/html5shiv.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/respond.min.js"></script>
		<![endif]-->
		<style type="text/css">
			.form-control{height: 28px !important;}
			.addForm{position: relative;display: none;}
			.addForm .tab-content{position: absolute;width: 100%;left: 0;top: 40px;border: 0px;}
			 #myModal .modal-body{padding-bottom: 0;}
			 #myModal .modal-footer{padding:5px 20px;}
			.modal-search{margin-top:-10px;padding-bottom: 10px;}
			.modal-search button{display: inline-block;margin-top:-2px;}
		</style>
	</head>

	<body>
		<!--顶部NAV-->
		<div class="navbar navbar-default" id="navbar">
			<div class="navbar-container" id="navbar-container">
				<!--左侧logo-->
				<div class="navbar-header pull-left">
					<a href="${pageContext.request.contextPath}/#" class="navbar-brand">
						<small>
							<i class="icon-leaf"></i>
							DREAM ABOUT IT
						</small>
					</a>
				</div>
				<!--右侧-->
				<div class="navbar-header pull-right" role="navigation">
					<ul class="nav ace-nav">
						<li class="purple">
							<a data-toggle="dropdown" class="dropdown-toggle" href="${pageContext.request.contextPath}/#">
								<i class="icon-bell-alt icon-animated-bell"></i>
								<span class="badge badge-important">8</span>
							</a>

							<ul class="pull-right dropdown-navbar navbar-pink dropdown-menu dropdown-caret dropdown-close">
								<li class="dropdown-header">
									<i class="icon-warning-sign"></i>
									8 消息
								</li>

								<li>
									<a href="${pageContext.request.contextPath}/#">
										<div class="clearfix">
											<span class="pull-left">
												<i class="btn btn-xs no-hover btn-pink icon-comment"></i>
												未读消息
											</span>
											<span class="pull-right badge badge-info">+12</span>
										</div>
									</a>
								</li>
							</ul>
						</li>

						<li class="light-blue">
							<a data-toggle="dropdown" href="${pageContext.request.contextPath}/#" class="dropdown-toggle">
								<img class="nav-user-photo" src="${pageContext.request.contextPath}/assets/avatars/user.jpg" alt="Jason's Photo" />
								<span class="user-info">
									<small>Welcome</small>
									宋灿
								</span>

								<i class="icon-caret-down"></i>
							</a>

							<ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
								<li>
									<a href="${pageContext.request.contextPath}/#">
										<i class="icon-cog"></i>
										系统参数
									</a>
								</li>

								<li>
									<a href="${pageContext.request.contextPath}/#">
										<i class="icon-user"></i>
										个人中心
									</a>
								</li>

								<li class="divider"></li>

								<li>
									<a href="${pageContext.request.contextPath}/#">
										<i class="icon-off"></i>
										登出
									</a>
								</li>
							</ul>
						</li>
					</ul><!-- /.ace-nav -->
				</div>

			</div>
		</div>
		<!--顶部NAV END-->

		<div class="main-container" id="main-container">

			<div class="main-container-inner">
				<a class="menu-toggler" id="menu-toggler" href="${pageContext.request.contextPath}/#">
					<span class="menu-text"></span>
				</a>
				<!--左侧导航-->
				<div class="sidebar" id="sidebar">
					<!--快捷功能区-->
					<div class="sidebar-shortcuts" id="sidebar-shortcuts">
						<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
							<button class="btn btn-success">
								<i class="icon-signal"></i>
							</button>

							<button class="btn btn-info">
								<i class="icon-pencil"></i>
							</button>

							<button class="btn btn-warning">
								<i class="icon-group"></i>
							</button>

							<button class="btn btn-danger">
								<i class="icon-cogs"></i>
							</button>
						</div>

						<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
							<span class="btn btn-success"></span>

							<span class="btn btn-info"></span>

							<span class="btn btn-warning"></span>

							<span class="btn btn-danger"></span>
						</div>
					</div>
					<!--主菜单-->
					<ul class="nav nav-list">
						<li>
							<a href="${pageContext.request.contextPath}/#" class="dropdown-toggle">
								<i class="icon-desktop"></i>
								<span class="menu-text"> 用户管理 </span>

								<b class="arrow icon-angle-down"></b>
							</a>

							<ul class="submenu">
								<li>
									<a href="${pageContext.request.contextPath}/user_normal">
										<i class="icon-double-angle-right"></i>
										普通用户
									</a>
								</li>

								<li>
									<a href="${pageContext.request.contextPath}/user_business">
										<i class="icon-double-angle-right"></i>
										商家管理
									</a>
								</li>

								<li>
									<a href="${pageContext.request.contextPath}/user_delivery">
										<i class="icon-double-angle-right"></i>
										配送员管理
									</a>
								</li>

								<li>
									<a href="${pageContext.request.contextPath}/user_admin">
										<i class="icon-double-angle-right"></i>
										管理员管理
									</a>
								</li>
							</ul>
						</li>

						<li class="active">
						  <a href="${pageContext.request.contextPath}/#" class="dropdown-toggle">
								<i class="icon-desktop"></i>
								<span class="menu-text"> 配送管理 </span>
								<b class="arrow icon-angle-down"></b>
							</a>
							<ul class="submenu">
								<li class="active">
									<a href="${pageContext.request.contextPath}/delivery">
										<i class="icon-double-angle-right"></i>
										配送情况
									</a>
								</li>

								<li>
									<a href="${pageContext.request.contextPath}/deliveryer">
										<i class="icon-double-angle-right"></i>
										配送员
									</a>
								</li>
								</ul>
						</li>

						<li>
							<a href="${pageContext.request.contextPath}/order">
								<i class="icon-text-width"></i>
								<span class="menu-text"> 订单管理 </span>
							</a>
						</li>

						<li>
							<a href="${pageContext.request.contextPath}/product">
								<i class="icon-text-width"></i>
								<span class="menu-text"> 商品管理 </span>
							</a>
						</li>

					</ul>
					<!--收缩键-->
					<div class="sidebar-collapse" id="sidebar-collapse">
						<i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i>
					</div>
				</div>
				<!--左侧导航 end-->
				<!--主页面-->
				<div class="main-content">
					<!--页面路径-->
					<div class="breadcrumbs" id="breadcrumbs">

						<ul class="breadcrumb">
							<li>
								<i class="icon-home home-icon"></i>
								<a href="${pageContext.request.contextPath}/#">首页</a>
							</li>
							<li>
								<a href="${pageContext.request.contextPath}/#">配送管理</a>
							</li>
							<li class="active">配送情况</li>
						</ul><!-- .breadcrumb -->

						<div class="nav-search" id="nav-search">
							<form class="form-search">
								<span class="input-icon">
									<input type="text" placeholder="Search ..." class="nav-search-input" id="nav-search-input" autocomplete="off" />
									<i class="icon-search nav-search-icon"></i>
								</span>
							</form>
						</div>
					</div>
					<!--页面路径-->
					<!--主页面内容-->
					<div class="page-content">
						<div class="page-header" style="border: 0px;">
							<div style="border-bottom: 1px dotted #e2e2e2;padding: 4px 0;">
								<button class="btn btn-xs btn-info" onclick="page.onTapAdd()">新增</button>
								<button class="btn btn-xs btn-info" onclick="page.onTapSave()">保存</button>
								<button class="btn btn-xs btn-info" onclick="page.onTapBack()">返回</button>
								<button class="btn btn-xs btn-info">编辑</button>
								<button class="btn btn-xs btn-info">删除</button>
								<button class="btn btn-xs btn-info">查询</button>
								<button class="btn btn-xs">关闭</button>
							</div>
							<!--新增区-->
							<div class="addForm" id="addForm">
								<ul id="myTab" class="nav nav-tabs">
									<li class="active">
										<a href="${pageContext.request.contextPath}/#home" data-toggle="tab">
											基本信息
										</a>
									</li>
									<li><a href="${pageContext.request.contextPath}/#other" data-toggle="tab">其它信息</a></li>
								</ul>
								<div id="myTabContent" class="tab-content">
									<div class="tab-pane fade in active" id="home">
										<div class="col-lg-3 col-md-4 col-sm-4 col-xs-12 ">
											<div class="form-group">
												<label class="col-lg-2 col-md-3 col-sm-3 control-label no-padding-right" for="form-field-1"> 姓名</label>
												<div class="col-lg-10 col-md-9 col-sm-9">
													<input type="text" id="form-field-1" placeholder="Username" class="form-control">
												</div>
											</div>
										</div>

										<div class="col-lg-3 col-md-4 col-sm-4 col-xs-12 ">
											<div class="form-group">
												<label class="col-lg-2 col-md-3 col-sm-3 control-label no-padding-right" for="form-field-1"> 姓名</label>
												<div class="col-lg-10 col-md-9 col-sm-9">
													<input type="text" id="form-field-1" placeholder="Username" class="form-control">
												</div>
											</div>
										</div>
									</div>
									<div class="tab-pane fade" id="other">
										
									</div>
								</div>
							</div>
							<!---->
							<div class="searchForm" style="padding: 4px 0;" id="searchForm">
								<div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
									<div class="form-group">
										<label class="col-lg-3 col-md-4 col-sm-4 control-label no-padding-right" for="form-field-1"> 状态</label>
										<div class="col-lg-9 col-md-8 col-sm-8">
											<select class="form-control" id="form-field-select-1">
											  <option value=""></option>
												<option value="AL">待配送</option>
												<option value="AK">配送中</option>
												<option value="AK">已配送</option>
											</select>
										</div>
									</div>
								</div>
								<div class="col-lg-3 col-md-4 col-sm-4 col-xs-12 ">
									<div class="form-group">
										<label class="col-lg-3 col-md-4 col-sm-4 control-label no-padding-right" for="form-field-1"> 店铺</label>
										<div class="col-lg-9 col-md-8 col-sm-8">
											<span class="block input-icon input-icon-right">
												<input type="text" name="ebcuNameCn" class="form-control">
												<input type="text" name="pmCode" hidden="true">
												<i class="icon-search" data-toggle="modal" data-target="#myModal" data-url="data/data1.json" onclick="allHandler.onTapFindPop(this)"></i>
											</span>
										</div>
									</div>
								</div>
								<div class="col-lg-3 col-md-4 col-sm-4 col-xs-12 ">
									<div class="form-group">
										<label class="col-lg-3 col-md-4 col-sm-4 control-label no-padding-right" for="form-field-1"> 配送员</label>
										<div class="col-lg-9 col-md-8 col-sm-8">
											<span class="block input-icon input-icon-right">
												<input type="text" name="ebcuNameCn" class="form-control">
												<input type="text" name="pmCode" hidden="true">
												<i class="icon-search" data-toggle="modal" data-target="#myModal" data-url="data/data1.json" onclick="allHandler.onTapFindPop(this)"></i>
											</span>
										</div>
									</div>
								</div>
								<div class="col-lg-3 col-md-4 col-sm-4 col-xs-12 ">
									<div class="form-group">
										<label class="col-lg-3 col-md-4 col-sm-4 control-label no-padding-right" for="form-field-1"> 日期从</label>
										<div class="col-lg-9 col-md-8 col-sm-8">
											<input class="form-control date-picker" id="id-date-picker-1" type="text" data-date-format="yyyy-mm-dd">
										</div>
									</div>
								</div>

								<div class="col-lg-3 col-md-4 col-sm-4 col-xs-12 ">
									<div class="form-group">
										<label class="col-lg-3 col-md-4 col-sm-4 control-label no-padding-right" for="form-field-1"> 日期到</label>
										<div class="col-lg-9 col-md-8 col-sm-8">
											<input class="form-control date-picker" id="id-date-picker-2" type="text" data-date-format="yyyy-mm-dd">
										</div>
									</div>
								</div>
								
							</div>
						</div><!-- /.page-header -->
						<div class="row" id="mainCon">
							<div class="col-xs-12">
								<table id="grid-table"></table>
								<div id="grid-pager"></div>

							</div>
						</div>
					</div>
					<!--主页面内容 end-->
				</div>

			</div>
			<!--回到顶部-->
			<a href="${pageContext.request.contextPath}/#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="icon-double-angle-up icon-only bigger-110"></i>
			</a>
			<!--回到顶部 end-->
		</div><!-- /.main-container -->

		<!--选择弹窗-->
		<!-- 模态框（Modal） -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
							&times;
						</button>
						<h4 class="modal-title" id="myModalLabel">
							选择弹窗
						</h4>
					</div>
					<div class="modal-body">
						<div class="modal-search">
							<select class="select-sm">
								<option value="AL">编码</option>
								<option value="AK">名称</option>
							</select>
							<input class="input-sm" type="text"  placeholder="请输入">
							<button class="btn btn-xs btn-info">查询</button>
							<button class="btn btn-xs btn-info">重置</button>
						</div>
						<table id="pop-grid-table" style="width: auto;"></table>
						<div id="pop-grid-pager"></div>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">取消
						</button>
						<button type="button" class="btn btn-primary" onclick="allHandler.onTapChoseRow()">
							确定
						</button>
					</div>
				</div><!-- /.modal-content -->
			</div><!-- /.modal -->
		</div>
	</body>
	<!-- basic scripts -->
	<script type="text/javascript">
		window.jQuery || document.write("<script src='assets/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
	</script>

	<!-- <![endif]-->

<!--[if IE]>
<script type="text/javascript">
 window.jQuery || document.write("<script src='assets/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
</script>
<![endif]-->

<script type="text/javascript">
	if("ontouchend" in document) document.write("<script src='assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
</script>
<script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
<!-- <script src="${pageContext.request.contextPath}/assets/js/typeahead-bs2.min.js"></script> -->

<!-- page specific plugin scripts -->
<script src="${pageContext.request.contextPath}/assets/js/date-time/bootstrap-datepicker.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/jqGrid/jquery.jqGrid.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/jqGrid/i18n/grid.locale-en.js"></script>
<!-- ace scripts -->
<script src="${pageContext.request.contextPath}/assets/js/date-time/bootstrap-datepicker.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/ace.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/common.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/allHandler.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/user/user-normal.js"></script>

</html>
