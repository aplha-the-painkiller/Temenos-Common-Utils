
package com.kcbgroup.common.models.notifybiller;

import java.io.Serializable;

/**
 * Primary Data Model Class
 * 
 * @author Stephen Okoth | KCB
 * @version 1.0.0
 */
public class PrimaryData implements Serializable {
	/**
	 * 
	 */
	/** Serial version UID */
	private static final long serialVersionUID = 7946240545762628738L;
 
	private String businessKey; 
	private String businessKeyType;
    
    public PrimaryData() {
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
		builder.append("PrimaryData [businessKey=");
		builder.append(businessKey);
		builder.append(", businessKeyType=");
		builder.append(businessKeyType);
		builder.append("]");
		return builder.toString();
	}
}
