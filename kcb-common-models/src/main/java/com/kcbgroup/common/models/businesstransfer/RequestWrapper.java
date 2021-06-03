/**
 * 
 */
package com.kcbgroup.common.models.businesstransfer;

import java.io.Serializable;

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
    private BusinessTransferRequestPayload requestPayload;

	public RequestWrapper() {
	}

	/**
	 * @return the header
	 */
	public RequestHeader getHeader() {
		return header;
	}

	/**
	 * @param header the header to set
	 */
	public void setHeader(RequestHeader header) {
		this.header = header;
	}

	/**
	 * @return the requestPayload
	 */
	public BusinessTransferRequestPayload getRequestPayload() {
		return requestPayload;
	}

	/**
	 * @param requestPayload the requestPayload to set
	 */
	public void setRequestPayload(BusinessTransferRequestPayload requestPayload) {
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
