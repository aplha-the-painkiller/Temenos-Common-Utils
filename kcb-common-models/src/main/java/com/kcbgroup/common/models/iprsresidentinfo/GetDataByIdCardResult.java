/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcbgroup.common.models.iprsresidentinfo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jgnjeru
 */
@XmlRootElement(name = "GetDataByIdCardResult", namespace = "http://schemas.datacontract.org/2004/07/IPRSManager")
@XmlAccessorType (XmlAccessType.FIELD)
public class GetDataByIdCardResult {
    
    @XmlElement
    private String ErrorCode;
    @XmlElement
    private String ErrorMessage;
    @XmlElement
    private String ErrorOcurred;
    @XmlElement
    private String Citizenship;
    @XmlElement
    private String Clan;
    @XmlElement
    private String Date_of_Birth;
    @XmlElement
    private String Date_of_Death;
    @XmlElement
    private String Ethnic_Group;
    @XmlElement
    private String Family;
    @XmlElement
    private String Fingerprint;
    private String First_Name;
    private String Gender;
    private String ID_Number;
    private String Occupation;
    private String Other_Name;
    private String Photo;
    private String Pin;
    private String Place_of_Birth;
    private String Place_of_Death;
    private String Place_of_Live;
    private String Signature;
    private String Surname;
    private String Date_of_Expiry;
    private String Date_of_Issue;
    private String RegOffice;
    private String Serial_Number;

//    public GetDataByAlienCardResult() {
//    }

    public String getErrorCode() {
        return ErrorCode;
    }

    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    public String getErrorMessage() {
        return ErrorMessage;
    }

    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    public String getErrorOcurred() {
        return ErrorOcurred;
    }

    public void setErrorOcurred(String ErrorOcurred) {
        this.ErrorOcurred = ErrorOcurred;
    }

    public String getCitizenship() {
        return Citizenship;
    }

    public void setCitizenship(String Citizenship) {
        this.Citizenship = Citizenship;
    }

    public String getClan() {
        return Clan;
    }

    public void setClan(String Clan) {
        this.Clan = Clan;
    }

    public String getDate_of_Birth() {
        return Date_of_Birth;
    }

    public void setDate_of_Birth(String Date_of_Birth) {
        this.Date_of_Birth = Date_of_Birth;
    }

    public String getDate_of_Death() {
        return Date_of_Death;
    }

    public void setDate_of_Death(String Date_of_Death) {
        this.Date_of_Death = Date_of_Death;
    }

    public String getEthnic_Group() {
        return Ethnic_Group;
    }

    public void setEthnic_Group(String Ethnic_Group) {
        this.Ethnic_Group = Ethnic_Group;
    }

    public String getFamily() {
        return Family;
    }

    public void setFamily(String Family) {
        this.Family = Family;
    }

    public String getFingerprint() {
        return Fingerprint;
    }

    public void setFingerprint(String Fingerprint) {
        this.Fingerprint = Fingerprint;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String First_Name) {
        this.First_Name = First_Name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getID_Number() {
        return ID_Number;
    }

    public void setID_Number(String ID_Number) {
        this.ID_Number = ID_Number;
    }

    public String getOccupation() {
        return Occupation;
    }

    public void setOccupation(String Occupation) {
        this.Occupation = Occupation;
    }

    public String getOther_Name() {
        return Other_Name;
    }

    public void setOther_Name(String Other_Name) {
        this.Other_Name = Other_Name;
    }

    public String getPhoto() {
        return Photo;
    }

    public void setPhoto(String Photo) {
        this.Photo = Photo;
    }

    public String getPin() {
        return Pin;
    }

    public void setPin(String Pin) {
        this.Pin = Pin;
    }

    public String getPlace_of_Birth() {
        return Place_of_Birth;
    }

    public void setPlace_of_Birth(String Place_of_Birth) {
        this.Place_of_Birth = Place_of_Birth;
    }

    public String getPlace_of_Death() {
        return Place_of_Death;
    }

    public void setPlace_of_Death(String Place_of_Death) {
        this.Place_of_Death = Place_of_Death;
    }

    public String getPlace_of_Live() {
        return Place_of_Live;
    }

    public void setPlace_of_Live(String Place_of_Live) {
        this.Place_of_Live = Place_of_Live;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String Signature) {
        this.Signature = Signature;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }

    public String getDate_of_Expiry() {
        return Date_of_Expiry;
    }

    public void setDate_of_Expiry(String Date_of_Expiry) {
        this.Date_of_Expiry = Date_of_Expiry;
    }

    public String getDate_of_Issue() {
        return Date_of_Issue;
    }

    public void setDate_of_Issue(String Date_of_Issue) {
        this.Date_of_Issue = Date_of_Issue;
    }

    public String getRegOffice() {
        return RegOffice;
    }

    public void setRegOffice(String RegOffice) {
        this.RegOffice = RegOffice;
    }

    public String getSerial_Number() {
        return Serial_Number;
    }

    public void setSerial_Number(String Serial_Number) {
        this.Serial_Number = Serial_Number;
    }

    @Override
    public String toString() {
        return "GetDataByIdCardResult{" + "ErrorCode=" + ErrorCode + ", ErrorMessage=" + ErrorMessage + ", ErrorOcurred=" + ErrorOcurred + ", Citizenship=" + Citizenship + ", Clan=" + Clan + ", Date_of_Birth=" + Date_of_Birth + ", Date_of_Death=" + Date_of_Death + ", Ethnic_Group=" + Ethnic_Group + ", Family=" + Family + ", Fingerprint=" + Fingerprint + ", First_Name=" + First_Name + ", Gender=" + Gender + ", ID_Number=" + ID_Number + ", Occupation=" + Occupation + ", Other_Name=" + Other_Name + ", Photo=" + Photo + ", Pin=" + Pin + ", Place_of_Birth=" + Place_of_Birth + ", Place_of_Death=" + Place_of_Death + ", Place_of_Live=" + Place_of_Live + ", Signature=" + Signature + ", Surname=" + Surname + ", Date_of_Expiry=" + Date_of_Expiry + ", Date_of_Issue=" + Date_of_Issue + ", RegOffice=" + RegOffice + ", Serial_Number=" + Serial_Number + '}';
    }
    
    
}
