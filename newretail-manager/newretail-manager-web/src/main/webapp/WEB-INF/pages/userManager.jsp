<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<div id="user_page">
	<!--页面路径-->
	<div class="breadcrumbs" id="breadcrumbs">
		<ul class="breadcrumb">
			<li>
				<i class="icon-home home-icon"></i>
				<a href="#">首页</a>
			</li>
			<li class="active">用户管理</li>
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
			<!--基础按钮-->
				<button class="btn btn-xs btn-info" id="query">查看</button>
				<button class="btn btn-xs btn-info" id="add">新增</button>
				<button class="btn btn-xs btn-info" id="edit">编辑</button>
				<button class="btn btn-xs btn-info" id="delete">删除</button>
				<button class="btn btn-xs btn-info" id="fresh">刷新</button>
				
			</div>
			
		<div class="row" id="mainCon">
			<div class="col-xs-12">
				<table id="managerDataGrid" >
					<th>
					<td fieldName="id" displayName="ID" width="20"></td>
					<td fieldName="username" displayName="姓名" width="20"></td>
					<td fieldName="sex" displayName="性别" width="20"></td>
					<td fieldName="phone" displayName="电话号码 " width="20"></td>
					<td fieldName="email" displayName="邮箱" width="20"></td>
					<td fieldName="createTime" displayName="创建时间" width="20"></td>
					<td fieldName="updateTime" displayName="更新时间" width="20"></td>
					</th>
				</table>
				<div id="grid-pager"></div>
			</div>
		</div>
	</div>
	<!--主页面内容 end-->
	
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

		<!-- 查看详情 -->
		<div class="modal fade" id="userDataInfo" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
							&times;
						</button>
						<h4 class="modal-title" id="myModalLabel">
							查看详情
						</h4>
					</div>
					<div class="modal-body clearfix">
						<div class="col-lg-4 col-md-4 col-sm-4 align-left" style="padding: 5px 0">用户名：<span id="username"></span></div>
						<div class="col-lg-4 col-md-4 col-sm-4 align-left" style="padding: 5px 0">性别：<span id="sex"></span></div>
						<div class="col-lg-4 col-md-4 col-sm-4 align-left" style="padding: 5px 0">电话：<span id="phone"></span></div>
						<div class="col-lg-4 col-md-4 col-sm-4 align-left" style="padding: 5px 0">邮箱：<span id="email"></span></div>
						<div class="col-lg-4 col-md-4 col-sm-4 align-left" style="padding: 5px 0">创建时间：<span id="createTime"></span></div>
						<div class="col-lg-4 col-md-4 col-sm-4 align-left" style="padding: 5px 0">更新时间：<span id="updateTime"></span></div>
					</div>
					<div class="modal-footer">
						<!-- <button type="button" class="btn btn-default" data-dismiss="modal">取消
						</button> -->
						<button type="button" class="btn btn-primary cancelBtn" >确认</button>
						<!-- <button type="button" class="btn btn-primary" onclick="page.toEdit()">
							编辑
						</button> -->
						<!-- <button type="button" class="btn btn-primary" onclick="page.save()">
							保存
						</button> -->
					</div>
				</div><!-- /.modal-content -->
			</div><!-- /.modal -->
			</div>
		<!--新增区-->
			<div class="modal fade" id="userAddForm" tabindex="-1" role="dialog"  aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog" >
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
							&times;
						</button>
						<h4 class="modal-title" id="myModalLabel">
							查看详情
						</h4>
					</div>
					
          <div class="modal-body">
            <div>
              <table width="100%" border="0" class="userCon_2">
              	<tr>
                  <th width="30%">用户名：</th>
                  <td width="70%">
                    <input type="text" name="username" class="form-control" style="border-radius:3px; width:220px;" id="username" required="" aria-required="true">
                  </td>
                </tr>
              	<tr>
                  <th width="30%">用户密码：</th>
                  <td width="70%">
                    <input type="text" name="passowrd" class="form-control" style="border-radius:3px; width:220px;" id="password" required="" aria-required="true">
                  </td>
                </tr>
                <tr>
                  <th width="30%">性别：</th>
                  <td width="70%">
                    <input type="text" name="sex" class="form-control" style="border-radius:3px; width:220px;" id="sex" required="" aria-required="true">
                  </td>
                </tr>
                <tr>
                  <th width="30%">电话：</th>
                  <td width="70%">
                    <input type="text" name="phone" class="form-control" style="border-radius:3px; width:220px;" id="phone" required="" aria-required="true">
                  </td>
                </tr>
                <tr>
                  <th width="30%">邮箱：</th>
                  <td width="70%">
                    <input type="text" name="email" class="form-control" style="border-radius:3px; width:220px;" id="email" required="" aria-required="true">
                  </td>
                </tr>
                <!-- <tr>
                  <th>动作类型：</th>
                  <td>
                    <select class="selectpicker show-tick" id="txtType" style="height: 30px; width: 220px;" name="Type">
                      <option value="view">view</option>
                      <option value="click">click</option>
                    </select>
                  </td>
                </tr> -->
              </table>
            </div>
          </div>
          <div class="modal-footer" style="border-top:none;">
            <button type="button" class="btn btn-default close" data-dismiss="modal" id="btnClose">关闭</button>
            <button type="submit" class="btn btn-primary" id="btnSave">保存</button>
          </div>
      </div><!-- /.modal-content -->
    </div><!-- /.modal -->

			</div>
			
	<!--更新区-->
			<div class="modal fade" id="userUpdateForm" tabindex="-1" role="dialog"  aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog" >
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">
							&times;
						</button>
						<h4 class="modal-title" id="myModalLabel">
							查看详情
						</h4>
					</div>

          <div class="modal-body">
            <div>
              <table width="100%" border="0" class="userCon_2">
              <tr>
                  <th width="30%">id：</th>
                  <td width="70%">
                    <input type="text" name="id" class="form-control" style="border-radius:3px; width:220px;" id="id" required="" readonly="true" aria-required="true">
                  </td>
                </tr>
                <tr>
                  <th width="30%">用户名：</th>
                  <td width="70%">
                    <input type="text" name="username" class="form-control" style="border-radius:3px; width:220px;" id="username" required="" aria-required="true">
                  </td>
                </tr>
              <tr>
                  <th width="30%">用户密码：</th>
                  <td width="70%">
                    <input type="text" name="passowrd" class="form-control" style="border-radius:3px; width:220px;" id="password" required="" aria-required="true">
                  </td>
                </tr>
                <tr>
                  <th width="30%">性别：</th>
                  <td width="70%">
                    <input type="text" name="sex" class="form-control" style="border-radius:3px; width:220px;" id="sex" required="" aria-required="true">
                  </td>
                </tr>
                <tr>
                  <th width="30%">电话：</th>
                  <td width="70%">
                    <input type="text" name="phone" class="form-control" style="border-radius:3px; width:220px;" id="phone" required="" aria-required="true">
                  </td>
                </tr>
                <tr>
                  <th width="30%">邮箱：</th>
                  <td width="70%">
                    <input type="text" name="email" class="form-control" style="border-radius:3px; width:220px;" id="email" required="" aria-required="true">
                  </td>
                </tr>
                <!-- <tr>
                  <th>动作类型：</th>
                  <td>
                    <select class="selectpicker show-tick" id="txtType" style="height: 30px; width: 220px;" name="Type">
                      <option value="view">view</option>
                      <option value="click">click</option>
                    </select>
                  </td>
                </tr> -->
              </table>
            </div>
          </div>
          <div class="modal-footer" style="border-top:none;">
            <button type="button" class="btn btn-default close" data-dismiss="modal" id="btnClose">关闭</button>
            <button type="submit" class="btn btn-primary" id="btnUpdate">保存</button>
          </div>
      </div><!-- /.modal-content -->
    </div><!-- /.modal -->

			</div>		
</div>
<script src="/js/common.js"></script>
<script src="/js/userManager/common/dataGridUtils.js"></script>
<script src="/js/userManager/service/userService.js"></script>
<script src="/js/userManager/pages/user.js"></script>