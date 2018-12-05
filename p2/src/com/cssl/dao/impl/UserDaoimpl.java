package com.cssl.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cssl.dao.BaseDao;
import com.cssl.dao.UserDao;
import com.cssl.pojo.Users;
@Repository
public class UserDaoimpl implements UserDao{
   @Autowired
   private BaseDao bd;

@Override
public int addUser(Users user) {
	System.out.println("指定userDaoimpl 添加用户");
	bd.getSession();
	return user.getId();
}
}
