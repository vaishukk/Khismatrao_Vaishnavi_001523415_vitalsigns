/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamainclass;

import java.util.Date;


/**
 *
 * @author sanik
 */
public class appointment {
    private String patientID;
    private Date datetime;
    private String appointmentID;
    private int upperlimit_bloodPressure;
    private int lowerlimit_bloodPressure;
    private int heart_rate;
    
    public appointment(String patientID,
     Date datetime,
     String appointmentID,
     int upperlimit_bloodPressure,
     int lowerlimit_bloodPressure,
     int heart_rate){
    this.patientID=patientID;
    this.datetime=datetime;
    this.appointmentID=appointmentID;
    this.upperlimit_bloodPressure=upperlimit_bloodPressure;
    this.lowerlimit_bloodPressure=lowerlimit_bloodPressure;
    this.heart_rate = heart_rate;
    }
    
    appointment(){
        
    }

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(String appointmentID) {
        this.appointmentID = appointmentID;
    }

    public int getUpperlimit_bloodPressure() {
        return upperlimit_bloodPressure;
    }

    public void setUpperlimit_bloodPressure(int upperlimit_bloodPressure) {
        this.upperlimit_bloodPressure = upperlimit_bloodPressure;
    }

    public int getLowerlimit_bloodPressure() {
        return lowerlimit_bloodPressure;
    }

    public void setLowerlimit_bloodPressure(int lowerlimit_bloodPressure) {
        this.lowerlimit_bloodPressure = lowerlimit_bloodPressure;
    }

    public int getHeart_rate() {
        return heart_rate;
    }

    public void setHeart_rate(int heart_rate) {
        this.heart_rate = heart_rate;
    }
    
    @Override
    public String toString(){
        return patientID;
    }
    

   
    
    
}
