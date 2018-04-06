package com.lming.chc.personal.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableEurekaClient
@EnableTransactionManagement
@MapperScan(basePackages = "com.lming.chc.personal.server.mapper")
@ServletComponentScan
public class ChcPersonalServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChcPersonalServerApplication.class, args);
	}
}
