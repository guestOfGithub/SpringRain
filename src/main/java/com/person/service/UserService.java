package com.person.service;

import com.person.entity.User;

/**
 * @ClassName: UserService.java
 * @Description: UserService接口
 *
 * @version: v1.1.0
 * @author: She Xiangdong
 * @date: Oct 19, 2016 11:19:13 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *------------------------------------------------------------
 * Oct 19, 2016     She Xiangdong          v1.1.0               修改原因
 */
public interface UserService extends BaseService<User> {
	User findUser(User user);
}
