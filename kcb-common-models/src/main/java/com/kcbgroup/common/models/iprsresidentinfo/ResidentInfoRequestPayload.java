
package com.kcbgroup.common.models.iprsresidentinfo;

/**
 *
 * @author abizibu
 */
public class ResidentInfoRequestPayload {
    
    private PrimaryData primaryData;  
    private AdditionalData additionalData;

    public ResidentInfoRequestPayload() {
        
    }

    public ResidentInfoRequestPayload(PrimaryData primaryData, AdditionalData additionalData) {
        this.primaryData = primaryData;
        this.additionalData = additionalData;
    }

    public PrimaryData getPrimaryData() {
        return primaryData;
    }

    public void setPrimaryData(PrimaryData primaryData) {
        this.primaryData = primaryData;
    }

    public AdditionalData getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(AdditionalData additionalData) {
        this.additionalData = additionalData;
    }

    @Override
    public String toString() {
        return "ResidentInfoRequestPayload{" + "primaryData=" + primaryData + ", additionalData=" + additionalData + '}';
    }
    
}
