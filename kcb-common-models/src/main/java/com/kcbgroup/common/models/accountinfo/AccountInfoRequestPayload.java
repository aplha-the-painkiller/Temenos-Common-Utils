/**
 * 
 */
package com.kcbgroup.common.models.accountinfo;

import java.io.Serializable;

/**
 * kcb-common-models
 * Sep 18, 2020
 * BalanceInquiryRequestPayload.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class AccountInfoRequestPayload implements Serializable {

	/** Serial version */
	private static final long serialVersionUID = 7868310611900741033L;

    private PrimaryData primaryData;  
    private AdditionalData additionalData;
    
    public AccountInfoRequestPayload() {
		super();
	}

	/**
	 * @return the primaryData
	 */
	public PrimaryData getPrimaryData() {
		return primaryData;
	}

	/**
	 * @param primaryData the primaryData to set
	 */
	public void setPrimaryData(PrimaryData primaryData) {
		this.primaryData = primaryData;
	}

	/**
	 * @return the additionalData
	 */
	public AdditionalData getAdditionalData() {
		return additionalData;
	}

	/**
	 * @param additionalData the additionalData to set
	 */
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
