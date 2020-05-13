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
import java.sql.Statement;
import javax.swing.JOptionPane;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author Malintha Fernando
 */
public class productAdminProductReport extends javax.swing.JFrame {

    /**
     * Creates new form productAdminProductReport
     */
    public productAdminProductReport() {
        initComponents();
       // getproductCount();
        totproduct();
        totDrug();
        
    }

   
    
    
//    private void getproductCount()
//    {
//        //System.out.printf("sfsfs");
//                try {
//            Class.forName("com.mysql.jdbc.Driver");
//
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic","root","");       
//            //Statement stat = conn.createStatement();     
//            
//            String sql = "select dname from drugcategories";
//            PreparedStatement pst = conn.prepareStatement(sql);
//            
//                           
//            ResultSet rs = pst.executeQuery();
//            
//             String tot = rs.getString(sql);
//             
//             System.out.printf("sfsfs");
//                  
//            //jLabel9.setText(tot);
//           
//     } 
//        
//        catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//            
//        }
//                            
//    
//    }
    
    
    
    
    
    
            private void totproduct()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic","root","");       
            Statement stat = conn.createStatement();
            String sql = "select count(pid) from productadmin";
            ResultSet rs = stat.executeQuery(sql);
            
            if(rs.next()){
            String tot = rs.getString("count(pid)");
            
            // System.out.printf("count(pid)");
                  
            nRows.setText(tot);
            }
     } 
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
    }
            
            
    private void totDrug()
    {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic","root","");       
            Statement stat = conn.createStatement();
            String sql = "select count(did) from drugcategories";
            ResultSet rs = stat.executeQuery(sql);
            
            if(rs.next()){
            String tot = rs.getString("count(did)");
            
            // System.out.printf("count(pid)");
                  
            nRows1.setText(tot);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nRows = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nRows1 = new javax.swing.JLabel();

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

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("No of products");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_product_120px.png"))); // NOI18N

        nRows.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        nRows.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(nRows, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(nRows, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addComponent(jLabel8))
        );

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("No of products");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_product_120px.png"))); // NOI18N

        nRows1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        nRows1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                    .addComponent(nRows1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(nRows1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 17, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );

        javax.swing.GroupLayout productAdmindesktopPanelLayout = new javax.swing.GroupLayout(productAdmindesktopPanel);
        productAdmindesktopPanel.setLayout(productAdmindesktopPanelLayout);
        productAdmindesktopPanelLayout.setHorizontalGroup(
            productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productAdmindesktopPanelLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        productAdmindesktopPanelLayout.setVerticalGroup(
            productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(productAdmindesktopPanelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(582, Short.MAX_VALUE))
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

    }//GEN-LAST:event_AddproductjPane1MouseClicked

    private void AddproductjPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddproductjPane1MousePressed
        // TODO add your handling code here:
        productAdminAddProduct p = new productAdminAddProduct();
        p.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_AddproductjPane1MousePressed

    private void infoJPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoJPanel3MouseClicked
        // TODO add your handling code here:

        myProduct p = new myProduct();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_infoJPanel3MouseClicked

    private void funtionTitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_funtionTitleMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_funtionTitleMouseClicked

    private void editProductjPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editProductjPanel8MouseClicked
        // TODO add your handling code here:
        productAdminEditProduct p = new productAdminEditProduct();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_editProductjPanel8MouseClicked

    private void deleteProductjPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteProductjPanel2MouseClicked
        // TODO add your handling code here:
        productAdminDeleteProduct p = new productAdminDeleteProduct();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_deleteProductjPanel2MouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(productAdminProductReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(productAdminProductReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(productAdminProductReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(productAdminProductReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new productAdminProductReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddproductjPane1;
    private javax.swing.JLabel Back;
    private javax.swing.JLabel HomeLable;
    private javax.swing.JLabel MainNavi;
    private javax.swing.JPanel deleteProductjPanel2;
    private javax.swing.JPanel editProductjPanel8;
    private javax.swing.JPanel funtionTitle;
    private javax.swing.JPanel infoJPanel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nRows;
    private javax.swing.JLabel nRows1;
    private javax.swing.JPanel productAdmindesktopPanel;
    private javax.swing.JLabel sideNavi;
    // End of variables declaration//GEN-END:variables
}
