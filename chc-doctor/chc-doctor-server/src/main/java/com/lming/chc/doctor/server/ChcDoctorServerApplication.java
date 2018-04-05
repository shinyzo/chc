package com.lming.chc.doctor.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ChcDoctorServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChcDoctorServerApplication.class, args);
	}
}
