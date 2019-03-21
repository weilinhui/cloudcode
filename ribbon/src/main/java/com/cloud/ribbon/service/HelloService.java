package com.cloud.ribbon.service;

import com.cloud.ribbon.mapper.UserBeanMapper;
import com.cloud.ribbon.pojo.UserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * desc :
 * author : wlh
 * date :
 **/
@Service
public class HelloService {

    @Autowired
    private UserBeanMapper userBeanMapper;

    public  String sayHello(){
        return "Hello";
    }


    public UserBean queryLogin(UserBean userBean){
        return userBeanMapper.queryLogin(userBean);
    }

}    