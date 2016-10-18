package com.person.service;

import java.util.Map;

import com.person.entity.User;

public interface UserService extends BaseService<User> {
	// 登录
	public User loginUser(Map<String, String> map);

	// 通过用户名判断是否存在，（新增时不能重名）
	public User existUserWithUserName(String userName);

	// 通过角色判断是否存在
	public User existUserWithRoleId(Integer roleId);
}
