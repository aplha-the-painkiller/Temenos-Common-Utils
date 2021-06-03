package com.kcbgroup.common.models.queryBiller;

import java.io.Serializable;

public class TransactionInfo implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = -2220163464484167223L;
	
	public String transactionId;
    public String utilityName;
    public String customerName;
    public String amount;
    
    public TransactionInfo() {
	}
    
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getUtilityName() {
		return utilityName;
	}
	public void setUtilityName(String utilityName) {
		this.utilityName = utilityName;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TransactionInfo [transactionId=");
		builder.append(transactionId);
		builder.append(", utilityName=");
		builder.append(utilityName);
		builder.append(", customerName=");
		builder.append(customerName);
		builder.append(", amount=");
		builder.append(amount);
		builder.append("]");
		return builder.toString();
	}
}
