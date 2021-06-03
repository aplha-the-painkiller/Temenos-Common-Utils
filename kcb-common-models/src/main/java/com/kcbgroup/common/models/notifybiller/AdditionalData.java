package com.kcbgroup.common.models.notifybiller;

import java.io.Serializable;

/**
 * Additional Data Model Class
 * 
 * @author Collins Kemboi | KCB
 * @version 1.0.0
 */
public class AdditionalData implements Serializable {
	/**
	 * 
	 */
	/** Serial version */
	private static final long serialVersionUID = 6531955705473920437L;
 
	private NotificationData notificationData; 
	
	public AdditionalData() {
	}

	public NotificationData getnotificationData() {
		return notificationData;
	}

	public void setnotificationData(NotificationData notificationData) {
		this.notificationData = notificationData;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AdditionalData [notificationData=");
		builder.append(notificationData);
		builder.append("]");
		return builder.toString();
	}
}