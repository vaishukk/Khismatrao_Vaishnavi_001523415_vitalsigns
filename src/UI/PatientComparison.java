/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javamainclass.AbPatient;
import javamainclass.AbPatientHistory;
import javamainclass.appointment;

import javamainclass.appointmenthistory;
import javamainclass.cars;
import javamainclass.carsdata;
import javamainclass.patient;
import javamainclass.patienthistory;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Kiran
 */
public class PatientComparison extends javax.swing.JPanel {

    /**
     * Creates new form PatientComparison
     */
    carsdata data;
    patienthistory PatientHistory;
    appointmenthistory encounterhistory;
    AbPatientHistory abpatienthistory;
    public PatientComparison(carsdata data, patienthistory PatientHistory, appointmenthistory encounterhistory, AbPatientHistory abpatienthistory) {
        initComponents();
        this.data=data;
        this.PatientHistory=PatientHistory;
        this.encounterhistory=encounterhistory;
        this.abpatienthistory=abpatienthistory;
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        persontbt = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        comparetbt = new javax.swing.JTable();
        persondata_btn = new javax.swing.JButton();
        compare_btn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        persontbt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Person ID", "Name", "AGE", "HOUSE", "COMMUNITY", "CITY", "APPOINTMENT DATE", "MEDRICAL RECORD NO", "DIABETIC", "LOWER BLOOD PRESSURE", "UPPER BLOOD PRESSURE", "HEART RATE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(persontbt);

        comparetbt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "COMMUNITY", "NO. OF PEOPLE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(comparetbt);

        persondata_btn.setText("LOAD PERSON DATA");
        persondata_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persondata_btnActionPerformed(evt);
            }
        });

        compare_btn.setText("COMPARE DATA");
        compare_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                compare_btnActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 0, 102));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ABNORMAL COMMUNITY COMPARISON");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 989, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(persondata_btn)
                .addGap(48, 48, 48)
                .addComponent(compare_btn)
                .addGap(378, 378, 378))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 944, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(persondata_btn)
                    .addComponent(compare_btn))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(198, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void persondata_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persondata_btnActionPerformed
        // TODO add your handling code here:
        String patientId = "";
        for(appointment a: encounterhistory.getappointmenthistory())
        {
            if(a.getUpperlimit_bloodPressure() > 120)
            {
                patientId = a.getPatientID();
                collectAbnormalPatientData(patientId, a);
            }
        }
        
        DefaultTableModel model = (DefaultTableModel) persontbt.getModel();
        model.setRowCount(0);
        
        for(AbPatient ap : abpatienthistory.getAbpatienthistory())
        {
            Object[] row = new Object[12];

            row[0] = ap;
            row[1] = ap.getName();
            row[2] = ap.getAge();
            row[3] = ap.getHouse();
            row[4] = ap.getCommunity();
            row[5] = ap.getCity();        
            SimpleDateFormat dateOnly = new SimpleDateFormat("MM/dd/yyyy");            
            row[6] = dateOnly.format(ap.getAppointment_Date().getTime());
            row[7] = ap.getMedicalRecordNo();
            row[8] = ap.getDiabetic();
            row[9] = ap.getLower_limit_bloodPressure();
            row[10] = ap.getUpper_limit_bloodPressure();
            row[11] = ap.getHeart_Rate();
            
            
            model.addRow(row);
        }
    }//GEN-LAST:event_persondata_btnActionPerformed

    private void compare_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_compare_btnActionPerformed
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel) comparetbt.getModel();
        model.setRowCount(0);
        
        List<String> communityList = new ArrayList<String>();
        
        // Inserting distinct community list in aaraylist
        for(AbPatient ap : abpatienthistory.getAbpatienthistory())
        {
            if(!communityList.contains(ap.getCommunity()))
            {
                communityList.add(ap.getCommunity());
            }
        }
        
        // Inserting Community and Count
        for(String com : communityList)
        {
            int count = 0;
            for(AbPatient ap : abpatienthistory.getAbpatienthistory())
            {
                if(ap.getCommunity() == com)
                {
                    count++;
                }
            }
            
            Object[] row = new Object[2];

            row[0] = com;
            row[1] = count;

            model.addRow(row);
        }
    }//GEN-LAST:event_compare_btnActionPerformed

    public void collectAbnormalPatientData(String patientId, appointment a)
    {
            System.out.println("Hello1!");
            AbPatient abp = abpatienthistory.addAbnormalPatient();
            cars selectedPerson = null;
            for(cars c: data.getData()){
            
                System.out.println("Hello!");
                if(c.getPersonID().equals(patientId))
                {
                    selectedPerson = c;
                }
            }
            
            patient selectedPatient = null;
            for(patient Pat : PatientHistory.getPatienthistory())
            {
                if(Pat.getPatientID().equals(patientId))
                {
                    selectedPatient = Pat;
                }
            }
            
            abp.setPersonId(patientId);
            abp.setName(selectedPerson.getName());
            String Age = String.valueOf(selectedPerson.getAge());
            abp.setAge(Age);
            abp.setHouse(selectedPerson.getHouse());
            abp.setCommunity(selectedPerson.getCommunity());
            abp.setCity(selectedPerson.getCity());
            abp.setAppointment_Date(a.getDatetime());
            abp.setMedicalRecordNo(selectedPatient.getMedicalRecord());
            abp.setDiabetic(selectedPatient.getDiabetic());
            abp.setAppointmentId(a.getAppointmentID());            
            abp.setUpper_limit_bloodPressure(a.getUpperlimit_bloodPressure());
            abp.setLower_limit_bloodPressure(a.getLowerlimit_bloodPressure());
            abp.setHeart_Rate(a.getHeart_rate());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton compare_btn;
    private javax.swing.JTable comparetbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton persondata_btn;
    private javax.swing.JTable persontbt;
    // End of variables declaration//GEN-END:variables
}
