package com.kcbgroup.common.models.notifybiller;

import java.io.Serializable;


/**
 * General Response Wrapper
 *
 * @author Stephen Okoth | KCB
 * @version 1.0.0
 */
public class ResponseWrapper implements Serializable {
	/**
	 * 
	 */
	/** Serial version UID */
	private static final long serialVersionUID = -7290644528129424460L;
	
	private ResponseHeader header;
    private NotificationBillerResponsePayload responsePayload;

	public ResponseWrapper() {
	}

	public ResponseHeader getHeader() {
		return header;
	}

	public void setHeader(ResponseHeader header) {
		this.header = header;
	}

	public NotificationBillerResponsePayload getResponsePayload() {
		return responsePayload;
	}

	public void setResponsePayload(NotificationBillerResponsePayload responsePayload) {
		this.responsePayload = responsePayload;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResponseWrapper [header=");
		builder.append(header);
		builder.append(", responsePayload=");
		builder.append(responsePayload);
		builder.append("]");
		return builder.toString();
	}
}
