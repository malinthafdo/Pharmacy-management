/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import Home.Home;
import Home.pharmacySubMenu;
//import applicationsSubmenu.patientSubMenu;
//import applicationsSubmenu.pharmacySubMenu;
import application.productAdminAddProduct;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Malintha Fernando
 */
public class productAdminAddProduct extends javax.swing.JFrame {

    /**
     * Creates new form productAdministration
     */
    public productAdminAddProduct() {
        initComponents();
        Fillcobo();
    }

        private void Fillcobo()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic","root","");       
            Statement stat = conn.createStatement();
            String sql = "select dname from drugcategories";
            ResultSet rs = stat.executeQuery(sql);
            
           
            
            while(rs.next())
            {
                
                DrugCatagoriesComboBox.addItem(rs.getString("dname"));
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
        Back = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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
        jLabel5 = new javax.swing.JLabel();
        sideNavi = new javax.swing.JLabel();
        productAdmindesktopPanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtProductCode = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        btnSave = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtDose = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtProvider = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtLastYearPrice = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtATC = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        txtProductCode1 = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        txtBarcodeNumber = new javax.swing.JTextField();
        UnitComboBox = new javax.swing.JComboBox();
        jPanel17 = new javax.swing.JPanel();
        DrugCatagoriesComboBox = new javax.swing.JComboBox();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_back_50px.png"))); // NOI18N
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });
        jPanel1.add(Back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 40));

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 238, 238));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Home> Pharmacy> Product admin> Add product");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 820, 310, 20));

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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AddproductjPane1MousePressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(238, 238, 238));
        jLabel17.setText("Add product");

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
        jLabel3.setText("My product");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_product_50px.png"))); // NOI18N

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

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 34)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(238, 238, 238));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("PRODUCT ADMIN");

        javax.swing.GroupLayout funtionTitleLayout = new javax.swing.GroupLayout(funtionTitle);
        funtionTitle.setLayout(funtionTitleLayout);
        funtionTitleLayout.setHorizontalGroup(
            funtionTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );
        funtionTitleLayout.setVerticalGroup(
            funtionTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
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
        jLabel13.setText("Edit product");

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
        jLabel2.setText("Delete product");

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

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Add new Product");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 1048, -1));

        sideNavi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bar2.jpg"))); // NOI18N
        jPanel1.add(sideNavi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 1060, 60));

        productAdmindesktopPanel.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a12.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, -1));

        jLabel8.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel8.setText("Product code");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        txtProductCode.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtProductCode.setBorder(null);
        txtProductCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductCodeActionPerformed(evt);
            }
        });
        jPanel5.add(txtProductCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 35, 260, 30));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel23.setText("Unit*");

        btnSave.setBackground(new java.awt.Color(235, 236, 240));
        btnSave.setPreferredSize(new java.awt.Dimension(190, 45));
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Save");

        javax.swing.GroupLayout btnSaveLayout = new javax.swing.GroupLayout(btnSave);
        btnSave.setLayout(btnSaveLayout);
        btnSaveLayout.setHorizontalGroup(
            btnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSaveLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        btnSaveLayout.setVerticalGroup(
            btnSaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a12.png"))); // NOI18N
        jLabel11.setText("jLabel10");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, -1));

        jLabel12.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel12.setText("Dose*");
        jPanel7.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        txtDose.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtDose.setBorder(null);
        txtDose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoseActionPerformed(evt);
            }
        });
        jPanel7.add(txtDose, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 35, 260, 30));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a12.png"))); // NOI18N
        jLabel16.setText("jLabel10");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, -1));

        jLabel19.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel19.setText("Unit Price");
        jPanel8.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        txtUnitPrice.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtUnitPrice.setBorder(null);
        txtUnitPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitPriceActionPerformed(evt);
            }
        });
        jPanel8.add(txtUnitPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 35, 260, 30));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a12.png"))); // NOI18N
        jLabel21.setText("jLabel10");
        jPanel9.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, 40));

        jLabel27.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel27.setText("Provider");
        jPanel9.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        txtProvider.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtProvider.setBorder(null);
        txtProvider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProviderActionPerformed(evt);
            }
        });
        jPanel9.add(txtProvider, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 35, 260, 30));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a12.png"))); // NOI18N
        jLabel22.setText("jLabel10");
        jPanel10.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, -1));

        jLabel28.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel28.setText("Last year average unit price");
        jPanel10.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, -1));

        txtLastYearPrice.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtLastYearPrice.setBorder(null);
        txtLastYearPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastYearPriceActionPerformed(evt);
            }
        });
        jPanel10.add(txtLastYearPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 35, 260, 30));

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a12.png"))); // NOI18N
        jLabel25.setText("jLabel10");
        jPanel11.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, -1));

        jLabel29.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel29.setText("ATC code");
        jPanel11.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        txtATC.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtATC.setBorder(null);
        txtATC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtATCActionPerformed(evt);
            }
        });
        jPanel11.add(txtATC, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 35, 260, 30));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a12.png"))); // NOI18N
        jLabel31.setText("jLabel10");
        jPanel16.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, -1));

        jLabel32.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel32.setText("Product Name");
        jPanel16.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        txtProductCode1.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtProductCode1.setBorder(null);
        txtProductCode1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductCode1ActionPerformed(evt);
            }
        });
        jPanel16.add(txtProductCode1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 35, 260, 30));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/a12.png"))); // NOI18N
        jLabel33.setText("jLabel10");
        jPanel14.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 270, 40));

        jLabel34.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel34.setText("Barcode Number");
        jPanel14.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        txtBarcodeNumber.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtBarcodeNumber.setBorder(null);
        txtBarcodeNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBarcodeNumberActionPerformed(evt);
            }
        });
        jPanel14.add(txtBarcodeNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 35, 260, 30));

        UnitComboBox.setEditable(true);
        UnitComboBox.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        UnitComboBox.setToolTipText("Drug Catagory");
        UnitComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UnitComboBoxActionPerformed(evt);
            }
        });

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DrugCatagoriesComboBox.setEditable(true);
        DrugCatagoriesComboBox.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        DrugCatagoriesComboBox.setToolTipText("Drug Catagory");
        jPanel17.add(DrugCatagoriesComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 270, 40));

        jLabel30.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel30.setText("Drug Catagory");
        jPanel17.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, 30));

        javax.swing.GroupLayout productAdmindesktopPanelLayout = new javax.swing.GroupLayout(productAdmindesktopPanel);
        productAdmindesktopPanel.setLayout(productAdmindesktopPanelLayout);
        productAdmindesktopPanelLayout.setHorizontalGroup(
            productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productAdmindesktopPanelLayout.createSequentialGroup()
                .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productAdmindesktopPanelLayout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(productAdmindesktopPanelLayout.createSequentialGroup()
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(996, 996, 996)
                                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(productAdmindesktopPanelLayout.createSequentialGroup()
                                .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(80, 80, 80)
                                .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(UnitComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(productAdmindesktopPanelLayout.createSequentialGroup()
                        .addGap(469, 469, 469)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        productAdmindesktopPanelLayout.setVerticalGroup(
            productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productAdmindesktopPanelLayout.createSequentialGroup()
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productAdmindesktopPanelLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(productAdmindesktopPanelLayout.createSequentialGroup()
                                .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(productAdmindesktopPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(UnitComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(productAdmindesktopPanelLayout.createSequentialGroup()
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
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

    private void funtionTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_funtionTitleMouseClicked
        // TODO add your handling code here:
        

    }//GEN-LAST:event_funtionTitleMouseClicked

    private void editProductjPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProductjPanel8MouseClicked
        // TODO add your handling code here:
        productAdminEditProduct p = new productAdminEditProduct();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editProductjPanel8MouseClicked

    private void AddproductjPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddproductjPane1MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_AddproductjPane1MouseClicked

    private void txtProductCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductCodeActionPerformed

    private void deleteProductjPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteProductjPanel2MouseClicked
        // TODO add your handling code here:
        productAdminDeleteProduct p = new productAdminDeleteProduct();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_deleteProductjPanel2MouseClicked

    private void AddproductjPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddproductjPane1MousePressed
        // TODO add your handling code here:
        productAdminAddProduct p = new productAdminAddProduct();
        p.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_AddproductjPane1MousePressed

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
              Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic","root","");

            
            if(txtProductCode.getText().isEmpty() && txtProductCode1.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please enter missing fields", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txtProductCode.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please enter missing fields", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(txtProductCode1.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null, "Please enter a missing fields", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
            
            String query = "insert into productadmin(productCode, productName, dose, Units, unitPrice, drugCatagory, provider, barcodeNumber, lastyearprice, atc) values(?,?,?,?,?,?,?,?,?,?)";
            
            PreparedStatement pst = conn.prepareStatement(query);
            
            pst.setString(1, txtProductCode.getText() );
            pst.setString(2, txtProductCode1.getText() );
            pst.setString(3, txtDose.getText() );
            pst.setString(4, UnitComboBox.getSelectedItem().toString() );
            pst.setString(5, txtUnitPrice.getText() );
            pst.setString(6, DrugCatagoriesComboBox.getSelectedItem().toString() );
            pst.setString(7, txtProvider.getText() );
            pst.setString(8, txtBarcodeNumber.getText() );
            pst.setString(9, txtLastYearPrice.getText() );
            pst.setString(10, txtATC.getText() );
            
             pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Saved successfully");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
    }//GEN-LAST:event_btnSaveMouseClicked

    private void txtDoseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoseActionPerformed

    private void txtUnitPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitPriceActionPerformed

    private void txtProviderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProviderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProviderActionPerformed

    private void txtLastYearPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastYearPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastYearPriceActionPerformed

    private void txtATCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtATCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtATCActionPerformed

    private void txtProductCode1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductCode1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductCode1ActionPerformed

    private void txtBarcodeNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBarcodeNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBarcodeNumberActionPerformed

    private void UnitComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UnitComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UnitComboBoxActionPerformed

    private void infoJPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoJPanel3MouseClicked
        // TODO add your handling code here:
        
        myProduct p = new myProduct();
        p.setVisible(true);
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
            java.util.logging.Logger.getLogger(productAdminAddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(productAdminAddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(productAdminAddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productAdminAddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productAdminAddProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddproductjPane1;
    private javax.swing.JLabel Back;
    private javax.swing.JComboBox DrugCatagoriesComboBox;
    private javax.swing.JLabel HomeLable;
    private javax.swing.JLabel MainNavi;
    private javax.swing.JComboBox UnitComboBox;
    private javax.swing.JPanel btnSave;
    private javax.swing.JPanel deleteProductjPanel2;
    private javax.swing.JPanel editProductjPanel8;
    private javax.swing.JPanel funtionTitle;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel productAdmindesktopPanel;
    private javax.swing.JLabel sideNavi;
    private javax.swing.JTextField txtATC;
    private javax.swing.JTextField txtBarcodeNumber;
    private javax.swing.JTextField txtDose;
    private javax.swing.JTextField txtLastYearPrice;
    private javax.swing.JTextField txtProductCode;
    private javax.swing.JTextField txtProductCode1;
    private javax.swing.JTextField txtProvider;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables
}
