package com.cloud.ribbon.service;

import com.cloud.ribbon.mapper.UserBeanMapper;
import com.cloud.ribbon.pojo.UserBean;
import com.cloud.ribbon.servcie.UserserviceProvide;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * desc :
 * author : wlh
 * date :
 **/
@Service
public class UserServiceProviderImpl implements UserserviceProvide{

	@Autowired
	private UserBeanMapper userBeanMapper;


	public UserBean queryLogin(UserBean userBean){
		return userBeanMapper.queryLogin(userBean);
	}

	@Override
	public UserBean queryUserById(UserBean userBean){
		return userBeanMapper.selectByPrimaryKey(userBean.getfId());
	}



}