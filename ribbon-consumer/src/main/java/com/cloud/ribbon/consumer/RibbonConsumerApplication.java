package com.cloud.ribbon.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan
@EnableDiscoveryClient
public class RibbonConsumerApplication  extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(RibbonConsumerApplication.class, args);
	}



	@Bean
	@Autowired
	@LoadBalanced
		//表示开启负载均衡
	RestTemplate restTemplate(){
		return  new RestTemplate();
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(RibbonConsumerApplication.class);
	}
}
