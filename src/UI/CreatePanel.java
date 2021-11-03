/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javamainclass.carsdata;
import javamainclass.cars;
import javax.swing.JOptionPane;



/**
 *
 * @author sanik
 */
public class CreatePanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePanel
     */
    carsdata data;
    
    public String gender;
    public CreatePanel(carsdata data) {
        initComponents();
        this.data=data;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblmodelname = new javax.swing.JLabel();
        lblmanufacturer = new javax.swing.JLabel();
        lblmanufactureryr = new javax.swing.JLabel();
        lblseats = new javax.swing.JLabel();
        lblmaintainencedate = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txthouse = new javax.swing.JTextField();
        txtage = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblmodel = new javax.swing.JLabel();
        lblmanu = new javax.swing.JLabel();
        lblmanuyr = new javax.swing.JLabel();
        lblseatss = new javax.swing.JLabel();
        checkbox_no = new javax.swing.JRadioButton();
        checkbox_yes = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        checkbox_other = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        txt_PERSONID = new javax.swing.JTextField();
        txt_city = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        lblmodelname.setText("NAME");

        lblmanufacturer.setText("HOUSE");

        lblmanufactureryr.setText("AGE");

        lblseats.setText("COMMUNITY");

        lblmaintainencedate.setText("GENDER");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnameKeyReleased(evt);
            }
        });

        txthouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthouseActionPerformed(evt);
            }
        });
        txthouse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txthouseKeyReleased(evt);
            }
        });

        txtage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtageActionPerformed(evt);
            }
        });
        txtage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtageKeyReleased(evt);
            }
        });

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 0, 102));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ENTER PERSON DETAILS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        checkbox_no.setText("FEMALE");
        checkbox_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_noActionPerformed(evt);
            }
        });

        checkbox_yes.setText("MALE");
        checkbox_yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_yesActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ZIP 02215(Community 1)", "ZIP 02115(Community 2)" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        checkbox_other.setText("OTHERS");
        checkbox_other.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkbox_otherActionPerformed(evt);
            }
        });

        jLabel1.setText("PERSON ID");

        txt_PERSONID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_PERSONIDKeyReleased(evt);
            }
        });

        jLabel3.setText("CITY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSave)
                                .addGap(140, 140, 140))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblmaintainencedate, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblmanufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lblmanufactureryr, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lblmodelname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblseats, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(117, 117, 117)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txthouse)
                                        .addComponent(txtage)
                                        .addComponent(txtname, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 228, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(checkbox_no)
                                            .addGap(18, 18, 18)
                                            .addComponent(checkbox_yes)
                                            .addGap(18, 18, 18)
                                            .addComponent(checkbox_other))
                                        .addComponent(txt_PERSONID))
                                    .addComponent(txt_city, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblseatss, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                            .addComponent(lblmanuyr, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblmanu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblmodel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(503, 503, 503))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txt_PERSONID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtname)
                            .addComponent(lblmodel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txthouse)
                            .addComponent(lblmanu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblmodelname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblmanufacturer)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblmanufactureryr, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(lblmanuyr, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblseatss, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblseats))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblmaintainencedate, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(checkbox_no)
                                .addComponent(checkbox_yes)
                                .addComponent(checkbox_other)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_city, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnSave)
                .addGap(436, 436, 436))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtageActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtageActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed
   
    private void txtnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyReleased
        // TODO add your handling code here:
        String SEQUENCE="^[a-zA-Z]{0,30}$";
        Pattern patt= Pattern.compile(SEQUENCE);
        Matcher match=patt.matcher(txtname.getText());
        if(!match.matches()) {
            lblmodel.setText("Please check the entered data");
             btnSave.setEnabled(false);
        }
         else{
            lblmodel.setText(null);
            btnSave.setEnabled(true);
        }
    }//GEN-LAST:event_txtnameKeyReleased

    private void txthouseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthouseKeyReleased
        // TODO add your handling code here:
        String SEQUENCE="^[,a-zA-Z0-9 ]{0,20}$";
        Pattern patt= Pattern.compile(SEQUENCE);
        Matcher match=patt.matcher(txthouse.getText());
        if(!match.matches()) {
        lblmanu.setText("Please check the entered data");
         btnSave.setEnabled(false);}
         else {
            lblmanu.setText(null);
            btnSave.setEnabled(true);
        }
        
    }//GEN-LAST:event_txthouseKeyReleased

    private void txthouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthouseActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txthouseActionPerformed

    private void txtageKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtageKeyReleased
        // TODO add your handling code here:
        String SEQUENCE="^[0-9]{0,2}$";
        Pattern mat=Pattern.compile(SEQUENCE);
        Matcher match= mat.matcher(txtage.getText());
        if(!match.matches()) {
            lblmanuyr.setText("Please check the entered data");
            btnSave.setEnabled(false);
        }
         else{
            lblmanuyr.setText(null);
            btnSave.setEnabled(true);
        }
                          
    }//GEN-LAST:event_txtageKeyReleased

    private void checkbox_yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_yesActionPerformed
        // TODO add your handling code here:
        if(checkbox_yes.isSelected()){
            checkbox_no.setSelected(false);
            checkbox_other.setSelected(false);
        }
        
    }//GEN-LAST:event_checkbox_yesActionPerformed

    private void checkbox_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_noActionPerformed
        // TODO add your handling code here:
        if(checkbox_no.isSelected()){
            checkbox_yes.setSelected(false);
            checkbox_other.setSelected(false);
        }
    }//GEN-LAST:event_checkbox_noActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

       String PersonID = txt_PERSONID.getText();
        if (checkbox_no.isSelected()){
                gender= checkbox_no.getText();
        }               
        else if  (checkbox_yes.isSelected()){
                gender=checkbox_yes.getText();
        }
        else if (checkbox_other.isSelected()) {
            gender= checkbox_other.getText();
        } 
        
        for (cars c : data.getData()){
            if(c.getPersonID().contains(PersonID)){
                JOptionPane.showMessageDialog(this,"Person already exists. Please enter another person details");
                  return;
            }
            else
                break;
        }

        if ( txt_PERSONID.getText().length()<=0|| txt_city.getText().length()<=0|| txtname .getText().length()<=0 || txthouse.getText().length()<=0 ||  txtage.getText().length()<=0 || txt_city.getText().length()<=0 || txt_PERSONID.getText().length()<0)
        {
            JOptionPane.showMessageDialog(this,"One of more field are empty");

        }
        else

        {
            String personId = txt_PERSONID.getText();
            String name=txtname.getText();
            String house = txthouse.getText();
            int age=Integer.parseInt(txtage.getText());
            String selectedcommunity = jComboBox1.getSelectedItem().toString();
            String city = txt_city.getText();
            
            cars c =data.addNewcar();
            
            c.setPersonID(personId);
            c.setName(name);
            c.setHouse(house);
            c.setCommunity(selectedcommunity);
            c.setAge(age);
            c.setGender(gender);
            //c.setLocation(selectedcommunity);
            c.setCity(city);

            JOptionPane.showMessageDialog(this,"New Person Information saved.");

            txtname.setText("");
            txt_city.setText("");
            txt_PERSONID.setText("");
            txthouse.setText("");
            txtage.setText("");
            checkbox_no.setSelected(false);
            checkbox_yes.setSelected(false);
            checkbox_other.setSelected(false);
            jComboBox1.setSelectedItem("ZIP 02215(Community 1)");

        }

    }//GEN-LAST:event_btnSaveActionPerformed

    private void checkbox_otherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkbox_otherActionPerformed
        // TODO add your handling code here:
        if(checkbox_other.isSelected()){
            checkbox_no.setSelected(false);
            checkbox_yes.setSelected(false);
        }
    }//GEN-LAST:event_checkbox_otherActionPerformed

    private void txt_PERSONIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_PERSONIDKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PERSONIDKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JRadioButton checkbox_no;
    private javax.swing.JRadioButton checkbox_other;
    private javax.swing.JRadioButton checkbox_yes;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblmaintainencedate;
    private javax.swing.JLabel lblmanu;
    private javax.swing.JLabel lblmanufacturer;
    private javax.swing.JLabel lblmanufactureryr;
    private javax.swing.JLabel lblmanuyr;
    private javax.swing.JLabel lblmodel;
    private javax.swing.JLabel lblmodelname;
    private javax.swing.JLabel lblseats;
    private javax.swing.JLabel lblseatss;
    private javax.swing.JTextField txt_PERSONID;
    private javax.swing.JTextField txt_city;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txthouse;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
