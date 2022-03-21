package com.java.architectural.hexa.ports.api;

import com.java.architectural.hexa.model.PolicyDto;

/*
 * inbound port
 * */
public interface PolicyServicePort {

	PolicyDto createPolicy(PolicyDto policy);
	
	PolicyDto getPolicy(Integer policyNumber);
}
