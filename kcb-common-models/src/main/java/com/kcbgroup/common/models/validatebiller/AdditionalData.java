package com.kcbgroup.common.models.validatebiller;

import java.io.Serializable;

/**
 * Additional Data Model Class
 * 
 * @author Stephen Okoth | KCB
 * @version 1.0.0
 */
public class AdditionalData implements Serializable {
	/**
	 * 
	 */
	/** Serial version */
	private static final long serialVersionUID = 6531955705473920437L;
 
	private ValidationData validationData; 
	
	public AdditionalData() {
	}

	public ValidationData getValidationData() {
		return validationData;
	}

	public void setValidationData(ValidationData validationData) {
		this.validationData = validationData;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AdditionalData [validationData=");
		builder.append(validationData);
		builder.append("]");
		return builder.toString();
	}
}