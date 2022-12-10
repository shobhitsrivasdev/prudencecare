package UserInterface.LabWorker;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.LaboratoryOrganization;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ClaimWorkRequest;
import Business.WorkQueue.LabPatientWorkRequest;
import Enterprise.Enterprise;
import java.awt.CardLayout;
import java.awt.Font;
import java.util.Date;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rishabagarwal
 */
public class LabWorkerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabWorkerJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;  
    private UserAccount account;
    Enterprise enterprise;
    public LabWorkerJPanel(JPanel userProcessContainer, EcoSystem business,UserAccount account, LaboratoryOrganization LabOrganization, Enterprise enterprise) {
        initComponents();
         this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.account = account;
        this.enterprise=enterprise;
        populateTestingTable();
                this.setSize(1466, 902);
                        lblName.setText(account.getEmployee().getName());
        lblRole.setText("Laboratory Staff");
        lblEnterprise.setText(enterprise.getName());
        lblAccount.setText("Logged in as: "+account.getUsername());
              DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(java.awt.Color.BLACK);
         headerRenderer.setForeground(java.awt.Color.WHITE);

        for (int i = 0; i < labTestingTable.getModel().getColumnCount(); i++) {
            labTestingTable.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
        labTestingTable.setShowGrid(true);
       labTestingTable.getTableHeader().setFont(new Font("SansSerif 14 Plain",Font.BOLD,16));
    }



    public void populateTestingTable(){
        DefaultTableModel model = (DefaultTableModel)labTestingTable.getModel();
        model.setRowCount(0);
        for(LabPatientWorkRequest work : account.getLabPatientWorkQueue().getLabPatientRequestList()){
                                Map<String,Date> map = work.getStatusMap();
                    String latestKey = "";
            for (Map.Entry<String,Date> mapEntry : work.getStatusMap().entrySet()) {  
                if(latestKey.equals("")){
            latestKey = mapEntry.getKey();
                }
                if((map.get(latestKey).compareTo(map.get(mapEntry.getKey()))) < 0){
                    latestKey = mapEntry.getKey();
                }
               }
                            Object[] row = new Object[8];
                    row[0] = work;
                    row[1] = work.getLabTestType();
                    row[2] = work.getPatient();
                     row[3] = work.getSlotDate();
                    row[4] = work.getSlotTime();
                    row[5] = latestKey;
                    row[6] = work.getMessage();

                    model.addRow(row);  
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAssign = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        labTestingTable = new javax.swing.JTable();
        btnProcess = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        lblEnterprise = new javax.swing.JLabel();
        lblAccount = new javax.swing.JLabel();

        setBackground(new java.awt.Color(49, 163, 222));

        btnAssign.setBackground(new java.awt.Color(49, 193, 255));
        btnAssign.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnAssign.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/patient.png"))); // NOI18N
        btnAssign.setText("Conduct Test");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        labTestingTable.setBackground(new java.awt.Color(182, 220, 237));
        labTestingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "LabID", "TestName", "PatientName", "Date", "Time", "Status", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(labTestingTable);

        btnProcess.setBackground(new java.awt.Color(49, 193, 255));
        btnProcess.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnProcess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/treatment_50px.png"))); // NOI18N
        btnProcess.setText("Submit");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(49, 163, 222));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Laboratory Worker");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/labadmin.png"))); // NOI18N

        lblName.setBackground(new java.awt.Color(51, 51, 51));
        lblName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblName.setText("Enterprise:");
        lblName.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblRole.setBackground(new java.awt.Color(51, 51, 51));
        lblRole.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblRole.setText("Enterprise:");
        lblRole.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblEnterprise.setBackground(new java.awt.Color(51, 51, 51));
        lblEnterprise.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblEnterprise.setText("Enterprise:");
        lblEnterprise.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblAccount.setBackground(new java.awt.Color(51, 51, 51));
        lblAccount.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblAccount.setText("Enterprise:");
        lblAccount.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(650, 650, 650)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(650, 650, 650)
                        .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(jLabel2)
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addGap(14, 14, 14)
                .addComponent(lblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(lblEnterprise)))
                .addGap(18, 18, 18)
                .addComponent(lblAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
         int selectedRow = labTestingTable.getSelectedRow();
                 if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a Lab Test from table!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        LabPatientWorkRequest labReq= (LabPatientWorkRequest)labTestingTable.getValueAt(selectedRow, 0);
        Map<String,Date> reqMap = labReq.getStatusMap();
        reqMap.put("LabTesting InProgress-"+labReq.getLabTestType(), new Date());
        labReq.setStatusMap(reqMap);
        UserAccount pat = labReq.getPatient();
        pat.getLabPatientWorkQueue().updateLabPatientRequest(labReq, pat.getLabPatientWorkQueue().getLabPatientRequestList());
        business.getLabPatQueue().updateLabPatientRequest(labReq, business.getLabPatQueue().getLabPatientRequestList());
        populateTestingTable();
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = labTestingTable.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a Lab Test from table!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        LabPatientWorkRequest labReq= (LabPatientWorkRequest)labTestingTable.getValueAt(selectedRow, 0);
        Map<String,Date> reqMap = labReq.getStatusMap();
        reqMap.put("Test Complete-Submitting Results-"+account, new Date());
        labReq.setStatusMap(reqMap);
        UserAccount pat1 = labReq.getPatient();
        pat1.getLabPatientWorkQueue().updateLabPatientRequest(labReq, pat1.getLabPatientWorkQueue().getLabPatientRequestList());
        business.getLabPatQueue().updateLabPatientRequest(labReq, business.getLabPatQueue().getLabPatientRequestList());
        ProcessTestJPanel processTestJPanel = new ProcessTestJPanel(userProcessContainer, account,business,labReq);
        userProcessContainer.add("processTestJPanel", processTestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        Patient patient = null;
        String pat= labReq.getSender().getUsername();
        for(Patient p:business.getPatientDirectory().getpatientlist())
        {if (p.getUserName().equals(pat)){
            patient=p;
        }
        }
        
        ClaimWorkRequest r = new ClaimWorkRequest();
        r.setSender(account);
        r.setPatient(patient);
        r.setRequestDate(new Date());
        r.setCost(150.00);
        r.setStatus("Claim Requested");
        r.setInsurancepolicy(patient.getInsurance());
        r.setHospital(enterprise.toString());
        r.setInsuranceEnterprise(patient.getInsurance().getEnterprise());
        r.setInsuranceNo(patient.getInsuranceOrderNo());
       
       
        
        business.getClaimWorkQueue().getWorkRequestList().add(r);
        account.getClaimWorkQueue().getWorkRequestList().add(r);
        
    }//GEN-LAST:event_btnProcessActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnProcess;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable labTestingTable;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRole;
    // End of variables declaration//GEN-END:variables
}
