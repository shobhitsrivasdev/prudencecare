/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.InsuranceAdminOrganization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Shobhit, rishabagarwal, parvathypillai
 */
public class PatientWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientWorkAreaJPanel
     */
    
JPanel userProcessContainer;
    EcoSystem ecosystem;
     UserAccount account;
     Enterprise enterprise;
     String patient;
     Patient pa;
InsuranceAdminOrganization iOrg;
     
    public PatientWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise,EcoSystem ecosystem,InsuranceAdminOrganization organization) {
         initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.enterprise = enterprise;
        this.iOrg=organization;
        this.account=account;
        for(Patient p : ecosystem.getPatientDirectory().getpatientlist())
        {   
        if(p.getUserAccount().toString().equals(account.getUsername().toString()))  
        { pa=p; 
            }
        
        }
        
        lblUsername.setText(pa.getPatientname());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        btnRegisterForInsurance = new javax.swing.JButton();
        btnEmergency = new javax.swing.JButton();
        btnBookLab = new javax.swing.JButton();
        btnMedReq = new javax.swing.JButton();
        btnPatientHistory = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblUsername1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(236, 239, 246));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setBackground(new java.awt.Color(49, 163, 222));
        jButton3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jButton3.setText("Hospital Appointment ");
        jButton3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jButton3.setContentAreaFilled(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setOpaque(true);
        jButton3.setVerifyInputWhenFocusTarget(false);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 460, 250, 300));

        btnRegisterForInsurance.setBackground(new java.awt.Color(49, 163, 222));
        btnRegisterForInsurance.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnRegisterForInsurance.setText("Insurance Details");
        btnRegisterForInsurance.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRegisterForInsurance.setContentAreaFilled(false);
        btnRegisterForInsurance.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegisterForInsurance.setOpaque(true);
        btnRegisterForInsurance.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegisterForInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterForInsuranceActionPerformed(evt);
            }
        });
        add(btnRegisterForInsurance, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 250, 300));

        btnEmergency.setBackground(new java.awt.Color(49, 163, 222));
        btnEmergency.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnEmergency.setText("Emergency- Ambulance ");
        btnEmergency.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEmergency.setContentAreaFilled(false);
        btnEmergency.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmergency.setOpaque(true);
        btnEmergency.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmergencyActionPerformed(evt);
            }
        });
        add(btnEmergency, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 250, 300));

        btnBookLab.setBackground(new java.awt.Color(49, 163, 222));
        btnBookLab.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnBookLab.setText("Book Appointment for Lab");
        btnBookLab.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBookLab.setContentAreaFilled(false);
        btnBookLab.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBookLab.setOpaque(true);
        btnBookLab.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBookLab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookLabActionPerformed(evt);
            }
        });
        add(btnBookLab, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 250, 300));

        btnMedReq.setBackground(new java.awt.Color(49, 163, 222));
        btnMedReq.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnMedReq.setText("Send Medicine Request");
        btnMedReq.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnMedReq.setContentAreaFilled(false);
        btnMedReq.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMedReq.setOpaque(true);
        btnMedReq.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMedReq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedReqActionPerformed(evt);
            }
        });
        add(btnMedReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 460, 250, 300));

        btnPatientHistory.setBackground(new java.awt.Color(49, 163, 222));
        btnPatientHistory.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnPatientHistory.setText("Patient History");
        btnPatientHistory.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPatientHistory.setContentAreaFilled(false);
        btnPatientHistory.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPatientHistory.setOpaque(true);
        btnPatientHistory.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPatientHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientHistoryActionPerformed(evt);
            }
        });
        add(btnPatientHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 70, 250, 300));

        jPanel2.setBackground(new java.awt.Color(49, 163, 222));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));

        lblUsername.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("<Value>");

        lblUsername1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblUsername1.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername1.setText("WELCOME");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblUsername1)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblUsername)
                        .addGap(59, 59, 59))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(466, 466, 466)
                        .addComponent(jLabel9))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(lblUsername1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUsername)))
                .addContainerGap(384, Short.MAX_VALUE))
        );

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 850));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegisterForInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterForInsuranceActionPerformed
        // TODO add your handling code here:
        PatientInsuranceWorkAreaJPanel pfi=new PatientInsuranceWorkAreaJPanel(userProcessContainer,account, ecosystem,iOrg);
        userProcessContainer.add("RegisterForInsuranceJPanel",pfi);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRegisterForInsuranceActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        for(Patient p:ecosystem.getPatientDirectory().getpatientlist()){
            if(p.getUserName().equals(account.getUsername())){
               
               if( p.getInsurance()==null){
                   JOptionPane.showMessageDialog(null,"Please register with an insurance first!", "Warning", JOptionPane.WARNING_MESSAGE);
               }else{
            
         HospitalAppointment seeResultJPanel=new HospitalAppointment(userProcessContainer,account, ecosystem);
        userProcessContainer.add("HospitalAppointment",seeResultJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
               }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnBookLabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookLabActionPerformed
        // TODO add your handling code here:
        for(Patient p:ecosystem.getPatientDirectory().getpatientlist()){
            if(p.getUserName().equals(account.getUsername())){
                
               if( p.getInsurance()==null){
                   JOptionPane.showMessageDialog(null,"Please register with an insurance first", "Warning", JOptionPane.WARNING_MESSAGE);
               }else{
        BookLabJPanel bookLabJPanel=new BookLabJPanel(userProcessContainer,account, enterprise,ecosystem);
        userProcessContainer.add("bookLabJPanel",bookLabJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
               }
            }
        }
    }//GEN-LAST:event_btnBookLabActionPerformed

    private void btnMedReqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedReqActionPerformed
        // TODO add your handling code here:
        for(Patient p:ecosystem.getPatientDirectory().getpatientlist()){
            if(p.getUserName().equals(account.getUsername())){
                  if( p.getInsurance()==null){
                   JOptionPane.showMessageDialog(null,"Please register with an insurance first!", "Warning", JOptionPane.WARNING_MESSAGE);
               }else{RequestMedicineJPanel reqMedJPanel=new RequestMedicineJPanel(userProcessContainer,account, enterprise,ecosystem);
        userProcessContainer.add("reqMedJPanel",reqMedJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
               }
            }
        }
    }//GEN-LAST:event_btnMedReqActionPerformed

    private void btnPatientHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientHistoryActionPerformed
        // TODO add your handling code here:
        PatientHistoryJPanel phjp = new PatientHistoryJPanel(userProcessContainer,account,ecosystem);
        userProcessContainer.add("reqMedJPanel",phjp);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnPatientHistoryActionPerformed

    private void btnEmergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmergencyActionPerformed
        // TODO add your handling code here:
         for(Patient p:ecosystem.getPatientDirectory().getpatientlist()){
            if(p.getUserName().equals(account.getUsername())){
                  if( p.getInsurance()==null){
                   JOptionPane.showMessageDialog(null,"Primary hospital is mandatory for emergency request!", "Warning", JOptionPane.WARNING_MESSAGE);
               }
                  else
                  {
        EmergencyJPanel emergencyJPanel=new EmergencyJPanel(userProcessContainer,account,ecosystem);
        userProcessContainer.add("emergencyJPanel",emergencyJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
                  }
            }
         }
    }//GEN-LAST:event_btnEmergencyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBookLab;
    private javax.swing.JButton btnEmergency;
    private javax.swing.JButton btnMedReq;
    private javax.swing.JButton btnPatientHistory;
    private javax.swing.JButton btnRegisterForInsurance;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblUsername1;
    // End of variables declaration//GEN-END:variables
}
