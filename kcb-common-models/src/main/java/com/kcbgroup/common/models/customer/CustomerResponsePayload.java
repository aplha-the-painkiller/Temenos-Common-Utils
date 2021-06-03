/**
 * 
 */
package com.kcbgroup.common.models.customer;

import java.io.Serializable;


/**
 * kcb-common-models
 * Sep 18, 2020
 * BalanceInquiryResponsePayload.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class CustomerResponsePayload implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = 353652223581858774L;
 
    private TransactionInfo transactionInfo;
    
    public CustomerResponsePayload() {
		super();
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CustomerResponsePayload [transactionInfo=");
		builder.append(transactionInfo);
		builder.append("]");
		return builder.toString();
	}
}
