package com.cssl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.cssl.pojo.Users;
import com.cssl.service.UserService;

@Controller("usercon")
public class UserController {
	@Autowired
	private UserService us;
	
    public void regUser(Users users) {
    	System.out.println("ÓÃ»§×¢²á");
    	System.out.println("rs:"+(us.addUser(users)>0?"ok":"no"));
    }
}
