package com.java.architectural.hexa.inbound.adaptors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.architectural.hexa.model.PolicyDto;
import com.java.architectural.hexa.ports.api.PolicyServicePort;

/*
 * Primary Adaptor
 * */
@RestController
@RequestMapping("/policy")
public class PolicyController implements IPolicyController {
	
	@Autowired
	private PolicyServicePort policyService;
	
	@PostMapping("/create")
	public PolicyDto createPolicy(@RequestBody PolicyDto policy) {
		return policyService.createPolicy(policy);
	}

	@GetMapping("/get/{policyNumber}")
	public PolicyDto getPolicy(@PathVariable Integer policyNumber) {
		return policyService.getPolicy(policyNumber);
	}

}
