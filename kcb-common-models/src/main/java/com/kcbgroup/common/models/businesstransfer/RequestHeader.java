/**
 * gateway-query-biller
 * Nov 9, 2020
 * RequestHeader.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
package com.kcbgroup.common.models.businesstransfer;

import java.io.Serializable;

/**
 * gateway-query-biller
 * Nov 9, 2020
 * RequestHeader.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class RequestHeader extends com.kcbgroup.common.models.RequestHeader implements Serializable{


	private static final long serialVersionUID = -7171755558112532107L;
	
	protected String timestamp;
	

	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RequestHeader [timestamp=");
		builder.append(timestamp);
		builder.append("]");
		return builder.toString();
	}
	
}
