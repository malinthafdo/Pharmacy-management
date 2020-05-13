/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import Home.Home;
import Home.pharmacySubMenu;
import application.stockAdministrationDelete;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Malintha Fernando
 */
public class stockAdministrationAdd extends javax.swing.JFrame {

    /**
     * Creates new form stockAdministration
     */
    public stockAdministrationAdd() {
        initComponents();
        FillcoboProductName();
    }

      private void FillcoboProductName(){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic","root","");       
            Statement stat = conn.createStatement();
            String sql = "select productName from productadmin";
            ResultSet rs = stat.executeQuery(sql);
            
           
            
            while(rs.next())
            {
                
                ComboBoxProduct.addItem(rs.getString("productName"));
            }
            } 
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
       }
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        HomeLable = new javax.swing.JLabel();
        AddproductjPane1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        infoJPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        funtionTitle = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        editProductjPanel8 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        deleteProductjPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MainNavi = new javax.swing.JLabel();
        sideNavi = new javax.swing.JLabel();
        productAdmindesktopPanel = new javax.swing.JPanel();
        ComboBoxAuthorizedDepartment = new javax.swing.JComboBox();
        ComboBoxProduct = new javax.swing.JComboBox();
        ComboBoxOrderperiodM = new javax.swing.JComboBox();
        hiddenCheckBox = new javax.swing.JCheckBox();
        closeCheckBox = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtStockName = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNoofUnit = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtProductCode2 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        outsetDate1 = new com.toedter.calendar.JDateChooser();
        jLabel29 = new javax.swing.JLabel();
        finalDate1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Add Stock");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 1048, -1));

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_back_50px.png"))); // NOI18N
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 40));

        HomeLable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_home_40px.png"))); // NOI18N
        HomeLable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HomeLable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeLableMouseClicked(evt);
            }
        });
        jPanel1.add(HomeLable, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 40, 40));

        AddproductjPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddproductjPane1.setOpaque(false);
        AddproductjPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddproductjPane1MouseClicked(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(238, 238, 238));
        jLabel17.setText("Add stock");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_add_50px_5.png"))); // NOI18N

        javax.swing.GroupLayout AddproductjPane1Layout = new javax.swing.GroupLayout(AddproductjPane1);
        AddproductjPane1.setLayout(AddproductjPane1Layout);
        AddproductjPane1Layout.setHorizontalGroup(
            AddproductjPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddproductjPane1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel18)
                .addGap(33, 33, 33)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
        );
        AddproductjPane1Layout.setVerticalGroup(
            AddproductjPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddproductjPane1Layout.createSequentialGroup()
                .addGroup(AddproductjPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(AddproductjPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 310, 60));

        infoJPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infoJPanel3.setOpaque(false);
        infoJPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoJPanel3MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("View Stocks");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_view_50px.png"))); // NOI18N

        javax.swing.GroupLayout infoJPanel3Layout = new javax.swing.GroupLayout(infoJPanel3);
        infoJPanel3.setLayout(infoJPanel3Layout);
        infoJPanel3Layout.setHorizontalGroup(
            infoJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoJPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addGap(29, 29, 29)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
        );
        infoJPanel3Layout.setVerticalGroup(
            infoJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoJPanel3Layout.createSequentialGroup()
                .addGroup(infoJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(infoJPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 310, 60));

        funtionTitle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        funtionTitle.setOpaque(false);
        funtionTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                funtionTitleMouseClicked(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(238, 238, 238));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Stock Admin");

        javax.swing.GroupLayout funtionTitleLayout = new javax.swing.GroupLayout(funtionTitle);
        funtionTitle.setLayout(funtionTitleLayout);
        funtionTitleLayout.setHorizontalGroup(
            funtionTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        funtionTitleLayout.setVerticalGroup(
            funtionTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(funtionTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 310, 60));

        editProductjPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editProductjPanel8.setOpaque(false);
        editProductjPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editProductjPanel8MouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(238, 238, 238));
        jLabel13.setText("Edit stock");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_edit_property_50px.png"))); // NOI18N

        javax.swing.GroupLayout editProductjPanel8Layout = new javax.swing.GroupLayout(editProductjPanel8);
        editProductjPanel8.setLayout(editProductjPanel8Layout);
        editProductjPanel8Layout.setHorizontalGroup(
            editProductjPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editProductjPanel8Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel14)
                .addGap(30, 30, 30)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        editProductjPanel8Layout.setVerticalGroup(
            editProductjPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editProductjPanel8Layout.createSequentialGroup()
                .addGroup(editProductjPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(editProductjPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 310, 60));

        deleteProductjPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteProductjPanel2.setOpaque(false);
        deleteProductjPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteProductjPanel2MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setText("Delete stock");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_delete_file_50px.png"))); // NOI18N

        javax.swing.GroupLayout deleteProductjPanel2Layout = new javax.swing.GroupLayout(deleteProductjPanel2);
        deleteProductjPanel2.setLayout(deleteProductjPanel2Layout);
        deleteProductjPanel2Layout.setHorizontalGroup(
            deleteProductjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteProductjPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
        );
        deleteProductjPanel2Layout.setVerticalGroup(
            deleteProductjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteProductjPanel2Layout.createSequentialGroup()
                .addGroup(deleteProductjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(deleteProductjPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 310, 60));

        MainNavi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/abstract-blur.jpg"))); // NOI18N
        jPanel1.add(MainNavi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 870));

        sideNavi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bar2.jpg"))); // NOI18N
        jPanel1.add(sideNavi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 1060, 60));

        productAdmindesktopPanel.setBackground(new java.awt.Color(255, 255, 255));

        ComboBoxAuthorizedDepartment.setEditable(true);
        ComboBoxAuthorizedDepartment.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        ComboBoxAuthorizedDepartment.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Outpatient(OPD)", "Emergency room", "Intensive care", "Surgical ward", "General surgery" }));
        ComboBoxAuthorizedDepartment.setToolTipText("Drug Catagory");
        ComboBoxAuthorizedDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxAuthorizedDepartmentActionPerformed(evt);
            }
        });

        ComboBoxProduct.setEditable(true);
        ComboBoxProduct.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        ComboBoxProduct.setToolTipText("Drug Catagory");
        ComboBoxProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxProductActionPerformed(evt);
            }
        });

        ComboBoxOrderperiodM.setEditable(true);
        ComboBoxOrderperiodM.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        ComboBoxOrderperiodM.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1 month", "2 months", "3 months", "6 months", "12 months" }));
        ComboBoxOrderperiodM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxOrderperiodMActionPerformed(evt);
            }
        });

        hiddenCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        hiddenCheckBox.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        hiddenCheckBox.setText("Hidden Stock");

        closeCheckBox.setBackground(new java.awt.Color(255, 255, 255));
        closeCheckBox.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        closeCheckBox.setText("Close Stock");
        closeCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeCheckBoxActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(235, 236, 240));
        jPanel3.setPreferredSize(new java.awt.Dimension(106, 45));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Save");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel7)
                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a12.png"))); // NOI18N
        jLabel11.setText("jLabel10");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, -1));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel8.setText("Stock Name");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        txtStockName.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtStockName.setBorder(null);
        txtStockName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStockNameActionPerformed(evt);
            }
        });
        jPanel5.add(txtStockName, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 35, 260, 30));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a12.png"))); // NOI18N
        jLabel12.setText("jLabel10");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, -1));

        jLabel16.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel16.setText("No of units");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        txtNoofUnit.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtNoofUnit.setBorder(null);
        txtNoofUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNoofUnitActionPerformed(evt);
            }
        });
        jPanel6.add(txtNoofUnit, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 35, 260, 30));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a12.png"))); // NOI18N
        jLabel19.setText("jLabel10");
        jPanel7.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, -1));

        jLabel21.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel21.setText("Stock code");
        jPanel7.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        txtProductCode2.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtProductCode2.setBorder(null);
        txtProductCode2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductCode2ActionPerformed(evt);
            }
        });
        jPanel7.add(txtProductCode2, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 35, 260, 30));

        jLabel22.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel22.setText("Product");

        jLabel23.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel23.setText("Order period in months");

        jLabel24.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel24.setText("Authorized Department ");

        jLabel20.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Outset Date");

        outsetDate1.setBackground(new java.awt.Color(255, 255, 255));
        outsetDate1.setDateFormatString("MM-d-yyyy");

        jLabel29.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Final Date");

        finalDate1.setBackground(new java.awt.Color(255, 255, 255));
        finalDate1.setDateFormatString("MM-d-yyyy");

        javax.swing.GroupLayout productAdmindesktopPanelLayout = new javax.swing.GroupLayout(productAdmindesktopPanel);
        productAdmindesktopPanel.setLayout(productAdmindesktopPanelLayout);
        productAdmindesktopPanelLayout.setHorizontalGroup(
            productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productAdmindesktopPanelLayout.createSequentialGroup()
                .addGap(482, 482, 482)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(452, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productAdmindesktopPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productAdmindesktopPanelLayout.createSequentialGroup()
                        .addComponent(hiddenCheckBox)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(closeCheckBox, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(productAdmindesktopPanelLayout.createSequentialGroup()
                        .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(ComboBoxProduct, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productAdmindesktopPanelLayout.createSequentialGroup()
                        .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ComboBoxAuthorizedDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComboBoxOrderperiodM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(productAdmindesktopPanelLayout.createSequentialGroup()
                        .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outsetDate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(finalDate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(220, 220, 220))
        );
        productAdmindesktopPanelLayout.setVerticalGroup(
            productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productAdmindesktopPanelLayout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(productAdmindesktopPanelLayout.createSequentialGroup()
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ComboBoxProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxAuthorizedDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxOrderperiodM, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(outsetDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(finalDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hiddenCheckBox)
                    .addComponent(closeCheckBox))
                .addGap(70, 70, 70)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        jPanel1.add(productAdmindesktopPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 1060, 810));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 868, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        // TODO add your handling code here:

        pharmacySubMenu sm = new pharmacySubMenu();
        sm.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BackMouseClicked

    private void HomeLableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeLableMouseClicked
        // TODO add your handling code here:

        Home h = new Home();
        h.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_HomeLableMouseClicked

    private void AddproductjPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddproductjPane1MouseClicked
        // TODO add your handling code here:
         stockAdministrationAdd h = new stockAdministrationAdd();
          h.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_AddproductjPane1MouseClicked

    private void funtionTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_funtionTitleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_funtionTitleMouseClicked

    private void editProductjPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProductjPanel8MouseClicked
        // TODO add your handling code here:
        stockAdministrationEdit h = new stockAdministrationEdit();
          h.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_editProductjPanel8MouseClicked

    private void ComboBoxAuthorizedDepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxAuthorizedDepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxAuthorizedDepartmentActionPerformed

    private void ComboBoxProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxProductActionPerformed

    private void ComboBoxOrderperiodMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxOrderperiodMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxOrderperiodMActionPerformed

    private void closeCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_closeCheckBoxActionPerformed

    private void deleteProductjPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteProductjPanel2MouseClicked
        // TODO add your handling code here:
        
    stockAdministrationDelete h = new stockAdministrationDelete();
          h.setVisible(true);
         this.setVisible(false);
    }//GEN-LAST:event_deleteProductjPanel2MouseClicked

    private void txtStockNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStockNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStockNameActionPerformed

    private void txtNoofUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNoofUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNoofUnitActionPerformed

    private void txtProductCode2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductCode2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductCode2ActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
               
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
              Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic","root","");

            
            if(txtStockName.getText().isEmpty() && txtProductCode2.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please enter missing fields", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txtStockName.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please enter Stock Name", "Error", JOptionPane.ERROR_MESSAGE);
            }
           
            else
            {
            
            String query = "INSERT INTO stockadmin (stockname, stockId, noOfUnit, product, antorizedDepartment, oderPeriodMonth, outsetdate, finaldate, hiddenstock, closestock) VALUES (?,?,?,?,?,?,?,?,?,?)";
            
            //"INSERT INTO stockadmin (stockname, stockId, noOfUnit, product, antorizedDepartment, oderPeriodMonth, outsetdate, finaldate) VALUES (?,?,?,?,?,?,?,?)";

            PreparedStatement pst = conn.prepareStatement(query);
            
            pst.setString(1, txtStockName.getText() );
            pst.setString(2, txtProductCode2.getText() );
            pst.setString(3, txtNoofUnit.getText() );  
            pst.setString(4, ComboBoxProduct.getSelectedItem().toString());                           
            pst.setString(5, ComboBoxAuthorizedDepartment.getSelectedItem().toString());
            pst.setString(6, ComboBoxOrderperiodM.getSelectedItem().toString());                      
            pst.setString(7, new SimpleDateFormat("MM-d-yyyy").format(outsetDate1.getDate() ) );
            pst.setString(8, new SimpleDateFormat("MM-d-yyyy").format(finalDate1.getDate() ) );  
            

                
            if (hiddenCheckBox.isSelected())
            {
               pst.setString(9,"hidden Stock "); 
            }
            
            else
            {
                pst.setString(9,""); 
            }
            
            if(closeCheckBox.isSelected())
            {
               pst.setString(10,"close Stock "); 
            }
            
            else
            {
                pst.setString(10,""); 
            }
            
                       
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Saved successfully");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
               
    }//GEN-LAST:event_jPanel3MouseClicked

    private void infoJPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoJPanel3MouseClicked
        // TODO add your handling code here:
stockAdministrationView ss = new stockAdministrationView();
          ss.setVisible(true);
         this.setVisible(false);
        
    }//GEN-LAST:event_infoJPanel3MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(stockAdministrationAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stockAdministrationAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stockAdministrationAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stockAdministrationAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stockAdministrationAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddproductjPane1;
    private javax.swing.JLabel Back;
    private javax.swing.JComboBox ComboBoxAuthorizedDepartment;
    private javax.swing.JComboBox ComboBoxOrderperiodM;
    private javax.swing.JComboBox ComboBoxProduct;
    private javax.swing.JLabel HomeLable;
    private javax.swing.JLabel MainNavi;
    private javax.swing.JCheckBox closeCheckBox;
    private javax.swing.JPanel deleteProductjPanel2;
    private javax.swing.JPanel editProductjPanel8;
    private com.toedter.calendar.JDateChooser finalDate1;
    private javax.swing.JPanel funtionTitle;
    private javax.swing.JCheckBox hiddenCheckBox;
    private javax.swing.JPanel infoJPanel3;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private com.toedter.calendar.JDateChooser outsetDate1;
    private javax.swing.JPanel productAdmindesktopPanel;
    private javax.swing.JLabel sideNavi;
    private javax.swing.JTextField txtNoofUnit;
    private javax.swing.JTextField txtProductCode2;
    private javax.swing.JTextField txtStockName;
    // End of variables declaration//GEN-END:variables
}
