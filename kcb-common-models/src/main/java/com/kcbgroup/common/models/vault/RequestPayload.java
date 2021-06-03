/**
 * kcb-connector-vault
 * Sep 4, 2020
 * VaultValidate.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
package com.kcbgroup.common.models.vault;

import java.io.Serializable;

/**
 * kcb-connector-vault
 * Sep 4, 2020
 * VaultCredentials.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class RequestPayload implements Serializable {
	
	/** Serial version */
	private static final long serialVersionUID = 7819616922864313611L;

	/** Route Code */
	String routeCode;
	
	/** Route Code */
	String channelCode;

	/** Environment ID (Backend Parameter) */
	String environment;
	
	/** Service Code */
	String serviceCode;

	public String getRouteCode() {
		return routeCode;
	}

	public void setRouteCode(String routeCode) {
		this.routeCode = routeCode;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RequestPayload [routeCode=");
		builder.append(routeCode);
		builder.append(", channelCode=");
		builder.append(channelCode);
		builder.append(", environment=");
		builder.append(environment);
		builder.append(", serviceCode=");
		builder.append(serviceCode);
		builder.append("]");
		return builder.toString();
	}
}
