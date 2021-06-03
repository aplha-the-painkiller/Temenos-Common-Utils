package com.kcbgroup.common.models.businesstransfer;

import java.io.Serializable;

/**
 * General Request Header Model (to Extend if Needed)
 * 
 * @author Andrés Vázquez | Bring Global
 * @version 0.0.1
 */
public class ResponseCallBackHeader implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = 7656371320496443722L;

	// All this information comes from channel as part of the full payload 
    protected String originatorMessageID;
    protected String conversationID;
	protected String targetSystemID;
    protected String statusCode;
    protected String messageCode;
    protected String statusDescription;
    protected String statusMessage;
    

    public ResponseCallBackHeader() {
	}


	/**
	 * @return the originatorMessageID
	 */
	public String getOriginatorMessageID() {
		return originatorMessageID;
	}


	/**
	 * @param originatorMessageID the originatorMessageID to set
	 */
	public void setOriginatorMessageID(String originatorMessageID) {
		this.originatorMessageID = originatorMessageID;
	}


	/**
	 * @return the conversationID
	 */
	public String getConversationID() {
		return conversationID;
	}


	/**
	 * @param conversationID the conversationID to set
	 */
	public void setConversationID(String conversationID) {
		this.conversationID = conversationID;
	}


	/**
	 * @return the targetSystemID
	 */
	public String getTargetSystemID() {
		return targetSystemID;
	}


	/**
	 * @param targetSystemID the targetSystemID to set
	 */
	public void setTargetSystemID(String targetSystemID) {
		this.targetSystemID = targetSystemID;
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
	 * @return the messageCode
	 */
	public String getMessageCode() {
		return messageCode;
	}


	/**
	 * @param messageCode the messageCode to set
	 */
	public void setMessageCode(String messageCode) {
		this.messageCode = messageCode;
	}


	/**
	 * @return the statusDescription
	 */
	public String getStatusDescription() {
		return statusDescription;
	}


	/**
	 * @param statusDescription the statusDescription to set
	 */
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}


	/**
	 * @return the statusMessage
	 */
	public String getStatusMessage() {
		return statusMessage;
	}


	/**
	 * @param statusMessage the statusMessage to set
	 */
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResponseCallBackHeader [originatorMessageID=");
		builder.append(originatorMessageID);
		builder.append(", conversationID=");
		builder.append(conversationID);
		builder.append(", targetSystemID=");
		builder.append(targetSystemID);
		builder.append(", statusCode=");
		builder.append(statusCode);
		builder.append(", messageCode=");
		builder.append(messageCode);
		builder.append(", statusDescription=");
		builder.append(statusDescription);
		builder.append(", statusMessage=");
		builder.append(statusMessage);
		builder.append("]");
		return builder.toString();
	}
	

}
