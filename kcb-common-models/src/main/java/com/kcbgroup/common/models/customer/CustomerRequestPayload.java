/**
 * 
 */
package com.kcbgroup.common.models.customer;

import java.io.Serializable;

/**
 * kcb-common-models
 * Sep 18, 2020
 * CustomRequestPayload.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class CustomerRequestPayload implements Serializable {

	/** Serial version */
	private static final long serialVersionUID = 7868310611900741033L;
	
	private TransactionInfo transactionInfo;
	
	public CustomerRequestPayload() {
		super();
	}

	public TransactionInfo getTransactionInfo() {
		return transactionInfo;
	}

	public void setTransactionInfo(TransactionInfo transactionInfo) {
		this.transactionInfo = transactionInfo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResponsePayload [transactionInfo=");
		builder.append(transactionInfo);
		builder.append("]");
		return builder.toString();
	}
}
