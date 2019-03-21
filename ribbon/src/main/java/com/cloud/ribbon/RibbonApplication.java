package com.cloud.ribbon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@EnableDiscoveryClient
@MapperScan("com.cloud.ribbon.mapper")
public class RibbonApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {

		SpringApplication.run(RibbonApplication.class, args);
	}


	@Bean
	@Autowired
	@LoadBalanced  //表示开启负载均衡
	RestTemplate restTemplate(){
		return  new RestTemplate();
	}


	/**
	 * desc : 若打成war包放进web容器,需要继承并实现configure方法
	 */

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(RibbonApplication.class);
	}


}
