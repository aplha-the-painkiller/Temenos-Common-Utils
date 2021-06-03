package com.kcbgroup.common.models.fundstransfer.lock;

import java.io.Serializable;

public class CreateUnlockResponse implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1613314122748228279L;
	private String statusCode;
	private String statusDescription;
	private String originalTransactionRef;
	private String darajaRefNo;
	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}
	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	/**
	 * @return the statusDescription
	 */
	public String getStatusDescription() {
		return statusDescription;
	}
	/**
	 * @param statusDescription the statusDescription to set
	 */
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
	/**
	 * @return the originalTransactionRef
	 */
	public String getOriginalTransactionRef() {
		return originalTransactionRef;
	}
	/**
	 * @param originalTransactionRef the originalTransactionRef to set
	 */
	public void setOriginalTransactionRef(String originalTransactionRef) {
		this.originalTransactionRef = originalTransactionRef;
	}
	/**
	 * @return the darajaRefNo
	 */
	public String getDarajaRefNo() {
		return darajaRefNo;
	}
	/**
	 * @param darajaRefNo the darajaRefNo to set
	 */
	public void setDarajaRefNo(String darajaRefNo) {
		this.darajaRefNo = darajaRefNo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CreateUnlockResponse [statusCode=");
		builder.append(statusCode);
		builder.append(", statusDescription=");
		builder.append(statusDescription);
		builder.append(", originalTransactionRef=");
		builder.append(originalTransactionRef);
		builder.append(", darajaRefNo=");
		builder.append(darajaRefNo);
		builder.append("]");
		return builder.toString();
	}

	
}
