package com.cloud.ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan
@EnableDiscoveryClient
public class RibbonApplication {

	public static void main(String[] args) {

		SpringApplication.run(RibbonApplication.class, args);
	}


	@Bean
	@Autowired
	@LoadBalanced  //表示开启负载均衡
	RestTemplate restTemplate(){
		return  new RestTemplate();
	}

}
