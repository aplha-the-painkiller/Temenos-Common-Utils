package com.kcbgroup.common.models.notifybiller;

import java.io.Serializable;

/**
 * Transaction Information Model Class
 * 
 * @author Stephen Okoth | KCB
 * @version 1.0.0
 */
public class TransactionInfo implements Serializable {
	/**
	 * 
	 */
	/** Serial version */
	private static final long serialVersionUID = -4779485671482188052L;

	private String transactionId;


	public TransactionInfo() {
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TransactionInfo [transactionId=");
		builder.append(transactionId);
		builder.append("]");
		return builder.toString();
	}
}
