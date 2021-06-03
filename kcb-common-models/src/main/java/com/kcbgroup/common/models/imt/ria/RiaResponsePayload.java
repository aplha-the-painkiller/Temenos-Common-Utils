/**
 * 
 */
package com.kcbgroup.common.models.imt.ria;

import java.io.Serializable;

/**
 * t24-account-balance-inquiry
 * Jun 29, 2020
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class RiaResponsePayload implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = 353652223581858774L;
 
    private SenderDetails primaryData; 
    private TransactionInfo transactionInfo;
    
    public RiaResponsePayload() {
	   super();
	}

	/**
	 * @return the primaryData
	 */
	public SenderDetails getPrimaryData() {
		return primaryData;
	}

	/**
	 * @param primaryData the primaryData to set
	 */
	public void setPrimaryData(SenderDetails primaryData) {
		this.primaryData = primaryData;
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
		builder.append("IMTResponsePayload [primaryData=");
		builder.append(primaryData);
		builder.append("]");
		return builder.toString();
	}
}
