/**
 * 
 */
package com.kcbgroup.common.models.businesstransfer;

import java.io.Serializable;

/**
 * kcb-common-models
 * Sep 18, 2020
 * PrimaryData.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class CallBackResult implements Serializable {
    /** Serial version UID */
	private static final long serialVersionUID = -8478981958316046120L;
 
    private TransactionInfo transactionInfo;

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
		builder.append("BusinessTransferResponsePayload [transactionInfo=");
		builder.append(transactionInfo);
		builder.append("]");
		return builder.toString();
	}  
}
