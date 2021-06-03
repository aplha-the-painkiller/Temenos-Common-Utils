/**
 * gateway-query-biller
 * Nov 9, 2020
 * RequestHeader.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
package com.kcbgroup.common.models.queryBiller;

import java.io.Serializable;

/**
 * gateway-query-biller
 * Nov 9, 2020
 * RequestHeader.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class RequestHeader extends com.kcbgroup.common.models.RequestHeader implements Serializable{


	private static final long serialVersionUID = -7171755558112532107L;
	
	protected String originatorConversationID;

	/**
	 * @return the originatorConversationID
	 */
	public String getOriginatorConversationID() {
		return originatorConversationID;
	}

	/**
	 * @param originatorConversationID the originatorConversationID to set
	 */
	public void setOriginatorConversationID(String originatorConversationID) {
		this.originatorConversationID = originatorConversationID;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RequestHeader [originatorConversationID=");
		builder.append(originatorConversationID);
		builder.append(", messageID=");
		builder.append(messageID);
		builder.append(", conversationID=");
		builder.append(conversationID);
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
