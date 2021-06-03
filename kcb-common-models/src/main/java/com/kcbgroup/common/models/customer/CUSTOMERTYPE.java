package com.kcbgroup.common.models.customer;



import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * t24-account-inquiry Sep 1, 2020 MKCBCHANNELACCTDetailType.java
 *
 * @author Gideon Mulandi | KCB Application Dev
 * @version 1.0.0
 */
//KCBCustomerCreationResponse
@XmlRootElement(name = "CUSTOMERType")
@XmlAccessorType(XmlAccessType.FIELD) // This line was added
public class CUSTOMERTYPE implements Serializable {

	private static final long serialVersionUID = 1259336165238582733L;

	@XmlElement(name = "transactionId")  
	private String transactionId;
	
	@XmlElement(name = "SHORTNAME")  
	private String firstName;
	
	@XmlElement(name = "NAME1")  
	private String fullName;
    
	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CUSTOMERType [transactionId=");
		builder.append(transactionId);
		builder.append(", firstName=");
		builder.append(firstName);
//		builder.append(", fullName=");
//		builder.append(fullName);
		builder.append("]");
		return builder.toString();
	}

	


}
