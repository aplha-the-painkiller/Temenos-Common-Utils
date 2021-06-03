package com.kcbgroup.common.models.reversal;

import java.io.Serializable;

/**
 * Reversal Request Payload Model
 * 
 * @author Stephen Okoth | KCB
 * @version 1.0.0
 */
public class ReversalRequestPayload implements Serializable {
	/** Serial Version UID */
	private static final long serialVersionUID = -3627553778458829450L;

	private TransactionInfo transactionInfo;

	public ReversalRequestPayload() {
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
		builder.append("RequestPayload [transactionInfo=");
		builder.append(transactionInfo);
		builder.append("]");
		return builder.toString();
	}
}
