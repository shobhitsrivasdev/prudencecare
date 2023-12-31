/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.Doctor.Doctor;
import Business.EcoSystem;
import static Business.Organization.Organization.Type.Doctor;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import static java.util.concurrent.TimeUnit.DAYS;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author rishabagarwal
 */
public class DoctorAvailability extends javax.swing.JPanel {

    /**
     * Creates new form DoctorAvailability
     */
    JPanel userProcessContainer; 
    UserAccount account;
    EcoSystem ecosystem;
    Date dfrom;
    Date dto;

    public DoctorAvailability(JPanel userProcessContainer, UserAccount account,EcoSystem ecosystem) {
        initComponents();
        this.ecosystem=ecosystem;
        this.account=account;
        this.userProcessContainer=userProcessContainer;
        //dateFrom.setDate(new Date());
//        dateTo.setDate(new Date());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jComboTime = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(49, 163, 222));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Available Time:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 248, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Available Date From:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 102, -1, -1));

        btnSubmit.setBackground(new java.awt.Color(49, 163, 222));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 171, 204, 42));

        jComboTime.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jComboTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00 - 16:00", "16:00 - 23:00", "01:00 - 08:00", "LEAVE" }));
        jComboTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTimeActionPerformed(evt);
            }
        });
        add(jComboTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 245, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Available Date To:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 102, -1, -1));

        jPanel1.setBackground(new java.awt.Color(49, 163, 222));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Available For Slots");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/back.png"))); // NOI18N
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(227, 227, 227)
                .addComponent(btnBack)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(14, 14, 14))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void dateFromMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateFromMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2)
        {
        

        }   
    }//GEN-LAST:event_dateFromMouseClicked

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        ArrayList<String>dummyArray = null;
        HashMap<LocalDate,ArrayList<String>>appointment=new HashMap<LocalDate,ArrayList<String>>();
       // dfrom=dateFrom.getDate();
        //dto=dateTo.getDate();
        String t = (String) jComboTime.getSelectedItem();
        for (Doctor doc : ecosystem.getDoctorDirectory().getdoctorlist()) {
            if (doc.getUserName().equals(account.getUsername())) {
                doc.setDateFrom(dfrom);
                doc.setDateTo(dto);
                doc.setTime(t);
                doc.removeAllTimeSlot();
                if (doc.getTime().equals("08:00 - 16:00")) {
                    String from = "08:00:00", to = "16:00:00";
                    LocalTime fromTime = LocalTime.parse(from), toTime = LocalTime.parse(to);

                    for (LocalTime counter = fromTime;counter.compareTo(toTime) <= 0;counter = counter.plusMinutes(30)) {
                        doc.addTimeSlot(counter.toString());
                        
                    }

                }else if(doc.getTime().equals("16:00 - 23:00")){
                    String from = "16:00:00", to = "23:00:00";
                    LocalTime fromTime = LocalTime.parse(from), toTime = LocalTime.parse(to);

                    for (LocalTime counter = fromTime;
                            counter.compareTo(toTime) <= 0;
                            counter = counter.plusMinutes(30)) {
                        doc.addTimeSlot(counter.toString());
                        
                    }
            }else if(doc.getTime().equals("01:00 - 08:00")){
                    String from = "00:00:00", to = "08:00:00";
                    LocalTime fromTime = LocalTime.parse(from), toTime = LocalTime.parse(to);

                    for (LocalTime counter = fromTime;
                            counter.compareTo(toTime) <= 0;
                            counter = counter.plusMinutes(30)) {
                        doc.addTimeSlot(counter.toString());
                      
                    }
            }
            
            LocalDate dFrom=new java.sql.Date(dfrom.getTime()).toLocalDate();
            LocalDate dTo=new java.sql.Date(dto.getTime()).toLocalDate();
            
            for (LocalDate date = dFrom; date.isBefore(dTo.plusDays(1)); date = date.plusDays(1))
            {
            appointment.put(date,doc.getTimeSlotList());
            }
            
            doc.setAppointment(appointment);
          
            
        }
                  
        } JOptionPane.showMessageDialog(null, "Successfully Submitted");

                                           

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jComboTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboTimeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> jComboTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
