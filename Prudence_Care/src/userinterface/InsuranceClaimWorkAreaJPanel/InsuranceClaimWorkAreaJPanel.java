/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.InsuranceClaimWorkAreaJPanel;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.InsurancePolicy.InsurancePolicy;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ClaimWorkRequest;
import Business.WorkQueue.InsuranceWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import userinterface.InsuranceAdminWorkArea.ViewPolicyWorkAreaJPanel;

/**
 *
 * @author rishabagarwal
 */
public class InsuranceClaimWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form InsuranceClaimWorkAreaJPanel
     */
    JPanel userProcessContainer;
    UserAccount account;
    Enterprise enterprise;
    EcoSystem ecosystem;
    
    public InsuranceClaimWorkAreaJPanel(JPanel userProcessContainer, UserAccount account,Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.ecosystem=business;
        this.enterprise=enterprise;
        this.account=account;
        this.userProcessContainer=userProcessContainer;
        
               jScrollPane1.getViewport().setBackground(Color.WHITE);
        UIManager.put("tblClaim.gridColor", new ColorUIResource(Color.BLACK));
       
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.BLACK);
         headerRenderer.setForeground(Color.WHITE);

        for (int i = 0; i < tblClaim.getModel().getColumnCount(); i++) {
            tblClaim.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
        tblClaim.setShowGrid(true);
       tblClaim.getTableHeader().setFont(new Font("SansSerif 14 Plain",Font.BOLD,16));
    
        populate();
    }

    public void populate(){
        DefaultTableModel model = (DefaultTableModel)tblClaim.getModel();
            model.setRowCount(0);
       for(ClaimWorkRequest r : ecosystem.getClaimWorkQueue().getWorkRequestList())
       {   if(r.getInsuranceEnterprise()==null){
       
       } 
       else{
           String enterpriseName=enterprise.toString();
           if(r.getInsuranceEnterprise().equals(enterpriseName))
           { 
             

            Object[] row = new Object[7];
            row[0] = r;
            row[1] = r.getHospital();
            row[2] = r.getCost();
            row[3] = r.getRequestDate();
            row[4] = r.getStatus();
            row[5] = r.getPatient();
            row[6] = r.getInsuranceNo();
            model.addRow(row);
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClaim = new javax.swing.JTable();
        viewPolicy = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(49, 163, 222));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("INSURANCE CLAIM WORK AREA");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 27, -1, -1));

        tblClaim.setBackground(new java.awt.Color(182, 220, 237));
        tblClaim.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Claim Number", "Sender", "Amount", "Date", "Status", "Patient", "InsuranceNumber"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblClaim.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(tblClaim);
        if (tblClaim.getColumnModel().getColumnCount() > 0) {
            tblClaim.getColumnModel().getColumn(0).setResizable(false);
            tblClaim.getColumnModel().getColumn(1).setResizable(false);
            tblClaim.getColumnModel().getColumn(2).setResizable(false);
            tblClaim.getColumnModel().getColumn(3).setResizable(false);
            tblClaim.getColumnModel().getColumn(4).setResizable(false);
            tblClaim.getColumnModel().getColumn(5).setResizable(false);
            tblClaim.getColumnModel().getColumn(6).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(107, 198, 912, 250));

        viewPolicy.setBackground(new java.awt.Color(49, 163, 222));
        viewPolicy.setText("View Policy Details");
        viewPolicy.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewPolicy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPolicyActionPerformed(evt);
            }
        });
        add(viewPolicy, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 216, 40));

        btnAccept.setBackground(new java.awt.Color(49, 163, 222));
        btnAccept.setText("Accept");
        btnAccept.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        add(btnAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 107, 120, 40));

        jButton4.setBackground(new java.awt.Color(49, 163, 222));
        jButton4.setText("Decline");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 107, 120, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        // TODO add your handling code here:
       
        int selectedRow =  tblClaim.getSelectedRow();
        if(selectedRow <0)
        {
            JOptionPane.showMessageDialog(null,"Pleasse select a row","Warning", JOptionPane.WARNING_MESSAGE);

        }

        else
        {
        ClaimWorkRequest request = (ClaimWorkRequest) tblClaim.getValueAt(selectedRow, 0);
         if(request.getStatus().equals("Claim Accepted")||request.getStatus().equals("Claim Declined")){
                     JOptionPane.showMessageDialog(null,"Request already processed","Warning", JOptionPane.WARNING_MESSAGE);
                 }else{
        request.setStatus("Claim Accepted");
        request.setResolveDate(new Date());
        request.setMessage("Cleared and closed");
        JOptionPane.showMessageDialog(null,"Successfully Accepted");
        populate();
    }    
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    
        int selectedRow =  tblClaim.getSelectedRow();
        if(selectedRow <0)
        {
            JOptionPane.showMessageDialog(null,"Pleasse select a row","Warning", JOptionPane.WARNING_MESSAGE);

        }

        else
        {
        ClaimWorkRequest request = (ClaimWorkRequest) tblClaim.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("Claim Accepted")||request.getStatus().equals("Claim Declined")){
                     JOptionPane.showMessageDialog(null,"Request already processed","Warning", JOptionPane.WARNING_MESSAGE);
                 }else{
          JOptionPane.showMessageDialog(null,"Successfully Accepted");
        request.setStatus("Claim Declined");
        request.setMessage("Additional,Not covered by insurance");
        populate();
        }
    }                 
    
    }//GEN-LAST:event_jButton4ActionPerformed

    private void viewPolicyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPolicyActionPerformed
        // TODO add your handling code here:
         int selectedRow =  tblClaim.getSelectedRow();
        if(selectedRow <0)
        {
            JOptionPane.showMessageDialog(null,"Pleasse select a row","Warning", JOptionPane.WARNING_MESSAGE);

        }

        else
      
        {
        ClaimWorkRequest request = (ClaimWorkRequest) tblClaim.getValueAt(selectedRow, 0);
            InsurancePolicy a=request.getInsurancepolicy();
            ViewPolicyWorkAreaJPanel vpeaj = new ViewPolicyWorkAreaJPanel(userProcessContainer, ecosystem, a,false);
            userProcessContainer.add("ViewPolicyWorkAreaJPanel", vpeaj);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);

        }
        
        
    }//GEN-LAST:event_viewPolicyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClaim;
    private javax.swing.JButton viewPolicy;
    // End of variables declaration//GEN-END:variables
}
