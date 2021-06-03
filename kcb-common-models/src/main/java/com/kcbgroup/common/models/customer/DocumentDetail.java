/**
 * kcb-common-models
 * Oct 1, 2020
 * DocumentDetail.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
package com.kcbgroup.common.models.customer;

import java.io.Serializable;

/**
 * kcb-common-models
 * Oct 1, 2020
 * DocumentDetail.java
 *
 * @author Andrés Vázquez | Bring global - KCB
 * @version 1.0.0
 */
public class DocumentDetail implements Serializable {


	private static final long serialVersionUID = -1077706221635741394L;
	
	public String documentNumber;
    public String documentType;
    public String documentHolderName;
    public String issuingAuthority;
    public String issueDate;
    public String expirtyDate;
	/**
	 * @return the documentNumber
	 */
	public String getDocumentNumber() {
		return documentNumber;
	}
	/**
	 * @param documentNumber the documentNumber to set
	 */
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	/**
	 * @return the documentType
	 */
	public String getDocumentType() {
		return documentType;
	}
	/**
	 * @param documentType the documentType to set
	 */
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	/**
	 * @return the documentHolderName
	 */
	public String getDocumentHolderName() {
		return documentHolderName;
	}
	/**
	 * @param documentHolderName the documentHolderName to set
	 */
	public void setDocumentHolderName(String documentHolderName) {
		this.documentHolderName = documentHolderName;
	}
	/**
	 * @return the issuingAuthority
	 */
	public String getIssuingAuthority() {
		return issuingAuthority;
	}
	/**
	 * @param issuingAuthority the issuingAuthority to set
	 */
	public void setIssuingAuthority(String issuingAuthority) {
		this.issuingAuthority = issuingAuthority;
	}
	/**
	 * @return the issueDate
	 */
	public String getIssueDate() {
		return issueDate;
	}
	/**
	 * @param issueDate the issueDate to set
	 */
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	/**
	 * @return the expirtyDate
	 */
	public String getExpirtyDate() {
		return expirtyDate;
	}
	/**
	 * @param expirtyDate the expirtyDate to set
	 */
	public void setExpirtyDate(String expirtyDate) {
		this.expirtyDate = expirtyDate;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DocumentDetail [documentNumber=");
		builder.append(documentNumber);
		builder.append(", documentType=");
		builder.append(documentType);
		builder.append(", documentHolderName=");
		builder.append(documentHolderName);
		builder.append(", issuingAuthority=");
		builder.append(issuingAuthority);
		builder.append(", issueDate=");
		builder.append(issueDate);
		builder.append(", expirtyDate=");
		builder.append(expirtyDate);
		builder.append("]");
		return builder.toString();
	}
    
    
}
