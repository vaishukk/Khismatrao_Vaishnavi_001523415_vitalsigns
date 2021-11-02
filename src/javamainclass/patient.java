/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamainclass;

/**
 *
 * @author sanik
 */
public class patient {
    
    private String patientID;
    private String medicalRecord;
    private String diabetic;
   
    


public patient(String patientID, String medicalRecord, String diabetic){

this.patientID = patientID;
this.medicalRecord = medicalRecord;
this.diabetic = diabetic;

}

patient(){
    
}

    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(String medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    public String getDiabetic() {
        return diabetic;
    }

    public void setDiabetic(String diabetic) {
        this.diabetic = diabetic;
    }
    
    @Override
    public String toString(){
        return patientID;
    }


}