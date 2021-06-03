package com.kcbgroup.common.models.reversal;

import java.io.Serializable;

import com.kcbgroup.common.models.ErrorDetail;
import com.kcbgroup.common.models.RequestHeader;

/**
 * General Request Wrapper
 *
 * @author Stephen Okoth | KCB
 * @version 1.0.0
 */
public class RequestWrapper implements Serializable {
	/** Serial version UID */
	private static final long serialVersionUID = 6464903968440189419L;

	private RequestHeader header;
	private ReversalRequestPayload requestPayload;
	private ErrorDetail errorDetail;

	public RequestWrapper() {
	}

	public RequestHeader getHeader() {
		return header;
	}

	public void setHeader(RequestHeader header) {
		this.header = header;
	}

	public ReversalRequestPayload getRequestPayload() {
		return requestPayload;
	}

	public void setRequestPayload(ReversalRequestPayload requestPayload) {
		this.requestPayload = requestPayload;
	}

	public ErrorDetail getErrorDetail() {
		return errorDetail;
	}

	public void setErrorDetail(ErrorDetail errorDetail) {
		this.errorDetail = errorDetail;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RequestWrapper [header=");
		builder.append(header);
		builder.append(", requestPayload=");
		builder.append(requestPayload);
		builder.append(", errorDetail=");
		builder.append(errorDetail);
		builder.append("]");
		return builder.toString();
	}
}
