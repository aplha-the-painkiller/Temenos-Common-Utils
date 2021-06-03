package com.kcbgroup.common.models;

import java.io.Serializable;

/**
 * General Request Header Model (to Extend if Needed)
 * 
 * @author Francisco Osorio | Bring Global
 * @version 0.0.1
 */
public class RequestHeader implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = 7656371320496443722L;
 
	// All this information comes from channel as part of the full payload 
    protected String messageID;
    protected String conversationID;
	protected String featureCode;
    protected String featureName;
    protected String serviceCode;
    protected String serviceName;
    protected String serviceSubCategory;
    protected String minorServiceVersion;
    protected String channelCode;
    protected String channelName;
    protected String routeCode;
    protected String timeStamp;
    protected String serviceMode;
    protected String subscribeEvents;
    protected String callBackURL;
   
    public RequestHeader() {
	}
	
	/**
	 * @return the messageID
	 */
	public String getMessageID() {
		return messageID;
	}

	/**
	 * @param messageID the messageID to set
	 */
	public void setMessageID(String messageID) {
		this.messageID = messageID;
	}

	public String getConversationID() {
		return conversationID;
	}

	public void setConversationID(String conversationID) {
		this.conversationID = conversationID;
	}
	
	/**
	 * @return the featureCode
	 */
	public String getFeatureCode() {
		return featureCode;
	}

	/**
	 * @param featureCode the featureCode to set
	 */
	public void setFeatureCode(String featureCode) {
		this.featureCode = featureCode;
	}

	/**
	 * @return the featureName
	 */
	public String getFeatureName() {
		return featureName;
	}

	/**
	 * @param featureName the featureName to set
	 */
	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	/**
	 * @return the serviceCode
	 */
	public String getServiceCode() {
		return serviceCode;
	}

	/**
	 * @param serviceCode the serviceCode to set
	 */
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	/**
	 * @return the serviceName
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * @param serviceName the serviceName to set
	 */
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	/**
	 * @return the serviceSubCategory
	 */
	public String getServiceSubCategory() {
		return serviceSubCategory;
	}

	/**
	 * @param serviceSubCategory the serviceSubCategory to set
	 */
	public void setServiceSubCategory(String serviceSubCategory) {
		this.serviceSubCategory = serviceSubCategory;
	}

	/**
	 * @return the minorServiceVersion
	 */
	public String getMinorServiceVersion() {
		return minorServiceVersion;
	}

	/**
	 * @param minorServiceVersion the minorServiceVersion to set
	 */
	public void setMinorServiceVersion(String minorServiceVersion) {
		this.minorServiceVersion = minorServiceVersion;
	}

	/**
	 * @return the channelCode
	 */
	public String getChannelCode() {
		return channelCode;
	}

	/**
	 * @param channelCode the channelCode to set
	 */
	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	/**
	 * @return the channelName
	 */
	public String getChannelName() {
		return channelName;
	}

	/**
	 * @param channelName the channelName to set
	 */
	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	/**
	 * @return the routeCode
	 */
	public String getRouteCode() {
		return routeCode;
	}

	/**
	 * @param routeCode the routeCode to set
	 */
	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}

	/**
	 * @return the timeStamp
	 */
	public String getTimeStamp() {
		return timeStamp;
	}

	/**
	 * @param timeStamp the timeStamp to set
	 */
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}

	/**
	 * @return the serviceMode
	 */
	public String getServiceMode() {
		return serviceMode;
	}

	/**
	 * @param serviceMode the serviceMode to set
	 */
	public void setServiceMode(String serviceMode) {
		this.serviceMode = serviceMode;
	}

	/**
	 * @return the subscribeEvents
	 */
	public String getSubscribeEvents() {
		return subscribeEvents;
	}

	/**
	 * @param subscribeEvents the subscribeEvents to set
	 */
	public void setSubscribeEvents(String subscribeEvents) {
		this.subscribeEvents = subscribeEvents;
	}

	/**
	 * @return the callBackURL
	 */
	public String getCallBackURL() {
		return callBackURL;
	}

	/**
	 * @param callBackURL the callBackURL to set
	 */
	public void setCallBackURL(String callBackURL) {
		this.callBackURL = callBackURL;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RequestHeader [messageID=");
		builder.append(messageID);
		builder.append(", featureCode=");
		builder.append(featureCode);
		builder.append(", featureName=");
		builder.append(featureName);
		builder.append(", serviceCode=");
		builder.append(serviceCode);
		builder.append(", serviceName=");
		builder.append(serviceName);
		builder.append(", serviceSubCategory=");
		builder.append(serviceSubCategory);
		builder.append(", minorServiceVersion=");
		builder.append(minorServiceVersion);
		builder.append(", channelCode=");
		builder.append(channelCode);
		builder.append(", channelName=");
		builder.append(channelName);
		builder.append(", routeCode=");
		builder.append(routeCode);
		builder.append(", timeStamp=");
		builder.append(timeStamp);
		builder.append(", serviceMode=");
		builder.append(serviceMode);
		builder.append(", subscribeEvents=");
		builder.append(subscribeEvents);
		builder.append(", callBackURL=");
		builder.append(callBackURL);
		builder.append("]");
		return builder.toString();
	}
}
