/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Role.AdminRole;
import Business.Role.InsuranceAdminRole;
import Business.Role.LabAdminRole;
import Business.Role.PharmacyAdminRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shobhit, rishabagarwal, parvathypillai
 */
public class ManageEnterpriseAdminJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem system;

    /**
     * Creates new form ManageEnterpriseJPanel
     */
    public ManageEnterpriseAdminJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.system = system;

         jScrollPane1.getViewport().setBackground(Color.WHITE);
//        UIManager.put("networkJTable.gridColor", new ColorUIResource(Color.BLACK));
       
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.BLACK);
         headerRenderer.setForeground(Color.WHITE);

        for (int i = 0; i < enterpriseJTable.getModel().getColumnCount(); i++) {
            enterpriseJTable.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
        enterpriseJTable.setShowGrid(true);
        
        populateTable();
        populateNetworkComboBox();
    }

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) enterpriseJTable.getModel();

        model.setRowCount(0);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    Object[] row = new Object[3];
                    row[0] = enterprise;
                    row[1] = network;
                    row[2] = userAccount;

                    model.addRow(row);
                }
            }
        }
    }

    private void populateNetworkComboBox(){
        networkJComboBox.removeAllItems();
         networkJComboBox.addItem("");
        for (Network network : system.getNetworkList()){
            networkJComboBox.addItem(network);
        }
    }
    
    private void populateEnterpriseComboBox(Network network){
        enterpriseJComboBox.removeAllItems();
         enterpriseJComboBox.addItem("");
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()){
            enterpriseJComboBox.addItem(enterprise);
        }
        
    }
        private void populateEnterpriseComboBox(String net){
        enterpriseJComboBox.removeAllItems();
        
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
        enterpriseJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        usernameJTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        enterpriseJComboBox = new javax.swing.JComboBox();
        submitJButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        passwordJPasswordField = new javax.swing.JPasswordField();
        btnRem = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        backJButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(238, 233, 234));

        enterpriseJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Enterprise Name", "Network", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(enterpriseJTable);

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setText("Network");

        networkJComboBox.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setText("Username");

        usernameJTextField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setText("Enterprise");

        enterpriseJComboBox.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseJComboBoxActionPerformed(evt);
            }
        });

        submitJButton.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setText("Password");

        nameJTextField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel5.setText("Name");

        passwordJPasswordField.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N

        btnRem.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        btnRem.setText("Remove User");
        btnRem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(49, 193, 255));

        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/back_to_50px_1.png"))); // NOI18N
        backJButton.setBorder(null);
        backJButton.setBorderPainted(false);
        backJButton.setContentAreaFilled(false);
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton)
                .addContainerGap(1165, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backJButton)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel6.setText("CREATE USER ADMIN FOR ENTERPRISE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 458, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordJPasswordField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(367, 367, 367))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(510, 510, 510)
                        .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnRem))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(25, 25, 25)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usernameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordJPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRem, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(109, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed
        try{
        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null){
            populateEnterpriseComboBox(network);
        }
        }catch(ClassCastException e){
           populateEnterpriseComboBox(""); 
        }catch(Exception e){
            populateEnterpriseComboBox("");  
        }
        
        
    }//GEN-LAST:event_networkJComboBoxActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
         if(networkJComboBox.getSelectedItem().toString().equals("")){
           JOptionPane.showMessageDialog(null, "Please select Network!");
            return;              
        }
        if(enterpriseJComboBox.getSelectedItem().toString().equals("")){
           JOptionPane.showMessageDialog(null, "Please select Enterprise!");
            return;              
        }
        Network network = (Network) networkJComboBox.getSelectedItem();
        Enterprise enterprise = (Enterprise) enterpriseJComboBox.getSelectedItem();
        
        String username = usernameJTextField.getText();
        if(usernameJTextField.getText().equals("") || passwordJPasswordField.getPassword().equals("") || nameJTextField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Username, Password and Name is Mandatory to create Admin account!");
            return;             
        }
        for(Network n: system.getNetworkList()){
        for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
           for(UserAccount ua:e.getUserAccountDirectory().getUserAccountList()){
            if(ua.getUsername().equals(username)){
          JOptionPane.showMessageDialog(null, "Username already exists!");
            return;    
            }
        } 
        }
        }
        
        String password = String.valueOf(passwordJPasswordField.getPassword());
        String name = nameJTextField.getText();
        
        Employee employee = enterprise.getEmployeeDirectory().createEmployee(name);
         boolean foundAdmin = false;
        for(UserAccount ua:enterprise.getUserAccountDirectory().getUserAccountList()){
               if(ua.getRole().toString().contains("Admin")){
                   foundAdmin = true;
               }
           }
           if(foundAdmin == true){
                       JOptionPane.showMessageDialog(null, "Enterprise selected already has an Admin!");
            return;  
        } 
       String usernamePattern = "((?=.*[a-z])(?=.*[0-9])(?=.*[A-Z]).{7})";
            Pattern userPat = Pattern.compile(usernamePattern);
            Matcher checkUser = userPat.matcher(username);
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
        if(enterprise.getEnterpriseType().getValue().equals("Pharmacy")){
            
         UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new PharmacyAdminRole());               
        
        }else if(enterprise.getEnterpriseType().getValue().equals("Laboratory")){
         UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new LabAdminRole());           

        }else if(enterprise.getEnterpriseType().equals(enterprise.getEnterpriseType().Insurance)){
         UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new InsuranceAdminRole());  
         
         
        }else if(enterprise.getEnterpriseType().equals(enterprise.getEnterpriseType().Hospital)){
           
         UserAccount account = enterprise.getUserAccountDirectory().createUserAccount(username, password, employee, new AdminRole());  
         
        }
         JOptionPane.showMessageDialog(null, "Admin account added successfully!");
        populateTable();
        usernameJTextField.setText("");
        passwordJPasswordField.setText("");
        nameJTextField.setText("");
        
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
       String adminMissing = "";
        for(Network n: system.getNetworkList()){
        for(Enterprise e: n.getEnterpriseDirectory().getEnterpriseList()){
            boolean foundAdmin = false;
           for(UserAccount ua:e.getUserAccountDirectory().getUserAccountList()){
               if(ua.getRole().toString().contains("Admin")){
                   foundAdmin = true;
               }
           }
           if(foundAdmin == false){
              adminMissing +=e.getName()+" ";
        } 
        }
        }
        
        if(!adminMissing.equals("")){
          int confirmed = JOptionPane.showConfirmDialog(null, "Below Enterprises do not have Admin accounts set up:\n"+adminMissing+"\n Are you sure you want to exit?","Confirm Exit",JOptionPane.YES_NO_OPTION);
            if(confirmed == JOptionPane.YES_OPTION){          
        
        userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
            }
        }else{
            userProcessContainer.remove(this);
         Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdminwjp = (SystemAdminWorkAreaJPanel) component;
        sysAdminwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);    
        }
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnRemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemActionPerformed
        // TODO add your handling code here:
        int selectedRow = enterpriseJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select an admin row to remove!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        int confirmed = JOptionPane.showConfirmDialog(null, "Are you Sure you want to delete the admin account?","Confirm Delete",JOptionPane.YES_NO_OPTION);
            if(confirmed == JOptionPane.YES_OPTION){
                Enterprise enterprise= (Enterprise)enterpriseJTable.getValueAt(selectedRow, 0);
                UserAccount account= (UserAccount)enterpriseJTable.getValueAt(selectedRow, 2);
                enterprise.getUserAccountDirectory().removeUserAccount(account);
//                Network networkName = (Network)enterpriseJTable.getValueAt(selectedRow, 1);
//                        networkName.getEnterpriseDirectory().removeEnterprise(enterprise);
                        JOptionPane.showMessageDialog(null, "Enterprise admin removed successfully!", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
            populateTable();
    }//GEN-LAST:event_btnRemActionPerformed

    private void enterpriseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseJComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnRem;
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JTable enterpriseJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
