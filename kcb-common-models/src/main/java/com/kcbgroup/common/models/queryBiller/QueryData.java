package com.kcbgroup.common.models.queryBiller;

import java.io.Serializable;

/**
 * @author Gideon Mulandi | KCB
 * @version 1.0.0
 */

public class QueryData implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = -5445868424544143515L;
    
	private String businessKey; 
	private String businessKeyType;
	
	public QueryData() {
	}
	
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
		builder.append("QueryData [businessKey=");
		builder.append(businessKey);
		builder.append(", businessKeyType=");
		builder.append(businessKeyType);
		builder.append("]");
		return builder.toString();
	}
}
