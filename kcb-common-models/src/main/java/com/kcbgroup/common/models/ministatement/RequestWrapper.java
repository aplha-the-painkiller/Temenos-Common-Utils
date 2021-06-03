/**
 * 
 */
package com.kcbgroup.common.models.ministatement;

import java.io.Serializable;

import com.kcbgroup.common.models.RequestHeader;

/**
 * General Request Wrapper
 *
 * @author Francisco Osorio | Bring Global
 * @version 1.0.0
 */
public class RequestWrapper implements Serializable {
	/** Serial version UID */
	private static final long serialVersionUID = 8864903968440189419L;
	
    private RequestHeader header;
    private MiniStatementRequestPayload requestPayload;

	public RequestWrapper() {
	}

	public RequestHeader getHeader() {
		return header;
	}

	public void setHeader(RequestHeader header) {
		this.header = header;
	}

	public MiniStatementRequestPayload getRequestPayload() {
		return requestPayload;
	}

	public void setRequestPayload(MiniStatementRequestPayload requestPayload) {
		this.requestPayload = requestPayload;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RequestWrapper [header=");
		builder.append(header);
		builder.append(", requestPayload=");
		builder.append(requestPayload);
		builder.append("]");
		return builder.toString();
	}
}
