package com.kcbgroup.common.models.ministatement;

import java.io.Serializable;

/**
 * Account Information Model Class
 * 
 * @author Collins Kemboi | Bring Global
 * @version 0.0.1
 */
public class PrimaryData implements Serializable {
	/** Serial version UID */
	private static final long serialVersionUID = -8498981998316046120L;

	private String businessKey;
	private String businessKeyType;

	public PrimaryData() {
	}

	public String getBusinessKey() {
		return businessKey;
	}

	public void setBusinessKey(String businessKey) {
		this.businessKey = businessKey;
	}

	public String getBusinessKeyType() {
		return businessKeyType;
	}

	public void setBusinessKeyType(String businessKeyType) {
		this.businessKeyType = businessKeyType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PrimaryData [businessKey=");
		builder.append(businessKey);
		builder.append(", businessKeyType=");
		builder.append(businessKeyType);
		builder.append("]");
		return builder.toString();
	}
}
