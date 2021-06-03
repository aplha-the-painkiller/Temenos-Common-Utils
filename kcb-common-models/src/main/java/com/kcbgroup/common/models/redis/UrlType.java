package com.kcbgroup.common.models.redis;

public class UrlType {
	private String businessKey;
	private String businessKeyType;
	
	public String getBusinessKey() {
		return businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	public String getBusinessKeyType() {
		return businessKeyType;
	}

	public void setBusinessKeyType(String businessKeyType) {
		this.businessKeyType = businessKeyType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Data [bussinesKey=");
		builder.append(businessKey);
		builder.append(", businessKeyType=");
		builder.append(businessKeyType);				
		builder.append("]");
		return builder.toString();
	}
}
