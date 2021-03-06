package com.sms.client.manager;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.sms.client.bo.StudentDetails;

@Component
public class SMSApiManager {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private SMSApiDiscoveryManager smsApiDiscoveryManager;

	public void getStudentDetailsById(Integer studentId) {

		List<ServiceInstance> serviceInstances = null;
		StudentDetails studentDetails = null;

		String uri = null;

		serviceInstances = smsApiDiscoveryManager.getStockApiServiceInstances();

		for (ServiceInstance serviceInstance : serviceInstances) {
			uri = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/student/getStudent/"
					+ studentId;
		}

		System.out.println(uri);
		studentDetails = restTemplate.getForObject(uri, StudentDetails.class);
		System.out.println(studentDetails);

	}

	public void insertNewStudent(StudentDetails studentDetails) {
		List<ServiceInstance> serviceInstances = null;
		ResponseEntity<StudentDetails> studentDetailsresponse = null;

		String uri = null;

		serviceInstances = smsApiDiscoveryManager.getStockApiServiceInstances();
		for (ServiceInstance serviceInstance : serviceInstances) {
			uri = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/student/saveStudent";
		}
		
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		HttpEntity<StudentDetails> entity = new HttpEntity<StudentDetails>(studentDetails,headers);
		studentDetailsresponse = restTemplate.exchange(uri, HttpMethod.POST, entity, StudentDetails.class);
		
		System.out.println(studentDetailsresponse.getBody());
	      
	}
}
