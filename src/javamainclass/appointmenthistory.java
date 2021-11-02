/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamainclass;

import java.util.ArrayList;

/**
 *
 * @author sanik
 */
public class appointmenthistory {
    
    private ArrayList<appointment> appointmenthistory;
    
   
    public  appointmenthistory() {
        this.appointmenthistory = new ArrayList<appointment>();
    }
    public ArrayList<appointment> getappointmenthistory() {
        return appointmenthistory;
    }
    public void setappointmenthistory(ArrayList<appointment> appointmenthistory) {
        this.appointmenthistory = appointmenthistory;
    }
    public appointment addNewappointment() {
        appointment newappointment = new appointment();
        appointmenthistory.add(newappointment);
        return newappointment;
        
    }
    
    public int count(){
        return appointmenthistory.size();
    }
    
}
