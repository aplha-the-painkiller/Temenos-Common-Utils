/**
 * 
 */
package com.kcbgroup.common.models.transactioninfo;

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
	
    @Override
	public String toString() {
		return "RequestWrapper [header=" + header + ", requestPayload=" + requestPayload + "]";
	}

	private RequestHeader header;
  
	private TransactionInfoRequestPayload requestPayload;

	public RequestWrapper() {
            
	}

	public RequestHeader getHeader() {
		return header;
	}

	public void setHeader(RequestHeader header) {
		this.header = header;
	}

	public TransactionInfoRequestPayload getRequestPayload() {
		return requestPayload;
	}

	public void setRequestPayload(TransactionInfoRequestPayload requestPayload) {
		this.requestPayload = requestPayload;
	}


}
