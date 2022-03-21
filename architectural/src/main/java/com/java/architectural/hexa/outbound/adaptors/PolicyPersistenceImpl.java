package com.java.architectural.hexa.outbound.adaptors;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.java.architectural.hexa.model.PolicyDto;
import com.java.architectural.hexa.ports.spi.PolicyPersistencePort;

/*
 * Secondary Adaptor
 * */
@Repository
public class PolicyPersistenceImpl implements PolicyPersistencePort{

	private static List<PolicyDto> db = new ArrayList<PolicyDto>();
	public PolicyDto createPolicy(PolicyDto policy) {
		PolicyDto policyDto = new PolicyDto();
		policyDto.setPolicyNumber(policy.getPolicyNumber());
		policyDto.setPolicyType(policy.getPolicyType());
		policyDto.setPolicyRenew(policy.getPolicyRenew());
		policyDto.setAutoRenew(policy.isAutoRenew());
		db.add(policyDto);
		return policyDto;
	}

	public PolicyDto getPolicy(Integer policyNumber) {
		return db.stream().filter(r -> r.getPolicyNumber().equals(policyNumber)).findAny().orElse(null);
	}

}
