package com.kcbgroup.common.models.queryBiller;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * General Response Header Model (to Extend if Needed)
 * 
 * @author fosorio | Bring Global
 * @version 1.0.0
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseHeader extends com.kcbgroup.common.models.ResponseHeader implements Serializable{
    
    /** Serial version UID */
    private static final long serialVersionUID = -7857624541088572239L;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    protected String channelCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    protected String timeStamp;

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResponseHeader [channelCode=");
		builder.append(channelCode);
		builder.append(", timeStamp=");
		builder.append(timeStamp);
		builder.append(", messageID=");
		builder.append(messageID);
		builder.append(", conversationID=");
		builder.append(conversationID);
		builder.append(", routeCode=");
		builder.append(routeCode);
		builder.append(", targetSystemID=");
		builder.append(targetSystemID);
		builder.append(", statusCode=");
		builder.append(statusCode);
		builder.append(", statusDescription=");
		builder.append(statusDescription);
		builder.append(", statusMessage=");
		builder.append(statusMessage);
		builder.append(", callBackURL=");
		builder.append(callBackURL);
		builder.append(", messageCode=");
		builder.append(messageCode);
		builder.append(", errorDetails=");
		builder.append(errorDetails);
		builder.append("]");
		return builder.toString();
	}
}
