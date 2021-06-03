package com.kcbgroup.common.models.errorhandler;

import java.io.Serializable;

import org.springframework.stereotype.Component;

/**
 * General Policy Model
 * @author fosorio | Bring Global
 * @version 0.0.1
 */
@Component
public class RedeliveryConfiguration implements Serializable {
	/** Serial version UID */
	private static final long serialVersionUID = 7665310449049336515L;
	
	/** The key that is used to fetch the service information */ 
    private String key;
    
    /** Indicates, name of the feature that the service falls under */ 
    private String featureName;
    
    /** Indicates, name of the service */
    private String serviceName;
	
	/** Indicates, how many times the retry should occur */
    private Short maxRetryCount;
	
    /** Indicates the time delay between each retry */
    private Short exponentialFactor;
	
	/** Indicates the business owner of the service */
    private String businessOwner;
	
	/** Indicates the email group where notification will be sent, when there is a service outage */
    private String emailGroup;
	
	/** Indicates the notification number, where notification can be sent */
    private String notificationMSISDN;
	
	/** Indicates, any additional information about the service */
    private String additionalInfo;
    
    public RedeliveryConfiguration() {
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
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

	public String getBusinessOwner() {
		return businessOwner;
	}

	public void setBusinessOwner(String businessOwner) {
		this.businessOwner = businessOwner;
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

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RedeliveryConfiguration [key=");
		builder.append(key);
		builder.append(", featureName=");
		builder.append(featureName);
		builder.append(", serviceName=");
		builder.append(serviceName);
		builder.append(", maxRetryCount=");
		builder.append(maxRetryCount);
		builder.append(", exponentialFactor=");
		builder.append(exponentialFactor);
		builder.append(", businessOwner=");
		builder.append(businessOwner);
		builder.append(", emailGroup=");
		builder.append(emailGroup);
		builder.append(", notificationMSISDN=");
		builder.append(notificationMSISDN);
		builder.append(", additionalInfo=");
		builder.append(additionalInfo);
		builder.append("]");
		return builder.toString();
	}
}
