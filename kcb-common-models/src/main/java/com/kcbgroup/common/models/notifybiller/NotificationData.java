package com.kcbgroup.common.models.notifybiller;

import java.io.Serializable;

/**
 * NotificationData Data Model Class
 * 
 * @author Collins Kemboi | Bring
 * @version 1.0.0
 */

public class NotificationData implements Serializable {
	@Override
	public String toString() {
		return "NotificationData [businessKey=" + businessKey + ", businessKeyType=" + businessKeyType
				+ ", debitMSISDN=" + debitMSISDN + ", transactionAmt=" + transactionAmt + ", transactionDate="
				+ transactionDate + ", transactionID=" + transactionID + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", currency=" + currency + ", narration=" + narration
				+ ", transactionType=" + transactionType + ", balance=" + balance + "]";
	}

	/**
	 * 
	 */
	/** Serial version */
	private static final long serialVersionUID = 3676435685915639797L;

	public String getBusinessKey() {
		return businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	public String getBusinessKeyType() {
		return businessKeyType;
	}

	public void setBusinessKeyType(String businessKeyType) {
		this.businessKeyType = businessKeyType;
	}

	public String getDebitMSISDN() {
		return debitMSISDN;
	}

	public void setDebitMSISDN(String debitMSISDN) {
		this.debitMSISDN = debitMSISDN;
	}

	public String getTransactionAmt() {
		return transactionAmt;
	}

	public void setTransactionAmt(String transactionAmt) {
		this.transactionAmt = transactionAmt;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getBalance() {
		return balance;
	}

	public void setBalance(String balance) {
		this.balance = balance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((balance == null) ? 0 : balance.hashCode());
		result = prime * result + ((businessKey == null) ? 0 : businessKey.hashCode());
		result = prime * result + ((businessKeyType == null) ? 0 : businessKeyType.hashCode());
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + ((debitMSISDN == null) ? 0 : debitMSISDN.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((middleName == null) ? 0 : middleName.hashCode());
		result = prime * result + ((narration == null) ? 0 : narration.hashCode());
		result = prime * result + ((transactionAmt == null) ? 0 : transactionAmt.hashCode());
		result = prime * result + ((transactionDate == null) ? 0 : transactionDate.hashCode());
		result = prime * result + ((transactionID == null) ? 0 : transactionID.hashCode());
		result = prime * result + ((transactionType == null) ? 0 : transactionType.hashCode());
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
		NotificationData other = (NotificationData) obj;
		if (balance == null) {
			if (other.balance != null)
				return false;
		} else if (!balance.equals(other.balance))
			return false;
		if (businessKey == null) {
			if (other.businessKey != null)
				return false;
		} else if (!businessKey.equals(other.businessKey))
			return false;
		if (businessKeyType == null) {
			if (other.businessKeyType != null)
				return false;
		} else if (!businessKeyType.equals(other.businessKeyType))
			return false;
		if (currency == null) {
			if (other.currency != null)
				return false;
		} else if (!currency.equals(other.currency))
			return false;
		if (debitMSISDN == null) {
			if (other.debitMSISDN != null)
				return false;
		} else if (!debitMSISDN.equals(other.debitMSISDN))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (middleName == null) {
			if (other.middleName != null)
				return false;
		} else if (!middleName.equals(other.middleName))
			return false;
		if (narration == null) {
			if (other.narration != null)
				return false;
		} else if (!narration.equals(other.narration))
			return false;
		if (transactionAmt == null) {
			if (other.transactionAmt != null)
				return false;
		} else if (!transactionAmt.equals(other.transactionAmt))
			return false;
		if (transactionDate == null) {
			if (other.transactionDate != null)
				return false;
		} else if (!transactionDate.equals(other.transactionDate))
			return false;
		if (transactionID == null) {
			if (other.transactionID != null)
				return false;
		} else if (!transactionID.equals(other.transactionID))
			return false;
		if (transactionType == null) {
			if (other.transactionType != null)
				return false;
		} else if (!transactionType.equals(other.transactionType))
			return false;
		return true;
	}

	private String businessKey;
	private String businessKeyType;
	private String debitMSISDN;
	private String transactionAmt;
	private String transactionDate;
	private String transactionID;
	private String firstName;
	private String middleName;
	private String lastName;
	private String currency;
	private String narration;
	private String transactionType;
	private String balance;

	public NotificationData() {
	}

}
