package com.kcbgroup.common.models.customer;

import java.io.Serializable;
import java.util.List;

/**
 * Transaction Information Model Class
 * 
 * @author Andrés Vázquez | Bring Global
 * @version 0.0.1
 */
public class TransactionInfo implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = -1110163464484167223L;
	
    public String companyCode;
    public String mnemonic;
    public String firstName;
    public String middleName;
    public String lastName;
    public String street;
    public String town;
    public String sectorCode;
    public String branchCode;
    public String industryCode;
    public String targetCode;
    public String nationality;
    public String customerStatus;
    public String residence;
    public List<DocumentDetail> documentDetails;
    public List<ContactDetail> contactDetails;
    public String notificationLanguage;
    public String kcbSector;
    public String customerSegmentCode;
    public String transactionId; 
    public String customerID; 
	/**
	 * @return the companyCode
	 */
	public String getCompanyCode() {
		return companyCode;
	}
	/**
	 * @param companyCode the companyCode to set
	 */
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	/**
	 * @return the mnemonic
	 */
	public String getMnemonic() {
		return mnemonic;
	}
	/**
	 * @param mnemonic the mnemonic to set
	 */
	public void setMnemonic(String mnemonic) {
		this.mnemonic = mnemonic;
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
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}
	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
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
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the town
	 */
	public String getTown() {
		return town;
	}
	/**
	 * @param town the town to set
	 */
	public void setTown(String town) {
		this.town = town;
	}
	/**
	 * @return the sectorCode
	 */
	public String getSectorCode() {
		return sectorCode;
	}
	/**
	 * @param sectorCode the sectorCode to set
	 */
	public void setSectorCode(String sectorCode) {
		this.sectorCode = sectorCode;
	}
	/**
	 * @return the branchCode
	 */
	public String getBranchCode() {
		return branchCode;
	}
	/**
	 * @param branchCode the branchCode to set
	 */
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}
	/**
	 * @return the industryCode
	 */
	public String getIndustryCode() {
		return industryCode;
	}
	/**
	 * @param industryCode the industryCode to set
	 */
	public void setIndustryCode(String industryCode) {
		this.industryCode = industryCode;
	}
	/**
	 * @return the targetCode
	 */
	public String getTargetCode() {
		return targetCode;
	}
	/**
	 * @param targetCode the targetCode to set
	 */
	public void setTargetCode(String targetCode) {
		this.targetCode = targetCode;
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
	/**
	 * @return the customerStatus
	 */
	public String getCustomerStatus() {
		return customerStatus;
	}
	/**
	 * @param customerStatus the customerStatus to set
	 */
	public void setCustomerStatus(String customerStatus) {
		this.customerStatus = customerStatus;
	}
	/**
	 * @return the residence
	 */
	public String getResidence() {
		return residence;
	}
	/**
	 * @param residence the residence to set
	 */
	public void setResidence(String residence) {
		this.residence = residence;
	}
	/**
	 * @return the documentDetails
	 */
	public List<DocumentDetail> getDocumentDetails() {
		return documentDetails;
	}
	/**
	 * @param documentDetails the documentDetails to set
	 */
	public void setDocumentDetails(List<DocumentDetail> documentDetails) {
		this.documentDetails = documentDetails;
	}
	/**
	 * @return the contactDetails
	 */
	public List<ContactDetail> getContactDetails() {
		return contactDetails;
	}
	/**
	 * @param contactDetails the contactDetails to set
	 */
	public void setContactDetails(List<ContactDetail> contactDetails) {
		this.contactDetails = contactDetails;
	}
	/**
	 * @return the notificationLanguage
	 */
	public String getNotificationLanguage() {
		return notificationLanguage;
	}
	/**
	 * @param notificationLanguage the notificationLanguage to set
	 */
	public void setNotificationLanguage(String notificationLanguage) {
		this.notificationLanguage = notificationLanguage;
	}
	/**
	 * @return the kcbSector
	 */
	public String getKcbSector() {
		return kcbSector;
	}
	/**
	 * @param kcbSector the kcbSector to set
	 */
	public void setKcbSector(String kcbSector) {
		this.kcbSector = kcbSector;
	}
	/**
	 * @return the customerSegmentCode
	 */
	public String getCustomerSegmentCode() {
		return customerSegmentCode;
	}
	/**
	 * @param customerSegmentCode the customerSegmentCode to set
	 */
	public void setCustomerSegmentCode(String customerSegmentCode) {
		this.customerSegmentCode = customerSegmentCode;
	}
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public void setCustomerId(String customerID) {
		this.customerID = customerID;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TransactionInfo [companyCode=");
		builder.append(companyCode);
		builder.append(", mnemonic=");
		builder.append(mnemonic);
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", middleName=");
		builder.append(middleName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", street=");
		builder.append(street);
		builder.append(", town=");
		builder.append(town);
		builder.append(", sectorCode=");
		builder.append(sectorCode);
		builder.append(", branchCode=");
		builder.append(branchCode);
		builder.append(", industryCode=");
		builder.append(industryCode);
		builder.append(", targetCode=");
		builder.append(targetCode);
		builder.append(", nationality=");
		builder.append(nationality);
		builder.append(", customerStatus=");
		builder.append(customerStatus);
		builder.append(", residence=");
		builder.append(residence);
		builder.append(", notificationLanguage=");
		builder.append(notificationLanguage);
		builder.append(", kcbSector=");
		builder.append(kcbSector);
		builder.append(", transactionId=");
		builder.append(transactionId);
		builder.append(", customerID=");
		builder.append(customerID);
		builder.append(", customerSegmentCode=");
		builder.append(customerSegmentCode);
		builder.append("]");
		return builder.toString();
	}
    

}
