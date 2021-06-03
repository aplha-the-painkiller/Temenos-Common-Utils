/**
 * kcb-common-models
 * Feb 18, 2021
 * CreateLockResponse.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
package com.kcbgroup.common.models.fundstransfer.unlock;

import java.io.Serializable;

/**
 * kcb-common-models
 * Feb 18, 2021
 * CreateLockResponse.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class CreateLockResponse implements Serializable {

	private static final long serialVersionUID = -3820803639235822826L;
	private String statusCode;
    private String statusDescription;
    private String balanceAfterLocking;
    private String balanceBeforeLocking;
    private String originalTransactionRef;
    private String darajaRefNo;
	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}
	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	/**
	 * @return the statusDescription
	 */
	public String getStatusDescription() {
		return statusDescription;
	}
	/**
	 * @param statusDescription the statusDescription to set
	 */
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
	/**
	 * @return the balanceAfterLocking
	 */
	public String getBalanceAfterLocking() {
		return balanceAfterLocking;
	}
	/**
	 * @param balanceAfterLocking the balanceAfterLocking to set
	 */
	public void setBalanceAfterLocking(String balanceAfterLocking) {
		this.balanceAfterLocking = balanceAfterLocking;
	}
	/**
	 * @return the balanceBeforeLocking
	 */
	public String getBalanceBeforeLocking() {
		return balanceBeforeLocking;
	}
	/**
	 * @param balanceBeforeLocking the balanceBeforeLocking to set
	 */
	public void setBalanceBeforeLocking(String balanceBeforeLocking) {
		this.balanceBeforeLocking = balanceBeforeLocking;
	}
	/**
	 * @return the originalTransactionRef
	 */
	public String getOriginalTransactionRef() {
		return originalTransactionRef;
	}
	/**
	 * @param originalTransactionRef the originalTransactionRef to set
	 */
	public void setOriginalTransactionRef(String originalTransactionRef) {
		this.originalTransactionRef = originalTransactionRef;
	}
	/**
	 * @return the darajaRefNo
	 */
	public String getDarajaRefNo() {
		return darajaRefNo;
	}
	/**
	 * @param darajaRefNo the darajaRefNo to set
	 */
	public void setDarajaRefNo(String darajaRefNo) {
		this.darajaRefNo = darajaRefNo;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CreateLockResponse [statusCode=");
		builder.append(statusCode);
		builder.append(", statusDescription=");
		builder.append(statusDescription);
		builder.append(", balanceAfterLocking=");
		builder.append(balanceAfterLocking);
		builder.append(", balanceBeforeLocking=");
		builder.append(balanceBeforeLocking);
		builder.append(", originalTransactionRef=");
		builder.append(originalTransactionRef);
		builder.append(", darajaRefNo=");
		builder.append(darajaRefNo);
		builder.append("]");
		return builder.toString();
	}
    
}
