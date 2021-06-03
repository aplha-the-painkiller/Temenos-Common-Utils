package com.kcbgroup.common.models.queryBiller;
import java.io.Serializable;

/**
 * @author Gideon Mulandi | KCB
 * @version 1.0.0
 */
public class AdditionalData implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = -6445868424539143515L;
 
	private QueryData queryData; 
	
	public AdditionalData() {
		super();
	}

	/**
	 * @return the QueryData
	 */
	public QueryData getQueryData() {
		return queryData;
	}

	/**
	 * @param ValidationData the QueryData to set
	 */
	public void setQueryData(QueryData queryData) {
		this.queryData = queryData;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AdditionalData [QueryData=");
		builder.append(queryData);
		builder.append("]");
		return builder.toString();
	}
}
