package com.kcbgroup.common.models.queryBiller;


import java.io.Serializable;

/**
 * @author Gideon Mulandi | KCB
 * @version 1.0.0
 */
public class QueryBillerRequestPayload implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = 7870310611900741033L;

    private PrimaryData primaryData;  
    private AdditionalData additionalData;
    
    public QueryBillerRequestPayload() {
		super();
	}

	/**
	 * @return the primaryData
	 */
	public PrimaryData getPrimaryData() {
		return primaryData;
	}

	/**
	 * @param primaryData the primaryData to set
	 */
	public void setPrimaryData(PrimaryData primaryData) {
		this.primaryData = primaryData;
	}

	/**
	 * @return the additionalData
	 */
	public AdditionalData getAdditionalData() {
		return additionalData;
	}

	/**
	 * @param additionalData the additionalData to set
	 */
	public void setAdditionalData(AdditionalData additionalData) {
		this.additionalData = additionalData;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("QueryBillerRequestPayload [primaryData=");
		builder.append(primaryData);
		builder.append(", additionalData=");
		builder.append(additionalData);
		builder.append("]");
		return builder.toString();
	}
}
