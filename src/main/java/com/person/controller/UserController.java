package com.person.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.person.entity.User;
import com.person.service.UserService;

/**
 * 
 * @ClassName: UserController.java
 * @Description:User
 *
 * @version: v1.1.0
 * @author: She Xiangdong
 * @date: Oct 19, 2016 11:59:46 PM 
 *
 * Modification History:
 * Date         Author          Version            Description
 *------------------------------------------------------------
 * Oct 19, 2016     She Xiangdong          v1.1.0               修改原因
 */
@Controller
@RequestMapping("/userAction")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public String login(HttpServletRequest req, User user) {
		System.out.println(user.toString());
		User user1=new User();
		user1=userService.findUser(user);
		if (user1==null) {
			return "fail";
		}
		return "success";
	}

}
