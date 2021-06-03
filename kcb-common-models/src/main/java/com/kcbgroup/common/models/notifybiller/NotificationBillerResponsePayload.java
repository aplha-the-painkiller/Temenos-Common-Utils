package com.kcbgroup.common.models.notifybiller;

import java.io.Serializable;

/**
 * Validate Biller Response Payload Model
 * 
 * @author Stephen Okoth | KCB
 * @version 1.0.0
 */
public class NotificationBillerResponsePayload implements Serializable {
	/**
	 * 
	 */
	/** Serial Version UID */
	private static final long serialVersionUID = -1390435216639519451L;

	private TransactionInfo transactionInfo;

	public NotificationBillerResponsePayload() {
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
