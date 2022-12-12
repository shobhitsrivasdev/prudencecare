/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.Doctor.Doctor;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import static java.lang.Boolean.FALSE;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rishabagarwal
 */
public class ManageUserAccountJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUserAccountJPanel
     */
    private JPanel container;
    private Enterprise enterprise;
private EcoSystem business;
private boolean card;
    public ManageUserAccountJPanel(JPanel container, Enterprise enterprise,EcoSystem business) {
        initComponents();
        this.enterprise = enterprise;
        this.container = container;
        this.business=business;
        
        jScrollPane2.getViewport().setBackground(Color.WHITE);
        UIManager.put("userJTable.gridColor", new ColorUIResource(Color.gray));
       
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.BLACK);
         headerRenderer.setForeground(Color.WHITE);

        for (int i = 0; i < userJTable.getModel().getColumnCount(); i++) {
            userJTable.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
        userJTable.setShowGrid(true);
       
    
        
        
        
        
        popOrganizationComboBox();
       // employeeJComboBox.removeAllItems();
        popData();
    }
   public void popOrganizationComboBox() {
        organizationJComboBox.removeAllItems();

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            organizationJComboBox.addItem(organization.getOrganizationType());
        }
    }
    
    public void populateEmployeeComboBox(Organization organization){
        employeeJComboBox.removeAllItems();
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            employeeJComboBox.addItem(employee);
        }
    }
    
    private void populateRoleComboBox(Organization organization){
        roleJComboBox.removeAllItems();
        for (Role role : organization.getSupportedRole()){
                        String pwdRegex = ".*Admin.*";
            Pattern pwdPattern = Pattern.compile(pwdRegex);
            Matcher pwdCheck = pwdPattern.matcher(role.toString());
            boolean checkPwd = pwdCheck.matches();
            if(checkPwd == FALSE){
                if(role.toString().equals(organizationJComboBox.getSelectedItem().toString())){
                     roleJComboBox.addItem(role);
                }
           
            }
        }
    }

    public void popData() {

        DefaultTableModel model = (DefaultTableModel) userJTable.getModel();

        model.setRowCount(0);

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            for (UserAccount ua : organization.getUserAccountDirectory().getUserAccountList()) {
                Object row[] = new Object[2];
                row[0] = ua;
                row[1] = ua.getRole();
                ((DefaultTableModel) userJTable.getModel()).addRow(row);
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

        backjButton1 = new javax.swing.JButton();
        btnRem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        userJTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        passwordJTextField = new javax.swing.JTextField();
        nameJTextField = new javax.swing.JTextField();
        roleJComboBox = new javax.swing.JComboBox();
        employeeJComboBox = new javax.swing.JComboBox();
        organizationJComboBox = new javax.swing.JComboBox();
        createUserJButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));

        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backjButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/back_to_501px.png"))); // NOI18N
        backjButton1.setBorder(null);
        backjButton1.setBorderPainted(false);
        backjButton1.setContentAreaFilled(false);
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        btnRem.setBackground(new java.awt.Color(0, 0, 0));
        btnRem.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        btnRem.setForeground(new java.awt.Color(255, 255, 255));
        btnRem.setText("Remove User");
        btnRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemActionPerformed(evt);
            }
        });

        userJTable.setBackground(new java.awt.Color(102, 102, 102));
        userJTable.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        userJTable.setForeground(new java.awt.Color(255, 255, 255));
        userJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Role"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userJTable.setSelectionBackground(new java.awt.Color(204, 204, 204));
        userJTable.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(userJTable);

        jLabel6.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel6.setText("Organization");

        jLabel7.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel7.setText("Employee");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel8.setText("Role");

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel9.setText("User Name");

        jLabel10.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        jLabel10.setText("Password");

        passwordJTextField.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

        nameJTextField.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N

        roleJComboBox.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        roleJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        roleJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roleJComboBoxActionPerformed(evt);
            }
        });

        employeeJComboBox.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        employeeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        organizationJComboBox.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        organizationJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        organizationJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                organizationJComboBoxActionPerformed(evt);
            }
        });

        createUserJButton1.setBackground(new java.awt.Color(0, 0, 0));
        createUserJButton1.setFont(new java.awt.Font("SansSerif", 0, 16)); // NOI18N
        createUserJButton1.setForeground(new java.awt.Color(255, 255, 255));
        createUserJButton1.setText("Create");
        createUserJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserJButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setText("CREATE USER ACCOUNT");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 389, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(228, 228, 228))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(395, 395, 395))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(431, 431, 431))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(createUserJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219)
                        .addComponent(btnRem, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(334, 334, 334))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(backjButton1))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(organizationJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(employeeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createUserJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(163, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backjButton1ActionPerformed

    private void btnRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemActionPerformed
        // TODO add your handling code here:
         int selectedRow = userJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row to remove!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int confirmed = JOptionPane.showConfirmDialog(null, "Are you Sure you want to delete the User?","Confirm Delete",JOptionPane.YES_NO_OPTION);
        Organization organization = null;  
        if(confirmed == JOptionPane.YES_OPTION){
                UserAccount ua= (UserAccount)userJTable.getValueAt(selectedRow, 0);
                for(Network n: business.getNetworkList()){
                    for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
                        for(Organization org: e.getOrganizationDirectory().getOrganizationList()){
                           for(UserAccount user : org.getUserAccountDirectory().getUserAccountList()){
                               if(user.equals(ua)){
                               organization = org;
                           }
                           }
                        }
                    }
                }
                if(organization  != null){
                organization.getUserAccountDirectory().removeUserAccount(ua);
                        }
            }
                  JOptionPane.showMessageDialog(null, "User Account removed!", "Information", JOptionPane.INFORMATION_MESSAGE);
            popData();
    }//GEN-LAST:event_btnRemActionPerformed

    private void roleJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roleJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_roleJComboBoxActionPerformed

    private void organizationJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_organizationJComboBoxActionPerformed
        Organization organization = null;
        for(Organization org: enterprise.getOrganizationDirectory().getOrganizationList()) {
            if(org.getOrganizationType().equals(organizationJComboBox.getSelectedItem())){
                organization = org;
            }
        }
        if (organization != null){
            populateEmployeeComboBox(organization);
            populateRoleComboBox(organization);
        }
    }//GEN-LAST:event_organizationJComboBoxActionPerformed

    private void createUserJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createUserJButton1ActionPerformed
     if(nameJTextField.getText().equals("") || passwordJTextField.getText().equals("")){
         JOptionPane.showMessageDialog(null, "Username and password is mandatory to create account!", "Warning", JOptionPane.WARNING_MESSAGE);
         return;
     }
     if(organizationJComboBox.getSelectedItem().toString().equals("") || roleJComboBox.getSelectedItem().toString().equals("") ||employeeJComboBox.getSelectedItem().toString().equals("") ){
           JOptionPane.showMessageDialog(null, "Organization, employee and role selection is mandatory to create account!", "Warning", JOptionPane.WARNING_MESSAGE);
         return;       
     }
        String userName = nameJTextField.getText();
        String password = passwordJTextField.getText();
               String usernamePattern = "((?=.*[a-z])(?=.*[0-9])(?=.*[A-Z]).{7})";
            Pattern userPat = Pattern.compile(usernamePattern);
            Matcher checkUser = userPat.matcher(userName);
            boolean userMatch = checkUser.matches();  
             System.out.println(userMatch);
             if(userMatch == false){
                          JOptionPane.showMessageDialog(null, "UserName pattern invalid:\nShould be 7 characters only\nMust include one UPPER CASE character,one lower case character and one digit");
            return;               
             }
    

        String pwdRegex = "((?=.*[a-z])(?=.*[0-9])(?=.*[$*#&])(?=.*[A-Z]).{7})";
                Pattern pwdPattern = Pattern.compile(pwdRegex);
                Matcher pwdCheck = pwdPattern.matcher(password);
                boolean checkPwd = pwdCheck.matches();
               System.out.println(checkPwd);
             if(checkPwd == false){
                          JOptionPane.showMessageDialog(null, "Password pattern invalid! \nNeeds to be 7 characters long and should have atleast:\nOne UPPER CASE character\nOne lower case character\nOne digit\nOne special character[$*#&]");
            return;
             }
        Organization organization = null;
        for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList()) {
            if(organizationJComboBox.getSelectedItem().equals(org.getOrganizationType())){
                organization = org;
            }
        }

        Employee employee = (Employee) employeeJComboBox.getSelectedItem();
        Role role = (Role) roleJComboBox.getSelectedItem();
                for(Network n: business.getNetworkList()){
        for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
            for(Organization org: e.getOrganizationDirectory().getOrganizationList()){
           for(UserAccount ua:org.getUserAccountDirectory().getUserAccountList()){
            if(ua.getUsername().equals(userName)){
          JOptionPane.showMessageDialog(null, "Username already exists!");
            return;    
            }
           }
            for(UserAccount ua:e.getUserAccountDirectory().getUserAccountList()){
            if(ua.getUsername().equals(userName)){
          JOptionPane.showMessageDialog(null, "Username already exists!");
            return;    
            }
           }          
        } 
        }
        }
          
           
        organization.getUserAccountDirectory().createUserAccount(userName, password, employee, role);
        if(role.toString().equals("Doctor"))
        {
            Doctor d= new Doctor();
            d.setUserName(userName);
            d.setName(userName);
            d.setHospital(enterprise.getName());
           
            business.getDoctorDirectory().addDoctor(d);
        }
                  JOptionPane.showMessageDialog(null, "Account Created Successfully!");
        popData();
        passwordJTextField.setText("");
        nameJTextField.setText("");
    }//GEN-LAST:event_createUserJButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton btnRem;
    private javax.swing.JButton createUserJButton1;
    private javax.swing.JComboBox employeeJComboBox;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox organizationJComboBox;
    private javax.swing.JTextField passwordJTextField;
    private javax.swing.JComboBox roleJComboBox;
    private javax.swing.JTable userJTable;
    // End of variables declaration//GEN-END:variables
}
