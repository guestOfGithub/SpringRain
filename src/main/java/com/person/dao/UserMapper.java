package com.person.dao;

import java.util.Map;

import com.person.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	User loginUser(Map<String, String> map);

	User existUserWithUserName(String userName);

	User existUserWithRoleId(Integer roleId);
}