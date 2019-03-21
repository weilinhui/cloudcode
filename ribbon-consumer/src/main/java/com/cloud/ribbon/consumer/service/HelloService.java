package com.cloud.ribbon.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * desc :
 * author : wlh
 * date :
 **/
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public  String sayHello(){
        //调用provider服务
        System.out.println("通过rest  调用provider服务");
        return restTemplate.getForObject("http://ribbon-provider/hello?name=ribbon",String.class);
    }
}    