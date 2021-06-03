package com.kcbgroup.common.models.businesstransfer;

import java.io.Serializable;

/**
 * kcb-common-models
 * Nov 4, 2020
 * CallBack.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class CallBack  implements Serializable {

	/** Serial version UID */
	private static final long serialVersionUID = 2982766528295910639L;

	private ResponseCallBackHeader header;
    private CallBackResult callBackResult;
	/**
	 * @return the header
	 */
	public ResponseCallBackHeader getHeader() {
		return header;
	}
	/**
	 * @param header the header to set
	 */
	public void setHeader(ResponseCallBackHeader header) {
		this.header = header;
	}
	/**
	 * @return the callBackResult
	 */
	public CallBackResult getCallBackResult() {
		return callBackResult;
	}
	/**
	 * @param callBackResult the callBackResult to set
	 */
	public void setCallBackResult(CallBackResult callBackResult) {
		this.callBackResult = callBackResult;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CallBack [header=");
		builder.append(header);
		builder.append(", callBackResult=");
		builder.append(callBackResult);
		builder.append("]");
		return builder.toString();
	}
    
    
}
