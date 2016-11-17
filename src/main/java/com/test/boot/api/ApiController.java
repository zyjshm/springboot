package com.test.boot.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.test.boot.entity.AreaBean;
import com.test.boot.service.hello.HelloService;

@RequestMapping("/helloapi")
@RestController
public class ApiController {

	@Autowired
	private HelloService helloService;
	
	@RequestMapping(method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
	public @ResponseBody Object hello() {
    	List<AreaBean> list = helloService.queryAreaList();
        return list;
    }
}
