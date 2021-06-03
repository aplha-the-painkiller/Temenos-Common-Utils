/**
 * gateway-query-biller
 * Nov 9, 2020
 * RequestHeader.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
package com.kcbgroup.common.models.notifybiller;

import java.io.Serializable;

/**
 * gateway-query-biller
 * Nov 9, 2020
 * RequestHeader.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class ResponseHeader extends com.kcbgroup.common.models.ResponseHeader implements Serializable{


	private static final long serialVersionUID = -7171755558112532107L;
	
	protected String originatorConversationID;

	/**
	 * @return the originatorConversationID
	 */
	public String getOriginatorConversationID() {
		return originatorConversationID;
	}

	/**
	 * @param originatorConversationID the originatorConversationID to set
	 */
	public void setOriginatorConversationID(String originatorConversationID) {
		this.originatorConversationID = originatorConversationID;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResponseHeader [originatorConversationID=");
		builder.append(originatorConversationID);
		builder.append("]");
		return builder.toString();
	}

    
}
