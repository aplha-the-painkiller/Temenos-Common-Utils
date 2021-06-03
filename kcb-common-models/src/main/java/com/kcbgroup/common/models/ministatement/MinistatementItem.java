/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcbgroup.common.models.ministatement;

import java.util.Objects;

/**
 *
 * @author abizibu
 */
public class MinistatementItem {
    
    private String transDate;
    private String transRef;
    private String transDesc;
    private String transType;
    private double transAmt;

    public MinistatementItem() {
        
    }

    public MinistatementItem(String transDate, String transRef, String transDesc, String transType, double transAmt) {
        this.transDate = transDate;
        this.transRef = transRef;
        this.transDesc = transDesc;
        this.transType = transType;
        this.transAmt = transAmt;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public String getTransRef() {
        return transRef;
    }

    public void setTransRef(String transRef) {
        this.transRef = transRef;
    }

    public String getTransDesc() {
        return transDesc;
    }

    public void setTransDesc(String transDesc) {
        this.transDesc = transDesc;
    }

    public String getTransType() {
        return transType;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }

    public double getTransAmt() {
        return transAmt;
    }

    public void setTransAmt(double transAmt) {
        this.transAmt = transAmt;
    }
    
     @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MinistatementItem other = (MinistatementItem) obj;
        if (Double.doubleToLongBits(this.transAmt) != Double.doubleToLongBits(other.transAmt)) {
            return false;
        }
        if (!Objects.equals(this.transDate, other.transDate)) {
            return false;
        }
        if (!Objects.equals(this.transRef, other.transRef)) {
            return false;
        }
        if (!Objects.equals(this.transDesc, other.transDesc)) {
            return false;
        }
        if (!Objects.equals(this.transType, other.transType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "MinistatementItem{" + "transDate=" + transDate + ", transRef=" + transRef + ", transDesc=" + transDesc + ", transType=" + transType + ", transAmt=" + transAmt + '}';
    }
}
