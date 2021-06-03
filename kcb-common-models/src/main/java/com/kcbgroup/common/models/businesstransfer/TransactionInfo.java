package com.kcbgroup.common.models.businesstransfer;

import java.io.Serializable;

/**
 * Transaction Information Model Class
 * 
 * @author Andrés Vázquez | Bring Global
 * @version 0.0.1
 */
public class TransactionInfo implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = -1110163464484167223L;
	
    public String transactionID;
    public String transactionType; 
    public String externalTransactionID;
    public String initiatorShortCode;
    public String customerName;
    public String customerMSISDN;
    public String transactionNarration;
    public String status;
	/**
	 * @return the transactionID
	 */
	public String getTransactionID() {
		return transactionID;
	}
	/**
	 * @param transactionID the transactionID to set
	 */
	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}
	/**
	 * @return the transactionType
	 */
	public String getTransactionType() {
		return transactionType;
	}
	/**
	 * @param transactionType the transactionType to set
	 */
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	/**
	 * @return the externalTransactionID
	 */
	public String getExternalTransactionID() {
		return externalTransactionID;
	}
	/**
	 * @param externalTransactionID the externalTransactionID to set
	 */
	public void setExternalTransactionID(String externalTransactionID) {
		this.externalTransactionID = externalTransactionID;
	}
	/**
	 * @return the initiatorShortCode
	 */
	public String getInitiatorShortCode() {
		return initiatorShortCode;
	}
	/**
	 * @param initiatorShortCode the initiatorShortCode to set
	 */
	public void setInitiatorShortCode(String initiatorShortCode) {
		this.initiatorShortCode = initiatorShortCode;
	}
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the customerMSISDN
	 */
	public String getCustomerMSISDN() {
		return customerMSISDN;
	}
	/**
	 * @param customerMSISDN the customerMSISDN to set
	 */
	public void setCustomerMSISDN(String customerMSISDN) {
		this.customerMSISDN = customerMSISDN;
	}
	/**
	 * @return the transactionNarration
	 */
	public String getTransactionNarration() {
		return transactionNarration;
	}
	/**
	 * @param transactionNarration the transactionNarration to set
	 */
	public void setTransactionNarration(String transactionNarration) {
		this.transactionNarration = transactionNarration;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TransactionInfo [transactionID=");
		builder.append(transactionID);
		builder.append(", transactionType=");
		builder.append(transactionType);
		builder.append(", externalTransactionID=");
		builder.append(externalTransactionID);
		builder.append(", initiatorShortCode=");
		builder.append(initiatorShortCode);
		builder.append(", customerName=");
		builder.append(customerName);
		builder.append(", customerMSISDN=");
		builder.append(customerMSISDN);
		builder.append(", transactionNarration=");
		builder.append(transactionNarration);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
    
}
