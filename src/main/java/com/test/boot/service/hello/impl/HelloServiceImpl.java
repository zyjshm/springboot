package com.test.boot.service.hello.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.boot.dao.hello.HelloMapper;
import com.test.boot.entity.AreaBean;
import com.test.boot.service.BaseService;
import com.test.boot.service.hello.HelloService;

@Service
public class HelloServiceImpl extends BaseService implements HelloService
{
	@Autowired
	private HelloMapper helloMapper;
	
	public List<AreaBean> queryAreaList()
	{
		return helloMapper.queryAreaList();
	}
}
