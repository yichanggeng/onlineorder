package com.shop.onlineorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.onlineorder.entity.User;
import com.shop.onlineorder.service.TestService;

/**
 * 测试controller配置是否成功
 * @author Administrator
 *
 */

@Controller
@RequestMapping("/testCtrl")
public class TestController {
	
	@Autowired
	private TestService testService;

	@RequestMapping("/test.do")
	public String toTest(){
		return "test";
	}
	
	@RequestMapping("/json.do")
	@ResponseBody
	public User toJson(){
		return testService.selectByDate();
	}
	
	
	
}
