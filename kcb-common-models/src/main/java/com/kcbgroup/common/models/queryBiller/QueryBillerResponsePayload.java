package com.kcbgroup.common.models.queryBiller;

import java.io.Serializable;


/**
 * @author Gideon Mulandi | KCB
 * @version 1.0.0
 */
public class QueryBillerResponsePayload implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = 363652223581858772L;
 
      private TransactionInfo transactionInfo;
    
    public QueryBillerResponsePayload() {
		super();
	}

	/**
	 * @return the transactionInfo
	 */
	public TransactionInfo getTransactionInfo() {
		return transactionInfo;
	}

	/**
	 * @param transactionInfo the transactionInfo to set
	 */
	public void setTransactionInfo(TransactionInfo transactionInfo) {
		this.transactionInfo = transactionInfo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("QueryBillerResponsePayload [transactionInfo=");
		builder.append(transactionInfo);
		builder.append("]");
		return builder.toString();
	}
}
