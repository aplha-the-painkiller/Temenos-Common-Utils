package com.kcbgroup.common.models.accountinfo;

import java.io.Serializable;

/**
 * kcb-common-models
 * Sep 18, 2020
 * AccountInfo.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class AccountInfo implements Serializable {
	
	/** Serial version */
	private static final long serialVersionUID = -6445868424539143515L;
	
	private String localCurrency;
	private String accountNumber;
	private String category;
	private String companyID;
	private String unclearedBalance;
	private String limitAmount;
	private String workingBalance;
	private String customerID;
	private String timestamp;
	private String accountStatus;
	private String localCountryCode;
	private String currency;
	private String groupCondition;
	private String accountCompanyCode;
	private String onlineActualBalance;
	private String branchCode;
	private String accountName;
	private String minimumBalance;
	private String postingRestrictCode;
	private String postingRestrictType;
	private String postingRestrictDesc;
	/**
	 * @return the localCurrency
	 */
	public String getLocalCurrency() {
		return localCurrency;
	}
	/**
	 * @param localCurrency the localCurrency to set
	 */
	public void setLocalCurrency(String localCurrency) {
		this.localCurrency = localCurrency;
	}
	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the companyID
	 */
	public String getCompanyID() {
		return companyID;
	}
	/**
	 * @param companyID the companyID to set
	 */
	public void setCompanyID(String companyID) {
		this.companyID = companyID;
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
	 * @return the customerID
	 */
	public String getCustomerID() {
		return customerID;
	}
	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}
	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	/**
	 * @return the accountStatus
	 */
	public String getAccountStatus() {
		return accountStatus;
	}
	/**
	 * @param accountStatus the accountStatus to set
	 */
	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	/**
	 * @return the localCountryCode
	 */
	public String getLocalCountryCode() {
		return localCountryCode;
	}
	/**
	 * @param localCountryCode the localCountryCode to set
	 */
	public void setLocalCountryCode(String localCountryCode) {
		this.localCountryCode = localCountryCode;
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
	 * @return the groupCondition
	 */
	public String getGroupCondition() {
		return groupCondition;
	}
	/**
	 * @param groupCondition the groupCondition to set
	 */
	public void setGroupCondition(String groupCondition) {
		this.groupCondition = groupCondition;
	}
	/**
	 * @return the accountCompanyCode
	 */
	public String getAccountCompanyCode() {
		return accountCompanyCode;
	}
	/**
	 * @param accountCompanyCode the accountCompanyCode to set
	 */
	public void setAccountCompanyCode(String accountCompanyCode) {
		this.accountCompanyCode = accountCompanyCode;
	}
	/**
	 * @return the onlineActualBalance
	 */
	public String getOnlineActualBalance() {
		return onlineActualBalance;
	}
	/**
	 * @param onlineActualBalance the onlineActualBalance to set
	 */
	public void setOnlineActualBalance(String onlineActualBalance) {
		this.onlineActualBalance = onlineActualBalance;
	}
	/**
	 * @return the branchCode
	 */
	public String getBranchCode() {
		return branchCode;
	}
	/**
	 * @param branchCode the branchCode to set
	 */
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	/**
	 * @return the accountName
	 */
	public String getAccountName() {
		return accountName;
	}
	/**
	 * @param accountName the accountName to set
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	/**
	 * @return the minimumBalance
	 */
	public String getMinimumBalance() {
		return minimumBalance;
	}
	/**
	 * @param minimumBalance the minimumBalance to set
	 */
	public void setMinimumBalance(String minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	/**
	 * @return the postingRestrictCode
	 */
	public String getPostingRestrictCode() {
		return postingRestrictCode;
	}
	/**
	 * @param postingRestrictCode the postingRestrictCode to set
	 */
	public void setPostingRestrictCode(String postingRestrictCode) {
		this.postingRestrictCode = postingRestrictCode;
	}
	/**
	 * @return the postingRestrictType
	 */
	public String getPostingRestrictType() {
		return postingRestrictType;
	}
	/**
	 * @param postingRestrictType the postingRestrictType to set
	 */
	public void setPostingRestrictType(String postingRestrictType) {
		this.postingRestrictType = postingRestrictType;
	}
	/**
	 * @return the postingRestrictDesc
	 */
	public String getPostingRestrictDesc() {
		return postingRestrictDesc;
	}
	/**
	 * @param postingRestrictDesc the postingRestrictDesc to set
	 */
	public void setPostingRestrictDesc(String postingRestrictDesc) {
		this.postingRestrictDesc = postingRestrictDesc;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AccountInfo [localCurrency=");
		builder.append(localCurrency);
		builder.append(", accountNumber=");
		builder.append(accountNumber);
		builder.append(", category=");
		builder.append(category);
		builder.append(", companyID=");
		builder.append(companyID);
		builder.append(", unclearedBalance=");
		builder.append(unclearedBalance);
		builder.append(", limitAmount=");
		builder.append(limitAmount);
		builder.append(", workingBalance=");
		builder.append(workingBalance);
		builder.append(", customerID=");
		builder.append(customerID);
		builder.append(", timestamp=");
		builder.append(timestamp);
		builder.append(", accountStatus=");
		builder.append(accountStatus);
		builder.append(", localCountryCode=");
		builder.append(localCountryCode);
		builder.append(", currency=");
		builder.append(currency);
		builder.append(", groupCondition=");
		builder.append(groupCondition);
		builder.append(", accountCompanyCode=");
		builder.append(accountCompanyCode);
		builder.append(", onlineActualBalance=");
		builder.append(onlineActualBalance);
		builder.append(", branchCode=");
		builder.append(branchCode);
		builder.append(", accountName=");
		builder.append(accountName);
		builder.append(", minimumBalance=");
		builder.append(minimumBalance);
		builder.append(", postingRestrictCode=");
		builder.append(postingRestrictCode);
		builder.append(", postingRestrictType=");
		builder.append(postingRestrictType);
		builder.append(", postingRestrictDesc=");
		builder.append(postingRestrictDesc);
		builder.append("]");
		return builder.toString();
	}


}