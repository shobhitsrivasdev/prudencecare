/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmacyAdminRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PharmacyEnterprise;
import Business.Essentials.Medicine;
import Business.UserAccount.UserAccount;
import Business.Vaccine.Vaccine;
import Business.WorkQueue.DrugDemandWorkRequest;
import Business.WorkQueue.DrugSupplyWorkRequest;
import Business.WorkQueue.VaccineWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Font;
import static java.lang.Boolean.TRUE;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Manaa
 */
public class ManageMedicineJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMedicineJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem business;
    private Medicine medicine;
    private UserAccount account;
    private PharmacyEnterprise enterprise;
    private String medName = "";
    private String cond;
    public ManageMedicineJPanel(JPanel userProcessContainer,UserAccount account,Enterprise enterprise,EcoSystem business ) {
        initComponents();
        this.business = business;
        this.userProcessContainer = userProcessContainer;
        this.medicine = null;
        this.account = account;
        this.enterprise = (PharmacyEnterprise)enterprise;
        lblEnterprise.setText(enterprise.getName());
        lblAccount.setText("Logged in as: "+account.getUsername());
        this.setSize(1466, 902);
                introPanel.setBounds(171, 33, 1293, 101);
        jLabel7.setBounds(1, 1, 160, 113);
        jTabbedPane1.setBounds(1, 115, 1228, 782);
        jPanel1.setSize(1190,600);
        //jPanel3.setSize(1190,600);
        populateMedTable();
        populateNewMedTable();
        populateSupplyTable();
        populateMedQuoteBox();
                                DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(java.awt.Color.BLACK);
         headerRenderer.setForeground(java.awt.Color.WHITE);

        for (int i = 0; i < medTable.getModel().getColumnCount(); i++) {
            medTable.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
        medTable.setShowGrid(true);
       medTable.getTableHeader().setFont(new Font("SansSerif 14 Plain",Font.BOLD,16));
              
    }
    public ManageMedicineJPanel(JPanel userProcessContainer,Enterprise enterprise,EcoSystem business,String name,String cond) {
        initComponents();
        this.business = business;
        this.userProcessContainer = userProcessContainer;
        this.medicine = null;
        this.enterprise = (PharmacyEnterprise)enterprise;
        this.medName = name;
        this.cond = cond;
        populateMedTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    public void populateSupplyTable(){
       
    }
    public void populateMedTable(){
        DefaultTableModel model = (DefaultTableModel)medTable.getModel();
        model.setRowCount(0);

         for(Medicine med: enterprise.getMedicineCatalog().getMedicineList()){
            Object row[] = new Object[5];
                 row[0] = med;
                 row[1] = med.getDosage();
                 row[2] = med.getPrice();
                 row[3] = med.getQuantity();
                 row[4] = med.getDemand();
                 model.addRow(row);                 
        }
    }
    public void populateMedQuoteBox(){
                   
    }
        public void populateNewMedTable(){
            
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        introPanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblEnterprise = new javax.swing.JLabel();
        lblAccount = new javax.swing.JLabel();
        backJButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        medTable = new javax.swing.JTable();
        btnRemove = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        medPanel = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDose = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        btnEnt = new javax.swing.JRadioButton();
        btnResp = new javax.swing.JRadioButton();
        btnHeart = new javax.swing.JRadioButton();
        btnFever = new javax.swing.JRadioButton();
        btnDiab = new javax.swing.JRadioButton();
        btnPain = new javax.swing.JRadioButton();
        btnCovid = new javax.swing.JRadioButton();
        btnOther = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        txtQuant = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1466, 902));

        introPanel.setBackground(new java.awt.Color(49, 193, 255));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Manage Medicine Supplies");

        lblEnterprise.setBackground(new java.awt.Color(51, 51, 51));
        lblEnterprise.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblEnterprise.setText("Enterprise:");
        lblEnterprise.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        lblAccount.setBackground(new java.awt.Color(51, 51, 51));
        lblAccount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblAccount.setText("Enterprise:");
        lblAccount.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        backJButton1.setBackground(new java.awt.Color(49, 193, 255));
        backJButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        backJButton1.setText("Home");
        backJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout introPanelLayout = new javax.swing.GroupLayout(introPanel);
        introPanel.setLayout(introPanelLayout);
        introPanelLayout.setHorizontalGroup(
            introPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(introPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(lblEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(649, Short.MAX_VALUE))
            .addGroup(introPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(129, 129, 129)
                .addComponent(backJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(320, 320, 320))
        );
        introPanelLayout.setVerticalGroup(
            introPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(introPanelLayout.createSequentialGroup()
                .addGroup(introPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(introPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEnterprise, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        medTable.setBackground(new java.awt.Color(182, 220, 237));
        medTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Medicine Name", "Dosage", "Price", "Quantity", "Demand"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(medTable);

        btnRemove.setBackground(new java.awt.Color(49, 193, 255));
        btnRemove.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 830, Short.MAX_VALUE)
                        .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 779, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Check Medicine List", jPanel1);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        medPanel.setBackground(new java.awt.Color(255, 255, 255));
        medPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 102)));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Dosage(mg)");

        btnCreate.setBackground(new java.awt.Color(49, 163, 222));
        btnCreate.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCreate.setForeground(new java.awt.Color(255, 255, 255));
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pictures/add.png"))); // NOI18N
        btnCreate.setText("CREATE NEW MEDICINE");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Please choose the most relevant Condition for Medicine:");

        btnEnt.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnEnt.setText("ENT");
        btnEnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntActionPerformed(evt);
            }
        });

        btnResp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnResp.setText("Respiratory problems");
        btnResp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRespActionPerformed(evt);
            }
        });

        btnHeart.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnHeart.setText("Heart-Related");
        btnHeart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHeartActionPerformed(evt);
            }
        });

        btnFever.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnFever.setText("Fever");
        btnFever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeverActionPerformed(evt);
            }
        });

        btnDiab.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnDiab.setText("Diabetes-Related");
        btnDiab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDiabActionPerformed(evt);
            }
        });

        btnPain.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnPain.setText("Painkiller");
        btnPain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPainActionPerformed(evt);
            }
        });

        btnCovid.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnCovid.setText("Covid-Relief");
        btnCovid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCovidActionPerformed(evt);
            }
        });

        btnOther.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnOther.setText("Other");
        btnOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtherActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Medicine Details");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Quantity");

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Price");

        javax.swing.GroupLayout medPanelLayout = new javax.swing.GroupLayout(medPanel);
        medPanel.setLayout(medPanelLayout);
        medPanelLayout.setHorizontalGroup(
            medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(medPanelLayout.createSequentialGroup()
                .addGroup(medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(medPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(txtQuant)))
                    .addGroup(medPanelLayout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(btnCovid)
                        .addGap(33, 33, 33)
                        .addGroup(medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(medPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 275, Short.MAX_VALUE))
                            .addGroup(medPanelLayout.createSequentialGroup()
                                .addComponent(btnResp)
                                .addGap(42, 42, 42)
                                .addComponent(btnFever)
                                .addGap(55, 55, 55)
                                .addComponent(btnEnt)
                                .addGap(44, 44, 44)
                                .addComponent(btnDiab)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(medPanelLayout.createSequentialGroup()
                        .addGroup(medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(medPanelLayout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(btnHeart)
                                .addGroup(medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(medPanelLayout.createSequentialGroup()
                                        .addGap(208, 208, 208)
                                        .addComponent(btnOther))
                                    .addGroup(medPanelLayout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addGroup(medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnPain)
                                            .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(medPanelLayout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addGroup(medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGroup(medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(medPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, medPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(txtDose, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(medPanelLayout.createSequentialGroup()
                                .addGap(513, 513, 513)
                                .addComponent(jLabel5)))
                        .addGap(0, 315, Short.MAX_VALUE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        medPanelLayout.setVerticalGroup(
            medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, medPanelLayout.createSequentialGroup()
                .addGroup(medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(medPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(medPanelLayout.createSequentialGroup()
                        .addContainerGap(56, Short.MAX_VALUE)
                        .addGroup(medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, medPanelLayout.createSequentialGroup()
                                .addGroup(medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtQuant, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1))
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, medPanelLayout.createSequentialGroup()
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDose, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))))
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCovid)
                    .addComponent(btnEnt)
                    .addComponent(btnFever)
                    .addComponent(btnResp)
                    .addComponent(btnDiab))
                .addGap(18, 18, 18)
                .addGroup(medPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPain)
                    .addComponent(btnHeart)
                    .addComponent(btnOther))
                .addGap(18, 18, 18)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel16.setText("Add new Medicines:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(9, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(medPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(351, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add New Medicine", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(introPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(introPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 847, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        int selectedRow = medTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a Medicine row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Medicine m = (Medicine)medTable.getValueAt(selectedRow, 0);
        enterprise.getMedicineCatalog().removeMedicine(m);
        populateMedTable();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        if((txtName.getText().equals("")) || (txtPrice.getText().equals("")) ||(txtQuant.getText().equals(""))||(txtDose.getText().equals("")) || cond.equals("")){
            JOptionPane.showMessageDialog(null, "Name, Dose, Quantity,Condition and Price are mandatory!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String priceRegex ="[0-9]+\\.[0-9]{2,}";
        Pattern namePattern = Pattern.compile(priceRegex);
        Matcher checkFirstName = namePattern.matcher(txtPrice.getText());
        boolean checkNameMatch = checkFirstName.matches();
        if(!(checkNameMatch == TRUE)){
            JOptionPane.showMessageDialog(null, "Please enter Price in decimal format only!!\n(mininmum 2 digits after decimal)", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        int dose = 0;
        int quant = 0;
        try{
            dose = Integer.parseInt(txtDose.getText());
            quant = Integer.parseInt(txtQuant.getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please enter dosage and quantity in integer format only", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if((dose <= 0) ||(quant <= 0)){
            JOptionPane.showMessageDialog(null, "Dosage and quantity need to be more than zero!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Medicine med = new Medicine(txtName.getText(),Double.parseDouble(txtPrice.getText()),quant,dose);
        med.setCondition(cond);
        med.setUpdateDate();
        med.setDemand(0);

        enterprise.getMedicineCatalog().addMedicine(med);
        populateMedTable();
        JOptionPane.showMessageDialog(null, "Medicine Created successfully!", "Information", JOptionPane.INFORMATION_MESSAGE);
        txtName.setText("");
        txtQuant.setText("");
        txtDose.setText("");
        txtPrice.setText("");
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnEntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntActionPerformed
        // TODO add your handling code here:
                btnPain.setSelected(false);
        btnResp.setSelected(false);
        btnHeart.setSelected(false);
        btnDiab.setSelected(false);
        btnOther.setSelected(false);
        btnFever.setSelected(false);
        btnCovid.setSelected(false);
        cond = "Ent";
    }//GEN-LAST:event_btnEntActionPerformed

    private void btnFeverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeverActionPerformed
        // TODO add your handling code here:
                btnPain.setSelected(false);
        btnResp.setSelected(false);
        btnHeart.setSelected(false);
        btnDiab.setSelected(false);
        btnCovid.setSelected(false);
        btnOther.setSelected(false);
        btnEnt.setSelected(false);
        cond = "Fever";
    }//GEN-LAST:event_btnFeverActionPerformed

    private void btnDiabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiabActionPerformed
        // TODO add your handling code here:
                btnPain.setSelected(false);
        btnResp.setSelected(false);
        btnHeart.setSelected(false);
        btnCovid.setSelected(false);
        btnFever.setSelected(false);
        btnOther.setSelected(false);
        btnEnt.setSelected(false);
        cond = "Diabetes";
    }//GEN-LAST:event_btnDiabActionPerformed

    private void btnPainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPainActionPerformed
        // TODO add your handling code here:
                btnCovid.setSelected(false);
        btnResp.setSelected(false);
        btnHeart.setSelected(false);
        btnDiab.setSelected(false);
        btnFever.setSelected(false);
        btnEnt.setSelected(false);
        btnOther.setSelected(false);
        cond = "Pain";
    }//GEN-LAST:event_btnPainActionPerformed

    private void btnCovidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCovidActionPerformed
        // TODO add your handling code here:
        btnPain.setSelected(false);
        btnResp.setSelected(false);
        btnHeart.setSelected(false);
        btnDiab.setSelected(false);
        btnFever.setSelected(false);
        btnEnt.setSelected(false);
        btnOther.setSelected(false);
        cond = "Covid";
        
    }//GEN-LAST:event_btnCovidActionPerformed

    private void btnHeartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHeartActionPerformed
        // TODO add your handling code here:
                btnPain.setSelected(false);
        btnResp.setSelected(false);
        btnCovid.setSelected(false);
        btnDiab.setSelected(false);
        btnFever.setSelected(false);
        btnEnt.setSelected(false);
        btnOther.setSelected(false);
        cond = "Heart";
    }//GEN-LAST:event_btnHeartActionPerformed

    private void btnRespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRespActionPerformed
        // TODO add your handling code here:
                btnPain.setSelected(false);
        btnCovid.setSelected(false);
        btnHeart.setSelected(false);
        btnDiab.setSelected(false);
        btnFever.setSelected(false);
        btnEnt.setSelected(false);
        btnOther.setSelected(false);
        cond = "Resp";
    }//GEN-LAST:event_btnRespActionPerformed

    private void btnOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtherActionPerformed
        // TODO add your handling code here:
                        btnPain.setSelected(false);
        btnCovid.setSelected(false);
        btnHeart.setSelected(false);
        btnDiab.setSelected(false);
        btnFever.setSelected(false);
        btnEnt.setSelected(false);
        btnResp.setSelected(false);
        cond = "other";
    }//GEN-LAST:event_btnOtherActionPerformed

    private void backJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton1ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton1ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        if(this.jTabbedPane1.getSelectedIndex() == 0){//check medicine
         populateMedTable();
        }else if(this.jTabbedPane1.getSelectedIndex() ==  1){//demand req
        populateMedQuoteBox();
        }else if(this.jTabbedPane1.getSelectedIndex() ==  2){//updateinventory
             populateNewMedTable();
             populateSupplyTable();
                }
    }//GEN-LAST:event_jTabbedPane1MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton1;
    private javax.swing.JRadioButton btnCovid;
    private javax.swing.JButton btnCreate;
    private javax.swing.JRadioButton btnDiab;
    private javax.swing.JRadioButton btnEnt;
    private javax.swing.JRadioButton btnFever;
    private javax.swing.JRadioButton btnHeart;
    private javax.swing.JRadioButton btnOther;
    private javax.swing.JRadioButton btnPain;
    private javax.swing.JButton btnRemove;
    private javax.swing.JRadioButton btnResp;
    private javax.swing.JPanel introPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAccount;
    private javax.swing.JLabel lblEnterprise;
    private javax.swing.JPanel medPanel;
    private javax.swing.JTable medTable;
    private javax.swing.JTextField txtDose;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuant;
    // End of variables declaration//GEN-END:variables
}
