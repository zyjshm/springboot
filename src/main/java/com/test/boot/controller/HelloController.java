package com.test.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.test.boot.entity.AreaBean;
import com.test.boot.service.hello.HelloService;

@Controller
public class HelloController {
	
	@Autowired
	private HelloService helloService;
	
    @RequestMapping("/hello")
    @ResponseBody
    int home() {
    	List<AreaBean> list = helloService.queryAreaList();
    	System.out.println(list.size());
        return list.size();
    }
}
