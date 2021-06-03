/**
 * 
 */
package com.kcbgroup.common.models.businesstransfer;

import java.io.Serializable;

/**
 * kcb-common-models
 * Sep 18, 2020
 * BalanceInquiryRequestPayload.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class BusinessTransferRequestPayload implements Serializable {

	/** Serial version */
	private static final long serialVersionUID = 7868310611900741033L;

    private TransactionInfo transactionInfo;  
    private AdditionalDetails additionalDetails;
    private OptionalDetails optionalDetails;
    
    
	/**
	 * 
	 */
	public BusinessTransferRequestPayload() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the transactionInfo
	 */
	public TransactionInfo getTransactionInfo() {
		return transactionInfo;
	}
	/**
	 * @param transactionInfo the transactionInfo to set
	 */
	public void setTransactionInfo(TransactionInfo transactionInfo) {
		this.transactionInfo = transactionInfo;
	}
	/**
	 * @return the additionalDetails
	 */
	public AdditionalDetails getAdditionalDetails() {
		return additionalDetails;
	}
	/**
	 * @param additionalDetails the additionalDetails to set
	 */
	public void setAdditionalDetails(AdditionalDetails additionalDetails) {
		this.additionalDetails = additionalDetails;
	}
	/**
	 * @return the optionalDetails
	 */
	public OptionalDetails getOptionalDetails() {
		return optionalDetails;
	}
	/**
	 * @param optionalDetails the optionalDetails to set
	 */
	public void setOptionalDetails(OptionalDetails optionalDetails) {
		this.optionalDetails = optionalDetails;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BusinessTransferRequestPayload [transactionInfo=");
		builder.append(transactionInfo);
		builder.append(", additionalDetails=");
		builder.append(additionalDetails);
		builder.append(", optionalDetails=");
		builder.append(optionalDetails);
		builder.append("]");
		return builder.toString();
	}

    

}
