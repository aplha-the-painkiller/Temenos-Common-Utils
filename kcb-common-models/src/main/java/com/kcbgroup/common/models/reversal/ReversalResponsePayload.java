package com.kcbgroup.common.models.reversal;

import java.io.Serializable;

import com.kcbgroup.common.models.validatebiller.AdditionalData;
import com.kcbgroup.common.models.validatebiller.PrimaryData;

/**
 * Funds Transfer Response Payload Model
 * 
 * @author Stephen Okoth | KCB
 * @version 1.0.0
 */
public class ReversalResponsePayload implements Serializable {
	/** Serial Version UID */
	private static final long serialVersionUID = -3627553778458829450L;

	private TransactionInfo transactionInfo;
	private PrimaryData primaryData; 
    private AdditionalData additionalData;

	public ReversalResponsePayload() {
		super();
	}

	public TransactionInfo getTransactionInfo() {
		return transactionInfo;
	}

	public void setTransactionInfo(TransactionInfo transactionInfo) {
		this.transactionInfo = transactionInfo;
	}

	public PrimaryData getPrimaryData() {
		return primaryData;
	}

	public void setPrimaryData(PrimaryData primaryData) {
		this.primaryData = primaryData;
	}

	public AdditionalData getAdditionalData() {
		return additionalData;
	}

	public void setAdditionalData(AdditionalData additionalData) {
		this.additionalData = additionalData;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResponsePayload [transactionInfo=");
		builder.append(transactionInfo);
		builder.append(", primaryData=");
		builder.append(primaryData);
		builder.append(", additionalData=");
		builder.append(additionalData);
		builder.append("]");
		return builder.toString();
	}
}
