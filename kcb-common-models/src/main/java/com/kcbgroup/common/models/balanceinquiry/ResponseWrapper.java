/**
 * 
 */
package com.kcbgroup.common.models.balanceinquiry;

import java.io.Serializable;

import com.kcbgroup.common.models.ResponseHeader;

/**
 * General Request Wrapper
 *
 * @author Francisco Osorio | Bring Global
 * @version 1.0.0
 */
public class ResponseWrapper implements Serializable {
	/** Serial version UID */
	private static final long serialVersionUID = 3547641363206949943L;
	
	private ResponseHeader header;
    private BalanceInquiryResponsePayload responsePayload;

	public ResponseWrapper() {
	}

	public ResponseHeader getHeader() {
		return header;
	}

	public void setHeader(ResponseHeader header) {
		this.header = header;
	}

	public BalanceInquiryResponsePayload getResponsePayload() {
		return responsePayload;
	}

	public void setResponsePayload(BalanceInquiryResponsePayload responsePayload) {
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
