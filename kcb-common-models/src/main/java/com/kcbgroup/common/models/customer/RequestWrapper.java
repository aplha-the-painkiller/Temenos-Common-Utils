/**
 * 
 */
package com.kcbgroup.common.models.customer;

import java.io.Serializable;

import com.kcbgroup.common.models.RequestHeader;

/**
 * kcb-common-models
 * Sep 18, 2020
 * RequestWrapper.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class RequestWrapper implements Serializable {
	/** Serial version UID */
	private static final long serialVersionUID = 6464903968440189419L;
	
    private RequestHeader header;
    private CustomerRequestPayload requestPayload;

	public RequestWrapper() {
	}

	public RequestHeader getHeader() {
		return header;
	}

	public void setHeader(RequestHeader header) {
		this.header = header;
	}

	public CustomerRequestPayload getRequestPayload() {
		return requestPayload;
	}

	public void setRequestPayload(CustomerRequestPayload requestPayload) {
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
