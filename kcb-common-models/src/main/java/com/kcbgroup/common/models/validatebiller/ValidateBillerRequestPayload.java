package com.kcbgroup.common.models.validatebiller;

import java.io.Serializable;

/**
 * Validate Biller Request Payload Model
 * 
 * @author Stephen Okoth | KCB
 * @version 1.0.0
 */
public class ValidateBillerRequestPayload implements Serializable {
	/**
	 * 
	 */
	/** Serial Version UID */
	private static final long serialVersionUID = 9051381313973133420L;
	
	private PrimaryData primaryData;  
    private AdditionalData additionalData;

	public ValidateBillerRequestPayload() {
	}
	
	public PrimaryData getPrimaryData() {
		return primaryData;
	}

	public void setPrimaryData(PrimaryData primaryData) {
		this.primaryData = primaryData;
	}
	
	public AdditionalData getAdditionalData() {
		return additionalData;
	}

	public void setAdditionalData(AdditionalData additionalData) {
		this.additionalData = additionalData;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RequestPayload [primaryData=");
		builder.append(primaryData);
		builder.append(", additionalData=");
		builder.append(additionalData);
		builder.append("]");
		return builder.toString();
	}

}
