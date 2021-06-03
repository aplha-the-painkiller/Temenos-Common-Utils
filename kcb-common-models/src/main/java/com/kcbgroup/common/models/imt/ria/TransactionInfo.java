package com.kcbgroup.common.models.imt.ria;

import java.io.Serializable;

/**
 * Jun 29, 2020
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class TransactionInfo implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = -6445868424539143515L;
 
	private String transactionID;
    private String validationStatus;
    private String paymentIndexNo;
    private String orderNumber;
    private String refIRDA;
    private String refIRDP;
    private String orderDate;
    private String orignatorCountryCode;
    private String beneficiaryCurrency;
    private String transactionAmount;
    private String transactionDetails;
    private String utcDateTime;
    private SenderDetails senderDetails;
    private ReceiverDetails receiverDetails;
    
    private String commissionCurrency;
    private String commissionAmount;
	
	public TransactionInfo() {
	}

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
	 * @return the validationStatus
	 */
	public String getValidationStatus() {
		return validationStatus;
	}

	/**
	 * @param validationStatus the validationStatus to set
	 */
	public void setValidationStatus(String validationStatus) {
		this.validationStatus = validationStatus;
	}

	/**
	 * @return the paymentIndexNo
	 */
	public String getPaymentIndexNo() {
		return paymentIndexNo;
	}

	/**
	 * @param paymentIndexNo the paymentIndexNo to set
	 */
	public void setPaymentIndexNo(String paymentIndexNo) {
		this.paymentIndexNo = paymentIndexNo;
	}

	/**
	 * @return the orderNumber
	 */
	public String getOrderNumber() {
		return orderNumber;
	}

	/**
	 * @param orderNumber the orderNumber to set
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * @return the refIRDA
	 */
	public String getRefIRDA() {
		return refIRDA;
	}

	/**
	 * @param refIRDA the refIRDA to set
	 */
	public void setRefIRDA(String refIRDA) {
		this.refIRDA = refIRDA;
	}

	/**
	 * @return the refIRDP
	 */
	public String getRefIRDP() {
		return refIRDP;
	}

	/**
	 * @param refIRDP the refIRDP to set
	 */
	public void setRefIRDP(String refIRDP) {
		this.refIRDP = refIRDP;
	}

	/**
	 * @return the orderDate
	 */
	public String getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the orignatorCountryCode
	 */
	public String getOrignatorCountryCode() {
		return orignatorCountryCode;
	}

	/**
	 * @param orignatorCountryCode the orignatorCountryCode to set
	 */
	public void setOrignatorCountryCode(String orignatorCountryCode) {
		this.orignatorCountryCode = orignatorCountryCode;
	}

	/**
	 * @return the beneficiaryCurrency
	 */
	public String getBeneficiaryCurrency() {
		return beneficiaryCurrency;
	}

	/**
	 * @param beneficiaryCurrency the beneficiaryCurrency to set
	 */
	public void setBeneficiaryCurrency(String beneficiaryCurrency) {
		this.beneficiaryCurrency = beneficiaryCurrency;
	}

	/**
	 * @return the transactionAmount
	 */
	public String getTransactionAmount() {
		return transactionAmount;
	}

	/**
	 * @param transactionAmount the transactionAmount to set
	 */
	public void setTransactionAmount(String transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	/**
	 * @return the transactionDetails
	 */
	public String getTransactionDetails() {
		return transactionDetails;
	}

	/**
	 * @param transactionDetails the transactionDetails to set
	 */
	public void setTransactionDetails(String transactionDetails) {
		this.transactionDetails = transactionDetails;
	}

	/**
	 * @return the utcDateTime
	 */
	public String getUtcDateTime() {
		return utcDateTime;
	}

	/**
	 * @param utcDateTime the utcDateTime to set
	 */
	public void setUtcDateTime(String utcDateTime) {
		this.utcDateTime = utcDateTime;
	}

	/**
	 * @return the senderDetails
	 */
	public SenderDetails getSenderDetails() {
		return senderDetails;
	}

	/**
	 * @param senderDetails the senderDetails to set
	 */
	public void setSenderDetails(SenderDetails senderDetails) {
		this.senderDetails = senderDetails;
	}

	/**
	 * @return the receiverDetails
	 */
	public ReceiverDetails getReceiverDetails() {
		return receiverDetails;
	}

	/**
	 * @param receiverDetails the receiverDetails to set
	 */
	public void setReceiverDetails(ReceiverDetails receiverDetails) {
		this.receiverDetails = receiverDetails;
	}

	/**
	 * @return the commissionCurrency
	 */
	public String getCommissionCurrency() {
		return commissionCurrency;
	}

	/**
	 * @param commissionCurrency the commissionCurrency to set
	 */
	public void setCommissionCurrency(String commissionCurrency) {
		this.commissionCurrency = commissionCurrency;
	}

	/**
	 * @return the commissionAmount
	 */
	public String getCommissionAmount() {
		return commissionAmount;
	}

	/**
	 * @param commissionAmount the commissionAmount to set
	 */
	public void setCommissionAmount(String commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TransactionInfo [transactionID=");
		builder.append(transactionID);
		builder.append(", validationStatus=");
		builder.append(validationStatus);
		builder.append(", paymentIndexNo=");
		builder.append(paymentIndexNo);
		builder.append(", orderNumber=");
		builder.append(orderNumber);
		builder.append(", refIRDA=");
		builder.append(refIRDA);
		builder.append(", refIRDP=");
		builder.append(refIRDP);
		builder.append(", orderDate=");
		builder.append(orderDate);
		builder.append(", orignatorCountryCode=");
		builder.append(orignatorCountryCode);
		builder.append(", beneficiaryCurrency=");
		builder.append(beneficiaryCurrency);
		builder.append(", transactionAmount=");
		builder.append(transactionAmount);
		builder.append(", transactionDetails=");
		builder.append(transactionDetails);
		builder.append(", utcDateTime=");
		builder.append(utcDateTime);
		builder.append(", senderDetails=");
		builder.append(senderDetails);
		builder.append(", receiverDetails=");
		builder.append(receiverDetails);
		builder.append(", commissionCurrency=");
		builder.append(commissionCurrency);
		builder.append(", commissionAmount=");
		builder.append(commissionAmount);
		builder.append("]");
		return builder.toString();
	}
}