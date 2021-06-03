package com.kcbgroup.common.models.reversal;

import java.io.Serializable;

/**
 * Additional Data Model Class
 * 
 * @author Stephen Okoth | KCB
 * @version 1.0.0
 */
public class AdditionalData implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = 4043308335023229339L;
 
	private String companyCode; 
	
	public AdditionalData() {
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AdditionalData [companyCode=");
		builder.append(companyCode);
		builder.append("]");
		return builder.toString();
	}
}