package com.zhang.mynews.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhang.mynews.manager.service.TestService;
import com.zhang.mynews.manager.dao.TestDao;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestDao testDao;
	
	public boolean login(String name, String pwd) {
		int i=testDao.login(name,pwd);
		System.out.println("结果条目："+i);
		return i>0;
	}

}
