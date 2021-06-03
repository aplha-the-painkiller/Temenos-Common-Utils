package com.kcbgroup.common.models.iprsresidentinfo;

import java.io.Serializable;

import com.kcbgroup.common.models.ResponseHeader;

/**
 *
 * @author jgnjeru
 */
public class ResponseWrapper implements Serializable {
	/** Serial version UID */
	private static final long serialVersionUID = 3947641363206949943L;

	private ResponseHeader header;
	private ResidentInfoResponsePayload responsePayload;

	public ResponseWrapper() {
	}

	public ResponseHeader getHeader() {
		return header;
	}

	public void setHeader(ResponseHeader header) {
		this.header = header;
	}

	public ResidentInfoResponsePayload getResponsePayload() {
		return responsePayload;
	}

	public void setResponsePayload(ResidentInfoResponsePayload responsePayload) {
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

//    public void setResponsePayload(ResidentInfoResponsePayload responsePayload) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    public void setResponsePayload(ResidentInfoResponsePayload responsePayload) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}
