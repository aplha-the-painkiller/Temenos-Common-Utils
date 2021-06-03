/**
 * kcb-common-models
 * Nov 24, 2020
 * ReceiverDetails.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
package com.kcbgroup.common.models.imt.ria;

import java.io.Serializable;

/**
 * kcb-common-models
 * Nov 24, 2020
 * ReceiverDetails.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class ReceiverDetails  implements Serializable {

    /** Serial version UID */
	private static final long serialVersionUID = -5319649202949243441L;
	
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String country;
    private String zipCode;
    private String msisdn;
    
    private String currency;
    private String amount;
    private String identifierType;
    private String identifierNo;
    private String identifierTypeIssuedAuthority;
    private String identifierIssuedCountryCode;
    private String identifierIssuedCountryState;
    private String identifierIssuedDate;
    private String identifierExpiryDate;
    
    
	/**
	 * @return the currency
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	/**
	 * @return the identifierType
	 */
	public String getIdentifierType() {
		return identifierType;
	}
	/**
	 * @param identifierType the identifierType to set
	 */
	public void setIdentifierType(String identifierType) {
		this.identifierType = identifierType;
	}
	/**
	 * @return the identifierNo
	 */
	public String getIdentifierNo() {
		return identifierNo;
	}
	/**
	 * @param identifierNo the identifierNo to set
	 */
	public void setIdentifierNo(String identifierNo) {
		this.identifierNo = identifierNo;
	}
	/**
	 * @return the identifierTypeIssuedAuthority
	 */
	public String getIdentifierTypeIssuedAuthority() {
		return identifierTypeIssuedAuthority;
	}
	/**
	 * @param identifierTypeIssuedAuthority the identifierTypeIssuedAuthority to set
	 */
	public void setIdentifierTypeIssuedAuthority(String identifierTypeIssuedAuthority) {
		this.identifierTypeIssuedAuthority = identifierTypeIssuedAuthority;
	}
	/**
	 * @return the identifierIssuedCountryCode
	 */
	public String getIdentifierIssuedCountryCode() {
		return identifierIssuedCountryCode;
	}
	/**
	 * @param identifierIssuedCountryCode the identifierIssuedCountryCode to set
	 */
	public void setIdentifierIssuedCountryCode(String identifierIssuedCountryCode) {
		this.identifierIssuedCountryCode = identifierIssuedCountryCode;
	}
	/**
	 * @return the identifierIssuedCountryState
	 */
	public String getIdentifierIssuedCountryState() {
		return identifierIssuedCountryState;
	}
	/**
	 * @param identifierIssuedCountryState the identifierIssuedCountryState to set
	 */
	public void setIdentifierIssuedCountryState(String identifierIssuedCountryState) {
		this.identifierIssuedCountryState = identifierIssuedCountryState;
	}
	/**
	 * @return the identifierIssuedDate
	 */
	public String getIdentifierIssuedDate() {
		return identifierIssuedDate;
	}
	/**
	 * @param identifierIssuedDate the identifierIssuedDate to set
	 */
	public void setIdentifierIssuedDate(String identifierIssuedDate) {
		this.identifierIssuedDate = identifierIssuedDate;
	}
	/**
	 * @return the identifierExpiryDate
	 */
	public String getIdentifierExpiryDate() {
		return identifierExpiryDate;
	}
	/**
	 * @param identifierExpiryDate the identifierExpiryDate to set
	 */
	public void setIdentifierExpiryDate(String identifierExpiryDate) {
		this.identifierExpiryDate = identifierExpiryDate;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}
	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	/**
	 * @return the msisdn
	 */
	public String getMsisdn() {
		return msisdn;
	}
	/**
	 * @param msisdn the msisdn to set
	 */
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ReceiverDetails [firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", address=");
		builder.append(address);
		builder.append(", city=");
		builder.append(city);
		builder.append(", country=");
		builder.append(country);
		builder.append(", zipCode=");
		builder.append(zipCode);
		builder.append(", msisdn=");
		builder.append(msisdn);
		builder.append(", currency=");
		builder.append(currency);
		builder.append(", amount=");
		builder.append(amount);
		builder.append(", identifierType=");
		builder.append(identifierType);
		builder.append(", identifierNo=");
		builder.append(identifierNo);
		builder.append(", identifierTypeIssuedAuthority=");
		builder.append(identifierTypeIssuedAuthority);
		builder.append(", identifierIssuedCountryCode=");
		builder.append(identifierIssuedCountryCode);
		builder.append(", identifierIssuedCountryState=");
		builder.append(identifierIssuedCountryState);
		builder.append(", identifierIssuedDate=");
		builder.append(identifierIssuedDate);
		builder.append(", identifierExpiryDate=");
		builder.append(identifierExpiryDate);
		builder.append("]");
		return builder.toString();
	}
}
