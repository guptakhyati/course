package com.code.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.code.entity.College;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class ApiCall {
	
	private static final Logger logger = LoggerFactory.getLogger(ApiCall.class);
	@Autowired RestTemplate restTemplate;
	
	private static final String collegeMicroserviceBaseUrl="http://college-service";
	
	@CircuitBreaker(name="example",fallbackMethod="fallback")
	public College getCollegeDetails(int collegeid) {
		logger.info("calling college microservice API using RestTemplate");
		College college= restTemplate.getForObject(collegeMicroserviceBaseUrl + "/college/id?id={collegeId}", College.class, collegeid);
		return college;
	}
	
	public College fallback(Exception ex) {
		
		logger.info("calling fallback and returning default college data");
		College college = new College();
		college.setId(1);
		college.setCollegeName("Default College");
		college.setCollegeCountry("India");
		college.setCollegeState("New Delhi");
		college.setCollegeCity("New Delhi");
		college.setCollegeImages("Default Image");
		
		return college;
	}

}
