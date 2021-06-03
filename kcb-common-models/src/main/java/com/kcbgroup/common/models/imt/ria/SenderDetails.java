/**
 * 
 */
package com.kcbgroup.common.models.imt.ria;

import java.io.Serializable;

/**
 * Generic Header Model Class (for Body and Body)
 * 
 * @author Andrés Vázquez | Bring Global
 * @version 1.0.0
 */
public class SenderDetails implements Serializable {
    /** Serial version UID */
	private static final long serialVersionUID = -8478981958316046120L;
 
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String country;
    private String zipCode;
    private String msisdn;
    private String identifierNo;
    private String identifierIssuedCountryCode;
    private String countryOfBirth;
    private String dateOfBirth;
    private String nationality;
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
	 * @return the countryOfBirth
	 */
	public String getCountryOfBirth() {
		return countryOfBirth;
	}
	/**
	 * @param countryOfBirth the countryOfBirth to set
	 */
	public void setCountryOfBirth(String countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}
	/**
	 * @return the dateOfBirth
	 */
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	/**
	 * @param dateOfBirth the dateOfBirth to set
	 */
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}
	/**
	 * @param nationality the nationality to set
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SenderDetails [firstName=");
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
		builder.append(", identifierNo=");
		builder.append(identifierNo);
		builder.append(", identifierIssuedCountryCode=");
		builder.append(identifierIssuedCountryCode);
		builder.append(", countryOfBirth=");
		builder.append(countryOfBirth);
		builder.append(", dateOfBirth=");
		builder.append(dateOfBirth);
		builder.append(", nationality=");
		builder.append(nationality);
		builder.append("]");
		return builder.toString();
	}
    
    
}
