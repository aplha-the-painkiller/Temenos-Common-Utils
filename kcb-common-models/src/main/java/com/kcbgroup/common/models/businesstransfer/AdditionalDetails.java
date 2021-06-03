package com.kcbgroup.common.models.businesstransfer;

import java.io.Serializable;

/**
 * kcb-common-models
 * Sep 18, 2020
 * AccountInfo.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class AdditionalDetails implements Serializable {

	/** Serial version */
	private static final long serialVersionUID = -6445868424539143515L;

	private String keyOwner;
	private String initiatorIdentifierType;
	private String initiatorIdentifier;
	private String initiatorSecurityCredentials;
	private String initiatorShortCode;
	private String receiverIdentifierType;
	private String receiverIdentifier;
	private String amount;
	private String currency;
	private String billerReferenceNo;


	/**
	 * 
	 */
	public AdditionalDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the billerReferenceNo
	 */
	public String getBillerReferenceNo() {
		return billerReferenceNo;
	}
	/**
	 * @param billerReferenceNo the billerReferenceNo to set
	 */
	public void setBillerReferenceNo(String billerReferenceNo) {
		this.billerReferenceNo = billerReferenceNo;
	}
	/**
	 * @return the keyOwner
	 */
	public String getKeyOwner() {
		return keyOwner;
	}
	/**
	 * @param keyOwner the keyOwner to set
	 */
	public void setKeyOwner(String keyOwner) {
		this.keyOwner = keyOwner;
	}
	/**
	 * @return the initiatorIdentifierType
	 */
	public String getInitiatorIdentifierType() {
		return initiatorIdentifierType;
	}
	/**
	 * @param initiatorIdentifierType the initiatorIdentifierType to set
	 */
	public void setInitiatorIdentifierType(String initiatorIdentifierType) {
		this.initiatorIdentifierType = initiatorIdentifierType;
	}
	/**
	 * @return the initiatorIdentifier
	 */
	public String getInitiatorIdentifier() {
		return initiatorIdentifier;
	}
	/**
	 * @param initiatorIdentifier the initiatorIdentifier to set
	 */
	public void setInitiatorIdentifier(String initiatorIdentifier) {
		this.initiatorIdentifier = initiatorIdentifier;
	}
	/**
	 * @return the initiatorSecurityCredentials
	 */
	public String getInitiatorSecurityCredentials() {
		return initiatorSecurityCredentials;
	}
	/**
	 * @param initiatorSecurityCredentials the initiatorSecurityCredentials to set
	 */
	public void setInitiatorSecurityCredentials(String initiatorSecurityCredentials) {
		this.initiatorSecurityCredentials = initiatorSecurityCredentials;
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
	 * @return the receiverIdentifierType
	 */
	public String getReceiverIdentifierType() {
		return receiverIdentifierType;
	}
	/**
	 * @param receiverIdentifierType the receiverIdentifierType to set
	 */
	public void setReceiverIdentifierType(String receiverIdentifierType) {
		this.receiverIdentifierType = receiverIdentifierType;
	}
	/**
	 * @return the receiverIdentifier
	 */
	public String getReceiverIdentifier() {
		return receiverIdentifier;
	}
	/**
	 * @param receiverIdentifier the receiverIdentifier to set
	 */
	public void setReceiverIdentifier(String receiverIdentifier) {
		this.receiverIdentifier = receiverIdentifier;
	}
	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AdditionalDetails [keyOwner=");
		builder.append(keyOwner);
		builder.append(", initiatorIdentifierType=");
		builder.append(initiatorIdentifierType);
		builder.append(", initiatorIdentifier=");
		builder.append(initiatorIdentifier);
		builder.append(", initiatorSecurityCredentials=");
		builder.append(initiatorSecurityCredentials);
		builder.append(", initiatorShortCode=");
		builder.append(initiatorShortCode);
		builder.append(", receiverIdentifierType=");
		builder.append(receiverIdentifierType);
		builder.append(", receiverIdentifier=");
		builder.append(receiverIdentifier);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", currency=");
		builder.append(currency);
		builder.append(", billerReferenceNo=");
		builder.append(billerReferenceNo);
		builder.append("]");
		return builder.toString();
	}
}