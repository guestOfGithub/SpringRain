package com.person.dao;

import java.io.Serializable;
import java.util.List;

import com.person.entity.User;

public interface UserDao {
	int add(User user);

	int del(User user);

	int update(User user);

	User findOneById(Serializable Id);

	List<User> findAll();
}
