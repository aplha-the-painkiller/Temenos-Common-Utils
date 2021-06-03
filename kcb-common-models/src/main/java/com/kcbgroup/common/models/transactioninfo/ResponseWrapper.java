/**
 *
 */
package com.kcbgroup.common.models.transactioninfo;

import java.io.Serializable;

import com.kcbgroup.common.models.ResponseHeader;


public class ResponseWrapper implements Serializable {
	/** Serial version UID */
	private static final long serialVersionUID = 3947641363206949943L;

	private ResponseHeader header;
	private TransactionInfoResponsePayload responsePayload;

	public ResponseWrapper() {
	}

	public ResponseHeader getHeader() {
		return header;
	}

	public void setHeader(ResponseHeader header) {
		this.header = header;
	}

	public TransactionInfoResponsePayload getResponsePayload() {
		return responsePayload;
	}

	public void setResponsePayload(TransactionInfoResponsePayload responsePayload) {
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
