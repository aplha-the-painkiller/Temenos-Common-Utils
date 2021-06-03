package com.kcbgroup.common.models.t24.lockfunds;

import java.io.Serializable;

/**
 * t24.lockfunds.response
 * Feb 7, 2021
 * RequestPayload.java
 *
 * @author Collins Kemboi| Bring global - KCB
 * @version 1.0.0
 */
public class ResponsePayload implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = -9010517583049095388L;

   
	private Response createLockResponse;

	public Response getCreateLockResponse() {
		return createLockResponse;
	}

	public void setCreateLockResponse(Response createLockResponse) {
		this.createLockResponse = createLockResponse;
	}

	@Override
	public String toString() {
		return "ResponsePayload [createLockRequest=" + createLockResponse + "]";
	}

}
