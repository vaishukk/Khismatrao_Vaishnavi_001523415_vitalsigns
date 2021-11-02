/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javamainclass;

import java.util.ArrayList;

/**
 *
 * @author Kiran
 */
public class AbPatientHistory {
    
    private ArrayList<AbPatient> Abpatienthistory;

    public AbPatientHistory() {
        this.Abpatienthistory = new ArrayList<AbPatient>();
    }

    public ArrayList<AbPatient> getAbpatienthistory() {
        return Abpatienthistory;
    }

    public void setAbpatienthistory(ArrayList<AbPatient> Abpatienthistory) {
        this.Abpatienthistory = Abpatienthistory;
    }
    
    public AbPatient addAbnormalPatient()
    {
        AbPatient patient1 = new AbPatient();
        Abpatienthistory.add(patient1);
        return patient1;
    }
    
    public AbPatient addAbnormalPatient(AbPatient abPatient1)
    {
        Abpatienthistory.add(abPatient1);
        return abPatient1;
    }
    
    
    
}
