package com.kcbgroup.common.models.transactioninfo;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Transaction Information Model Class
 * 
 * @author Francisco Osorio | Bring Global
 * @version 0.0.1
 */
@JsonIgnoreProperties
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TransactionInfo implements Serializable {
	/*** Serial version ***/
	private static final long serialVersionUID = -1110163464484167223L;

	private String companyCode;
	private String transactionType;
	private String debitAccountNumber;
	private String debitAmount;
	private String debitReference;
	private String creditReference;
	private String creditAccountNumber;
	private String paymentDetails;
	private String terminalID;
	private String messageType;
	private String currencyCode;
	private String retrievalRefNumber;
	private String amountCurrency;
	private String dateTime;
	private String dateString;
	private String agentCommAmount;
	private String totalChrgAmount;
	private String agentCommAccount;
	private String custChrgAmount;
	private String transactionID;
	private String falconBalance;
        private String debitCurrency;
        private String creditCurrency;
        private String chargesAccountNumber;
        private String commissionCode;
        private String chargeCode;
        private String creditAmount;
        private String debitCustomer;
        private String creditCustomer;
        private String chargedCustomer;
        private String inputter;
        private String authorizer;
        private String uniqueID;
        private String uniqueReference;
        private String falconAccountNumber;
        private String status;


               
	public TransactionInfo() {
            
	}
	   public String getstatus() {
           return status;
       }
        public String getFalconAccountNumber() {
            return falconAccountNumber;
        }

        public void setFalconAccountNumber(String falconAccountNumber) {
            this.falconAccountNumber = falconAccountNumber;
        }
        
        public String getUniqueReference() {
            return uniqueReference;
        }

        public void setStatus(String status) {
            this.status = status;
        }
        public void setUniqueReference(String uniqueReference) {
            this.uniqueReference = uniqueReference;
        }
        public String getUniqueID() {
            return uniqueID;
        }

        public void setUniqueID(String uniqueID) {
            this.uniqueID = uniqueID;
        }
        
        public String getAuthorizer() {
            return authorizer;
        }

        public void setAuthorizer(String authorizer) {
            this.authorizer = authorizer;
        }
        
        
        public String getInputter() {
            return inputter;
        }

        public void setInputter(String inputter) {
            this.inputter = inputter;
        }
                
        public String getChargedCustomer() {
            return chargedCustomer;
        }

        public void setChargedCustomer(String chargedCustomer) {
            this.chargedCustomer = chargedCustomer;
        }
        
        

        public String getDebitCustomer() {
            return debitCustomer;
        }

        public void setDebitCustomer(String debitCustomer) {
            this.debitCustomer = debitCustomer;
        }

        public String getCreditCustomer() {
            return creditCustomer;
        }

        public void setCreditCustomer(String creditCustomer) {
            this.creditCustomer = creditCustomer;
        }
        
        public String getCreditAmount() {
            return creditAmount;
        }

        public void setCreditAmount(String creditAmount) {
            this.creditAmount = creditAmount;
        }
        
        

        public String getChargeCode() {
            return chargeCode;
        }

        public void setChargeCode(String chargeCode) {
            this.chargeCode = chargeCode;
        }
        
        
        public String getCommissionCode() {
            return commissionCode;
        }

        public void setCommissionCode(String commissionCode) {
            this.commissionCode = commissionCode;
        }
        
        
        public String getChargesAccountNumber() {
            return chargesAccountNumber;
        }

        public void setChargesAccountNumber(String chargesAccountNumber) {
            this.chargesAccountNumber = chargesAccountNumber;
        }
        
        
	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getDebitAccountNumber() {
		return debitAccountNumber;
	}

	public void setDebitAccountNumber(String debitAccountNumber) {
		this.debitAccountNumber = debitAccountNumber;
	}

	public String getDebitAmount() {
		return debitAmount;
	}

	public void setDebitAmount(String debitAmount) {
		this.debitAmount = debitAmount;
	}

	public String getDebitReference() {
		return debitReference;
	}

	public void setDebitReference(String debitReference) {
		this.debitReference = debitReference;
	}

	public String getCreditReference() {
		return creditReference;
	}

	public void setCreditReference(String creditReference) {
		this.creditReference = creditReference;
	}

	public String getCreditAccountNumber() {
		return creditAccountNumber;
	}

	public void setCreditAccountNumber(String creditAccountNumber) {
		this.creditAccountNumber = creditAccountNumber;
	}

	public String getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(String paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public String getTerminalID() {
		return terminalID;
	}

	public void setTerminalID(String terminalID) {
		this.terminalID = terminalID;
	}

	public String getMessageType() {
		return messageType;
	}

	public void setMessageType(String messageType) {
		this.messageType = messageType;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getRetrievalRefNumber() {
		return retrievalRefNumber;
	}

	public void setRetrievalRefNumber(String retrievalRefNumber) {
		this.retrievalRefNumber = retrievalRefNumber;
	}

	public String getAmountCurrency() {
		return amountCurrency;
	}

	public void setAmountCurrency(String amountCurrency) {
		this.amountCurrency = amountCurrency;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

	public String getDateString() {
		return dateString;
	}

	public void setDateString(String dateString) {
		this.dateString = dateString;
	}

	public String getAgentCommAmount() {
		return agentCommAmount;
	}

	public void setAgentCommAmount(String agentCommAmount) {
		this.agentCommAmount = agentCommAmount;
	}

	public String getTotalChrgAmount() {
		return totalChrgAmount;
	}

	public void setTotalChrgAmount(String totalChrgAmount) {
		this.totalChrgAmount = totalChrgAmount;
	}

	public String getAgentCommAccount() {
		return agentCommAccount;
	}

	public void setAgentCommAccount(String agentCommAccount) {
		this.agentCommAccount = agentCommAccount;
	}

	public String getCustChrgAmount() {
		return custChrgAmount;
	}

	public void setCustChrgAmount(String custChrgAmount) {
		this.custChrgAmount = custChrgAmount;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public String getFalconBalance() {
		return falconBalance;
	}

	public void setFalconBalance(String falconBalance) {
		this.falconBalance = falconBalance;
	}

        public String getDebitCurrency() {
            return debitCurrency;
        }

        public void setDebitCurrency(String debitCurrency) {
            this.debitCurrency = debitCurrency;
        }

        public String getCreditCurrency() {
            return creditCurrency;
        }

        public void setCreditCurrency(String creditCurrency) {
            this.creditCurrency = creditCurrency;
        }
        
        
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TransactionInfo [companyCode=");
		builder.append(companyCode);
		builder.append(", transactionType=");
		builder.append(transactionType);
		builder.append(", debitAccountNumber=");
		builder.append(debitAccountNumber);
		builder.append(", debitAmount=");
		builder.append(debitAmount);
		builder.append(", debitReference=");
		builder.append(debitReference);
		builder.append(", creditReference=");
		builder.append(creditReference);
		builder.append(", creditAccountNumber=");
		builder.append(creditAccountNumber);
		builder.append(", paymentDetails=");
		builder.append(paymentDetails);
		builder.append(", terminalID=");
		builder.append(terminalID);
		builder.append(", messageType=");
		builder.append(messageType);
		builder.append(", currencyCode=");
		builder.append(currencyCode);
		builder.append(", retrievalRefNumber=");
		builder.append(retrievalRefNumber);
		builder.append(", amountCurrency=");
		builder.append(amountCurrency);
		builder.append(", dateTime=");
		builder.append(dateTime);
		builder.append(", dateString=");
		builder.append(dateString);
		builder.append(", agentCommAmount=");
		builder.append(agentCommAmount);
		builder.append(", totalChrgAmount=");
		builder.append(totalChrgAmount);
		builder.append(", agentCommAccount=");
		builder.append(agentCommAccount);
		builder.append(", custChrgAmount=");
		builder.append(custChrgAmount);
		builder.append(", transactionID=");
		builder.append(transactionID);
		builder.append(", falconBalance=");
		builder.append(falconBalance);
		builder.append(", status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
}
