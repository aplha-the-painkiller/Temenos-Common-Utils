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
public class TransactionInfoRequestPayload implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = 353652223581858774L;

    @Override
	public String toString() {
		return "TransactionInfoRequestPayload [transactionInfo=" + transactionInfo + ", additionalDetails="
				+ additionalDetails + "]";
	}
    @JsonIgnoreProperties
	private TransactionInfo transactionInfo;
	@JsonIgnoreProperties
	private  AdditionalDetails additionalDetails;
   
    public TransactionInfo getTransactionInfo() {
		return transactionInfo;
	}


	public void setTransactionInfo(TransactionInfo transactionInfo) {
		this.transactionInfo = transactionInfo;
	}


	public AdditionalDetails getAdditionalDetails() {
		return additionalDetails;
	}


	public void setAdditionalDetails(AdditionalDetails additionalDetails) {
		this.additionalDetails = additionalDetails;
	}


    public TransactionInfoRequestPayload() {
        
	}


	
}
