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
public class patienthistory {
    
    private ArrayList<patient> patienthistory;
    
    public patienthistory(){
        this.patienthistory = new ArrayList<patient>();
    }

    public ArrayList<patient> getPatienthistory() {
        return patienthistory;
    }

    public void setPatienthistory(ArrayList<patient> patienthistory) {
        this.patienthistory = patienthistory;
    }
    
    public patient newPatient(){
        patient PatientNew = new patient();
        patienthistory.add(PatientNew);
        return PatientNew;
    }
    public patient newPatient(patient Patient){
        patienthistory.add(Patient);
        return Patient;
    }
    
    public int count(){
        return patienthistory.size();
    }
    
    public patient deletepatient(patient Patient){
        patienthistory.remove(Patient);
        return Patient;
    }
    
}
