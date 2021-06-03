package com.kcbgroup.common.models.vault;

import java.io.Serializable;
import java.util.Map;

/**
 * Response Payload Model Class
 * 
 * @author Francisco Osorio | Bring Global
 * @version 0.0.1
 */
public class ResponsePayload implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = -9010517583049025388L;

	/** Response Status */
	private Status status;

	/** List the users Map */
	private Map<String, String> user;

	public ResponsePayload() {
	}

	/**
	 * @param status
	 * @param users
	 */
	public ResponsePayload(Status status) {
		super();
		this.status = status;
	}

	/**
	 * @param status
	 * @param users
	 */
	public ResponsePayload(Status status, Map<String, String> user) {
		super();
		this.status = status;
		this.user = user;
	}

	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}



	/**
	 * @return the user
	 */
	public Map<String, String> getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(Map<String, String> user) {
		this.user = user;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Payload [status=");
		builder.append(status);
		builder.append("]");
		return builder.toString();
	}
}
