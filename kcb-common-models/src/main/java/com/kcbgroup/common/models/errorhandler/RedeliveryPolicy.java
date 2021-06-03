package com.kcbgroup.common.models.errorhandler;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * General Policy Model
 * @author fosorio | Bring Global
 * @version 0.0.1
 */
@Component
public class RedeliveryPolicy implements Serializable {
	/** Serial version UID */
	private static final long serialVersionUID = 7665310449049336515L;
	
	/** Channel Message ID */ 
    private String messageID;
    
    /** Adapter's  Conversation ID */ 
    private String conversationID;
    
    /** Oririnal Request Queue/Topic (to send it back on retries) */
    private String serviceRequestQueueName;
	
	/** Oririnal Response Queue/Topic (to send after exhausted retries) */
    private String serviceResponseQueueName;
	
    /** Flag that Indicates If We Already Get Proper Redelivery Policy*/
    private Boolean redisLookupFlag;
	
	/** Number of Retries for this Message */
    private Short retryCount;
	
	/** Maximum Number of Retries for this Message */
    private Short maxRetryCount;
	
	/** Indicates the delay between retries */
    private Short exponentialFactor;
	
	/** The Provider Error Code from Atomic */
    private String atomicResponseCode;
	
	/** The eMail Group Address Where Notification Will be Sent (in Case of Service Outage)*/
    private String emailGroup;
	
	/** Indicates the Notification Number where Notification Can Be Sent */
    private String notificationMSISDN;

	public RedeliveryPolicy() {
	}

	public String getMessageID() {
		return messageID;
	}

	public void setMessageID(String messageID) {
		this.messageID = messageID;
	}

	public String getConversationID() {
		return conversationID;
	}

	public void setConversationID(String conversationID) {
		this.conversationID = conversationID;
	}

	public String getServiceRequestQueueName() {
		return serviceRequestQueueName;
	}

	public void setServiceRequestQueueName(String serviceRequestQueueName) {
		this.serviceRequestQueueName = serviceRequestQueueName;
	}

	public String getServiceResponseQueueName() {
		return serviceResponseQueueName;
	}

	public void setServiceResponseQueueName(String serviceResponseQueueName) {
		this.serviceResponseQueueName = serviceResponseQueueName;
	}

	public Boolean getRedisLookupFlag() {
		return redisLookupFlag;
	}

	public void setRedisLookupFlag(Boolean redisLookupFlag) {
		this.redisLookupFlag = redisLookupFlag;
	}

	public Short getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(Short retryCount) {
		this.retryCount = retryCount;
	}

	public Short getMaxRetryCount() {
		return maxRetryCount;
	}

	public void setMaxRetryCount(Short maxRetryCount) {
		this.maxRetryCount = maxRetryCount;
	}

	public Short getExponentialFactor() {
		return exponentialFactor;
	}

	public void setExponentialFactor(Short exponentialFactor) {
		this.exponentialFactor = exponentialFactor;
	}

	public String getAtomicResponseCode() {
		return atomicResponseCode;
	}

	public void setAtomicResponseCode(String atomicResponseCode) {
		this.atomicResponseCode = atomicResponseCode;
	}

	public String getEmailGroup() {
		return emailGroup;
	}

	public void setEmailGroup(String emailGroup) {
		this.emailGroup = emailGroup;
	}

	public String getNotificationMSISDN() {
		return notificationMSISDN;
	}

	public void setNotificationMSISDN(String notificationMSISDN) {
		this.notificationMSISDN = notificationMSISDN;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RedeliveryPolicyModel [messageID=");
		builder.append(messageID);
		builder.append(", conversationID=");
		builder.append(conversationID);
		builder.append(", serviceRequestQueueName=");
		builder.append(serviceRequestQueueName);
		builder.append(", serviceResponseQueueName=");
		builder.append(serviceResponseQueueName);
		builder.append(", redisLookupFlag=");
		builder.append(redisLookupFlag);
		builder.append(", retryCount=");
		builder.append(retryCount);
		builder.append(", maxRetryCount=");
		builder.append(maxRetryCount);
		builder.append(", exponentialFactor=");
		builder.append(exponentialFactor);
		builder.append(", atomicResponseCode=");
		builder.append(atomicResponseCode);
		builder.append(", emailGroup=");
		builder.append(emailGroup);
		builder.append(", notificationMSISDN=");
		builder.append(notificationMSISDN);
		builder.append("]");
		return builder.toString();
	}
}
