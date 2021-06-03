/**
 * 
 */
package com.kcbgroup.common.models.queryBiller;

import java.io.Serializable;

/**
 * @author Gideon Mulandi | KCB
 * @version 1.0.0
 */
public class ResponseWrapper implements Serializable {
	/** Serial version UID */
	private static final long serialVersionUID = 3547641363206949943L;
	
	private ResponseHeader header;
    private QueryBillerResponsePayload responsePayload;

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
	public QueryBillerResponsePayload getResponsePayload() {
		return responsePayload;
	}

	/**
	 * @param responsePayload the responsePayload to set
	 */
	public void setResponsePayload(QueryBillerResponsePayload responsePayload) {
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
