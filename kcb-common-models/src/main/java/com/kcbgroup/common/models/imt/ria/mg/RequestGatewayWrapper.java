/**
 * 
 */
package com.kcbgroup.common.models.imt.ria.mg;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * General Request Wrapper
 *
 * @author Andres Vazquez | Bring Global
 * @version 1.0.0
 */
public class RequestGatewayWrapper implements Serializable {
	/** Serial version UID */
	private static final long serialVersionUID = 6464903968440189419L;
	
    @JsonProperty("DateTimeLocal") 
    private String dateTimeLocal;
    
    @JsonProperty("DateTimeUTC") 
    private String dateTimeUTC;
    
    @JsonProperty("PIN") 
    private String pin;
    
    @JsonProperty("BeneAmount") 
    private String beneAmount;
    
    @JsonProperty("CorrespLocID") 
    private String correspLocID;
    
    @JsonProperty("VerifyOrderTransRefID") 
    private String verifyOrderTransRefID;
    
    @JsonProperty("OrderNo") 
    private String orderNo;
    
    @JsonProperty("BeneCurrency") 
    private String beneCurrency;
    
    @JsonProperty("PaidDateTimeLocal") 
    private String paidDateTimeLocal;
    
    @JsonProperty("PaidDateTimeUTC") 
    private String paidDateTimeUTC;
    
    @JsonProperty("BeneIDType") 
    private String beneIDType;
    
    @JsonProperty("BeneIDNumber") 
    private String beneIDNumber;
    
    @JsonProperty("BeneIDIssuedBy") 
    private String beneIDIssuedBy;
    
    @JsonProperty("BeneIDIssuedByCountry") 
    private String beneIDIssuedByCountry;
    
    @JsonProperty("BeneIDIssuedByState") 
    private String beneIDIssuedByState;
    
    @JsonProperty("BeneIDIssueDate") 
    private String beneIDIssueDate;
    
    @JsonProperty("BeneIDExpirationDate") 
    private String beneIDExpirationDate;
    
    @JsonProperty("CorrespLocCountry") 
    private String correspLocCountry;
    
    @JsonProperty("OrderPaidTransRefID") 
    private String orderPaidTransRefID;
    
    @JsonProperty("PCOrderNo") 
    private String pCOrderNo;
    
    @JsonProperty("SCOrderNo") 
    private String sCOrderNo;
    
    @JsonProperty("NotificationID") 
    private String notificationID;
    
    @JsonProperty("OrderStatus") 
    private String orderStatus;
    
    @JsonProperty("StatusDate") 
    private String statusDate;
    
    @JsonProperty("StatusTime") 
    private String statusTime;
    
    @JsonProperty("Reason") 
    private String reason;
    
    @JsonProperty("CorrespLocName") 
    private String correspLocName;
    
    @JsonProperty("CorrespLocAddress") 
    private String correspLocAddress;
    
    @JsonProperty("CorrespLocCity") 
    private String correspLocCity;
    
    @JsonProperty("CorrespLocState") 
    private String correspLocState;
    
    @JsonProperty("CorrespLocPostalCode") 
    private String correspLocPostalCode;

    @JsonProperty("BeneIDNo") 
    private String beneIDNo;
    
    @JsonProperty("PaidByCorrespID") 
    private String paidByCorrespID;




    
	/**
	 * @param dateTimeLocal
	 * @param dateTimeUTC
	 * @param pin
	 * @param beneAmount
	 * @param correspLocID
	 */
	public RequestGatewayWrapper(String dateTimeLocal, String dateTimeUTC, String pin, String beneAmount,
			String correspLocID) {
		super();
		this.dateTimeLocal = dateTimeLocal;
		this.dateTimeUTC = dateTimeUTC;
		this.pin = pin;
		this.beneAmount = beneAmount;
		this.correspLocID = correspLocID;
	}

	/**
	 * @param dateTimeLocal
	 * @param dateTimeUTC
	 * @param pin
	 * @param beneAmount
	 * @param orderNo
	 * @param beneCurrency
	 * @param orderPaidTransRefID
	 */
	public RequestGatewayWrapper(String dateTimeLocal, String dateTimeUTC, String pin, String beneAmount,
			String orderNo, String beneCurrency, String orderPaidTransRefID) {
		super();
		this.dateTimeLocal = dateTimeLocal;
		this.dateTimeUTC = dateTimeUTC;
		this.pin = pin;
		this.beneAmount = beneAmount;
		this.orderNo = orderNo;
		this.beneCurrency = beneCurrency;
		this.orderPaidTransRefID = orderPaidTransRefID;
	}

	/**
	 * @param dateTimeLocal
	 * @param dateTimeUTC
	 * @param pin
	 * @param beneAmount
	 * @param correspLocID
	 * @param verifyOrderTransRefID
	 * @param orderNo
	 * @param beneCurrency
	 * @param paidDateTimeLocal
	 * @param paidDateTimeUTC
	 * @param beneIDType
	 * @param beneIDNumber
	 * @param beneIDIssuedBy
	 * @param beneIDIssuedByCountry
	 * @param beneIDIssuedByState
	 * @param beneIDIssueDate
	 * @param beneIDExpirationDate
	 * @param correspLocCountry
	 */
	public RequestGatewayWrapper(String dateTimeLocal, String dateTimeUTC, String pin, String beneAmount,
			String correspLocID, String verifyOrderTransRefID, String orderNo, String beneCurrency,
			String paidDateTimeLocal, String paidDateTimeUTC, String beneIDType, String beneIDNumber,
			String beneIDIssuedBy, String beneIDIssuedByCountry, String beneIDIssuedByState, String beneIDIssueDate,
			String beneIDExpirationDate, String correspLocCountry) {
		super();
		this.dateTimeLocal = dateTimeLocal;
		this.dateTimeUTC = dateTimeUTC;
		this.pin = pin;
		this.beneAmount = beneAmount;
		this.correspLocID = correspLocID;
		this.verifyOrderTransRefID = verifyOrderTransRefID;
		this.orderNo = orderNo;
		this.beneCurrency = beneCurrency;
		this.paidDateTimeLocal = paidDateTimeLocal;
		this.paidDateTimeUTC = paidDateTimeUTC;
		this.beneIDType = beneIDType;
		this.beneIDNumber = beneIDNumber;
		this.beneIDIssuedBy = beneIDIssuedBy;
		this.beneIDIssuedByCountry = beneIDIssuedByCountry;
		this.beneIDIssuedByState = beneIDIssuedByState;
		this.beneIDIssueDate = beneIDIssueDate;
		this.beneIDExpirationDate = beneIDExpirationDate;
		this.correspLocCountry = correspLocCountry;
	}




	/**
	 * @return the orderPaidTransRefID
	 */
	public String getOrderPaidTransRefID() {
		return orderPaidTransRefID;
	}




	/**
	 * @param orderPaidTransRefID the orderPaidTransRefID to set
	 */
	public void setOrderPaidTransRefID(String orderPaidTransRefID) {
		this.orderPaidTransRefID = orderPaidTransRefID;
	}




	/**
	 * @return the dateTimeLocal
	 */
	public String getDateTimeLocal() {
		return dateTimeLocal;
	}

	/**
	 * @param dateTimeLocal the dateTimeLocal to set
	 */
	public void setDateTimeLocal(String dateTimeLocal) {
		this.dateTimeLocal = dateTimeLocal;
	}

	/**
	 * @return the dateTimeUTC
	 */
	public String getDateTimeUTC() {
		return dateTimeUTC;
	}

	/**
	 * @param dateTimeUTC the dateTimeUTC to set
	 */
	public void setDateTimeUTC(String dateTimeUTC) {
		this.dateTimeUTC = dateTimeUTC;
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
	 * @return the correspLocID
	 */
	public String getCorrespLocID() {
		return correspLocID;
	}

	/**
	 * @param correspLocID the correspLocID to set
	 */
	public void setCorrespLocID(String correspLocID) {
		this.correspLocID = correspLocID;
	}

	/**
	 * @return the verifyOrderTransRefID
	 */
	public String getVerifyOrderTransRefID() {
		return verifyOrderTransRefID;
	}

	/**
	 * @param verifyOrderTransRefID the verifyOrderTransRefID to set
	 */
	public void setVerifyOrderTransRefID(String verifyOrderTransRefID) {
		this.verifyOrderTransRefID = verifyOrderTransRefID;
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
	 * @return the paidDateTimeLocal
	 */
	public String getPaidDateTimeLocal() {
		return paidDateTimeLocal;
	}

	/**
	 * @param paidDateTimeLocal the paidDateTimeLocal to set
	 */
	public void setPaidDateTimeLocal(String paidDateTimeLocal) {
		this.paidDateTimeLocal = paidDateTimeLocal;
	}

	/**
	 * @return the paidDateTimeUTC
	 */
	public String getPaidDateTimeUTC() {
		return paidDateTimeUTC;
	}

	/**
	 * @param paidDateTimeUTC the paidDateTimeUTC to set
	 */
	public void setPaidDateTimeUTC(String paidDateTimeUTC) {
		this.paidDateTimeUTC = paidDateTimeUTC;
	}

	/**
	 * @return the beneIDType
	 */
	public String getBeneIDType() {
		return beneIDType;
	}

	/**
	 * @param beneIDType the beneIDType to set
	 */
	public void setBeneIDType(String beneIDType) {
		this.beneIDType = beneIDType;
	}

	/**
	 * @return the beneIDNumber
	 */
	public String getBeneIDNumber() {
		return beneIDNumber;
	}

	/**
	 * @param beneIDNumber the beneIDNumber to set
	 */
	public void setBeneIDNumber(String beneIDNumber) {
		this.beneIDNumber = beneIDNumber;
	}

	/**
	 * @return the beneIDIssuedBy
	 */
	public String getBeneIDIssuedBy() {
		return beneIDIssuedBy;
	}

	/**
	 * @param beneIDIssuedBy the beneIDIssuedBy to set
	 */
	public void setBeneIDIssuedBy(String beneIDIssuedBy) {
		this.beneIDIssuedBy = beneIDIssuedBy;
	}

	/**
	 * @return the beneIDIssuedByCountry
	 */
	public String getBeneIDIssuedByCountry() {
		return beneIDIssuedByCountry;
	}

	/**
	 * @param beneIDIssuedByCountry the beneIDIssuedByCountry to set
	 */
	public void setBeneIDIssuedByCountry(String beneIDIssuedByCountry) {
		this.beneIDIssuedByCountry = beneIDIssuedByCountry;
	}

	/**
	 * @return the beneIDIssuedByState
	 */
	public String getBeneIDIssuedByState() {
		return beneIDIssuedByState;
	}

	/**
	 * @param beneIDIssuedByState the beneIDIssuedByState to set
	 */
	public void setBeneIDIssuedByState(String beneIDIssuedByState) {
		this.beneIDIssuedByState = beneIDIssuedByState;
	}

	/**
	 * @return the beneIDIssueDate
	 */
	public String getBeneIDIssueDate() {
		return beneIDIssueDate;
	}

	/**
	 * @param beneIDIssueDate the beneIDIssueDate to set
	 */
	public void setBeneIDIssueDate(String beneIDIssueDate) {
		this.beneIDIssueDate = beneIDIssueDate;
	}

	/**
	 * @return the beneIDExpirationDate
	 */
	public String getBeneIDExpirationDate() {
		return beneIDExpirationDate;
	}

	/**
	 * @param beneIDExpirationDate the beneIDExpirationDate to set
	 */
	public void setBeneIDExpirationDate(String beneIDExpirationDate) {
		this.beneIDExpirationDate = beneIDExpirationDate;
	}

	/**
	 * @return the correspLocCountry
	 */
	public String getCorrespLocCountry() {
		return correspLocCountry;
	}

	/**
	 * @param correspLocCountry the correspLocCountry to set
	 */
	public void setCorrespLocCountry(String correspLocCountry) {
		this.correspLocCountry = correspLocCountry;
	}
	
	

	/**
	 * @return the pCOrderNo
	 */
	public String getpCOrderNo() {
		return pCOrderNo;
	}

	/**
	 * @param pCOrderNo the pCOrderNo to set
	 */
	public void setpCOrderNo(String pCOrderNo) {
		this.pCOrderNo = pCOrderNo;
	}

	/**
	 * @return the sCOrderNo
	 */
	public String getsCOrderNo() {
		return sCOrderNo;
	}

	/**
	 * @param sCOrderNo the sCOrderNo to set
	 */
	public void setsCOrderNo(String sCOrderNo) {
		this.sCOrderNo = sCOrderNo;
	}

	/**
	 * @return the notificationID
	 */
	public String getNotificationID() {
		return notificationID;
	}

	/**
	 * @param notificationID the notificationID to set
	 */
	public void setNotificationID(String notificationID) {
		this.notificationID = notificationID;
	}

	/**
	 * @return the orderStatus
	 */
	public String getOrderStatus() {
		return orderStatus;
	}

	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	/**
	 * @return the statusDate
	 */
	public String getStatusDate() {
		return statusDate;
	}

	/**
	 * @param statusDate the statusDate to set
	 */
	public void setStatusDate(String statusDate) {
		this.statusDate = statusDate;
	}

	/**
	 * @return the statusTime
	 */
	public String getStatusTime() {
		return statusTime;
	}

	/**
	 * @param statusTime the statusTime to set
	 */
	public void setStatusTime(String statusTime) {
		this.statusTime = statusTime;
	}

	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}

	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}

	/**
	 * @return the correspLocName
	 */
	public String getCorrespLocName() {
		return correspLocName;
	}

	/**
	 * @param correspLocName the correspLocName to set
	 */
	public void setCorrespLocName(String correspLocName) {
		this.correspLocName = correspLocName;
	}

	/**
	 * @return the correspLocAddress
	 */
	public String getCorrespLocAddress() {
		return correspLocAddress;
	}

	/**
	 * @param correspLocAddress the correspLocAddress to set
	 */
	public void setCorrespLocAddress(String correspLocAddress) {
		this.correspLocAddress = correspLocAddress;
	}

	/**
	 * @return the correspLocCity
	 */
	public String getCorrespLocCity() {
		return correspLocCity;
	}

	/**
	 * @param correspLocCity the correspLocCity to set
	 */
	public void setCorrespLocCity(String correspLocCity) {
		this.correspLocCity = correspLocCity;
	}

	/**
	 * @return the correspLocState
	 */
	public String getCorrespLocState() {
		return correspLocState;
	}

	/**
	 * @param correspLocState the correspLocState to set
	 */
	public void setCorrespLocState(String correspLocState) {
		this.correspLocState = correspLocState;
	}

	/**
	 * @return the correspLocPostalCode
	 */
	public String getCorrespLocPostalCode() {
		return correspLocPostalCode;
	}

	/**
	 * @param correspLocPostalCode the correspLocPostalCode to set
	 */
	public void setCorrespLocPostalCode(String correspLocPostalCode) {
		this.correspLocPostalCode = correspLocPostalCode;
	}

	/**
	 * @return the beneIDNo
	 */
	public String getBeneIDNo() {
		return beneIDNo;
	}

	/**
	 * @param beneIDNo the beneIDNo to set
	 */
	public void setBeneIDNo(String beneIDNo) {
		this.beneIDNo = beneIDNo;
	}

	/**
	 * @return the paidByCorrespID
	 */
	public String getPaidByCorrespID() {
		return paidByCorrespID;
	}

	/**
	 * @param paidByCorrespID the paidByCorrespID to set
	 */
	public void setPaidByCorrespID(String paidByCorrespID) {
		this.paidByCorrespID = paidByCorrespID;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RequestGatewayWrapper [dateTimeLocal=");
		builder.append(dateTimeLocal);
		builder.append(", dateTimeUTC=");
		builder.append(dateTimeUTC);
		builder.append(", pin=");
		builder.append(pin);
		builder.append(", beneAmount=");
		builder.append(beneAmount);
		builder.append(", correspLocID=");
		builder.append(correspLocID);
		builder.append(", verifyOrderTransRefID=");
		builder.append(verifyOrderTransRefID);
		builder.append(", orderNo=");
		builder.append(orderNo);
		builder.append(", beneCurrency=");
		builder.append(beneCurrency);
		builder.append(", paidDateTimeLocal=");
		builder.append(paidDateTimeLocal);
		builder.append(", paidDateTimeUTC=");
		builder.append(paidDateTimeUTC);
		builder.append(", beneIDType=");
		builder.append(beneIDType);
		builder.append(", beneIDNumber=");
		builder.append(beneIDNumber);
		builder.append(", beneIDIssuedBy=");
		builder.append(beneIDIssuedBy);
		builder.append(", beneIDIssuedByCountry=");
		builder.append(beneIDIssuedByCountry);
		builder.append(", beneIDIssuedByState=");
		builder.append(beneIDIssuedByState);
		builder.append(", beneIDIssueDate=");
		builder.append(beneIDIssueDate);
		builder.append(", beneIDExpirationDate=");
		builder.append(beneIDExpirationDate);
		builder.append(", correspLocCountry=");
		builder.append(correspLocCountry);
		builder.append(", orderPaidTransRefID=");
		builder.append(orderPaidTransRefID);
		builder.append(", pCOrderNo=");
		builder.append(pCOrderNo);
		builder.append(", sCOrderNo=");
		builder.append(sCOrderNo);
		builder.append(", notificationID=");
		builder.append(notificationID);
		builder.append(", orderStatus=");
		builder.append(orderStatus);
		builder.append(", statusDate=");
		builder.append(statusDate);
		builder.append(", statusTime=");
		builder.append(statusTime);
		builder.append(", reason=");
		builder.append(reason);
		builder.append(", correspLocName=");
		builder.append(correspLocName);
		builder.append(", correspLocAddress=");
		builder.append(correspLocAddress);
		builder.append(", correspLocCity=");
		builder.append(correspLocCity);
		builder.append(", correspLocState=");
		builder.append(correspLocState);
		builder.append(", correspLocPostalCode=");
		builder.append(correspLocPostalCode);
		builder.append(", beneIDNo=");
		builder.append(beneIDNo);
		builder.append(", paidByCorrespID=");
		builder.append(paidByCorrespID);
		builder.append("]");
		return builder.toString();
	}
}
