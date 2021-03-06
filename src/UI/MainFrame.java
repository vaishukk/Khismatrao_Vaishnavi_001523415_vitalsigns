/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javamainclass.AbPatientHistory;
import javamainclass.appointmenthistory;
import javamainclass.carsdata;
import javamainclass.patienthistory;



/**
 *
 * @author sanik
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    patienthistory PatientHistory;
    appointmenthistory encounterhistory;
    carsdata data;
    AbPatientHistory abpatienthistory;
    public MainFrame() {
        initComponents();
        this.data=new carsdata();
        this.encounterhistory = new appointmenthistory();
        this.PatientHistory = new patienthistory();
        this.abpatienthistory = new AbPatientHistory();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Splitpane = new javax.swing.JSplitPane();
        CreateArea = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnvital = new javax.swing.JButton();
        viewPatient_btn = new javax.swing.JButton();
        abcomparison = new javax.swing.JButton();
        WorkArea = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CreateArea.setBackground(new java.awt.Color(153, 0, 102));

        btnCreate.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnCreate.setText("CREATE");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnView.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnView.setText(" DISPLAY PERSON PROFILE");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton1.setText("DISPLAY APPOINTMENTS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButton2.setText("SCHEDULE DOCTOR APPOINTMEMNT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnvital.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnvital.setText("ADD PERSON TO PATIENT");
        btnvital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvitalActionPerformed(evt);
            }
        });

        viewPatient_btn.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        viewPatient_btn.setText("VIEW PATIENT");
        viewPatient_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPatient_btnActionPerformed(evt);
            }
        });

        abcomparison.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        abcomparison.setText("VIEW COMPARISON");
        abcomparison.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abcomparisonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CreateAreaLayout = new javax.swing.GroupLayout(CreateArea);
        CreateArea.setLayout(CreateAreaLayout);
        CreateAreaLayout.setHorizontalGroup(
            CreateAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateAreaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CreateAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnvital, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewPatient_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(abcomparison, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        CreateAreaLayout.setVerticalGroup(
            CreateAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateAreaLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnCreate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnView)
                .addGap(18, 18, 18)
                .addComponent(btnvital)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(viewPatient_btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(abcomparison)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        Splitpane.setLeftComponent(CreateArea);

        WorkArea.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout WorkAreaLayout = new javax.swing.GroupLayout(WorkArea);
        WorkArea.setLayout(WorkAreaLayout);
        WorkAreaLayout.setHorizontalGroup(
            WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        WorkAreaLayout.setVerticalGroup(
            WorkAreaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );

        Splitpane.setRightComponent(WorkArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Splitpane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Splitpane, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        CreatePanel createPanel = new CreatePanel(data);
        Splitpane.setRightComponent(createPanel);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        ViewPanel viewPanel = new ViewPanel(data);
        Splitpane.setRightComponent(viewPanel);
    }//GEN-LAST:event_btnViewActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ViewAppointment schedule = new ViewAppointment(data, PatientHistory, encounterhistory);
        Splitpane.setRightComponent(schedule);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Appointment appointmentpanel = new Appointment(data,encounterhistory, PatientHistory);
        Splitpane.setRightComponent(appointmentpanel);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnvitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvitalActionPerformed
        // TODO add your handling code here:
         AddPatient addpatient = new AddPatient(data,PatientHistory);
        Splitpane.setRightComponent(addpatient);
    }//GEN-LAST:event_btnvitalActionPerformed

    private void viewPatient_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPatient_btnActionPerformed
        // TODO add your handling code here:
         Patient viewpatient= new Patient(data,PatientHistory);
        Splitpane.setRightComponent(viewpatient);
    }//GEN-LAST:event_viewPatient_btnActionPerformed

    private void abcomparisonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abcomparisonActionPerformed
        // TODO add your handling code here:
        PatientComparison abpatient= new PatientComparison(data,PatientHistory,encounterhistory,abpatienthistory);
        Splitpane.setRightComponent(abpatient);
        
    }//GEN-LAST:event_abcomparisonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CreateArea;
    private javax.swing.JSplitPane Splitpane;
    private javax.swing.JPanel WorkArea;
    private javax.swing.JButton abcomparison;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnView;
    private javax.swing.JButton btnvital;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton viewPatient_btn;
    // End of variables declaration//GEN-END:variables
}
