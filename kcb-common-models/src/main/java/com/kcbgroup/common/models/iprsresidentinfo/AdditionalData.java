/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcbgroup.common.models.iprsresidentinfo;

/**
 *
 * @author jgnjeru
 */
public class AdditionalData {

    private String firstName;
    private String middleName;
    private String lastName;
    
    public AdditionalData() {
    
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("AdditionalData [firstName=");
        builder.append(firstName);
        builder.append(", middleName=");
        builder.append(middleName);
        builder.append(", lastName=");
        builder.append(lastName);
        builder.append("]");
        return builder.toString();
    }
}
