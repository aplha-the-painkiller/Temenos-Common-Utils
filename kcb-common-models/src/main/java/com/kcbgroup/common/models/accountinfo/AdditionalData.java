package com.kcbgroup.common.models.accountinfo;

import java.io.Serializable;

/**
 * kcb-common-models
 * Sep 18, 2020
 * AdditionalData.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class AdditionalData implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = -6445868424539143515L;
 
	private String companyCode; 
	private String transactionType;
	private String cardEntryMode; 
	private String transactionCondition; 
	private String sourceAccountType;
	private String currency; 
	private String unclearedBalance; 
	private String accountBalance; 
	private String limitAmount; 
	private String isAccountDormant; 
	private String isPostingRestricted; 
	private String workingBalance; 
	private String lockedAmount;
	private String retentionAmount; 
	private String ledgerBalance; 
	private String maskedBalance;
	
	public AdditionalData() {
	}

	/**
	 * @return the companyCode
	 */
	public String getCompanyCode() {
		return companyCode;
	}

	/**
	 * @param companyCode the companyCode to set
	 */
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
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
	 * @return the cardEntryMode
	 */
	public String getCardEntryMode() {
		return cardEntryMode;
	}

	/**
	 * @param cardEntryMode the cardEntryMode to set
	 */
	public void setCardEntryMode(String cardEntryMode) {
		this.cardEntryMode = cardEntryMode;
	}

	/**
	 * @return the transactionCondition
	 */
	public String getTransactionCondition() {
		return transactionCondition;
	}

	/**
	 * @param transactionCondition the transactionCondition to set
	 */
	public void setTransactionCondition(String transactionCondition) {
		this.transactionCondition = transactionCondition;
	}

	/**
	 * @return the sourceAccountType
	 */
	public String getSourceAccountType() {
		return sourceAccountType;
	}

	/**
	 * @param sourceAccountType the sourceAccountType to set
	 */
	public void setSourceAccountType(String sourceAccountType) {
		this.sourceAccountType = sourceAccountType;
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

	/**
	 * @return the unclearedBalance
	 */
	public String getUnclearedBalance() {
		return unclearedBalance;
	}

	/**
	 * @param unclearedBalance the unclearedBalance to set
	 */
	public void setUnclearedBalance(String unclearedBalance) {
		this.unclearedBalance = unclearedBalance;
	}

	/**
	 * @return the accountBalance
	 */
	public String getAccountBalance() {
		return accountBalance;
	}

	/**
	 * @param accountBalance the accountBalance to set
	 */
	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}

	/**
	 * @return the limitAmount
	 */
	public String getLimitAmount() {
		return limitAmount;
	}

	/**
	 * @param limitAmount the limitAmount to set
	 */
	public void setLimitAmount(String limitAmount) {
		this.limitAmount = limitAmount;
	}

	/**
	 * @return the isAccountDormant
	 */
	public String getIsAccountDormant() {
		return isAccountDormant;
	}

	/**
	 * @param isAccountDormant the isAccountDormant to set
	 */
	public void setIsAccountDormant(String isAccountDormant) {
		this.isAccountDormant = isAccountDormant;
	}

	/**
	 * @return the isPostingRestricted
	 */
	public String getIsPostingRestricted() {
		return isPostingRestricted;
	}

	/**
	 * @param isPostingRestricted the isPostingRestricted to set
	 */
	public void setIsPostingRestricted(String isPostingRestricted) {
		this.isPostingRestricted = isPostingRestricted;
	}

	/**
	 * @return the workingBalance
	 */
	public String getWorkingBalance() {
		return workingBalance;
	}

	/**
	 * @param workingBalance the workingBalance to set
	 */
	public void setWorkingBalance(String workingBalance) {
		this.workingBalance = workingBalance;
	}

	/**
	 * @return the lockedAmount
	 */
	public String getLockedAmount() {
		return lockedAmount;
	}

	/**
	 * @param lockedAmount the lockedAmount to set
	 */
	public void setLockedAmount(String lockedAmount) {
		this.lockedAmount = lockedAmount;
	}

	/**
	 * @return the retentionAmount
	 */
	public String getRetentionAmount() {
		return retentionAmount;
	}

	/**
	 * @param retentionAmount the retentionAmount to set
	 */
	public void setRetentionAmount(String retentionAmount) {
		this.retentionAmount = retentionAmount;
	}

	/**
	 * @return the ledgerBalance
	 */
	public String getLedgerBalance() {
		return ledgerBalance;
	}

	/**
	 * @param ledgerBalance the ledgerBalance to set
	 */
	public void setLedgerBalance(String ledgerBalance) {
		this.ledgerBalance = ledgerBalance;
	}

	/**
	 * @return the maskedBalance
	 */
	public String getMaskedBalance() {
		return maskedBalance;
	}

	/**
	 * @param maskedBalance the maskedBalance to set
	 */
	public void setMaskedBalance(String maskedBalance) {
		this.maskedBalance = maskedBalance;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AdditionalData [companyCode=");
		builder.append(companyCode);
		builder.append(", transactionType=");
		builder.append(transactionType);
		builder.append(", cardEntryMode=");
		builder.append(cardEntryMode);
		builder.append(", transactionCondition=");
		builder.append(transactionCondition);
		builder.append(", sourceAccountType=");
		builder.append(sourceAccountType);
		builder.append(", currency=");
		builder.append(currency);
		builder.append(", unclearedBalance=");
		builder.append(unclearedBalance);
		builder.append(", accountBalance=");
		builder.append(accountBalance);
		builder.append(", limitAmount=");
		builder.append(limitAmount);
		builder.append(", isAccountDormant=");
		builder.append(isAccountDormant);
		builder.append(", isPostingRestricted=");
		builder.append(isPostingRestricted);
		builder.append(", workingBalance=");
		builder.append(workingBalance);
		builder.append(", lockedAmount=");
		builder.append(lockedAmount);
		builder.append(", retentionAmount=");
		builder.append(retentionAmount);
		builder.append(", ledgerBalance=");
		builder.append(ledgerBalance);
		builder.append(", maskedBalance=");
		builder.append(maskedBalance);
		builder.append("]");
		return builder.toString();
	}
}