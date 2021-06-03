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
public class RiaRequestPayload implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = 7868310611900741033L;

	private String localDateTime; 
	private String utcDateTime;
	private String paymentIndexNo; 
	private String payoutLocationID; 
	private String transactionAmt;
	
	private String validationTxnID;
	private String orderNumber;
	private String payoutLocationCountry;
	private String payoutLocalDateTime;
	private String payoutUTCDateTime;
    private ReceiverDetails receiverDetails;
    
    public String confirmationTxnID;
    
    public String validationReference;//check

	/**
	 * @return the validationReference
	 */
	public String getValidationReference() {
		return validationReference;
	}
	/**
	 * @param validationReference the validationReference to set
	 */
	public void setValidationReference(String validationReference) {
		this.validationReference = validationReference;
	}
	/**
	 * @return the confirmationTxnID
	 */
	public String getConfirmationTxnID() {
		return confirmationTxnID;
	}
	/**
	 * @param confirmationTxnID the confirmationTxnID to set
	 */
	public void setConfirmationTxnID(String confirmationTxnID) {
		this.confirmationTxnID = confirmationTxnID;
	}
	/**
	 * @return the validationTxnID
	 */
	public String getValidationTxnID() {
		return validationTxnID;
	}
	/**
	 * @param validationTxnID the validationTxnID to set
	 */
	public void setValidationTxnID(String validationTxnID) {
		this.validationTxnID = validationTxnID;
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
	 * @return the payoutLocationCountry
	 */
	public String getPayoutLocationCountry() {
		return payoutLocationCountry;
	}
	/**
	 * @param payoutLocationCountry the payoutLocationCountry to set
	 */
	public void setPayoutLocationCountry(String payoutLocationCountry) {
		this.payoutLocationCountry = payoutLocationCountry;
	}
	/**
	 * @return the payoutLocalDateTime
	 */
	public String getPayoutLocalDateTime() {
		return payoutLocalDateTime;
	}
	/**
	 * @param payoutLocalDateTime the payoutLocalDateTime to set
	 */
	public void setPayoutLocalDateTime(String payoutLocalDateTime) {
		this.payoutLocalDateTime = payoutLocalDateTime;
	}
	/**
	 * @return the payoutUTCDateTime
	 */
	public String getPayoutUTCDateTime() {
		return payoutUTCDateTime;
	}
	/**
	 * @param payoutUTCDateTime the payoutUTCDateTime to set
	 */
	public void setPayoutUTCDateTime(String payoutUTCDateTime) {
		this.payoutUTCDateTime = payoutUTCDateTime;
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
	 * @return the localDateTime
	 */
	public String getLocalDateTime() {
		return localDateTime;
	}
	/**
	 * @param localDateTime the localDateTime to set
	 */
	public void setLocalDateTime(String localDateTime) {
		this.localDateTime = localDateTime;
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
	 * @return the payoutLocationID
	 */
	public String getPayoutLocationID() {
		return payoutLocationID;
	}
	/**
	 * @param payoutLocationID the payoutLocationID to set
	 */
	public void setPayoutLocationID(String payoutLocationID) {
		this.payoutLocationID = payoutLocationID;
	}
	/**
	 * @return the transactionAmt
	 */
	public String getTransactionAmt() {
		return transactionAmt;
	}
	/**
	 * @param transactionAmt the transactionAmt to set
	 */
	public void setTransactionAmt(String transactionAmt) {
		this.transactionAmt = transactionAmt;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RiaRequestPayload [localDateTime=");
		builder.append(localDateTime);
		builder.append(", utcDateTime=");
		builder.append(utcDateTime);
		builder.append(", paymentIndexNo=");
		builder.append(paymentIndexNo);
		builder.append(", payoutLocationID=");
		builder.append(payoutLocationID);
		builder.append(", transactionAmt=");
		builder.append(transactionAmt);
		builder.append(", validationTxnID=");
		builder.append(validationTxnID);
		builder.append(", orderNumber=");
		builder.append(orderNumber);
		builder.append(", payoutLocationCountry=");
		builder.append(payoutLocationCountry);
		builder.append(", payoutLocalDateTime=");
		builder.append(payoutLocalDateTime);
		builder.append(", payoutUTCDateTime=");
		builder.append(payoutUTCDateTime);
		builder.append(", receiverDetails=");
		builder.append(receiverDetails);
		builder.append(", confirmationTxnID=");
		builder.append(confirmationTxnID);
		builder.append(", validationReference=");
		builder.append(validationReference);
		builder.append("]");
		return builder.toString();
	}
}
