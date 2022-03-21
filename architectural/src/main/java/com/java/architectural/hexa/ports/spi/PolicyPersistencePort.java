package com.java.architectural.hexa.ports.spi;

/*
 * outbound port
 * */
import com.java.architectural.hexa.model.PolicyDto;

public interface PolicyPersistencePort {

	PolicyDto createPolicy(PolicyDto policy);
	
	PolicyDto getPolicy(Integer policyNumber);
	
}
