/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DoctorRole;

import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AdminOrganization;
import Business.Organization.DoctorOrganization;
import static Business.Organization.Organization.Type.Doctor;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientHospitalAppointmentWorkRequest;
import java.awt.CardLayout;
import java.util.Date;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.PatientRole.PatientHistoryJPanel;

/**
 *
 * @author Shobhit, rishabagarwal, parvathypillai
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorRole
     */
      JPanel userProcessContainer;
    EcoSystem ecosystem;
      UserAccount account;
      Enterprise enterprise;
      UserAccount patient;
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, AdminOrganization AdminOrganization, Enterprise enterprise,EcoSystem ecosystem) {
        initComponents();
         this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        this.account=account;
        this.enterprise=enterprise;
        DocName.setText(account.getEmployee().getName());
        DocName1.setText(enterprise.getName());
        populateTable();
    }
    
     public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        for (PatientHospitalAppointmentWorkRequest request : ecosystem.getHospitalQueue().hospitalRequestList()) {
          if(request.getDoctor()==null)
          {System.out.println(account.getEmployee().getName());
          }else{
          
             
            if (request.getDoctor().equals(account.getUsername())) {
                if(!(request.getStatus().equals("Appointment declined"))){
                String message;
                if (request.getResult() == null) {
                    message = "Not available yet";
                } else {
                    message = request.getResult();
                }
            
            Object[] row = new Object[7];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getAppDate();
            row[3] = request.getTime();
            row[4] = request.getStatus();
            row[5] = request.getMessage();
            row[6] = message;
            model.addRow(row);
            patient = request.getSender();
        }
            }
        }
        }
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
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnCheckPatient = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnAvailability = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        DocName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        DocName1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "AppointmentNo.", "Patient name", "Date", "Time", "Status", "PatientCondition", "Result"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(5).setResizable(false);
            jTable1.getColumnModel().getColumn(6).setResizable(false);
        }

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setText("View Patient History");
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnCheckPatient.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnCheckPatient.setForeground(new java.awt.Color(0, 102, 102));
        btnCheckPatient.setText("Check Patient ");
        btnCheckPatient.setBorderPainted(false);
        btnCheckPatient.setContentAreaFilled(false);
        btnCheckPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckPatientActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Appointment request");

        btnAvailability.setBackground(new java.awt.Color(49, 163, 222));
        btnAvailability.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAvailability.setForeground(new java.awt.Color(0, 102, 102));
        btnAvailability.setText("Availability");
        btnAvailability.setBorderPainted(false);
        btnAvailability.setContentAreaFilled(false);
        btnAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailabilityActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("(To be update weekly)");

        btnView.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnView.setForeground(new java.awt.Color(0, 102, 102));
        btnView.setText("Update Doctor Profile");
        btnView.setBorderPainted(false);
        btnView.setContentAreaFilled(false);
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(49, 163, 222));

        DocName.setBackground(new java.awt.Color(255, 255, 255));
        DocName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DocName.setText("<value>");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Doctor Work Panel");

        jLabel3.setBackground(new java.awt.Color(49, 163, 222));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Hospital:");

        DocName1.setBackground(new java.awt.Color(255, 255, 255));
        DocName1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DocName1.setText("<value>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DocName, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(DocName1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(DocName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(DocName1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(btnView)
                        .addGap(65, 65, 65)
                        .addComponent(btnAvailability)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(btnCheckPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(508, 508, 508)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnAvailability)
                    .addComponent(jLabel2))
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCheckPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(355, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         PatientHistoryJPanel phjp = new PatientHistoryJPanel(userProcessContainer,patient,ecosystem);
        userProcessContainer.add("reqMedJPanel",phjp);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnCheckPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckPatientActionPerformed
        // TODO add your handling code here:
        boolean patientActive = false;
        for (PatientHospitalAppointmentWorkRequest w : ecosystem.getHospitalQueue().hospitalRequestList()) {
            Map<String, Date> map = w.getStatusMap();
            String latestKey = "";
            for (Map.Entry<String, Date> mapEntry : w.getStatusMap().entrySet()) {
                if (latestKey.equals("")) {
                    latestKey = mapEntry.getKey();
                }
                if ((map.get(latestKey).compareTo(map.get(mapEntry.getKey()))) < 0) {
                    latestKey = mapEntry.getKey();
                }
            }
            if (latestKey.equals("Checking Patient")) {
                patientActive = true;
            }
        }
        
        
        
        
        if (patientActive == true) {
            JOptionPane.showMessageDialog(null, "Already one patient being handled!\nPlease complete the appointment with existing patient to handle next patient", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);

        } else if (patientActive == false) {
            PatientHospitalAppointmentWorkRequest request = (PatientHospitalAppointmentWorkRequest) jTable1.getValueAt(selectedRow, 0);

            if (request.getStatus().equals("Consultation completed")) {
                JOptionPane.showMessageDialog(null, "Appointment already consulted", "Warning", JOptionPane.WARNING_MESSAGE);

            } else {

                Map<String, Date> reqMap = request.getStatusMap();
                reqMap.put("Checking Patient", new Date());
                request.setStatusMap(reqMap);
                request.setStatus("Checking Patient");
                ecosystem.getHospitalQueue().updateHospitalRequest(request, ecosystem.getHospitalQueue().hospitalRequestList());
                RequestLabTestJPanel ppanel = new RequestLabTestJPanel(userProcessContainer, account, enterprise, ecosystem, request);
                userProcessContainer.add("RequestLabTestJPanel", ppanel);
                CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
    }//GEN-LAST:event_btnCheckPatientActionPerformed

    private void btnAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailabilityActionPerformed
        // TODO add your handling code here:
        for (Doctor d : ecosystem.getDoctorDirectory().getdoctorlist()) {

            if (d.getUserName().equals(account.getUsername())) {
                if (d.getHospital() == null) {
                    JOptionPane.showMessageDialog(null, "Please update the doctor details first");
                } else {
                    DoctorAvailability da = new DoctorAvailability(userProcessContainer, account, ecosystem);
                    userProcessContainer.add("DoctorAvailability", da);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);

                }
            }
        }
        
        
       
    }//GEN-LAST:event_btnAvailabilityActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        for(Doctor d :ecosystem.getDoctorDirectory().getdoctorlist()){
            System.out.println(" doc user name "+d.getUserName());
            System.out.println(" doc account user name "+account.getUsername());
        if(d.getUserName().equals(account.getUsername())){
        ViewDoctorProfileJPanel panel = new ViewDoctorProfileJPanel(userProcessContainer,account,enterprise,ecosystem,d);
        userProcessContainer.add("DoctorProfileUpdateJPanel", panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);}
        }
        
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DocName;
    private javax.swing.JLabel DocName1;
    private javax.swing.JButton btnAvailability;
    private javax.swing.JButton btnCheckPatient;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
