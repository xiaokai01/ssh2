package cn.itcast.dao;

import java.util.List;

import cn.itcast.domain.User;

public interface UserDao {
	public void save(User user);

	public void update(User user);

	public void delete(User user);

	public User findById(Integer id);

	public List<User> findAll();
}
