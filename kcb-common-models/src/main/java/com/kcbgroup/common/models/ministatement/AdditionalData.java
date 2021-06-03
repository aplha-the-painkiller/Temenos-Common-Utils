package com.kcbgroup.common.models.ministatement;

import java.io.Serializable;
import java.util.List;

public class AdditionalData  implements Serializable {

	/** Serial version */
	private static final long serialVersionUID = 7819616922864313611L;
	//	private String currency;
	//	private String actualBalance;
	//	private String availableBalance;
	private String statementCount;        
	private List<StatementEntry> statementEntries;
	private String companyCode;
	private String maxEntriesRequired;

	/**
	 * @return the statementCount
	 */
	public String getStatementCount() {
		return statementCount;
	}
	/**
	 * @param statementCount the statementCount to set
	 */
	public void setStatementCount(String statementCount) {
		this.statementCount = statementCount;
	}
	/**
	 * @return the statementEntries
	 */
	public List<StatementEntry> getStatementEntries() {
		return statementEntries;
	}
	/**
	 * @param statementEntries the statementEntries to set
	 */
	public void setStatementEntries(List<StatementEntry> statementEntries) {
		this.statementEntries = statementEntries;
	}
	
	/**
	 * @return the companyCode
	 */
	public String getCompanyCode() {
		return companyCode;
	}
	/**
	 * @param companyCode the companyCode to set
	 */
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	/**
	 * @return the maxEntriesRequired
	 */
	public String getMaxEntriesRequired() {
		return maxEntriesRequired;
	}
	/**
	 * @param maxEntriesRequired the maxEntriesRequired to set
	 */
	public void setMaxEntriesRequired(String maxEntriesRequired) {
		this.maxEntriesRequired = maxEntriesRequired;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AdditionalData [statementCount=");
		builder.append(statementCount);
		builder.append(", statementEntries=");
		builder.append(statementEntries);
		builder.append(", companyCode=");
		builder.append(companyCode);
		builder.append(", maxEntriesRequired=");
		builder.append(maxEntriesRequired);
		builder.append("]");
		return builder.toString();
	}

}
