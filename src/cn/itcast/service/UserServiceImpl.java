package cn.itcast.service;

import java.util.List;

import cn.itcast.dao.UserDao;
import cn.itcast.domain.User;

public class UserServiceImpl implements UserService{
	private UserDao userdao;
	
	public void setUserDao(UserDao userdao) {
		this.userdao = userdao;
	}
	@Override
	public void saveUser(User user) {
		this.userdao.save(user);
		
	}

	@Override
	public void updateUser(User user) {
		this.userdao.update(user);
		
	}

	@Override
	public void deleteUser(User user) {
		this.userdao.delete(user);
		
	}

	@Override
	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		return this.userdao.findById(id);
	}

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return this.userdao.findAll();
	}
	
}
