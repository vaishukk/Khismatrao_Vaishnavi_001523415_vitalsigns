/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamainclass;

import java.util.Date;

/**
 *
 * @author Kiran
 */
public class AbPatient {
    
    private String personId;
    private String name;
    private String age;
    private String House;
    private String community;
    private String city;
    private String medicalRecordNo;
    private String diabetic;
    
    private String appointmentId;
    private Date appointment_Date;
    
    private int lower_limit_bloodPressure;
    private int upper_limit_bloodPressure;
    
    private int heart_Rate;

    public String getHouse() {
        return House;
    }

    public void setHouse(String House) {
        this.House = House;
    }
    
    

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
    
    

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMedicalRecordNo() {
        return medicalRecordNo;
    }

    public void setMedicalRecordNo(String medicalRecordNo) {
        this.medicalRecordNo = medicalRecordNo;
    }

    public String getDiabetic() {
        return diabetic;
    }

    public void setDiabetic(String diabetic) {
        this.diabetic = diabetic;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Date getAppointment_Date() {
        return appointment_Date;
    }

    public void setAppointment_Date(Date appointment_Date) {
        this.appointment_Date = appointment_Date;
    }

    public int getLower_limit_bloodPressure() {
        return lower_limit_bloodPressure;
    }

    public void setLower_limit_bloodPressure(int lower_limit_bloodPressure) {
        this.lower_limit_bloodPressure = lower_limit_bloodPressure;
    }

    public int getUpper_limit_bloodPressure() {
        return upper_limit_bloodPressure;
    }

    public void setUpper_limit_bloodPressure(int upper_limit_bloodPressure) {
        this.upper_limit_bloodPressure = upper_limit_bloodPressure;
    }

    public int getHeart_Rate() {
        return heart_Rate;
    }

    public void setHeart_Rate(int heart_Rate) {
        this.heart_Rate = heart_Rate;
    }
    
     @Override
    public String toString()
    {
        return personId;
    }
    
    
}
