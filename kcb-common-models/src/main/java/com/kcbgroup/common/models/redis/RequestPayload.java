package com.kcbgroup.common.models.redis;

import java.io.Serializable;

/**
 * Redis Request Payload Model
 * 
 * @author Stephen Okoth | KCB
 * @version 1.0.0
 */
public class RequestPayload implements Serializable {
	
	private static final long serialVersionUID = -4287737649587858501L;
	
	private KeyType keyType;
	private UrlType urlType; 
	
	public KeyType getKeyType() {
		return keyType;
	}
	
	public void setKeyType(KeyType keyType) {
		this.keyType = keyType;
	}
	
	public UrlType getUrlType() {
		return urlType;
	}

	public void setUrlType(UrlType urlType) {
		this.urlType = urlType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RequestPayload [keyType=");
		builder.append(keyType);
		builder.append(", urlType=");
		builder.append(urlType);				
		builder.append("]");
		return builder.toString();
	}

}
