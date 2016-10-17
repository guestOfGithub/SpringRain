package com.person.controller;

import java.util.List;

import javax.enterprise.inject.New;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.person.entity.User;
import com.person.service.UserService;
import com.person.util.WriterUtil;

@Controller
@RequestMapping("/userCont")
public class UserController {
	
	@Autowired
	private UserService userService;
	WriterUtil WriterUtil=new WriterUtil();
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public void login(HttpServletRequest request,HttpServletResponse response){
		try {
			User user=new User();
			user.setPassword(request.getParameter("password"));
			user.setUsername(request.getParameter("username"));
			JSONObject jsonObj = new JSONObject();
			jsonObj.put("user",user );
	        WriterUtil.write(response,jsonObj.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
