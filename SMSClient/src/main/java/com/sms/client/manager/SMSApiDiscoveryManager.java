package com.sms.client.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;


@Component
public class SMSApiDiscoveryManager {
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	public List<ServiceInstance> getStockApiServiceInstances() {
		return discoveryClient.getInstances("SMS-MICROSERVICE");
		}

}
