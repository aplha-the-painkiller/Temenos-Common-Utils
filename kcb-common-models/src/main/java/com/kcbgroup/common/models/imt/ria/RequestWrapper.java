/**
 * 
 */
package com.kcbgroup.common.models.imt.ria;

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
	private static final long serialVersionUID = 6464903968440189419L;
	
    private RequestHeader header;
    private RiaRequestPayload requestPayload;

	public RequestWrapper() {
	}

	public RequestHeader getHeader() {
		return header;
	}

	public void setHeader(RequestHeader header) {
		this.header = header;
	}

	public RiaRequestPayload getRequestPayload() {
		return requestPayload;
	}

	public void setRequestPayload(RiaRequestPayload requestPayload) {
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
