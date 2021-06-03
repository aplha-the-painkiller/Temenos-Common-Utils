/**
 * kcb-common-models
 * Feb 18, 2021
 * CreateLockRequest.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
package com.kcbgroup.common.models.fundstransfer.unlock;

import java.io.Serializable;

/**
 * kcb-common-models
 * Feb 18, 2021
 * CreateLockRequest.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class CreateLockRequest  implements Serializable {
	

	private static final long serialVersionUID = 755915245099121116L;
	
	private String companyID;
    private String uniqueTransactionRef;
    private String txnTimeStamp;
    private String txnAmount;
    private String debitAccount;
    private String creditAccount;
    private String txnCurrency;
    
    
    
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



	/**
	 * @return the creditAccount
	 */
	public String getCreditAccount() {
		return creditAccount;
	}



	/**
	 * @param creditAccount the creditAccount to set
	 */
	public void setCreditAccount(String creditAccount) {
		this.creditAccount = creditAccount;
	}



	/**
	 * @return the txnCurrency
	 */
	public String getTxnCurrency() {
		return txnCurrency;
	}



	/**
	 * @param txnCurrency the txnCurrency to set
	 */
	public void setTxnCurrency(String txnCurrency) {
		this.txnCurrency = txnCurrency;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CreateLockRequest [companyID=");
		builder.append(companyID);
		builder.append(", uniqueTransactionRef=");
		builder.append(uniqueTransactionRef);
		builder.append(", txnTimeStamp=");
		builder.append(txnTimeStamp);
		builder.append(", txnAmount=");
		builder.append(txnAmount);
		builder.append(", debitAccount=");
		builder.append(debitAccount);
		builder.append(", creditAccount=");
		builder.append(creditAccount);
		builder.append(", txnCurrency=");
		builder.append(txnCurrency);
		builder.append("]");
		return builder.toString();
	}
    
    

}
