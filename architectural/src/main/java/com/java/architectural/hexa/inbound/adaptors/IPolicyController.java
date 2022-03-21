package com.java.architectural.hexa.inbound.adaptors;

import com.java.architectural.hexa.model.PolicyDto;

public interface IPolicyController {


	PolicyDto createPolicy(PolicyDto policy);
	
	PolicyDto getPolicy(Integer policyNumber);
	
}
