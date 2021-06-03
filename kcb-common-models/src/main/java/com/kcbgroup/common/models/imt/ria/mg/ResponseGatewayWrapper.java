/**
 * 
 */
package com.kcbgroup.common.models.imt.ria.mg;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * General Request Wrapper
 *
 * @author Francisco Osorio | Bring Global
 * @version 1.0.0
 */
public class ResponseGatewayWrapper implements Serializable {
	/** Serial version UID */
	private static final long serialVersionUID = 3547641363206949943L;
	
    @JsonProperty("Errors") 
    private String errors;
    
    @JsonProperty("Response") 
    private Response response;

	/**
	 * @return the errors
	 */
	public String getErrors() {
		return errors;
	}

	/**
	 * @param errors the errors to set
	 */
	public void setErrors(String errors) {
		this.errors = errors;
	}

	/**
	 * @return the response
	 */
	public Response getResponse() {
		return response;
	}

	/**
	 * @param response the response to set
	 */
	public void setResponse(Response response) {
		this.response = response;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResponseGatewayWrapper [errors=");
		builder.append(errors);
		builder.append(", response=");
		builder.append(response);
		builder.append("]");
		return builder.toString();
	}
    
}
