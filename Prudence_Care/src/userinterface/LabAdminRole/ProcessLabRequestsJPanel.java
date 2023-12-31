/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LaboratoryOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.LabPatientWorkRequest;
import Business.WorkQueue.VaccineWorkRequest;
import java.awt.CardLayout;
import java.awt.Font;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import userinterface.AdministrativeRole.ManageEmployeeJPanel;
import userinterface.AdministrativeRole.ManageOrgJPanel;
import userinterface.AdministrativeRole.ManageOrganizationJPanel;
import userinterface.AdministrativeRole.ManageUserAccountJPanel;


/**
 *
 * @author Shobhit, rishabagarwal, parvathy pillai
 */
public class ProcessLabRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount account;
    LaboratoryOrganization organization;
    EcoSystem business;
    public ProcessLabRequestsJPanel(JPanel userProcessContainer, UserAccount account, LaboratoryOrganization LabOrganization, Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.business = business;
        this.organization = LabOrganization;
        this.setSize(1466, 902);
        lblAccount.setText("Logged in as: "+account.getUsername());
        populateLabTests();
        populateStaffBox();
              DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(java.awt.Color.BLACK);
         headerRenderer.setForeground(java.awt.Color.WHITE);

        for (int i = 0; i < labTestingTable.getModel().getColumnCount(); i++) {
            labTestingTable.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
        labTestingTable.setShowGrid(true);
       labTestingTable.getTableHeader().setFont(new Font("SansSerif 14 Plain",Font.BOLD,16));
    }
    
    public void populateStaffBox(){
        staffComboBox.removeAllItems();
         staffComboBox.addItem("");
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                   if(ua.getRole().toString().equals("LabStaff")){
                staffComboBox.addItem(ua);
                }
            }
                 }
    }
    public void populateLabTests(){
                DefaultTableModel model = (DefaultTableModel)labTestingTable.getModel();
        model.setRowCount(0);
        for(LabPatientWorkRequest work : account.getLabPatientWorkQueue().getLabPatientRequestList()){
                            Object[] row = new Object[8];
                    row[0] = work;
                    row[1] = work.getLabTestType();
                    row[2] = work.getPatient();
                     row[3] = work.getSlotDate();
                    row[4] = work.getSlotTime();
                    row[5] = work.getMessage();

                    model.addRow(row);  
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        labTestingTable = new javax.swing.JTable();
        btnAssignLabReq1 = new javax.swing.JButton();
        staffComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        lblAccount = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(49, 163, 222));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Upcoming Lab Tests:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        labTestingTable.setBackground(new java.awt.Color(182, 220, 237));
        labTestingTable.setForeground(new java.awt.Color(0, 102, 102));
        labTestingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "LabID", "TestName", "PatientName", "Date", "Time", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(labTestingTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 155, 922, 265));

        btnAssignLabReq1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAssignLabReq1.setText("Assign Lab Requests");
        btnAssignLabReq1.setBorderPainted(false);
        btnAssignLabReq1.setContentAreaFilled(false);
        btnAssignLabReq1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignLabReq1ActionPerformed(evt);
            }
        });
        add(btnAssignLabReq1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 542, -1, 42));

        staffComboBox.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        staffComboBox.setForeground(new java.awt.Color(0, 102, 102));
        staffComboBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        staffComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffComboBoxActionPerformed(evt);
            }
        });
        add(staffComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(972, 548, 144, 32));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(49, 163, 222));
        jLabel3.setText("TestingStaff");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(892, 556, -1, -1));

        lblAccount.setBackground(new java.awt.Color(51, 51, 51));
        lblAccount.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblAccount.setText("Enterprise:");
        lblAccount.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        add(lblAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(593, 15, 210, 30));

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/back.png"))); // NOI18N
        backJButton.setBorderPainted(false);
        backJButton.setContentAreaFilled(false);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(954, 0, 162, 44));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignLabReq1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignLabReq1ActionPerformed
        // TODO add your handling code here:
        if(staffComboBox.getSelectedItem().equals("")){
            JOptionPane.showMessageDialog(null, "Please select a Lab Testing staff!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int selectedRow = labTestingTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a Lab Test from table!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        LabPatientWorkRequest labReq= (LabPatientWorkRequest)labTestingTable.getValueAt(selectedRow, 0);
        UserAccount ua = (UserAccount)staffComboBox.getSelectedItem();
        labReq.setReceiver(ua);
        Map<String,Date> reqMap = labReq.getStatusMap();
        reqMap.put("Request Assigned to Staff-"+ua, new Date());
        labReq.setStatusMap(reqMap);
        ua.getLabPatientWorkQueue().addLabPatientRequest(labReq);
        account.getLabPatientWorkQueue().removeLabPatientRequest(labReq);
        business.getLabPatQueue().updateLabPatientRequest(labReq, business.getLabPatQueue().getLabPatientRequestList());
        JOptionPane.showMessageDialog(null, "Lab test assigned Successfully!", "Information", JOptionPane.INFORMATION_MESSAGE);
        populateLabTests();
    }//GEN-LAST:event_btnAssignLabReq1ActionPerformed

    private void staffComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffComboBoxActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnAssignLabReq1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable labTestingTable;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JComboBox staffComboBox;
    // End of variables declaration//GEN-END:variables
}
