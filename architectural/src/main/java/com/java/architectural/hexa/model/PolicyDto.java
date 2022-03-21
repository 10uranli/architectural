package com.java.architectural.hexa.model;

//value object
public class PolicyDto {

	private Integer policyNumber;
	private Integer policyRenew;
	private String policyType;
	private boolean autoRenew;
	
	public Integer getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(Integer policyNumber) {
		this.policyNumber = policyNumber;
	}
	public Integer getPolicyRenew() {
		return policyRenew;
	}
	public void setPolicyRenew(Integer policyRenew) {
		this.policyRenew = policyRenew;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public boolean isAutoRenew() {
		return autoRenew;
	}
	public void setAutoRenew(boolean autoRenew) {
		this.autoRenew = autoRenew;
	}
	
}
