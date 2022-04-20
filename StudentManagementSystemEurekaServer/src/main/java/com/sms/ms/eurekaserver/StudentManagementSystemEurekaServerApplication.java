package com.sms.ms.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StudentManagementSystemEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemEurekaServerApplication.class, args);
	}

}
