/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcbgroup.common.models.iprsresidentinfo;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jgnjeru
 */
@XmlRootElement(name = "GetDataByAlienCard")
@XmlAccessorType(XmlAccessType.FIELD) // This line was added
public class GetDataByAlienCard implements Serializable {

    private static final long serialVersionUID = 1259336165238582735L;

    @XmlElement(name = "log")
    private String log;

    @XmlElement(name = "pass")
    private String pass;

    @XmlElement(name = "id_number")
    private String id_number;

    public GetDataByAlienCard() {
    }
    

    public String getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getId_number() {
        return id_number;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    
    
    @Override
    public String toString() {
        return "GetDataByAlienCard{" + "log=" + log + ", pass=" + pass + ", id_number=" + id_number + '}';
    }
    
    
    
    

}
