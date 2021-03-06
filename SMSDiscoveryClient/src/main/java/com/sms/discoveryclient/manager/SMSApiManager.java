package com.sms.discoveryclient.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.sms.discoveryclient.bos.StudentDetails;

@Component
public class SMSApiManager {

	@Autowired
	private SMSApiDiscoveryManager smsApiDiscoveryManager;

	@Autowired
	private RestTemplate restTemplate;

	public void getStudentDetails(Integer StudentId) {

		List<ServiceInstance> serviceInstances = null;
		String uri = null;
		StudentDetails details = null;

		serviceInstances = smsApiDiscoveryManager.getSMSServiceInstances();

		for (ServiceInstance serviceInstance : serviceInstances) {
			
			System.out.println(serviceInstance.getHost() + ":" + serviceInstance.getPort());
			
			uri = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/student/getStudent/"
					+ StudentId;
		}

		details = restTemplate.getForObject(uri, StudentDetails.class);
		System.out.println(details);

	}

}
