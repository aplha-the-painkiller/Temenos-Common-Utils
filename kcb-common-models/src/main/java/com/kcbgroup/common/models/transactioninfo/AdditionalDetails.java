
package com.kcbgroup.common.models.transactioninfo;

import java.io.Serializable;

/**
 *
 * @author abizibu
 */
public class AdditionalDetails implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = 8769616922898713611L;

	public AdditionalDetails() {
	};

	@Override
	public String toString() {
		return "AdditionalDetails [initiatorIdentifierType=" + initiatorIdentifierType + ", initiatorIdentifier="
				+ initiatorIdentifier + ", initiatorSecurityCredentials=" + initiatorSecurityCredentials
				+ ", initiatorShortCode=" + initiatorShortCode + ", keyOwner=" + keyOwner + "]";
	}

	public String initiatorIdentifierType;

	public String getInitiatorIdentifierType() {
		return initiatorIdentifierType;
	}

	public void setInitiatorIdentifierType(String initiatorIdentifierType) {
		this.initiatorIdentifierType = initiatorIdentifierType;
	}

	public String getInitiatorIdentifier() {
		return initiatorIdentifier;
	}

	public void setInitiatorIdentifier(String initiatorIdentifier) {
		this.initiatorIdentifier = initiatorIdentifier;
	}

	public String getInitiatorSecurityCredentials() {
		return initiatorSecurityCredentials;
	}

	public void setInitiatorSecurityCredentials(String initiatorSecurityCredentials) {
		this.initiatorSecurityCredentials = initiatorSecurityCredentials;
	}

	public String getInitiatorShortCode() {
		return initiatorShortCode;
	}

	public void setInitiatorShortCode(String initiatorShortCode) {
		this.initiatorShortCode = initiatorShortCode;
	}

	public String getKeyOwner() {
		return keyOwner;
	}

	public void setKeyOwner(String keyOwner) {
		this.keyOwner = keyOwner;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((initiatorIdentifier == null) ? 0 : initiatorIdentifier.hashCode());
		result = prime * result + ((initiatorIdentifierType == null) ? 0 : initiatorIdentifierType.hashCode());
		result = prime * result
				+ ((initiatorSecurityCredentials == null) ? 0 : initiatorSecurityCredentials.hashCode());
		result = prime * result + ((initiatorShortCode == null) ? 0 : initiatorShortCode.hashCode());
		result = prime * result + ((keyOwner == null) ? 0 : keyOwner.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdditionalDetails other = (AdditionalDetails) obj;
		if (initiatorIdentifier == null) {
			if (other.initiatorIdentifier != null)
				return false;
		} else if (!initiatorIdentifier.equals(other.initiatorIdentifier))
			return false;
		if (initiatorIdentifierType == null) {
			if (other.initiatorIdentifierType != null)
				return false;
		} else if (!initiatorIdentifierType.equals(other.initiatorIdentifierType))
			return false;
		if (initiatorSecurityCredentials == null) {
			if (other.initiatorSecurityCredentials != null)
				return false;
		} else if (!initiatorSecurityCredentials.equals(other.initiatorSecurityCredentials))
			return false;
		if (initiatorShortCode == null) {
			if (other.initiatorShortCode != null)
				return false;
		} else if (!initiatorShortCode.equals(other.initiatorShortCode))
			return false;
		if (keyOwner == null) {
			if (other.keyOwner != null)
				return false;
		} else if (!keyOwner.equals(other.keyOwner))
			return false;
		return true;
	}

	public String initiatorIdentifier;

	public AdditionalDetails(String initiatorIdentifierType, String initiatorIdentifier,
			String initiatorSecurityCredentials, String initiatorShortCode, String keyOwner) {
		super();
		this.initiatorIdentifierType = initiatorIdentifierType;
		this.initiatorIdentifier = initiatorIdentifier;
		this.initiatorSecurityCredentials = initiatorSecurityCredentials;
		this.initiatorShortCode = initiatorShortCode;
		this.keyOwner = keyOwner;
	}

	public String initiatorSecurityCredentials;
	public String initiatorShortCode;
	public String keyOwner;
}
