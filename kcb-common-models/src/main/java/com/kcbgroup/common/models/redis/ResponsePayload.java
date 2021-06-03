package com.kcbgroup.common.models.redis;

import java.io.Serializable;

/**
 * Redis Response Payload Model
 * 
 * @author Stephen Okoth | KCB
 * @version 1.0.0
 */
public class ResponsePayload implements Serializable {
	
	private static final long serialVersionUID = 5172061720514332218L;
	
	private RegisteredData registeredData;

	public ResponsePayload() {
	}

	public RegisteredData getRegisteredData() {
		return registeredData;
	}

	public void setRegisteredData(RegisteredData registeredData) {
		this.registeredData = registeredData;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResponsePayload [registeredBillers=");
		builder.append(registeredData);
		builder.append("]");
		return builder.toString();
	}
}
