package com.cloud.feign.service;

import com.cloud.feign.rpc.GetHello;
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
    private GetHello getHello; //注入rpc


    public  String sayHello(){

        return getHello.sayHello();  //提供一个hello方法

    }
}    