/**
 * 
 */
package com.kcbgroup.common.models.businesstransfer;

import java.io.Serializable;

import com.kcbgroup.common.models.ResponseHeader;


/**
 * kcb-common-models
 * Sep 18, 2020
 * ResponseWrapper.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class ResponseWrapper implements Serializable {
	/** Serial version UID */
	private static final long serialVersionUID = 3547641363206949943L;
	
	private ResponseHeader header;
    private BusinessTransferResponsePayload responsePayload;

	public ResponseWrapper() {
	}

	/**
	 * @return the header
	 */
	public ResponseHeader getHeader() {
		return header;
	}

	/**
	 * @param header the header to set
	 */
	public void setHeader(ResponseHeader header) {
		this.header = header;
	}

	/**
	 * @return the responsePayload
	 */
	public BusinessTransferResponsePayload getResponsePayload() {
		return responsePayload;
	}

	/**
	 * @param responsePayload the responsePayload to set
	 */
	public void setResponsePayload(BusinessTransferResponsePayload responsePayload) {
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
