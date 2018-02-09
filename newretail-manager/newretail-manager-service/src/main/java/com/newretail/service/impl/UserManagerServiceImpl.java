package com.newretail.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.newretail.common.utils.IdGenerator;
import com.newretail.mapper.UserAdminTableMapper;
import com.newretail.mapper.UserDeliveryTableMapper;
import com.newretail.mapper.UserSellerTableMapper;
import com.newretail.mapper.UserTableMapper;
import com.newretail.pojo.UserAdminTable;
import com.newretail.pojo.UserAdminTableExample;
import com.newretail.pojo.UserDeliveryTable;
import com.newretail.pojo.UserDeliveryTableExample;
import com.newretail.pojo.UserSellerTable;
import com.newretail.pojo.UserSellerTableExample;
import com.newretail.pojo.UserTable;
import com.newretail.pojo.UserTableExample;
import com.newretail.service.UserManagerService;;

/**
 * @Description 用户管理服务实现类
 * @author Administrator
 *
 */
@Service("userManagerService")
public class UserManagerServiceImpl implements UserManagerService {
	@Autowired
	private UserAdminTableMapper adminMapper;
	@Autowired
	private UserTableMapper userMapper;
	@Autowired
	private UserSellerTableMapper sellerMapper;
	@Autowired
	private UserDeliveryTableMapper deliveryMapper;
	@Override
	public int addAdmin(UserAdminTable admin) {
		//userMapper.insertSelective(record);
		admin.setId(IdGenerator.getId());	
		return adminMapper.insertSelective(admin);
	}

	@Override
	public int delAdminById(String id) {
		return 	adminMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateAdmin(UserAdminTable admin) {
		
		return adminMapper.updateByPrimaryKey(admin);
	}

	@Override
	public UserAdminTable querAdminById(String id) {
		
		return adminMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<UserAdminTable> queryAdminList() {
		return adminMapper.selectByExample(new UserAdminTableExample());
	}

	@Override
	public int delUserById(String id) {
		
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateUser(UserTable user) {
		return userMapper.updateByPrimaryKey(user);
	}

	@Override
	public UserTable querUserById(String id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int addSeller(UserTable user, UserSellerTable seller) {
		user.setId(IdGenerator.getId());
		seller.setId(IdGenerator.getId());
		try {
			int i=userMapper.insert(user);
			if(i<=0){
				throw new Exception("添加失败");
			}
			i=sellerMapper.insert(seller);
			if(i<=0){
				throw new Exception("添加失败");
			}
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public UserSellerTable querySellerById(String id) {
		return sellerMapper.selectByPrimaryKey(id);
	}

	@Override
	public int delSellerById(String id,String userid) {
		try {
			int i=userMapper.deleteByPrimaryKey(userid);
			if(i<=0){
				throw new Exception("删除失败");
			}
			i=sellerMapper.deleteByPrimaryKey(id);
			if(i<=0){
				throw new Exception("删除失败");
			}
			return i;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public int updateSeller(UserTable user, UserSellerTable seller) {
		try {
			int i=userMapper.updateByPrimaryKey(user);
			if(i<=0){
				throw new Exception("更新失败");
			}
			i=sellerMapper.updateByPrimaryKey(seller);
			if(i<=0){
				throw new Exception("更新失败");
			}
			return i;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public int addDelivery(UserTable user, UserDeliveryTable delivery) {
		try {
			int i=userMapper.insert(user);
			if(i<=0){
				throw new Exception("添加失败");
			}
			i=deliveryMapper.insert(delivery);
			if(i<=0){
				throw new Exception("添加失败");
			}
			return i;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public UserDeliveryTable queryDeliveryById(String id) {
		return deliveryMapper.selectByPrimaryKey(id);
	}

	@Override
	public int delDeliveryById(String id,String userid) {
		try {
			int i=userMapper.deleteByPrimaryKey(userid);
			if(i<=0){
				throw new Exception("删除失败");
			}
			i=deliveryMapper.deleteByPrimaryKey(id);
			if(i<=0){
				throw new Exception("删除失败");
			}
			return i;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public int updateDelivery(UserTable user, UserDeliveryTable delivery) {
		try {
			int i=userMapper.updateByPrimaryKey(user);
			if(i<=0){
				throw new Exception("更新失败");
			}
			i=deliveryMapper.updateByPrimaryKey(delivery);
			if(i<=0){
				throw new Exception("更新失败");
			}
			return i;
		} catch (Exception e) {
			return 0;
		}
	}

	@Override
	public List<UserSellerTable> querySellerList() {
		return sellerMapper.selectByExample(new UserSellerTableExample());
	}

	@Override
	public List<UserTable> queryUserList() {
		return userMapper.selectByExample(new UserTableExample());
	}

	@Override
	public List<UserDeliveryTable> queryDeliveryList() {
		return deliveryMapper.selectByExample(new UserDeliveryTableExample());
	}

	@Override
	public int updateSellerCheckStatus(UserSellerTable seller) {
		return sellerMapper.updateByPrimaryKey(seller);
	}

	@Override
	public int updateDeliveryCheckStatus(UserDeliveryTable delivery) {
		return deliveryMapper.updateByPrimaryKey(delivery);
	}

}
