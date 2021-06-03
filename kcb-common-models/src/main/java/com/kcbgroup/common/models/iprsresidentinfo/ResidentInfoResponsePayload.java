/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcbgroup.common.models.iprsresidentinfo;

/**
 *
 * @author abizibu
 */
public class ResidentInfoResponsePayload {
    
    private PrimaryData primaryData;
    
    private ResponseAdditionalData additionalData;
    
    private ResidentInfo residentInfo;

    public ResidentInfoResponsePayload() {
        
    }

    public PrimaryData getPrimaryData() {
        return primaryData;
    }

    public void setPrimaryData(PrimaryData primaryData) {
        this.primaryData = primaryData;
    }

    public ResponseAdditionalData getAdditionalData() {
        return additionalData;
    }

    public void setAdditionalData(ResponseAdditionalData additionalData) {
        this.additionalData = additionalData;
    }

    public ResidentInfo getResidentInfo() {
        return residentInfo;
    }

    public void setResidentInfo(ResidentInfo residentInfo) {
        this.residentInfo = residentInfo;
    }

    @Override
    public String toString() {
        return "ResidentInfoResponsePayload{" + "primaryData=" + primaryData + ", additionalData=" + additionalData + ", residentInfo=" + residentInfo + '}';
    }    
}
