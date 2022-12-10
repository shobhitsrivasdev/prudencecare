/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Doctor;

import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.io.File;
import static java.lang.Boolean.TRUE;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import UserInterface.SystemAdminWorkArea.ManagePateintJPanel;

/**
 *
 * @author rishabagarwal
 */
public class ViewUpdateDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDoctorProfileJPanel
     */
    String gender = "";
        int age = 0;
        String condition ="";
    private JPanel userProcessContainer;
    private EcoSystem business; 
    private UserAccount account;
    private Doctor doc;
    Enterprise enterprise;
    public ViewUpdateDoctorJPanel(JPanel userProcessContainer,UserAccount account,Enterprise enterprise, EcoSystem business,Doctor doc ) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.business = business;
        this.doc=doc;
        this.enterprise=enterprise;
        
        this.account=account;
        
        initializePage();
        
    }

    
 private void initializePage() {
        txtName.setText(doc.getUserName());
        if(doc.getDOB()!=null){
                System.out.println("Name check"+doc.getUserName());
                txtGeo.setText(doc.getAddress());
                txtDOB.setText(doc.getDOB());
                txtEmail.setText(doc.getEmail());
                txtPhone.setText(String.valueOf(doc.getContact()));
                System.out.println("Conact "+doc.getContact());
                txtSSN.setText(doc.getSsn());
                txtOtherProbs.setText(doc.getHealthOther());
                txtSplcialization.setText(doc.getSpecialization());
                txtLicense.setText(doc.getLicense());
              
                txtPhoto.setText(doc.getPhotograph());
                labelFullPic.setIcon(new ImageIcon(doc.getPhotograph()));
                if(doc.getGender().equals("Male")){
                    gender = "Male";
                    btnMale.setSelected(true);
                }else if(doc.getGender().equals("Female")){
                     gender = "Female";
                    btnFemale.setSelected(true);
                }else{
                     gender = "Other";
                    btnOther.setSelected(true);
                }
        }
                txtName.setEnabled(false);
                txtGeo.setEnabled(false);
                txtDOB.setEnabled(false);
                txtEmail.setEnabled(false);
                txtPhone.setEnabled(false);
                txtSSN.setEnabled(false);
                txtSplcialization.setEnabled(false);
                txtLicense.setEnabled(false);
                txtOtherProbs.setEnabled(false);
               
                txtPhoto.setEnabled(false);
                labelFullPic.setEnabled(false);
                
                btnMale.setEnabled(false);
                btnFemale.setEnabled(false);
                btnOther.setEnabled(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        txtGeo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtLicense = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtPhoto = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpload = new javax.swing.JButton();
        labelFullPic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtOtherProbs = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        btnSave1 = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        btnMale = new javax.swing.JRadioButton();
        btnOther = new javax.swing.JRadioButton();
        btnFemale = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        txtSplcialization = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setText("Doctor's Profile");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 40, -1, 24));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 2, 10)); // NOI18N
        jLabel4.setText("Enter all the details and Click");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 2, 10)); // NOI18N
        jLabel5.setText(") are Mandatory Fields");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 130, -1, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setText("*");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 2, 10)); // NOI18N
        jLabel8.setText("Fields marked (");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setText("1. Person Information and Address");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 226, -1, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setText("3. Identification Records");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 311, -1, -1));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel12.setText("4. Biometrics Record");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(688, 201, -1, -1));

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 0, 51));
        jLabel19.setText("*");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 253, -1, -1));

        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel24.setText("Contact Number");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 349, -1, -1));
        jPanel2.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 347, 137, -1));

        jLabel25.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel25.setText("Date Of Birth");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 312, -1, -1));
        jPanel2.add(txtDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 310, 137, -1));

        jLabel26.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel26.setText("Address");
        jPanel2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 281, -1, 22));
        jPanel2.add(txtGeo, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 281, 137, -1));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel14.setText("Email Address");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 413, -1, -1));

        jLabel27.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel27.setText(" Name");
        jPanel2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 257, -1, -1));
        jPanel2.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 413, 128, -1));

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 252, 137, -1));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setText("Gender");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 382, -1, -1));

        jLabel34.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel34.setText("*");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 413, -1, -1));

        jLabel35.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 0, 51));
        jLabel35.setText("*");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(647, 1223, -1, -1));

        jLabel37.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel37.setText("Mandatory to fill atleast one Identification Record");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 350, -1, -1));

        jLabel31.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel31.setText("Social Security Number");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(354, 376, -1, -1));

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel17.setText("Full Face Photograph");
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 230, -1, -1));

        jLabel36.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel36.setText("License Number");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 411, -1, -1));
        jPanel2.add(txtLicense, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 409, 143, -1));
        jPanel2.add(txtSSN, new org.netbeans.lib.awtextra.AbsoluteConstraints(496, 374, 143, -1));
        jPanel2.add(txtPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(832, 228, 166, -1));

        btnSave.setBackground(new java.awt.Color(102, 102, 102));
        btnSave.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/save.png"))); // NOI18N
        btnSave.setText("SAVE");
        btnSave.setBorder(null);
        btnSave.setContentAreaFilled(false);
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 616, 135, 50));

        btnUpload.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnUpload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/upload.png"))); // NOI18N
        btnUpload.setText("Upload");
        btnUpload.setBorderPainted(false);
        btnUpload.setContentAreaFilled(false);
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });
        jPanel2.add(btnUpload, new org.netbeans.lib.awtextra.AbsoluteConstraints(895, 281, 123, 46));

        labelFullPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/pic.png"))); // NOI18N
        labelFullPic.setMaximumSize(new java.awt.Dimension(700, 700));
        labelFullPic.setMinimumSize(new java.awt.Dimension(120, 120));
        jPanel2.add(labelFullPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(1045, 210, 77, 89));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        jLabel1.setText("(.jpg .jpeg .gif .png files allowed)");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 281, -1, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 2, 10)); // NOI18N
        jLabel2.setText("\"SAVE\"");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 10)); // NOI18N
        jLabel6.setText("Maximum photo size allowed: 350 * 250");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(705, 257, -1, 12));

        jLabel39.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel39.setText("*");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 345, 19, -1));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel13.setText("2. Health Record");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(336, 219, -1, -1));
        jPanel2.add(txtOtherProbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(515, 252, 160, -1));

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel21.setText("Other Health related data:");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(346, 254, -1, -1));

        btnSave1.setBackground(new java.awt.Color(102, 102, 102));
        btnSave1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnSave1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/update.png"))); // NOI18N
        btnSave1.setText("UPDATE");
        btnSave1.setBorder(null);
        btnSave1.setBorderPainted(false);
        btnSave1.setContentAreaFilled(false);
        btnSave1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave1ActionPerformed(evt);
            }
        });
        jPanel2.add(btnSave1, new org.netbeans.lib.awtextra.AbsoluteConstraints(511, 616, 177, 50));

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/back.png"))); // NOI18N
        backJButton.setContentAreaFilled(false);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(516, 29, 129, 43));

        btnMale.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnMale.setText("Male");
        btnMale.setContentAreaFilled(false);
        btnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaleActionPerformed(evt);
            }
        });
        jPanel2.add(btnMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 380, -1, -1));

        btnOther.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnOther.setText("Other");
        btnOther.setContentAreaFilled(false);
        btnOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtherActionPerformed(evt);
            }
        });
        jPanel2.add(btnOther, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 380, -1, -1));

        btnFemale.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        btnFemale.setText("Female");
        btnFemale.setContentAreaFilled(false);
        btnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFemaleActionPerformed(evt);
            }
        });
        jPanel2.add(btnFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 380, -1, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel11.setText("Specialization");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 445, -1, -1));
        jPanel2.add(txtSplcialization, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 443, 128, -1));

        jLabel38.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel38.setText("*");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(97, 441, 16, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/doctor.png"))); // NOI18N
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 6, -1, 88));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/doc_personal.png"))); // NOI18N
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(246, 247, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/health.png"))); // NOI18N
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 199, -1, 41));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/biometric.png"))); // NOI18N
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 222, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1167, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        //Validation of Personal Information and Address.
        int comp = 0;
        
        String error = "";
        //Validation of Mandatory fields.
//        if(txtName.getText().equalsIgnoreCase("")){
//            error="\nName Field is mandatory!";
//        }
        if(txtDOB.getText().equalsIgnoreCase("")){
            error+="\nDate Of Birth Field is mandatory!";
        }
        if(txtEmail.getText().equalsIgnoreCase("")){
            error+="\nEmail Field is mandatory!";
        }
        if((txtSSN.getText().equalsIgnoreCase(""))

            && (txtLicense.getText().equalsIgnoreCase(""))){
            error+="\nIt is mandatory to fill atleast one Identification Record!";
        }
        if(txtSplcialization.getText().equalsIgnoreCase("")){
            error+="\nSpecialization Field is mandatory!";
        }
        /* if(txtPhoto.getText().equalsIgnoreCase("")){
            error+="\nPhotograph Upload is mandatory!";
        }*/
        //        if(condition.equals("")){
            //            error+="\nIt is mandatory to fill condition of patient!";
            //        }

        if(!(error.equalsIgnoreCase(""))){
            JOptionPane.showMessageDialog(null,error);
        }else{

            //After Mandatory checks, Validation ifthe input record have valid datatypes.

//            String nameRegex = "^[a-zA-Z][a-zA-Z ]+[a-zA-Z]$";
//            Pattern namePattern = Pattern.compile(nameRegex);
//            Matcher checkName = namePattern.matcher(txtName.getText());
//            boolean checkNameMatch = checkName.matches();
//            if(!(checkNameMatch == TRUE)){
//                error+="\nFor Name - Valid name with only Alphabets and Spaces allowed!";
//            }
            if(!txtPhone.getText().equalsIgnoreCase("")){
                System.out.println(txtPhone.getText());
                String phone = (txtPhone.getText());

                String phoneRegex = "^[0-9]{10}$";
                Pattern phonePattern = Pattern.compile(phoneRegex);
                Matcher checkPhone = phonePattern.matcher(txtPhone.getText());
                boolean checkPhoneMatch = checkPhone.matches();
                if(!(checkPhoneMatch == TRUE)){

                    error="\nFor Phone number - Please enter only 10 digits!";
                }
            }
            boolean tryExp = false;
            try{
                SimpleDateFormat fmt = new SimpleDateFormat("dd/mm/yyyy");
                String dateString = txtDOB.getText();

                String formattedDate = fmt.format(fmt.parse(dateString));
                if (!(formattedDate.equals(dateString))) {
                    error+="\nFor Date Of Birth - Please enter in \"dd/mm/yyyy\" pattern only!";
                    tryExp = true;
                }
                            DateTimeFormatter dateFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate locBirthDate= LocalDate.parse(txtDOB.getText(),dateFormatter);
            LocalDate today = LocalDate.now();
            Period p = Period.between(locBirthDate, today);
            
            age = p.getYears();
            }catch (ParseException ex) {
                if(tryExp == false){
                error+="\nFor Date Of Birth - Please enter in \"dd/mm/yyyy\" pattern only!";
                tryExp  = true;
                }
            }catch (DateTimeParseException  ex2){
                if(tryExp == false){
                 error+="\nFor Date Of Birth - Please enter in \"dd/mm/yyyy\" pattern only!";   
                }
            }
            
            String emailRegex = "^(.+)@(.+)[.](.+)$";
            Pattern emailPattern = Pattern.compile(emailRegex);
            Matcher checkEmail = emailPattern.matcher(txtEmail.getText());
            boolean checkMatch = checkEmail.matches();
            if(!(checkMatch == TRUE)){
                error+="\nFor Email - Please enter valid address (Pattern username@****.****)!";
            }

            if(!txtSSN.getText().equalsIgnoreCase("")){
                String ssnRegex = "^[0-9]{3}-[0-9]{2}-[0-9]{4}$";
                Pattern ssnPattern = Pattern.compile(ssnRegex);
                Matcher ssnEmail = ssnPattern.matcher(txtSSN.getText());
                boolean ssnMatch = ssnEmail.matches();
                if(!(ssnMatch == TRUE)){
                    error+="\nFor SSN - Please enter valid SSN (Pattern: ***-**-****)!";
                }
            }

            if(!(error.equalsIgnoreCase(""))){
                JOptionPane.showMessageDialog(null,error);
            }else{
                doc.setName(txtName.getText());
                if(!txtGeo.getText().equals("")){
                    doc.setAddress(txtGeo.getText());
                }else{
                    doc.setAddress("");
                }
                doc.setDOB(txtDOB.getText());
                doc.setAge(age);
                doc.setEmail(txtEmail.getText());
                if(!txtSSN.getText().equals("")){
                    doc.setSsn(txtSSN.getText());
                }else{
                    doc.setSsn("");
                }

                if(!txtLicense.getText().equals("")){
                    doc.setLicense(txtLicense.getText());
                }else{
                    doc.setLicense("");
                }
//                if(!(txtAllergy.getText().equals(""))){
//                    doc.setAllergy(txtAllergy.getText());
//                }else{
//                    doc.setAllergy("");
//                }
                if(!(txtOtherProbs.getText().equals(""))){
                    doc.setHealthOther(txtOtherProbs.getText());
                }else{
                    doc.setHealthOther("");
                }
                doc.setContact(txtPhone.getText());
                doc.setGender(gender);
                doc.setSpecialization(txtSplcialization.getText());
                doc.setPhotograph(txtPhoto.getText());
                doc.setUpdateDate();
                 doc.setHospital(enterprise.getName());
               
                business.getDoctorDirectory().updateDoctor(doc);
                JOptionPane.showMessageDialog(null,"Doctor details updated successfully!!!");

                txtName.setText("");
                txtGeo.setText("");
                txtDOB.setText("");
                txtEmail.setText("");
                txtPhone.setText("");
                txtSSN.setText("");

                txtLicense.setText("");
                txtOtherProbs.setText("");
//                txtAllergy.setText("");
                txtPhoto.setText("");
                labelFullPic.setIcon(new ImageIcon(""));

            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChoose = new JFileChooser();
        fileChoose.showOpenDialog(null);
        File photoFile = fileChoose.getSelectedFile();
        String filename = photoFile.getAbsolutePath();
        if(!((filename.toLowerCase().endsWith(".jpg")) || (filename.toLowerCase().endsWith(".png"))|| (filename.toLowerCase().endsWith(".gif")) || (filename.toLowerCase().endsWith(".jpeg")))){
            JOptionPane.showMessageDialog(null,"Photo upload must be of file type .jpg .gif .png or .jpeg only");
        }else{
            txtPhoto.setText(filename);
            labelFullPic.setIcon(new ImageIcon(filename));
        }
    }//GEN-LAST:event_btnUploadActionPerformed

    private void btnSave1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave1ActionPerformed
        // TODO add your handling code here:
        txtName.setEnabled(false);
        txtGeo.setEnabled(true);
        txtDOB.setEnabled(true);
        txtEmail.setEnabled(true);
        txtPhone.setEnabled(true);
        txtSSN.setEnabled(true);
        txtSplcialization.setEnabled(true);
        txtLicense.setEnabled(true);
        txtOtherProbs.setEnabled(true);
//        txtAllergy.setEnabled(true);
        txtPhoto.setEnabled(true);
        labelFullPic.setEnabled(true);

        btnMale.setEnabled(true);
        btnFemale.setEnabled(true);
        btnOther.setEnabled(true);
    }//GEN-LAST:event_btnSave1ActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
//        userProcessContainer.remove(this);
//        Component[] componentArray = userProcessContainer.getComponents();
//        Component component = componentArray[componentArray.length - 1];
//       DoctorWorkAreaJPanel sysAdminwjp = (DoctorWorkAreaJPanel) component;
       //sysAdminwjp.populatePatientTable();

//        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
//        layout.previous(userProcessContainer);

            userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaleActionPerformed
        // TODO add your handling code here:
        gender = "Male";
        btnFemale.setSelected(false);
        btnOther.setSelected(false);
    }//GEN-LAST:event_btnMaleActionPerformed

    private void btnOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtherActionPerformed
        // TODO add your handling code here:
        gender = "Other";
        btnMale.setSelected(false);
        btnFemale.setSelected(false);
    }//GEN-LAST:event_btnOtherActionPerformed

    private void btnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFemaleActionPerformed
        // TODO add your handling code here:
        gender = "Female";
        btnMale.setSelected(false);
        btnOther.setSelected(false);
    }//GEN-LAST:event_btnFemaleActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.JRadioButton btnOther;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSave1;
    private javax.swing.JButton btnUpload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelFullPic;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGeo;
    private javax.swing.JTextField txtLicense;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOtherProbs;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtPhoto;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtSplcialization;
    // End of variables declaration//GEN-END:variables

   
}
