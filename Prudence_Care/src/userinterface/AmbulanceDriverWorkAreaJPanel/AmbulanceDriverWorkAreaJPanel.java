/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AmbulanceDriverWorkAreaJPanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AdminOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EmergencyRequest;
import java.awt.Font;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import userinterface.PatientRole.EmergencyJPanel;

/**
 *
 * @author rishabagarwal
 */
public class AmbulanceDriverWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AmbulanceDriverWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private EcoSystem ecosystem;
    private Enterprise enterprise;
    public AmbulanceDriverWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ecosystem = ecosystem;
        this.enterprise = enterprise;
        this.setSize(1466, 902);
        populateTable();
                      DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(java.awt.Color.BLACK);
         headerRenderer.setForeground(java.awt.Color.WHITE);

        for (int i = 0; i < emerTable.getModel().getColumnCount(); i++) {
            emerTable.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
        emerTable.setShowGrid(true);
       emerTable.getTableHeader().setFont(new Font("SansSerif 14 Plain",Font.BOLD,16));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void populateTable(){
       DefaultTableModel model = (DefaultTableModel)emerTable.getModel();
        model.setRowCount(0);

        for(EmergencyRequest req: account.getEmergencyQueue().getEmergencyRequestList()){
            Object row[] = new Object[8];
                 row[0] = req;
                 row[1] = req.getSender();
                 row[2] = req.getCreateDate();
                 row[3] =req.getHospital();
                 row[4] = req.getMsg();
                 row[5] = req.getResult();
                 

                 
                 
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

        jScrollPane1 = new javax.swing.JScrollPane();
        emerTable = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        emerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "RequestID", "Patient", "CreateDate", "Hospital", "Message"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(emerTable);

        btnUpdate.setBackground(new java.awt.Color(49, 163, 222));
        btnUpdate.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE STATUS");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(49, 163, 222));
        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Get Current Location");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setText("AMBULANCE DRIVER PORTAL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1085, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(333, 333, 333))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(166, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = emerTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        EmergencyRequest eReq= (EmergencyRequest)emerTable.getValueAt(selectedRow, 0);
        eReq.setResult("CompletedRequest!");
        JOptionPane.showMessageDialog(null, "Patient reached Hospital successfully!", "Information", JOptionPane.INFORMATION_MESSAGE);
        Map<String,Date> reqMap = eReq.getStatusMap();
        reqMap.put("Patient Admitted to Hospital -"+eReq.getHospital(), new Date());
        reqMap.put("Patient Admitted", new Date());
        eReq.setStatusMap(reqMap);
        ecosystem.getEmergencyQueue().updateEmergencyRequest(eReq, ecosystem.getEmergencyQueue().getEmergencyRequestList());
        account.getEmergencyQueue().removeEmergencyRequest(eReq);
        populateTable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                int selectedRow = emerTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a request to check location!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        EmergencyRequest eReq= (EmergencyRequest)emerTable.getValueAt(selectedRow, 0);
        String url = "https://www.google.com/maps/place/"+eReq.getLocation();
    try {
        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
    } catch (IOException ex) {
        Logger.getLogger(EmergencyJPanel.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTable emerTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
