package com.tcf.cloud.hystrix.turbine.demo.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/***
 * TODO TCF Hystrix Turbine多服务监控组件启动类
 * @author 71485
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableTurbine
public class HystrixTurbineApplication {

	public static void main(String[] args) 
	{
		SpringApplication.run(HystrixTurbineApplication.class,args);
	}
	
}
