package com.cloud.feign.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * desc :
 * author : wlh
 * date :
 **/
@FeignClient(value = "ribbon-provider")
public interface GetHello {

    @RequestMapping(value = "/hello1?name=feign",method = RequestMethod.GET)
    public String sayHello();

}    