package com.person.service.serviceImpl;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.person.dao.UserMapper;
import com.person.entity.User;
import com.person.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void addObject(User user) {
		userMapper.insert(user);
	}

	@Override
	public void deleteObject(Long id) {
		userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public void updateObject(User t) {
		userMapper.updateByPrimaryKey(t);
	}

	@Override
	public User loginUser(Map<String, String> map) {
		return userMapper.loginUser(map);
	}

	@Override
	public User existUserWithUserName(String userName) {
		return userMapper.existUserWithUserName(userName);
	}

	@Override
	public User existUserWithRoleId(Integer roleId) {
		return userMapper.existUserWithRoleId(roleId);
	}

}
