/**
 * 
 */
package com.kcbgroup.common.models.fundstransfer;

import java.io.Serializable;

import com.kcbgroup.common.models.ErrorDetail;
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
    private FundsTransferRequestPayload requestPayload;
    private ErrorDetail errorDetail;

	public RequestWrapper() {
	}

	public RequestHeader getHeader() {
		return header;
	}

	public void setHeader(RequestHeader header) {
		this.header = header;
	}

	public FundsTransferRequestPayload getRequestPayload() {
		return requestPayload;
	}

	public void setRequestPayload(FundsTransferRequestPayload requestPayload) {
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
