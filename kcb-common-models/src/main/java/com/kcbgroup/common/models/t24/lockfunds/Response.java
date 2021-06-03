package com.kcbgroup.common.models.t24.lockfunds;

public class Response {
	/** CompanyID  */
	String txnCurrency;
	String statusCode;
	String statusDescription;
	String balanceAfterLocking;
	String balanceBeforeLocking;
	String originalTransactionRef;
	String darajaRefNo;
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getStatusDescription() {
		return statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
	public String getBalanceAfterLocking() {
		return balanceAfterLocking;
	}
	public void setBalanceAfterLocking(String balanceAfterLocking) {
		this.balanceAfterLocking = balanceAfterLocking;
	}
	public String getBalanceBeforeLocking() {
		return balanceBeforeLocking;
	}
	public void setBalanceBeforeLocking(String balanceBeforeLocking) {
		this.balanceBeforeLocking = balanceBeforeLocking;
	}
	public String getOriginalTransactionRef() {
		return originalTransactionRef;
	}
	public void setOriginalTransactionRef(String originalTransactionRef) {
		this.originalTransactionRef = originalTransactionRef;
	}
	public String getDarajaRefNo() {
		return darajaRefNo;
	}
	public void setDarajaRefNo(String darajaRefNo) {
		this.darajaRefNo = darajaRefNo;
	}
	@Override
	public String toString() {
		return "Request [statusCode=" + statusCode + ", statusDescription=" + statusDescription
				+ ", balanceAfterLocking=" + balanceAfterLocking + ", balanceBeforeLocking=" + balanceBeforeLocking
				+ ", originalTransactionRef=" + originalTransactionRef + ", darajaRefNo=" + darajaRefNo + "]";
	}

	
}
