package com.sms.discoveryclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.sms.discoveryclient.manager.SMSApiManager;

@SpringBootApplication
@EnableDiscoveryClient
public class SmsDiscoveryClientApplication {

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SmsDiscoveryClientApplication.class, args);

		SMSApiManager smsApiManager = context.getBean(SMSApiManager.class);
		smsApiManager.getStudentDetails(2);

		/*
		 * List<ServiceInstance> serviceInstances =
		 * smsApiDiscoveryManager.getSMSServiceInstances();
		 * 
		 * serviceInstances .forEach(si ->
		 * System.out.println("SMS Ports are running with :" + si.getHost() + ":" +
		 * si.getPort()));
		 */
	}

}
