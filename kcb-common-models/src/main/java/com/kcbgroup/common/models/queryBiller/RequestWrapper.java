/**
 * 
 */
package com.kcbgroup.common.models.queryBiller;

import java.io.Serializable;

/**
 * General Request Wrapper
 * @author Gideon Mulandi | KCB
 * @version 1.0.0
 */
public class RequestWrapper implements Serializable {
	/** Serial version UID */
	private static final long serialVersionUID = 6464903968440189419L;
	
    private RequestHeader header;
    private QueryBillerRequestPayload requestPayload;

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
	public QueryBillerRequestPayload getRequestPayload() {
		return requestPayload;
	}
	/**
	 * @param requestPayload the requestPayload to set
	 */
	public void setRequestPayload(QueryBillerRequestPayload requestPayload) {
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
