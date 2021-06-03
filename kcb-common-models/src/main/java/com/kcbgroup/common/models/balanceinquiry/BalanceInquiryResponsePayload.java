/**
 * 
 */
package com.kcbgroup.common.models.balanceinquiry;

import java.io.Serializable;

/**
 * t24-account-balance-inquiry
 * Jun 29, 2020
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class BalanceInquiryResponsePayload implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = 353652223581858774L;
 
    private PrimaryData primaryData; 
    private AdditionalData additionalData;
    
    public BalanceInquiryResponsePayload() {
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
		builder.append("ResponsePayload [primaryData=");
		builder.append(primaryData);
		builder.append(", additionalData=");
		builder.append(additionalData);
		builder.append("]");
		return builder.toString();
	}
}
