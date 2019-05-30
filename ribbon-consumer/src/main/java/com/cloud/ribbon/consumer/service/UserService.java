package com.cloud.ribbon.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.cloud.ribbon.pojo.UserBean;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by weilinhui on 2019/5/29.
 */
@Service
public class UserService {

	@Autowired
	RestTemplate restTemplate;

	public  UserBean queryUserById(){
		//调用provider服务
		System.out.println("通过rest  调用provider服务");
		return restTemplate.getForObject("http://ribbon-provider/queryUserById?fId=45",UserBean.class);
	}

	public  UserBean queryLogin(UserBean userBean){
		//调用provider服务
		System.out.println("通过rest  调用provider服务");
//		Map map = new HashMap();
//		map.put("fUserPhone",userBean.getfUserPhone());
//		map.put("fUserPassword",userBean.getfUserPassword());
		return restTemplate.postForObject("http://ribbon-provider/startLogin",userBean,UserBean.class);
	}
}
