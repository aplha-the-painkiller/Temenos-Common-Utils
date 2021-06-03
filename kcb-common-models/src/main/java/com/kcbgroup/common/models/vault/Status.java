package com.kcbgroup.common.models.vault;

import java.io.Serializable;

/**
 * Status Model Class
 * @author Francisco Osorio | Bring Global
 * @version 0.0.1
 */
public class Status implements Serializable {
	/** Serial version */
	private static final long serialVersionUID = -5719023520331562920L;

	/** Status Code */
	private String code;
	/** Status Description */
	private String description;
	/** Serial Narrative (Only for Errors) */
	private String narrative;

	public Status() {
	}
	
	public Status(String code, String description) {
		super();
		this.code = code;
		this.description = description;
	}

	public Status(String code, String description, String narrative) {
		super();
		this.code = code;
		this.description = description;
		this.narrative = narrative;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNarrative() {
		return narrative;
	}

	public void setNarrative(String narrative) {
		this.narrative = narrative;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((code == null) ? 0 : code.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((narrative == null) ? 0 : narrative.hashCode());
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
		Status other = (Status) obj;
		if (code == null) {
			if (other.code != null)
				return false;
		} else if (!code.equals(other.code))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (narrative == null) {
			if (other.narrative != null)
				return false;
		} else if (!narrative.equals(other.narrative))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Status [code=" + code + ", description=" + description + ", narrative=" + narrative + "]";
	}
}
