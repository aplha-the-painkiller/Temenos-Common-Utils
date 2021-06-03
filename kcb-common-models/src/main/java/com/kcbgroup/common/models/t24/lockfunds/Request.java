package com.kcbgroup.common.models.t24.lockfunds;

public class Request {
String companyID;
	
	@Override
public String toString() {
	return "Request [companyID=" + companyID + ", uniqueTransactionRef=" + uniqueTransactionRef + ", txnTimeStamp="
			+ txnTimeStamp + ", txnAmount=" + txnAmount + ", debitAccount=" + debitAccount + ", creditAccount="
			+ creditAccount + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}
	/** uniqueTransactionRef */
	String uniqueTransactionRef;

	public String getCompanyID() {
		return companyID;
	}
	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}
	public String getUniqueTransactionRef() {
		return uniqueTransactionRef;
	}
	public void setUniqueTransactionRef(String uniqueTransactionRef) {
		this.uniqueTransactionRef = uniqueTransactionRef;
	}
	public String getTxnTimeStamp() {
		return txnTimeStamp;
	}
	public void setTxnTimeStamp(String txnTimeStamp) {
		this.txnTimeStamp = txnTimeStamp;
	}
	public String getTxnAmount() {
		return txnAmount;
	}
	public void setTxnAmount(String txnAmount) {
		this.txnAmount = txnAmount;
	}
	public String getDebitAccount() {
		return debitAccount;
	}
	public void setDebitAccount(String debitAccount) {
		this.debitAccount = debitAccount;
	}
	public String getCreditAccount() {
		return creditAccount;
	}
	public void setCreditAccount(String creditAccount) {
		this.creditAccount = creditAccount;
	}
	/** txnTimeStamp*/
	String txnTimeStamp;
	
	/**txnAmount */
	String txnAmount;

	/** debitAccount */
	String debitAccount;
	/** creditAccount */
	String creditAccount;
	/** txnCurrency*/

}
