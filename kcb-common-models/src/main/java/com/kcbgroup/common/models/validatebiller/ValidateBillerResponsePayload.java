package com.kcbgroup.common.models.validatebiller;

import java.io.Serializable;

public class ValidateBillerResponsePayload implements Serializable {
	
    private static final long serialVersionUID = -1390435216639519451L;

    private TransactionInfo transactionInfo;

    public ValidateBillerResponsePayload() {
       super();
    }

    public TransactionInfo getTransactionInfo() {
        return transactionInfo;
    }

    public void setTransactionInfo(TransactionInfo transactionInfo) {
            this.transactionInfo = transactionInfo;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ResponsePayload [transactionInfo=");
        builder.append(transactionInfo);
        builder.append("]");
        return builder.toString();
    }
}
