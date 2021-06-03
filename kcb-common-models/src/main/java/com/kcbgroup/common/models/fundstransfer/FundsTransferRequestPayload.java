package com.kcbgroup.common.models.fundstransfer;

import java.io.Serializable;

/**
 * Funds Transfer Request Payload Model
 * 
 * @author Francisco Osorio | Bring Global
 * @version 1.0.0
 */
public class FundsTransferRequestPayload implements Serializable {
	/**Serial Version UID */
	private static final long serialVersionUID = -3627553778458829450L;
	
	private TransactionInfo transactionInfo;
	
	public FundsTransferRequestPayload() {
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
