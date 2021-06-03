package com.kcbgroup.common.models.redis;

import java.io.Serializable;

public class RegisteredData implements Serializable {
		
	private static final long serialVersionUID = 6943465414783198947L;
	
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
		builder.append("RegisteredData [keyType=");
		builder.append(keyType);
		builder.append(", urlType=");
		builder.append(urlType);				
		builder.append("]");
		return builder.toString();
	}
	
}
