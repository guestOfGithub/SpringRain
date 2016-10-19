package com.person.service.serviceImpl;

import java.util.HashMap;
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
		
	}

	@Override
	public void updateObject(User t) {
		// TODO Auto-generated method stub

	}

	@Override
	public User findUser(User user) {
		Map<String, String> map=new HashMap<>();
		map.put("username", user.getLoginname());
		map.put("password", user.getPassword());
		System.out.println(map);
		return userMapper.loginUser(map);
	}

}
