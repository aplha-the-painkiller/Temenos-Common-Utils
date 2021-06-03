/**
 * 
 */
package com.kcbgroup.common.models.transactioninfo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * t24-account-balance-inquiry
 * Jun 29, 2020
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
@JsonIgnoreProperties
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionInfoResponsePayload implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = 353652223581858774L;

    @Override
	public String toString() {
		return "TransactionInfoResponsePayload [transactionInfo=" + transactionInfo + ", additionalDetails="
				+ additionalDetails + "]";
	}
    @JsonIgnoreProperties
    private TransactionInfo transactionInfo;
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((additionalDetails == null) ? 0 : additionalDetails.hashCode());
		result = prime * result + ((transactionInfo == null) ? 0 : transactionInfo.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TransactionInfoResponsePayload other = (TransactionInfoResponsePayload) obj;
		if (additionalDetails == null) {
			if (other.additionalDetails != null)
				return false;
		} else if (!additionalDetails.equals(other.additionalDetails))
			return false;
		if (transactionInfo == null) {
			if (other.transactionInfo != null)
				return false;
		} else if (!transactionInfo.equals(other.transactionInfo))
			return false;
		return true;
	}
    @JsonIgnoreProperties
	public AdditionalDetails getAdditionalDetails() {
		return additionalDetails;
	}


	public void setAdditionalDetails(AdditionalDetails additionalDetails) {
		this.additionalDetails = additionalDetails;
	}

	private AdditionalDetails additionalDetails;


    public TransactionInfoResponsePayload() {
		super();
	}
	public TransactionInfo getTransactionInfo() {
		return transactionInfo;
	}

	public void setTransactionInfo(TransactionInfo transactionInfo) {
		this.transactionInfo = transactionInfo;
	}

	
}
