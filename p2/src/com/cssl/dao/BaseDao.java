package com.cssl.dao;

import org.springframework.stereotype.Component;

@Component
public class BaseDao {
	public void getSession() {
		System.out.println("��BasedAo��ȡ��Session");
	}
}
