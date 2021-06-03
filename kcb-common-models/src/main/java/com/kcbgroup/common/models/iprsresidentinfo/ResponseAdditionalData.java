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
public class ResponseAdditionalData {
    
    private String nameMatched;

    public ResponseAdditionalData() {
        
    }

    public String getNameMatched() {
        return nameMatched;
    }

    public void setNameMatched(String nameMatched) {
        this.nameMatched = nameMatched;
    }

    @Override
    public String toString() {
        return "ResponseAdditionalData{" + "nameMatched=" + nameMatched + '}';
    }

}
