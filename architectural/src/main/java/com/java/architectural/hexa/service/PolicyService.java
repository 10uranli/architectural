package com.java.architectural.hexa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.architectural.hexa.model.PolicyDto;
import com.java.architectural.hexa.ports.api.PolicyServicePort;
import com.java.architectural.hexa.ports.spi.PolicyPersistencePort;

//domain, teknolojik bagımlılık az olmalı
//core ve datasource iletisim.
@Service
public class PolicyService implements PolicyServicePort{
	
	@Autowired
	private PolicyPersistencePort persistencePort;
	/*
	public PolicyService(PolicyPersistencePort persistencePort) {
		this.persistencePort = persistencePort;
	}
*/
	public PolicyDto createPolicy(PolicyDto policy) {
		return persistencePort.createPolicy(policy);
	}

	public PolicyDto getPolicy(Integer policyNumber) {
		return persistencePort.getPolicy(policyNumber);
	}

}
