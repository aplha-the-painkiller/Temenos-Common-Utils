/**
 * 
 */
package com.kcbgroup.common.models.accountinfo;

import java.io.Serializable;


/**
 * kcb-common-models
 * Sep 18, 2020
 * BalanceInquiryResponsePayload.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class AccountInfoResponsePayload implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = 353652223581858774L;
 
    private PrimaryData primaryData; 
    private AdditionalData additionalData;
    private AccountInfo accountInfo;
    
    public AccountInfoResponsePayload() {
		super();
	}

	/**
	 * @return the primaryData
	 */
	public PrimaryData getPrimaryData() {
		return primaryData;
	}

	/**
	 * @param primaryData the primaryData to set
	 */
	public void setPrimaryData(PrimaryData primaryData) {
		this.primaryData = primaryData;
	}

	/**
	 * @return the additionalData
	 */
	public AdditionalData getAdditionalData() {
		return additionalData;
	}

	/**
	 * @param additionalData the additionalData to set
	 */
	public void setAdditionalData(AdditionalData additionalData) {
		this.additionalData = additionalData;
	}

	/**
	 * @return the accountInfo
	 */
	public AccountInfo getAccountInfo() {
		return accountInfo;
	}

	/**
	 * @param accountInfo the accountInfo to set
	 */
	public void setAccountInfo(AccountInfo accountInfo) {
		this.accountInfo = accountInfo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AccountInfoResponsePayload [primaryData=");
		builder.append(primaryData);
		builder.append(", additionalData=");
		builder.append(additionalData);
		builder.append(", accountInfo=");
		builder.append(accountInfo);
		builder.append("]");
		return builder.toString();
	}

    
}
