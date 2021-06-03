package com.kcbgroup.common.models.fundstransfer.lock;

import java.io.Serializable;

public class CreateUnlockRequest implements Serializable {
	

	private static final long serialVersionUID = 1L;
	private String companyID;
    private String uniqueTransactionRef;
    private String txnTimeStamp;
    private String txnAmount;
    private String debitAccount;
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
	 * @return the uniqueTransactionRef
	 */
	public String getUniqueTransactionRef() {
		return uniqueTransactionRef;
	}
	/**
	 * @param uniqueTransactionRef the uniqueTransactionRef to set
	 */
	public void setUniqueTransactionRef(String uniqueTransactionRef) {
		this.uniqueTransactionRef = uniqueTransactionRef;
	}
	/**
	 * @return the txnTimeStamp
	 */
	public String getTxnTimeStamp() {
		return txnTimeStamp;
	}
	/**
	 * @param txnTimeStamp the txnTimeStamp to set
	 */
	public void setTxnTimeStamp(String txnTimeStamp) {
		this.txnTimeStamp = txnTimeStamp;
	}
	/**
	 * @return the txnAmount
	 */
	public String getTxnAmount() {
		return txnAmount;
	}
	/**
	 * @param txnAmount the txnAmount to set
	 */
	public void setTxnAmount(String txnAmount) {
		this.txnAmount = txnAmount;
	}
	/**
	 * @return the debitAccount
	 */
	public String getDebitAccount() {
		return debitAccount;
	}
	/**
	 * @param debitAccount the debitAccount to set
	 */
	public void setDebitAccount(String debitAccount) {
		this.debitAccount = debitAccount;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CreateUnlockRequest [companyID=");
		builder.append(companyID);
		builder.append(", uniqueTransactionRef=");
		builder.append(uniqueTransactionRef);
		builder.append(", txnTimeStamp=");
		builder.append(txnTimeStamp);
		builder.append(", txnAmount=");
		builder.append(txnAmount);
		builder.append(", debitAccount=");
		builder.append(debitAccount);
		builder.append("]");
		return builder.toString();
	}

    
}
