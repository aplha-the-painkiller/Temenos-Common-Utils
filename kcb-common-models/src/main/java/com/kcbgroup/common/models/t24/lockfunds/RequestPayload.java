/**
 * kcb-connector-vault
 * Sep 4, 2020
 * VaultValidate.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
package com.kcbgroup.common.models.t24.lockfunds;

import java.io.Serializable;

/**
 * t24.lockfunds.request
 * Feb 7, 2021
 * RequestPayload.java
 *
 * @author Collins Kemboi| Bring global - KCB
 * @version 1.0.0
 */
public class RequestPayload implements Serializable {
	
	/** Serial version */
	private static final long serialVersionUID = 78196169294313611L;

	    private Request createLockRequest;

		public Request getCreateLockRequest() {
			return createLockRequest;
		}

		public void setCreateLockRequest(Request createLockRequest) {
			this.createLockRequest = createLockRequest;
		}

	

		@Override
		public String toString() {
			return "RequestPayload [createLockRequest=" + createLockRequest + "]";
		}

		public RequestPayload() {
		}

	
	}
