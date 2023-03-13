/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientRole;

import Business.EcoSystem;
import Business.InsurancePolicy.InsurancePolicy;
import Business.Patient.Patient;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientHospitalAppointmentWorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shobhit, rishabagarwal, parvathypillai
 */
public class HospitalAppointment extends javax.swing.JPanel {

    /**
     * Creates new form SeeResultJPanel
     */
    EcoSystem ecosystem;
    JPanel userProcessContainer;
    UserAccount account;
    Patient patient;
    Date date;
    InsurancePolicy Insurancepolicy;
    String policy;
    
    public HospitalAppointment(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.account = account;
        String patientName = account.getUsername();
        dateApp.setDate(new Date());
        
        
        for (Patient p : ecosystem.getPatientDirectory().getpatientlist()) {
 
            if (p.getUserName().equals(patientName)) {
                patient = p;               
            }
        }

        Insurancepolicy = patient.getInsurance();
        policy=Insurancepolicy.toString();
        
        tblRequest.getTableHeader().setFont(new Font("SansSerif 14 Plain",Font.BOLD,15));
        jScrollPane1.getViewport().setBackground(Color.WHITE);
        UIManager.put("tblRequest.gridColor", new ColorUIResource(Color.BLACK));
       
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(new Color(51,47,73));
         headerRenderer.setForeground(Color.WHITE);

        for (int i = 0; i < tblRequest.getModel().getColumnCount(); i++) {
            tblRequest.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
        tblRequest.setShowGrid(true);
        tblRequest.getTableHeader().setFont(new Font("SansSerif 14 Plain",Font.BOLD,16));
        
        String from = "08:00:00", to = "20:00:00";
        LocalTime fromTime = LocalTime.parse(from), toTime = LocalTime.parse(to);

        for (LocalTime counter = fromTime;
                counter.compareTo(toTime) <= 0;
                counter = counter.plusMinutes(30)) {
            jComboBoxTime.addItem(counter.toString());

                    }
        populateComboBox();
    }
    
   public void populateComboBox()
   {for (InsurancePolicy a: ecosystem.getInsurancePolicyDirectory().getInsurancePolicyList())
   {    
   
       if(a.getPolicyName().equalsIgnoreCase(policy))
       {for (int counter = 0; counter < a.getHospitalList().size(); counter++) {
           
                    jComboBoxHospitalList.addItem(a.getHospitalList().get(counter));
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
        tblRequest = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCheckBoxPrimaryHospital = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtDetails = new javax.swing.JTextField();
        jComboBoxHospitalList = new javax.swing.JComboBox<>();
        btnSubmit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        dateApp = new com.toedter.calendar.JDateChooser();
        jComboBoxTime = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(255, 255, 255));

        tblRequest.setBackground(new java.awt.Color(182, 220, 237));
        tblRequest.setForeground(new java.awt.Color(255, 255, 255));
        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AppointmentNo.", "Hospital", "Date", "Time", "Message", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRequest.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(tblRequest);
        if (tblRequest.getColumnModel().getColumnCount() > 0) {
            tblRequest.getColumnModel().getColumn(0).setResizable(false);
            tblRequest.getColumnModel().getColumn(1).setResizable(false);
            tblRequest.getColumnModel().getColumn(2).setResizable(false);
            tblRequest.getColumnModel().getColumn(3).setResizable(false);
            tblRequest.getColumnModel().getColumn(4).setResizable(false);
            tblRequest.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setText("BOOK AN APPOINTMENT ");

        btnBack.setBackground(new java.awt.Color(49, 193, 255));
        btnBack.setText("BACK");
        btnBack.setBorder(null);
        btnBack.setBorderPainted(false);
        btnBack.setContentAreaFilled(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel6.setText("Appointment Details");

        jPanel1.setBackground(new java.awt.Color(49, 163, 222));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jCheckBoxPrimaryHospital.setBackground(new java.awt.Color(49, 163, 222));
        jCheckBoxPrimaryHospital.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jCheckBoxPrimaryHospital.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBoxPrimaryHospital.setText("Primary Hospital");

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Choose hospital:");

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("If other hospital please choose from the list:");

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Choose appointment Date and Time:");

        jComboBoxHospitalList.setForeground(new java.awt.Color(255, 255, 255));

        btnSubmit.setBackground(new java.awt.Color(49, 193, 255));
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Confirm");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Appointment Details:");

        dateApp.setForeground(new java.awt.Color(255, 255, 255));
        dateApp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateAppMouseClicked(evt);
            }
        });

        jComboBoxTime.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jCheckBoxPrimaryHospital)
                                .addComponent(jComboBoxHospitalList, 0, 183, Short.MAX_VALUE)
                                .addComponent(txtDetails))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(dateApp, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jComboBoxTime, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(339, 339, 339))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBoxPrimaryHospital)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxHospitalList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jComboBoxTime, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(263, 263, 263)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(153, 153, 153)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jLabel6)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(227, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
       if(txtDetails.getText().equals(""))
        { JOptionPane.showMessageDialog(null, "Please fill the appointment details", "Warning", JOptionPane.WARNING_MESSAGE);
        }else{
       date=dateApp.getDate();
       LocalDate dates=new java.sql.Date(date.getTime()).toLocalDate();
       String selected=(String) jComboBoxTime.getSelectedItem();
      
       String hospital;
        boolean primary= jCheckBoxPrimaryHospital.isSelected();
        if(primary==true)
        { hospital= patient.getPrimaryHospital();      
        }else{
          hospital= (String) jComboBoxHospitalList.getSelectedItem();
        }
        
        PatientHospitalAppointmentWorkRequest r = new PatientHospitalAppointmentWorkRequest();
        r.setHospital(hospital);
        r.setMessage(txtDetails.getText());
        r.setSender(account);
        r.setAppDate(dates);
        r.setTime(selected);
        r.setStatus("Appointment requested");
        r.setInsurance(Insurancepolicy);
        r.setDoctor("not assigned");
        r.setDoctor("not available");
        Map<String,Date> reqMap = r.getStatusMap();
        reqMap.put("New Appointment Request: "+hospital, new Date());
        r.setStatusMap(reqMap); 
        r.setRequestDate(new Date());
        ecosystem.getHospitalQueue().hospitalRequestList().add(r);
        account.getHospitalWorkQueue().hospitalRequestList().add(r);
        
        String s;
        DefaultTableModel model = (DefaultTableModel)tblRequest.getModel();
        model.setRowCount(0);

            Object[] row = new Object[7];
            row[0] = r;
            row[1] = r.getHospital();
            row[2] = r.getAppDate();
            row[3] = r.getTime();
            row[4] = r.getMessage();
            row[5] = r.getStatus();
            model.addRow(row);
             JOptionPane.showMessageDialog(null,"Successfully requested appointment");
             
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void dateAppMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateAppMouseClicked
        // TODO add your handling code here:
        if(evt.getClickCount()==2)
        {
        }
    }//GEN-LAST:event_dateAppMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private com.toedter.calendar.JDateChooser dateApp;
    private javax.swing.JCheckBox jCheckBoxPrimaryHospital;
    private javax.swing.JComboBox<String> jComboBoxHospitalList;
    private javax.swing.JComboBox<String> jComboBoxTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequest;
    private javax.swing.JTextField txtDetails;
    // End of variables declaration//GEN-END:variables
}
