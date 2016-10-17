package com.person.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.person.dao.UserDao;
import com.person.entity.User;
import com.person.service.UserService;


/**
 * 
 * @ClassName: UserServiceImpl.java
 * @Description: Service实现
 *
 * @version: v1.1.0
 * @author: She Xiangdong
 * @date: Oct 17, 2016 10:41:46 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *------------------------------------------------------------
 * Oct 17, 2016     She Xiangdong          v1.1.0               修改原因
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	public UserDao userDao;

	@Override
	public void add(User user) throws Exception {
		// TODO Auto-generated method stub
		int result = 0; //受影响的行数默认为0
        try {
            result = userDao.add(user);
        } catch (Exception e) {
            System.out.println("添加用户失败,用户已经存在");
        }
        if (result > 0)
            System.out.println("添加用户成功");
	}

	@Override
	public User findUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return userDao.findOneById(1);
	}

}
