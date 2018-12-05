package com.cssl.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cssl.dao.UserDao;
import com.cssl.pojo.Users;
import com.cssl.service.UserService;
@Service("")
public class UserServiceImpl implements UserService {
    @Resource(name="oracleUS")
    private UserDao ud;
	@Override
	public int addUser(Users user) {
		System.out.println("这是业务逻辑。。。");
		return ud.addUser(user);
	}

}
