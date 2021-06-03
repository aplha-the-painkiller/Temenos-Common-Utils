/**
 * 
 */
package com.kcbgroup.common.models.imt.ria.mg;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * t24-account-balance-inquiry
 * Jun 29, 2020
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class Response implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = 353652223581858774L;
 
	@JsonProperty("TransRefID") 
    private String transRefID;
	
    @JsonProperty("OrderFound") 
    private String orderFound;
    
    @JsonProperty("PIN") 
    private String pin;
    
    @JsonProperty("OrderNo") 
    private String orderNo;
    
    @JsonProperty("SeqIDRA") 
    private String seqIDRA;
    
    @JsonProperty("SeqIDPA") 
    private String seqIDPA;
    
    @JsonProperty("OrderDate") 
    private String orderDate;
    
    @JsonProperty("CountryFrom") 
    private String countryFrom;
    
    @JsonProperty("CustNameFirst") 
    private String custNameFirst;
    
    @JsonProperty("CustNameLast1") 
    private String custNameLast1;
    
    @JsonProperty("CustAddress") 
    private String custAddress;
    
    @JsonProperty("CustCity") 
    private String custCity;
    
    @JsonProperty("CustCountry") 
    private String custCountry;
    
    @JsonProperty("BeneNameFirst") 
    private String beneNameFirst;
    
    @JsonProperty("BeneNameLast1") 
    private String beneNameLast1;
    
    @JsonProperty("BeneCity") 
    private String beneCity;
    
    @JsonProperty("BeneCountry") 
    private String beneCountry;
    
    @JsonProperty("BeneTelNo") 
    private String beneTelNo;
    
    @JsonProperty("BeneCurrency") 
    private String beneCurrency;
    
    @JsonProperty("BeneAmount") 
    private String beneAmount;
    
    @JsonProperty("TransferReason") 
    private String transferReason;
    
    @JsonProperty("CustID1No") 
    private String custID1No;
    
    @JsonProperty("CustID1IssuedByCountry") 
    private String custID1IssuedByCountry;
    
    @JsonProperty("CustCountryOfBirth") 
    private String custCountryOfBirth;
    
    @JsonProperty("CustDateOfBirth") 
    private String custDateOfBirth;
    
    @JsonProperty("CustNationality") 
    private String custNationality;
    
    @JsonProperty("ResponseDateTimeUTC") 
    private String responseDateTimeUTC;
    
    @JsonProperty("ResponseCode") 
    private String responseCode;
    
    @JsonProperty("ResponseText") 
    private String responseText;
    
    @JsonProperty("statusCode")
    private String statusCode;
    
    @JsonProperty("message")
    private String message;
    
    @JsonProperty("PCCommissionCurrency")
    private String pCCommissionCurrency;
    
    @JsonProperty("PCCommissionAmount")
    private String pCCommissionAmount;
    
    @JsonProperty("PCOrderNo")
    private String pCOrderNo;
    
    @JsonProperty("SCOrderNo")
    private String sCOrderNo;
    
    @JsonProperty("PCNotificationID")
    private String pCNotificationID;
    
    @JsonProperty("ProcessDate")
    private String processDate;
    
    @JsonProperty("ProcessTime")
    private String processTime;
    
    @JsonProperty("NotificationCode")
    private String notificationCode;
    
    @JsonProperty("NotificationDesc")
    private String notificationDesc;


	/**
	 * @return the transRefID
	 */
	public String getTransRefID() {
		return transRefID;
	}

	/**
	 * @param transRefID the transRefID to set
	 */
	public void setTransRefID(String transRefID) {
		this.transRefID = transRefID;
	}

	/**
	 * @return the orderFound
	 */
	public String getOrderFound() {
		return orderFound;
	}

	/**
	 * @param orderFound the orderFound to set
	 */
	public void setOrderFound(String orderFound) {
		this.orderFound = orderFound;
	}

	/**
	 * @return the pin
	 */
	public String getPin() {
		return pin;
	}

	/**
	 * @param pin the pin to set
	 */
	public void setPin(String pin) {
		this.pin = pin;
	}

	/**
	 * @return the orderNo
	 */
	public String getOrderNo() {
		return orderNo;
	}

	/**
	 * @param orderNo the orderNo to set
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * @return the seqIDRA
	 */
	public String getSeqIDRA() {
		return seqIDRA;
	}

	/**
	 * @param seqIDRA the seqIDRA to set
	 */
	public void setSeqIDRA(String seqIDRA) {
		this.seqIDRA = seqIDRA;
	}

	/**
	 * @return the seqIDPA
	 */
	public String getSeqIDPA() {
		return seqIDPA;
	}

	/**
	 * @param seqIDPA the seqIDPA to set
	 */
	public void setSeqIDPA(String seqIDPA) {
		this.seqIDPA = seqIDPA;
	}

	/**
	 * @return the orderDate
	 */
	public String getOrderDate() {
		return orderDate;
	}

	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	/**
	 * @return the countryFrom
	 */
	public String getCountryFrom() {
		return countryFrom;
	}

	/**
	 * @param countryFrom the countryFrom to set
	 */
	public void setCountryFrom(String countryFrom) {
		this.countryFrom = countryFrom;
	}

	/**
	 * @return the custNameFirst
	 */
	public String getCustNameFirst() {
		return custNameFirst;
	}

	/**
	 * @param custNameFirst the custNameFirst to set
	 */
	public void setCustNameFirst(String custNameFirst) {
		this.custNameFirst = custNameFirst;
	}

	/**
	 * @return the custNameLast1
	 */
	public String getCustNameLast1() {
		return custNameLast1;
	}

	/**
	 * @param custNameLast1 the custNameLast1 to set
	 */
	public void setCustNameLast1(String custNameLast1) {
		this.custNameLast1 = custNameLast1;
	}

	/**
	 * @return the custAddress
	 */
	public String getCustAddress() {
		return custAddress;
	}

	/**
	 * @param custAddress the custAddress to set
	 */
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	/**
	 * @return the custCity
	 */
	public String getCustCity() {
		return custCity;
	}

	/**
	 * @param custCity the custCity to set
	 */
	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}

	/**
	 * @return the custCountry
	 */
	public String getCustCountry() {
		return custCountry;
	}

	/**
	 * @param custCountry the custCountry to set
	 */
	public void setCustCountry(String custCountry) {
		this.custCountry = custCountry;
	}

	/**
	 * @return the beneNameFirst
	 */
	public String getBeneNameFirst() {
		return beneNameFirst;
	}

	/**
	 * @param beneNameFirst the beneNameFirst to set
	 */
	public void setBeneNameFirst(String beneNameFirst) {
		this.beneNameFirst = beneNameFirst;
	}

	/**
	 * @return the beneNameLast1
	 */
	public String getBeneNameLast1() {
		return beneNameLast1;
	}

	/**
	 * @param beneNameLast1 the beneNameLast1 to set
	 */
	public void setBeneNameLast1(String beneNameLast1) {
		this.beneNameLast1 = beneNameLast1;
	}

	/**
	 * @return the beneCity
	 */
	public String getBeneCity() {
		return beneCity;
	}

	/**
	 * @param beneCity the beneCity to set
	 */
	public void setBeneCity(String beneCity) {
		this.beneCity = beneCity;
	}

	/**
	 * @return the beneCountry
	 */
	public String getBeneCountry() {
		return beneCountry;
	}

	/**
	 * @param beneCountry the beneCountry to set
	 */
	public void setBeneCountry(String beneCountry) {
		this.beneCountry = beneCountry;
	}

	/**
	 * @return the beneTelNo
	 */
	public String getBeneTelNo() {
		return beneTelNo;
	}

	/**
	 * @param beneTelNo the beneTelNo to set
	 */
	public void setBeneTelNo(String beneTelNo) {
		this.beneTelNo = beneTelNo;
	}

	/**
	 * @return the beneCurrency
	 */
	public String getBeneCurrency() {
		return beneCurrency;
	}

	/**
	 * @param beneCurrency the beneCurrency to set
	 */
	public void setBeneCurrency(String beneCurrency) {
		this.beneCurrency = beneCurrency;
	}

	/**
	 * @return the beneAmount
	 */
	public String getBeneAmount() {
		return beneAmount;
	}

	/**
	 * @param beneAmount the beneAmount to set
	 */
	public void setBeneAmount(String beneAmount) {
		this.beneAmount = beneAmount;
	}

	/**
	 * @return the transferReason
	 */
	public String getTransferReason() {
		return transferReason;
	}

	/**
	 * @param transferReason the transferReason to set
	 */
	public void setTransferReason(String transferReason) {
		this.transferReason = transferReason;
	}

	/**
	 * @return the custID1No
	 */
	public String getCustID1No() {
		return custID1No;
	}

	/**
	 * @param custID1No the custID1No to set
	 */
	public void setCustID1No(String custID1No) {
		this.custID1No = custID1No;
	}

	/**
	 * @return the custID1IssuedByCountry
	 */
	public String getCustID1IssuedByCountry() {
		return custID1IssuedByCountry;
	}

	/**
	 * @param custID1IssuedByCountry the custID1IssuedByCountry to set
	 */
	public void setCustID1IssuedByCountry(String custID1IssuedByCountry) {
		this.custID1IssuedByCountry = custID1IssuedByCountry;
	}

	/**
	 * @return the custCountryOfBirth
	 */
	public String getCustCountryOfBirth() {
		return custCountryOfBirth;
	}

	/**
	 * @param custCountryOfBirth the custCountryOfBirth to set
	 */
	public void setCustCountryOfBirth(String custCountryOfBirth) {
		this.custCountryOfBirth = custCountryOfBirth;
	}

	/**
	 * @return the custDateOfBirth
	 */
	public String getCustDateOfBirth() {
		return custDateOfBirth;
	}

	/**
	 * @param custDateOfBirth the custDateOfBirth to set
	 */
	public void setCustDateOfBirth(String custDateOfBirth) {
		this.custDateOfBirth = custDateOfBirth;
	}

	/**
	 * @return the custNationality
	 */
	public String getCustNationality() {
		return custNationality;
	}

	/**
	 * @param custNationality the custNationality to set
	 */
	public void setCustNationality(String custNationality) {
		this.custNationality = custNationality;
	}

	/**
	 * @return the responseDateTimeUTC
	 */
	public String getResponseDateTimeUTC() {
		return responseDateTimeUTC;
	}

	/**
	 * @param responseDateTimeUTC the responseDateTimeUTC to set
	 */
	public void setResponseDateTimeUTC(String responseDateTimeUTC) {
		this.responseDateTimeUTC = responseDateTimeUTC;
	}

	/**
	 * @return the responseCode
	 */
	public String getResponseCode() {
		return responseCode;
	}

	/**
	 * @param responseCode the responseCode to set
	 */
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	/**
	 * @return the responseText
	 */
	public String getResponseText() {
		return responseText;
	}

	/**
	 * @param responseText the responseText to set
	 */
	public void setResponseText(String responseText) {
		this.responseText = responseText;
	}

	/**
	 * @return the statusCode
	 */
	public String getStatusCode() {
		return statusCode;
	}

	/**
	 * @param statusCode the statusCode to set
	 */
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Response [transRefID=");
		builder.append(transRefID);
		builder.append(", orderFound=");
		builder.append(orderFound);
		builder.append(", pin=");
		builder.append(pin);
		builder.append(", orderNo=");
		builder.append(orderNo);
		builder.append(", seqIDRA=");
		builder.append(seqIDRA);
		builder.append(", seqIDPA=");
		builder.append(seqIDPA);
		builder.append(", orderDate=");
		builder.append(orderDate);
		builder.append(", countryFrom=");
		builder.append(countryFrom);
		builder.append(", custNameFirst=");
		builder.append(custNameFirst);
		builder.append(", custNameLast1=");
		builder.append(custNameLast1);
		builder.append(", custAddress=");
		builder.append(custAddress);
		builder.append(", custCity=");
		builder.append(custCity);
		builder.append(", custCountry=");
		builder.append(custCountry);
		builder.append(", beneNameFirst=");
		builder.append(beneNameFirst);
		builder.append(", beneNameLast1=");
		builder.append(beneNameLast1);
		builder.append(", beneCity=");
		builder.append(beneCity);
		builder.append(", beneCountry=");
		builder.append(beneCountry);
		builder.append(", beneTelNo=");
		builder.append(beneTelNo);
		builder.append(", beneCurrency=");
		builder.append(beneCurrency);
		builder.append(", beneAmount=");
		builder.append(beneAmount);
		builder.append(", transferReason=");
		builder.append(transferReason);
		builder.append(", custID1No=");
		builder.append(custID1No);
		builder.append(", custID1IssuedByCountry=");
		builder.append(custID1IssuedByCountry);
		builder.append(", custCountryOfBirth=");
		builder.append(custCountryOfBirth);
		builder.append(", custDateOfBirth=");
		builder.append(custDateOfBirth);
		builder.append(", custNationality=");
		builder.append(custNationality);
		builder.append(", responseDateTimeUTC=");
		builder.append(responseDateTimeUTC);
		builder.append(", responseCode=");
		builder.append(responseCode);
		builder.append(", responseText=");
		builder.append(responseText);
		builder.append(", statusCode=");
		builder.append(statusCode);
		builder.append(", message=");
		builder.append(message);
		builder.append("]");
		return builder.toString();
	}
}
