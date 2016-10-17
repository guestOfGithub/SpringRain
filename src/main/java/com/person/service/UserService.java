package com.person.service;

import com.person.entity.User;

public interface UserService {
	void add(User user) throws Exception;

	User findUser(User user) throws Exception;
}
