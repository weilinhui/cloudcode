package com.cloud.ribbon.controller;

import com.cloud.ribbon.pojo.UserBean;
import com.cloud.ribbon.service.UserServiceProviderImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

/**
 * desc :
 * author : wlh
 * date :
 **/
@RestController
public class UserControllerProvider {

    @Autowired
    private UserServiceProviderImpl userServiceProviderImpl;


	@GetMapping("/queryUserById")
	public  UserBean queryUserById(String fId)
	{
		UserBean bean = new UserBean();
		bean.setfId(Long.valueOf(fId));
		return  userServiceProviderImpl.queryUserById(bean);
	}

    @RequestMapping("login")
    public String login(UserBean userBean, HttpSession session){
        userBean = userServiceProviderImpl.queryLogin(userBean);
        if(userBean!=null){
            session.setAttribute("user",userBean);
            return userBean.getfUserRelname();
        }
        return "error";
    }

	@RequestMapping(value = "startLogin",method = RequestMethod.POST)
	public UserBean startLogin(@RequestBody UserBean userBean){
		userBean = userServiceProviderImpl.queryLogin(userBean);
		return userBean;
	}
}    