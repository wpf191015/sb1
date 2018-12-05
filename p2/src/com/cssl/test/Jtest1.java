package com.cssl.test;



import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cssl.controller.UserController;
import com.cssl.pojo.Users;

public class Jtest1 {

	@Test
	public void test() {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		UserController bean=ctx.getBean(UserController.class);
		Users users=new Users(100,"123");
		bean.regUser(users);
	}

}
