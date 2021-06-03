package com.kcbgroup.common.models.businesstransfer;

import java.io.Serializable;

/**
 * kcb-common-models
 * Sep 18, 2020
 * AdditionalData.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class OptionalDetails implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = -6445868424539143515L;
 
	private String customerName; 
	private String customerMSISDN; 
	private String transactionNarration;
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
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OptionalDetails [customerName=");
		builder.append(customerName);
		builder.append(", customerMSISDN=");
		builder.append(customerMSISDN);
		builder.append(", transactionNarration=");
		builder.append(transactionNarration);
		builder.append("]");
		return builder.toString();
	} 


}