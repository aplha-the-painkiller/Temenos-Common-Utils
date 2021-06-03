package com.kcbgroup.common.models.ministatement;



import java.io.Serializable;

/**
 * Request Payload Model Class
 * 
 * @author Collins Kemboi | Bring Global
 * @version 0.0.1
 */
public class MiniStatementRequestPayload implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = -331967078048082824L;


	private PrimaryData primaryData;
	private AdditionalData additionalData;

	public MiniStatementRequestPayload() {
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
		builder.append("RequestPayload [primaryData=");
		builder.append(primaryData);
		builder.append(", additionalData=");
		builder.append(additionalData);
		builder.append("]");
		return builder.toString();
	}
}
