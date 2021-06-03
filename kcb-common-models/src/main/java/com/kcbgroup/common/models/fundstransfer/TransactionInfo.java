package com.kcbgroup.common.models.fundstransfer;

import java.io.Serializable;

/**
 * Transaction Information Model Class
 * 
 * @author Francisco Osorio | Bring Global
 * @version 0.0.1
 */
public class TransactionInfo implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = -1110163464484167223L;

	private String companyCode;
	private String transactionType;
	private String debitAccountNumber;
	private String debitAmount;
	private String debitReference;
	private String creditReference;
	private String creditAccountNumber;
	private String paymentDetails;
	private String terminalID;
	private String messageType;
	private String currencyCode;
	private String retrievalRefNumber;
	private String amountCurrency;
	private String dateTime;
	private String dateString;
	private String agentCommAmount;
	private String totalChrgAmount;
	private String agentCommAccount;
	private String custChrgAmount;
	private String transactionID;
	private String falconBalance;
	
	//validate with Sri
	private String debitCurrency;
	private String creditCurrency;

	public TransactionInfo() {
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getDebitAccountNumber() {
		return debitAccountNumber;
	}

	public void setDebitAccountNumber(String debitAccountNumber) {
		this.debitAccountNumber = debitAccountNumber;
	}

	public String getDebitAmount() {
		return debitAmount;
	}

	public void setDebitAmount(String debitAmount) {
		this.debitAmount = debitAmount;
	}

	public String getDebitReference() {
		return debitReference;
	}

	public void setDebitReference(String debitReference) {
		this.debitReference = debitReference;
	}

	public String getCreditReference() {
		return creditReference;
	}

	public void setCreditReference(String creditReference) {
		this.creditReference = creditReference;
	}

	public String getCreditAccountNumber() {
		return creditAccountNumber;
	}

	public void setCreditAccountNumber(String creditAccountNumber) {
		this.creditAccountNumber = creditAccountNumber;
	}

	public String getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public String getTerminalID() {
		return terminalID;
	}

	public void setTerminalID(String terminalID) {
		this.terminalID = terminalID;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getRetrievalRefNumber() {
		return retrievalRefNumber;
	}

	public void setRetrievalRefNumber(String retrievalRefNumber) {
		this.retrievalRefNumber = retrievalRefNumber;
	}

	public String getAmountCurrency() {
		return amountCurrency;
	}

	public void setAmountCurrency(String amountCurrency) {
		this.amountCurrency = amountCurrency;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getDateString() {
		return dateString;
	}

	public void setDateString(String dateString) {
		this.dateString = dateString;
	}

	public String getAgentCommAmount() {
		return agentCommAmount;
	}

	public void setAgentCommAmount(String agentCommAmount) {
		this.agentCommAmount = agentCommAmount;
	}

	public String getTotalChrgAmount() {
		return totalChrgAmount;
	}

	public void setTotalChrgAmount(String totalChrgAmount) {
		this.totalChrgAmount = totalChrgAmount;
	}

	public String getAgentCommAccount() {
		return agentCommAccount;
	}

	public void setAgentCommAccount(String agentCommAccount) {
		this.agentCommAccount = agentCommAccount;
	}

	public String getCustChrgAmount() {
		return custChrgAmount;
	}

	public void setCustChrgAmount(String custChrgAmount) {
		this.custChrgAmount = custChrgAmount;
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
	
	

	/**
	 * @return the debitCurrency
	 */
	public String getDebitCurrency() {
		return debitCurrency;
	}

	/**
	 * @param debitCurrency the debitCurrency to set
	 */
	public void setDebitCurrency(String debitCurrency) {
		this.debitCurrency = debitCurrency;
	}

	/**
	 * @return the creditCurrency
	 */
	public String getCreditCurrency() {
		return creditCurrency;
	}

	/**
	 * @param creditCurrency the creditCurrency to set
	 */
	public void setCreditCurrency(String creditCurrency) {
		this.creditCurrency = creditCurrency;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TransactionInfo [companyCode=");
		builder.append(companyCode);
		builder.append(", transactionType=");
		builder.append(transactionType);
		builder.append(", debitAccountNumber=");
		builder.append(debitAccountNumber);
		builder.append(", debitAmount=");
		builder.append(debitAmount);
		builder.append(", debitReference=");
		builder.append(debitReference);
		builder.append(", creditReference=");
		builder.append(creditReference);
		builder.append(", creditAccountNumber=");
		builder.append(creditAccountNumber);
		builder.append(", paymentDetails=");
		builder.append(paymentDetails);
		builder.append(", terminalID=");
		builder.append(terminalID);
		builder.append(", messageType=");
		builder.append(messageType);
		builder.append(", currencyCode=");
		builder.append(currencyCode);
		builder.append(", retrievalRefNumber=");
		builder.append(retrievalRefNumber);
		builder.append(", amountCurrency=");
		builder.append(amountCurrency);
		builder.append(", dateTime=");
		builder.append(dateTime);
		builder.append(", dateString=");
		builder.append(dateString);
		builder.append(", agentCommAmount=");
		builder.append(agentCommAmount);
		builder.append(", totalChrgAmount=");
		builder.append(totalChrgAmount);
		builder.append(", agentCommAccount=");
		builder.append(agentCommAccount);
		builder.append(", custChrgAmount=");
		builder.append(custChrgAmount);
		builder.append(", transactionID=");
		builder.append(transactionID);
		builder.append(", falconBalance=");
		builder.append(falconBalance);
		builder.append(", debitCurrency=");
		builder.append(debitCurrency);
		builder.append(", creditCurrency=");
		builder.append(creditCurrency);
		builder.append("]");
		return builder.toString();
	}
}
