package com.cssl.dao;

import org.springframework.stereotype.Component;

@Component
public class BaseDao {
	public void getSession() {
		System.out.println("从BasedAo获取到Session");
	}
}
