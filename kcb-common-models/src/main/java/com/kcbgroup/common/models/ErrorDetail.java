package com.kcbgroup.common.models;

import java.io.Serializable;
import java.util.List;

/**
 * Error Detail Model (for Error Handling Framework)
 * @author Francisco Osorio | Bring Global
 * @version 1.0.0
 */
public class ErrorDetail implements Serializable {
	/** Serial version UID */
	private static final long serialVersionUID = -8647643428147121819L;
	
	private String errorCode;
	private List<String> items;
	private String errorMessage;
	
	public ErrorDetail() {
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public List<String> getItems() {
		return items;
	}

	public void setItems(List<String> items) {
		this.items = items;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ErrorDetail [errorCode=");
		builder.append(errorCode);
		builder.append(", items=");
		builder.append(items);
		builder.append(", errorMessage=");
		builder.append(errorMessage);
		builder.append("]");
		return builder.toString();
	}
}
