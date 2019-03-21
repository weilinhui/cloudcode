package com.cloud.ribbon.controller;

import com.cloud.ribbon.pojo.UserBean;
import com.cloud.ribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * desc :
 * author : wlh
 * date :
 **/
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public  String sayHello(String name){
        return  helloService.sayHello()+": "+name;
    }


    @RequestMapping("login")
    public String login(UserBean userBean, HttpSession session){
        userBean = helloService.queryLogin(userBean);
        if(userBean!=null){
            session.setAttribute("user",userBean);
            return userBean.getUserRelname();
        }
        return "error";
    }
}    