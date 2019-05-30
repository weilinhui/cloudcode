package com.cloud.ribbon.consumer.controller;

import com.cloud.ribbon.consumer.service.UserService;
import com.cloud.ribbon.pojo.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by weilinhui on 2019/5/29.
 */
@Controller
public class UserController {


	@Autowired
	private UserService userService;

	@GetMapping("/queryUserById")
	@ResponseBody
	public  String queryUserById(String name){
		return  userService.queryUserById().toString();
	}

	@RequestMapping("login")
	public  String testDemo(){
		return "login";
	}

	@RequestMapping("startLogin")
	@ResponseBody
	public Map<String, Object> startLogin(UserBean bean, HttpSession session){
		Map<String, Object> map = new HashMap<String, Object>();
		UserBean user = userService.queryLogin(bean);
		if(user!=null){
			map.put("status","0");
			session.setAttribute("user",user);
			return map;
		}else{
			map.put("status","1");
		}
		return map;
	}

	@RequestMapping("index")
	public  String index(){
		return "index";
	}

}



