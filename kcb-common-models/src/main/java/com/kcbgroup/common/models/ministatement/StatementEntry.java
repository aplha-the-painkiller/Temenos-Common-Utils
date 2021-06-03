/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcbgroup.common.models.ministatement;

import java.io.Serializable;

/**
 *
 * @author abizibu
 */
public class StatementEntry implements Serializable {

	private static final long serialVersionUID = -6644179902534677297L;
	
	private String transactionDate;
    private String transactionDesc;
    private String transactionValueDate;
    private String debitAmout;
    private String creditAmount;
    
	/**
	 * 
	 */
	public StatementEntry() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param transactionDate
	 * @param transactionDesc
	 * @param transactionValueDate
	 * @param debitAmout
	 * @param creditAmount
	 */
	public StatementEntry(String transactionDate, String transactionDesc, String transactionValueDate,
			String debitAmout, String creditAmount) {
		super();
		this.transactionDate = transactionDate;
		this.transactionDesc = transactionDesc;
		this.transactionValueDate = transactionValueDate;
		this.debitAmout = debitAmout;
		this.creditAmount = creditAmount;
	}
	/**
	 * @return the transactionDate
	 */
	public String getTransactionDate() {
		return transactionDate;
	}
	/**
	 * @param transactionDate the transactionDate to set
	 */
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	/**
	 * @return the transactionDesc
	 */
	public String getTransactionDesc() {
		return transactionDesc;
	}
	/**
	 * @param transactionDesc the transactionDesc to set
	 */
	public void setTransactionDesc(String transactionDesc) {
		this.transactionDesc = transactionDesc;
	}
	/**
	 * @return the transactionValueDate
	 */
	public String getTransactionValueDate() {
		return transactionValueDate;
	}
	/**
	 * @param transactionValueDate the transactionValueDate to set
	 */
	public void setTransactionValueDate(String transactionValueDate) {
		this.transactionValueDate = transactionValueDate;
	}
	/**
	 * @return the debitAmout
	 */
	public String getDebitAmout() {
		return debitAmout;
	}
	/**
	 * @param debitAmout the debitAmout to set
	 */
	public void setDebitAmout(String debitAmout) {
		this.debitAmout = debitAmout;
	}
	/**
	 * @return the creditAmount
	 */
	public String getCreditAmount() {
		return creditAmount;
	}
	/**
	 * @param creditAmount the creditAmount to set
	 */
	public void setCreditAmount(String creditAmount) {
		this.creditAmount = creditAmount;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("StatementEntry [transactionDate=");
		builder.append(transactionDate);
		builder.append(", transactionDesc=");
		builder.append(transactionDesc);
		builder.append(", transactionValueDate=");
		builder.append(transactionValueDate);
		builder.append(", debitAmout=");
		builder.append(debitAmout);
		builder.append(", creditAmount=");
		builder.append(creditAmount);
		builder.append("]");
		return builder.toString();
	}
}
