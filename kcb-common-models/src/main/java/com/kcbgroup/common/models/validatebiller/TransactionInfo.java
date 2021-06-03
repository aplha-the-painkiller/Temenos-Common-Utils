package com.kcbgroup.common.models.validatebiller;

import java.io.Serializable;

public class TransactionInfo implements Serializable {

    private static final long serialVersionUID = -4779485671482188052L;

    private String transactionId;

    public String getTransactionId() {
            return transactionId;
    }

    public void setTransactionId(String transactionId) {
            this.transactionId = transactionId;
    }

    @Override
    public String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("TransactionInfo [transactionId=");
            builder.append(transactionId);
            builder.append("]");
            return builder.toString();
    }
}
