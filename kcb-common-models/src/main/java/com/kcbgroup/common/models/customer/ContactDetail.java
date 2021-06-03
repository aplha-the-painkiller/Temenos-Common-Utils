/**
 * kcb-common-models
 * Oct 1, 2020
 * ContactDetail.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
package com.kcbgroup.common.models.customer;

import java.io.Serializable;

/**
 * kcb-common-models
 * Oct 1, 2020
 * ContactDetail.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class ContactDetail implements Serializable {

	private static final long serialVersionUID = 5270516008125375758L;
	
	public String mobileNumber;
    public String emailAddress;
	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}
	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContactDetail [mobileNumber=");
		builder.append(mobileNumber);
		builder.append(", emailAddress=");
		builder.append(emailAddress);
		builder.append("]");
		return builder.toString();
	}
    
    
}
