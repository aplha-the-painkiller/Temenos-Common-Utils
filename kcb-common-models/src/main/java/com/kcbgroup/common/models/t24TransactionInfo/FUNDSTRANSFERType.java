/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcbgroup.common.models.t24TransactionInfo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author abizibu
 */
@XmlRootElement(name = "FUNDSTRANSFERType")
@XmlAccessorType(XmlAccessType.FIELD) // This line was added
public class FUNDSTRANSFERType implements Serializable  {
    
    private static final long serialVersionUID = 1259336165238582739L;
    
    @XmlElement(name="TRANSACTIONTYPE")
    private String transactionType;
     
    @XmlElement(name="DEBITACCTNO")
    private String debitAccountNumber; 
    
    @XmlElement(name="DEBITCURRENCY")
    private String debitCurrency;
    
    @XmlElement(name="DEBITTHEIRREF")
    private String debitTheirRef;
    
    @XmlElement(name="CREDITTHEIRREF")
    private String creditTheirRef;
    
    @XmlElement(name="CREDITACCTNO")
    private String creditAccountNumber;
    
    @XmlElement(name="CREDITCURRENCY")
    private String creditCurrency;
    
    @XmlElement(name="CHARGESACCTNO")
    private String chargesAccountNumber;
    
    @XmlElement(name="PAYMENTDETAILS")
    private String paymentDetails;
    
    @XmlElement(name="COMMISSIONCODE")
    private String commissionCode;
    
    @XmlElement(name="CHARGECODE")
    private String chargeCode;
    
    @XmlElement(name="AMOUNTDEBITED")
    private String debitAmount;
    
    @XmlElement(name="AMOUNTCREDITED")
    private String creditAmount;
    
    @XmlElement(name="DEBITCUSTOMER")
    private String debitCustomer;
    
    @XmlElement(name="CREDITCUSTOMER")
    private String creditCustomer;
    
    @XmlElement(name="CHARGEDCUSTOMER")
    private String chargedCustomer;
    
    @XmlElement(name="INPUTTER")
    private String inputter;
    
    @XmlElement(name="AUTHORISER")
    private String authorizer;
    
    @XmlElement(name="ATUNIQUEID")
    private String uniqueID;
    
    @XmlElement(name="ATMTERMID")
    private String terminalID;
    
    @XmlElement(name="ATMSGTYPE")
    private String messageType;

    @XmlElement(name="ATRRN")
    private String retrievalRefNumber;
    
    @XmlElement(name="ATDATETIME")
    private String dateTime;
    
    @XmlElement(name="OFFUNIQREF")
    private String uniqueReference;
    
    @XmlElement(name="FALCONACCT")
    private String falconAccountNumber;
    
    @XmlElement(name="FALCONBAL")
    private String falconBalance;

    public String getFalconBalance() {
        return falconBalance;
    }

    public void setFalconBalance(String falconBalance) {
        this.falconBalance = falconBalance;
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

    public void setUniqueReference(String uniqueReference) {
        this.uniqueReference = uniqueReference;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
    
    public String getMessageType() {
        return messageType;
    }
   
    public String getRetrievalRefNumber() {
        return retrievalRefNumber;
    }

    public void setRetrievalRefNumber(String retrievalRefNumber) {
        this.retrievalRefNumber = retrievalRefNumber;
    }
    
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getInputter() {
        return inputter;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
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

    public void setInputter(String inputter) {
        this.inputter = inputter;
    }
    
    public String getChargedCustomer() {
        return chargedCustomer;
    }

    public void setChargedCustomer(String chargedCustomer) {
        this.chargedCustomer = chargedCustomer;
    }

    public String getCreditAmount() {
        return creditAmount;
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
    
    
    

    public void setCreditAmount(String creditAmount) {
        this.creditAmount = creditAmount;
    }
   
    public String getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(String debitAmount) {
        this.debitAmount = debitAmount;
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

    public String getDebitCurrency() {
        return debitCurrency;
    }

    public void setDebitCurrency(String debitCurrency) {
        this.debitCurrency = debitCurrency;
    }

    public String getDebitTheirRef() {
        return debitTheirRef;
    }

    public void setDebitTheirRef(String debitTheirRef) {
        this.debitTheirRef = debitTheirRef;
    }

    public String getCreditTheirRef() {
        return creditTheirRef;
    }

    public void setCreditTheirRef(String creditTheirRef) {
        this.creditTheirRef = creditTheirRef;
    }

    public String getCreditAccountNumber() {
        return creditAccountNumber;
    }

    public void setCreditAccountNumber(String creditAccountNumber) {
        this.creditAccountNumber = creditAccountNumber;
    }

    public String getCreditCurrency() {
        return creditCurrency;
    }

    public void setCreditCurrency(String creditCurrency) {
        this.creditCurrency = creditCurrency;
    }

    public String getChargesAccountNumber() {
        return chargesAccountNumber;
    }

    public void setChargesAccountNumber(String chargesAccountNumber) {
        this.chargesAccountNumber = chargesAccountNumber;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }
    
    @Override
    public String toString() {
        return "FUNDSTRANSFERType{" + "transactionType=" + transactionType + ", debitAccountNumber=" + debitAccountNumber + ", debitCurrency=" + debitCurrency + ", debitTheirRef=" + debitTheirRef + ", creditTheirRef=" + creditTheirRef + ", creditAccountNumber=" + creditAccountNumber + ", creditCurrency=" + creditCurrency + ", chargesAccountNumber=" + chargesAccountNumber + '}';
    }
}
