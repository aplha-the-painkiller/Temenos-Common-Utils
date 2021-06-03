package com.kcbgroup.common.models.redis;

import java.io.Serializable;

public class Data implements Serializable {

	private static final long serialVersionUID = -1721741031922219030L;

	private String id;
	private String name;
	private String additionalInfo;	
	private String url;
	private String statusCode;
	private String statusDescription;

	public Data() {
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusDescription() {
		return statusDescription;
	}

	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Data [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", additionalInfo=");
		builder.append(additionalInfo);
		builder.append(", url=");
		builder.append(url);		
		builder.append(", statusCode=");
		builder.append(statusCode);
		builder.append(", statusDescription=");
		builder.append(statusDescription);
		builder.append("]");
		return builder.toString();
	}
}
	