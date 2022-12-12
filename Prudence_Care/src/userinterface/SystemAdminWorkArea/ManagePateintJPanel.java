/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Font;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import userinterface.PatientRole.CreatePatientJPanel;
import userinterface.PatientRole.ViewPatientJPanel;

/**
 *
 * @author Shobhit, rishabagarwal, parvathypillai
 */
public class ManagePateintJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePateintJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
     UserAccount account;
     
   public ManagePateintJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
          initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
        populatePatientTable();
    }
 public void populatePatientTable(){
        DefaultTableModel model = (DefaultTableModel)patientTable.getModel();
        
        model.setRowCount(0);
        List<Patient> vaccinetestList = ecosystem.getPatientDirectory().getpatientlist();
        for(Patient tester: vaccinetestList){
            Object row[] = new Object[4];
                 row[0] = tester.getId();
                 row[1] = tester;
                 row[2] = tester.getAllergy();
                 row[3] = tester.getAge();        
                 
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

        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientTable = new javax.swing.JTable();
        btnCreatePateint = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnchart = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/backIcon.png"))); // NOI18N
        btnBack.setContentAreaFilled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        patientTable.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        patientTable.setForeground(new java.awt.Color(0, 102, 102));
        patientTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient ID", "Name", "Allergy", "Age"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        patientTable.setGridColor(new java.awt.Color(0, 102, 102));
        jScrollPane2.setViewportView(patientTable);

        btnCreatePateint.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCreatePateint.setForeground(new java.awt.Color(0, 102, 102));
        btnCreatePateint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/createPatient.png"))); // NOI18N
        btnCreatePateint.setText("Create Patient's Profile");
        btnCreatePateint.setContentAreaFilled(false);
        btnCreatePateint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePateintActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/viewPatient.png"))); // NOI18N
        jButton1.setText("View Patient's Details");
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnchart.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnchart.setForeground(new java.awt.Color(0, 102, 102));
        btnchart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/chart.png"))); // NOI18N
        btnchart.setText("  See Statistic ");
        btnchart.setContentAreaFilled(false);
        btnchart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchartActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Manage Patient's Details");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/ManagePatient.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/ManagePatient1.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Patient's Details");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCreatePateint, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(450, 450, 450))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnchart, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnBack)
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCreatePateint)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnchart)
                .addContainerGap(433, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
          userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreatePateintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePateintActionPerformed
        // TODO add your handling code here:
        CreatePatientJPanel CreatePatientJPanel=new CreatePatientJPanel(userProcessContainer,account, ecosystem);
        userProcessContainer.add("CreatePatientJPanel",CreatePatientJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnCreatePateintActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         int selectedRow = patientTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a patient to view details!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Patient tester= (Patient)patientTable.getValueAt(selectedRow, 1);
        ViewPatientJPanel viewPatientJPanel = new ViewPatientJPanel(userProcessContainer, ecosystem,tester);
        userProcessContainer.add("viewPatientJPanel", viewPatientJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnchartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchartActionPerformed
        // TODO add your handling code here:
        // int age1=tester.getAge();
        //  int selectedRow=patientTable.getSelectedRow();
        //  Patient pa=(Patient)patientTable.getValueAt(selectedRow, 1);
        int countA = 0;
        int countB=0;
        int countC=0;
        int countD=0;
        for(Patient patient : ecosystem.getPatientDirectory().getpatientlist()){
            if(patient.getAge() <= 25){
                ++countA;
            }
            else if(patient.getAge()>=26 && patient.getAge()<=35)
            {
                ++countB;
            }
            else if(patient.getAge()>=36 && patient.getAge()<=45)
            {
                ++countC;
            }
            else if(patient.getAge()>=46 && patient.getAge()<=100)
            {
                ++countD;
            }
        }
       
        DefaultPieDataset piedataset= new DefaultPieDataset();
        piedataset.setValue("Below 26 age", countA);
        piedataset.setValue("from 26 to 35 age",countB );
        piedataset.setValue("from 36 to 45 age",countC);
        piedataset.setValue("from 46 to 100 age",countD);
        JFreeChart chart=ChartFactory.createPieChart("Pie Chart age", piedataset, true, true, true);
        PiePlot p=(PiePlot)chart.getPlot();
        ChartFrame frame=new ChartFrame("Pie Chart for Patient Age group", chart);
        frame.setVisible(true);
        frame.setSize(450,500);
    }//GEN-LAST:event_btnchartActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreatePateint;
    private javax.swing.JButton btnchart;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable patientTable;
    // End of variables declaration//GEN-END:variables
}
