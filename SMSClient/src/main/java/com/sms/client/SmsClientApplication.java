package com.sms.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.sms.client.bo.StudentDetails;
import com.sms.client.manager.SMSApiManager;

@SpringBootApplication
@EnableDiscoveryClient
public class SmsClientApplication {
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SmsClientApplication.class, args);
		/*
		 * SMSApiDiscoveryManager apiDiscoveryManager =
		 * context.getBean(SMSApiDiscoveryManager.class);
		 * 
		 * List<ServiceInstance> serviceInstances =
		 * apiDiscoveryManager.getStockApiServiceInstances();
		 * 
		 * serviceInstances.forEach(a -> System.out.println("PORTS.."+a.getHost() + ".."
		 * + a.getPort()));
		 */
		
		SMSApiManager smsApiManager = context.getBean(SMSApiManager.class);
		smsApiManager.getStudentDetailsById(9);
		
		StudentDetails studentDetails = new StudentDetails();
		studentDetails.setFirstName("TestClient");
		studentDetails.setLastName("Dicovery");
		studentDetails.setAge(26);
		studentDetails.setEmailId("test@xyz.com");
		studentDetails.setMobileNumber("2345365464");
		studentDetails.setGender("male");
		studentDetails.setStandard("6");
		studentDetails.setAddress("feign client");
		
		//smsApiManager.insertNewStudent(studentDetails);
	}

}
