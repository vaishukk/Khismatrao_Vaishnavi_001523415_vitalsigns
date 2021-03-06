/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javamainclass.cars;
import javamainclass.carsdata;
import javamainclass.patient;
import javamainclass.patienthistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanik
 */
public class Patient extends javax.swing.JPanel {

    /**
     * Creates new form Patient
     */
    carsdata data;
    patienthistory PatientHistory;
    public Patient(carsdata data, patienthistory PatientHistory) {
        initComponents();
        this.data=data;
        this.PatientHistory=PatientHistory;
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
        patienttbt = new javax.swing.JTable();
        allpatients_btn = new javax.swing.JButton();
        patientdetails = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_age = new javax.swing.JTextField();
        txt_gender = new javax.swing.JTextField();
        txt_house = new javax.swing.JTextField();
        txt_community = new javax.swing.JTextField();
        txt_city = new javax.swing.JTextField();
        txt_medical_record_no = new javax.swing.JTextField();
        txt_diabetic = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        persontbt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "PERSON ID", "NAME", "AGE", "GENDER", "HOUSE", "COMMUNITY", "CITY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(persontbt);

        patienttbt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "PATIENT ID", "MEDICAL RECORD NO", "DIBETIC"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(patienttbt);

        allpatients_btn.setText("All Patients");
        allpatients_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allpatients_btnActionPerformed(evt);
            }
        });

        patientdetails.setText("View Patient Details");
        patientdetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientdetailsActionPerformed(evt);
            }
        });

        jLabel1.setText("Name");

        jLabel2.setText("Age");

        jLabel3.setText("Gender");

        jLabel4.setText("House");

        jLabel5.setText("Community");

        jLabel6.setText("City");

        jLabel7.setText("Medical Record No");

        jLabel8.setText("Diabetic");

        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });

        txt_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ageActionPerformed(evt);
            }
        });

        txt_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_genderActionPerformed(evt);
            }
        });

        txt_house.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_houseActionPerformed(evt);
            }
        });

        txt_community.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_communityActionPerformed(evt);
            }
        });

        txt_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_cityActionPerformed(evt);
            }
        });

        txt_medical_record_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_medical_record_noActionPerformed(evt);
            }
        });

        txt_diabetic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_diabeticActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 0, 102));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("VIEW PATIENTS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(allpatients_btn)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_city, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_community, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_house, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(patientdetails)
                                .addGap(115, 115, 115))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_medical_record_no, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_diabetic, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(108, Short.MAX_VALUE))))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(patientdetails)
                    .addComponent(allpatients_btn))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_medical_record_no, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(txt_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_diabetic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_house, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_community, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ageActionPerformed

    private void txt_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_genderActionPerformed

    private void txt_houseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_houseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_houseActionPerformed

    private void txt_communityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_communityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_communityActionPerformed

    private void txt_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cityActionPerformed

    private void txt_medical_record_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_medical_record_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_medical_record_noActionPerformed

    private void txt_diabeticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_diabeticActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_diabeticActionPerformed

    private void allpatients_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allpatients_btnActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_allpatients_btnActionPerformed

    private void patientdetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientdetailsActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = persontbt.getSelectedRow();
        
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this,"Please select a row to add person to the patients list");
        }
        else{
            DefaultTableModel modelPer = (DefaultTableModel)persontbt.getModel();
            cars selectedcar = (cars)modelPer.getValueAt(selectedRowIndex, 0);
            
            txt_name.setText(selectedcar.getName());
            String age = String.valueOf(selectedcar.getAge());
            txt_age.setText(age);
            txt_gender.setText(selectedcar.getGender());
            txt_house.setText(selectedcar.getHouse());
            txt_community.setText(selectedcar.getCommunity());
            txt_city.setText(selectedcar.getCity());
            
            DefaultTableModel modelPat = (DefaultTableModel)patienttbt.getModel();
            patient pat = (patient)modelPat.getValueAt(selectedRowIndex, 0);
            
            txt_medical_record_no.setText(pat.getMedicalRecord());
            txt_diabetic.setText(pat.getDiabetic());
        }
    }//GEN-LAST:event_patientdetailsActionPerformed
public void populateTable(){
    DefaultTableModel modelPer = (DefaultTableModel)persontbt.getModel();
    modelPer.setRowCount(0);
    
    for(cars c: data.getData()){
        Object[] row = new Object[7];
        
        row[0] = c;
        row[1] = c.getName();
        row[2] = c.getAge();
        row[3] = c.getGender();
        row[4] = c.getHouse();
        row[5] = c.getCommunity();
        row[6] = c.getCity();
        
        modelPer.addRow(row);
    }
    
    DefaultTableModel modelPat = (DefaultTableModel)patienttbt.getModel();
     modelPat.setRowCount(0);
     
     for(patient p : PatientHistory.getPatienthistory()){
         
         Object[] row =new Object[7];
            row[0]=p;
            row[1]=p.getMedicalRecord();
            row[2]=p.getDiabetic();
            
            
            
            modelPat.addRow(row);
}
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton allpatients_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton patientdetails;
    private javax.swing.JTable patienttbt;
    private javax.swing.JTable persontbt;
    private javax.swing.JTextField txt_age;
    private javax.swing.JTextField txt_city;
    private javax.swing.JTextField txt_community;
    private javax.swing.JTextField txt_diabetic;
    private javax.swing.JTextField txt_gender;
    private javax.swing.JTextField txt_house;
    private javax.swing.JTextField txt_medical_record_no;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
