package com.kcbgroup.common.models.reversal;

import java.io.Serializable;

/**
 * Transaction Information Model Class
 * 
 * @author Stephen Okoth | KCB
 * @version 1.0.0
 */
public class TransactionInfo implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = -1110163464484167223L;

	private String companyCode;
	private String transactionID;
	private String falconBalance;

	public TransactionInfo() {
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	
	public String getFalconBalance() {
		return falconBalance;
	}

	public void setFalconBalance(String falconBalance) {
		this.falconBalance = falconBalance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TransactionInfo [companyCode=");
		builder.append(companyCode);
		builder.append(", transactionID=");
		builder.append(transactionID);
		builder.append(", falconBalance=");
		builder.append(falconBalance);
		builder.append("]");
		return builder.toString();
	}
}
