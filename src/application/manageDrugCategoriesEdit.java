/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import Home.Home;
import Home.pharmacySubMenu;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Malintha Fernando
 */
public class manageDrugCategoriesEdit extends javax.swing.JFrame {

    /**
     * Creates new form manageDrugCategoriesEdit
     */
    public manageDrugCategoriesEdit() {
        initComponents();
    }

    
    private void clearFildes()
    {
        txtDrugCategoieName.setText(null);
        txtPatientType.setText(null);
        txtDrugCategoieDescription.setText(null);
              
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
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
        btnUpdate = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        txtSearchBox = new javax.swing.JTextField();
        btnSearch = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnClear = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDrugCategoieId = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtDrugCategoieName = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        txtPatientType = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        txtDrugCategoieDescription = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Edit drug Categories");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 1048, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(238, 238, 238));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Category");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 310, -1));

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
        jLabel17.setText("Add Category.");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_add_50px_5.png"))); // NOI18N

        javax.swing.GroupLayout AddproductjPane1Layout = new javax.swing.GroupLayout(AddproductjPane1);
        AddproductjPane1.setLayout(AddproductjPane1Layout);
        AddproductjPane1Layout.setHorizontalGroup(
            AddproductjPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddproductjPane1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        AddproductjPane1Layout.setVerticalGroup(
            AddproductjPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddproductjPane1Layout.createSequentialGroup()
                .addGroup(AddproductjPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(AddproductjPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 310, 60));

        infoJPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        infoJPanel3.setOpaque(false);
        infoJPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoJPanel3MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("View Categories");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_view_50px_1_1.png"))); // NOI18N

        javax.swing.GroupLayout infoJPanel3Layout = new javax.swing.GroupLayout(infoJPanel3);
        infoJPanel3.setLayout(infoJPanel3Layout);
        infoJPanel3Layout.setHorizontalGroup(
            infoJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, infoJPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        infoJPanel3Layout.setVerticalGroup(
            infoJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(infoJPanel3Layout.createSequentialGroup()
                .addGroup(infoJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(infoJPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 310, 60));

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
        jLabel15.setText("Manage Drug ");

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
        jLabel13.setText("Edit Category");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_edit_property_50px.png"))); // NOI18N

        javax.swing.GroupLayout editProductjPanel8Layout = new javax.swing.GroupLayout(editProductjPanel8);
        editProductjPanel8.setLayout(editProductjPanel8Layout);
        editProductjPanel8Layout.setHorizontalGroup(
            editProductjPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, editProductjPanel8Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        editProductjPanel8Layout.setVerticalGroup(
            editProductjPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(editProductjPanel8Layout.createSequentialGroup()
                .addGroup(editProductjPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(editProductjPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 310, 60));

        deleteProductjPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteProductjPanel2.setOpaque(false);
        deleteProductjPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteProductjPanel2MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setText("Delete Category");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_delete_file_50px.png"))); // NOI18N

        javax.swing.GroupLayout deleteProductjPanel2Layout = new javax.swing.GroupLayout(deleteProductjPanel2);
        deleteProductjPanel2.setLayout(deleteProductjPanel2Layout);
        deleteProductjPanel2Layout.setHorizontalGroup(
            deleteProductjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deleteProductjPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addContainerGap())
        );
        deleteProductjPanel2Layout.setVerticalGroup(
            deleteProductjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteProductjPanel2Layout.createSequentialGroup()
                .addGroup(deleteProductjPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(deleteProductjPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 310, 60));

        MainNavi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/abstract-blur.jpg"))); // NOI18N
        jPanel1.add(MainNavi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 870));

        sideNavi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bar2.jpg"))); // NOI18N
        jPanel1.add(sideNavi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 1060, 60));

        productAdmindesktopPanel.setBackground(new java.awt.Color(255, 255, 255));
        productAdmindesktopPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnUpdate.setPreferredSize(new java.awt.Dimension(190, 45));
        btnUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUpdateMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Update");

        javax.swing.GroupLayout btnUpdateLayout = new javax.swing.GroupLayout(btnUpdate);
        btnUpdate.setLayout(btnUpdateLayout);
        btnUpdateLayout.setHorizontalGroup(
            btnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnUpdateLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel6)
                .addGap(40, 40, 40))
        );
        btnUpdateLayout.setVerticalGroup(
            btnUpdateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel4.setBackground(new java.awt.Color(235, 236, 240));
        jPanel4.setPreferredSize(new java.awt.Dimension(700, 54));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel21.setText("Drug Category ID /Name");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 240, 90));

        txtSearchBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSearchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchBoxActionPerformed(evt);
            }
        });
        jPanel4.add(txtSearchBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 263, 44));

        btnSearch.setPreferredSize(new java.awt.Dimension(190, 45));
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("Search");

        javax.swing.GroupLayout btnSearchLayout = new javax.swing.GroupLayout(btnSearch);
        btnSearch.setLayout(btnSearchLayout);
        btnSearchLayout.setHorizontalGroup(
            btnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSearchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnSearchLayout.setVerticalGroup(
            btnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jPanel4.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 106, 42));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_binoculars_35px.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, 90));

        btnClear.setPreferredSize(new java.awt.Dimension(190, 45));
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Clear");

        javax.swing.GroupLayout btnClearLayout = new javax.swing.GroupLayout(btnClear);
        btnClear.setLayout(btnClearLayout);
        btnClearLayout.setHorizontalGroup(
            btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnClearLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        btnClearLayout.setVerticalGroup(
            btnClearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aaBB.png"))); // NOI18N
        jLabel11.setText("jLabel10");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 600, -1));

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel9.setText("Drug Category ID");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        txtDrugCategoieId.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtDrugCategoieId.setBorder(null);
        txtDrugCategoieId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDrugCategoieIdActionPerformed(evt);
            }
        });
        jPanel7.add(txtDrugCategoieId, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 35, 580, 30));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aaBB.png"))); // NOI18N
        jLabel12.setText("jLabel10");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 600, -1));

        jLabel16.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel16.setText("Drug Category Name");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        txtDrugCategoieName.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtDrugCategoieName.setBorder(null);
        txtDrugCategoieName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDrugCategoieNameActionPerformed(evt);
            }
        });
        jPanel8.add(txtDrugCategoieName, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 35, 580, 30));

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aaBB.png"))); // NOI18N
        jLabel23.setText("jLabel10");
        jPanel9.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 600, -1));

        jLabel24.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel24.setText("Patient type");
        jPanel9.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        txtPatientType.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtPatientType.setBorder(null);
        txtPatientType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientTypeActionPerformed(evt);
            }
        });
        jPanel9.add(txtPatientType, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 35, 580, 30));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/aaBB.png"))); // NOI18N
        jLabel19.setText("jLabel10");
        jPanel10.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 600, -1));

        jLabel25.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel25.setText("Description");
        jPanel10.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 30));

        txtDrugCategoieDescription.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtDrugCategoieDescription.setBorder(null);
        txtDrugCategoieDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDrugCategoieDescriptionActionPerformed(evt);
            }
        });
        jPanel10.add(txtDrugCategoieDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 35, 580, 30));

        javax.swing.GroupLayout productAdmindesktopPanelLayout = new javax.swing.GroupLayout(productAdmindesktopPanel);
        productAdmindesktopPanel.setLayout(productAdmindesktopPanelLayout);
        productAdmindesktopPanelLayout.setHorizontalGroup(
            productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productAdmindesktopPanelLayout.createSequentialGroup()
                .addContainerGap(155, Short.MAX_VALUE)
                .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productAdmindesktopPanelLayout.createSequentialGroup()
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(269, 269, 269))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productAdmindesktopPanelLayout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, productAdmindesktopPanelLayout.createSequentialGroup()
                        .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(230, 230, 230))))
        );
        productAdmindesktopPanelLayout.setVerticalGroup(
            productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productAdmindesktopPanelLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
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
        manageDrugCategoriesAdd p = new manageDrugCategoriesAdd();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AddproductjPane1MouseClicked

    private void funtionTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_funtionTitleMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_funtionTitleMouseClicked

    private void editProductjPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProductjPanel8MouseClicked
        // TODO add your handling code here:
        manageDrugCategoriesEdit p = new manageDrugCategoriesEdit();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editProductjPanel8MouseClicked

    private void deleteProductjPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteProductjPanel2MouseClicked
        // TODO add your handling code here:
        manageDrugCategoriesDelete p = new manageDrugCategoriesDelete();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_deleteProductjPanel2MouseClicked

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked

        clearFildes();

    }//GEN-LAST:event_btnClearMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:

        searchCatagory p = new searchCatagory();
        p.setVisible(true);

    }//GEN-LAST:event_jLabel10MouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked

        if(txtSearchBox.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter a DrugCategoie Id", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{

            try {
                Class.forName("com.mysql.jdbc.Driver");

                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic","root","");

                String sql = "select * from drugcategories where drugCategorieId = ?";

                PreparedStatement pst = conn.prepareStatement(sql);

                pst.setString(1, txtSearchBox.getText() );

                ResultSet rs = pst.executeQuery();

                if(rs.next() )
                {
                    txtDrugCategoieId.setText(rs.getString("drugCategorieId"));
                    txtDrugCategoieName.setText(rs.getString("dname"));
                    txtPatientType.setText(rs.getString("patientType"));
                    txtDrugCategoieDescription.setText(rs.getString("description"));

                }
                else
                {
                    JOptionPane.showMessageDialog(null, "No record found");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);

            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }
    }//GEN-LAST:event_btnSearchMouseClicked

    private void txtSearchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBoxActionPerformed

    private void btnUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUpdateMouseClicked

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic","root","");

            String sql = "update drugcategories set drugCategorieId=?, dname=?, patientType=?, description=? where drugCategorieId = '"+txtSearchBox.getText()+"'";

            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, txtDrugCategoieId.getText() );
            pst.setString(2, txtDrugCategoieName.getText() );
            pst.setString(3, txtPatientType.getText() );
            pst.setString(4, txtDrugCategoieDescription.getText() );

            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Updated successfully");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }//GEN-LAST:event_btnUpdateMouseClicked

    private void txtDrugCategoieIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDrugCategoieIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDrugCategoieIdActionPerformed

    private void txtDrugCategoieNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDrugCategoieNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDrugCategoieNameActionPerformed

    private void txtPatientTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientTypeActionPerformed

    private void txtDrugCategoieDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDrugCategoieDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDrugCategoieDescriptionActionPerformed

    private void infoJPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoJPanel3MouseClicked
        // TODO add your handling code here:
        manageDrugCategoriesView p = new manageDrugCategoriesView();
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
            java.util.logging.Logger.getLogger(manageDrugCategoriesEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageDrugCategoriesEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageDrugCategoriesEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageDrugCategoriesEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageDrugCategoriesEdit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddproductjPane1;
    private javax.swing.JLabel Back;
    private javax.swing.JLabel HomeLable;
    private javax.swing.JLabel MainNavi;
    private javax.swing.JPanel btnClear;
    private javax.swing.JPanel btnSearch;
    private javax.swing.JPanel btnUpdate;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel productAdmindesktopPanel;
    private javax.swing.JLabel sideNavi;
    private javax.swing.JTextField txtDrugCategoieDescription;
    private javax.swing.JTextField txtDrugCategoieId;
    private javax.swing.JTextField txtDrugCategoieName;
    private javax.swing.JTextField txtPatientType;
    private javax.swing.JTextField txtSearchBox;
    // End of variables declaration//GEN-END:variables
}
