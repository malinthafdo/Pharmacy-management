/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.border.BevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Malintha Fernando
 */
public class seachProduct extends javax.swing.JFrame {

    /**
     * Creates new form seachProduct
     */
    public seachProduct() {
        initComponents();

        setBackground(new Color(0, 0, 0));

        productTable.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 20));
        productTable.getTableHeader().setOpaque(false);
        productTable.getTableHeader().setBackground(new Color(32, 136, 203));
        productTable.getTableHeader().setForeground(new Color(255, 255, 255));
        productTable.setRowHeight(35);

        tableload();
        //FillcoboDrugProvider();
        FillcoboDrugCat();
        FillcoboProvider();

    }

    private void FillcoboDrugCat() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic", "root", "");
            Statement stat = conn.createStatement();
            String sql = "select dname from drugcategories";
            ResultSet rs = stat.executeQuery(sql);

            while (rs.next()) {

                DrugCatComboBox.addItem(rs.getString("dname"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }

    public void filterlstatus(String query) {
        DefaultTableModel dtm = (DefaultTableModel) productTable.getModel();

        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        productTable.setRowSorter(tr);
                  
        
        
         if (query == "Select") {
            
                 tableload();  
        }

       else if (query != "Opioid") {
            tr.setRowFilter(RowFilter.regexFilter(query));
                   
        }
       else if (query != "Drug category") {
            tr.setRowFilter(RowFilter.regexFilter(query));
        }
    }
    
    
           private void FillcoboProvider(){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic","root","");       
            Statement stat = conn.createStatement();
            String sql = "select provider from productadmin";
            ResultSet rs = stat.executeQuery(sql);
            
           
            
            while(rs.next())
            {
                
                DrugCatComboBox3.addItem(rs.getString("provider"));
            }
            } 
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
       }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

//      private void FillcoboDrugProvider(){
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic","root","");       
//            Statement stat = conn.createStatement();
//            String sql = "select provider from productadmin";
//            ResultSet rs = stat.executeQuery(sql);
//            
//           
//            
//            while(rs.next())
//            {
//                
//                providerComboBox.addItem(rs.getString("provider"));
//            }
//            } 
//        
//        catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e);
//            
//        }
//    }
    public void tableload() {

        try {
            
            
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic", "root", "");

            int row = 0;
            int rowIndex = 0;
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT productCode, productName, unitPrice, drugCatagory, barcodeNumber, provider FROM productadmin");

            if (rs.next()) {
                rs.last();
                row = rs.getRow();
                rs.beforeFirst();
            }

            String[][] data = new String[row][6];
            while (rs.next()) {
                data[rowIndex][0] = rs.getInt(1) + "";
                data[rowIndex][1] = rs.getString(2) + "";
                data[rowIndex][2] = rs.getInt(3) + "";
                data[rowIndex][3] = rs.getString(4) + "";
                data[rowIndex][4] = rs.getInt(5) + "";
                data[rowIndex][5] = rs.getString(6) + "";
                rowIndex++;
            }

            String[] title = {"Product Code", "Product Name", "Unit Price", "Drug Catagory", "Barcode No", "Provider"};
            DefaultTableModel model = new DefaultTableModel(data, title);
            productTable.setModel(model);
            rs.close();
            stm.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e + "Database Loading error");

        }

    }

  //  public void Search()
    //  {
//        String searchInput = txtSearchBar.getText();
//        
//                  if(txtSearchBar.getText().isEmpty())
//                    {
//                        JOptionPane.showMessageDialog(null, "Please enter a scale id", "Error", JOptionPane.ERROR_MESSAGE);
//                    }
//        
//                  else if (searchInput.matches("[a-zA-Z]+")) 
//                        {
//                            try{
//                                Class.forName("com.mysql.jdbc.Driver");
//
//                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic","root","");
//
//
//                                PreparedStatement pst = null;
//                                ResultSet res = null;
//                                String search = txtSearchBar.getText();
//
//                                String sql = "Select productCode, productName, drugCatagory, provider from productadmin where productName LIKE '%"+search+"%' ";
//
//
//                                pst = con.prepareStatement(sql);
//                                res = pst.executeQuery();
//
//                                searchTableResult.setModel(DbUtils.resultSetToTableModel(res));
//
//                             }
//
//                             catch (Exception e)
//                             {
//
//                             }
//
//                          }
//                    else if (searchInput.matches("[0-9]+"))
//                          {
//                              
//                            try{
//                                Class.forName("com.mysql.jdbc.Driver");
//
//                                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic","root","");
//
//
//                                PreparedStatement pst = null;
//                                ResultSet res = null;
//                                String search = txtSearchBar.getText();
//
//                                String sql = "Select productCode, productName, drugCatagory, provider from productadmin where productCode LIKE '%"+search+"%' ";
//
//
//                                pst = con.prepareStatement(sql);
//                                res = pst.executeQuery();
//
//                                searchTableResult.setModel(DbUtils.resultSetToTableModel(res));
//
//                             }
//
//                             catch (Exception e)
//                             {
//
//                             }
//                             
//                          }
 //       }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jTextField1 = new javax.swing.JTextField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        SearchProductPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtSeachBox = new javax.swing.JTextField();
        DrugCatComboBox = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        DrugCatComboBox1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        DrugCatComboBox3 = new javax.swing.JComboBox();
        btnSearch = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnSearch1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        SearchProductPanel1.setBackground(new java.awt.Color(255, 255, 255));
        SearchProductPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("Product Details");
        SearchProductPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 270, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bar2.jpg"))); // NOI18N
        SearchProductPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 50));

        productTable.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "item1", "item2", "item3", "item4"
            }
        ));
        productTable.setFocusable(false);
        productTable.setRowHeight(25);
        productTable.setSelectionBackground(new java.awt.Color(232, 57, 95));
        productTable.setShowVerticalLines(false);
        productTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(productTable);

        SearchProductPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 1000, 510));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        SearchProductPanel1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 790, 1060, 20));

        jPanel2.setBackground(new java.awt.Color(235, 236, 240));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Product Name/ ID");

        txtSeachBox.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        txtSeachBox.setBorder(null);
        txtSeachBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeachBoxActionPerformed(evt);
            }
        });

        DrugCatComboBox.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        DrugCatComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        DrugCatComboBox.setToolTipText("Drug Catagory");
        DrugCatComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DrugCatComboBoxMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DrugCatComboBoxMousePressed(evt);
            }
        });
        DrugCatComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrugCatComboBoxActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Drug category");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Price range");

        DrugCatComboBox1.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        DrugCatComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "0-300", "301-600", "601-900", "901-1200" }));
        DrugCatComboBox1.setToolTipText("Drug Catagory");
        DrugCatComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrugCatComboBox1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Provider");

        DrugCatComboBox3.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        DrugCatComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        DrugCatComboBox3.setToolTipText("Drug Catagory");
        DrugCatComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DrugCatComboBox3ActionPerformed(evt);
            }
        });

        btnSearch.setPreferredSize(new java.awt.Dimension(190, 45));
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Search");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_search_35px.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSearchLayout = new javax.swing.GroupLayout(btnSearch);
        btnSearch.setLayout(btnSearchLayout);
        btnSearchLayout.setHorizontalGroup(
            btnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSearchLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addGap(10, 10, 10)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnSearchLayout.setVerticalGroup(
            btnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        btnSearch1.setPreferredSize(new java.awt.Dimension(190, 45));
        btnSearch1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearch1MouseClicked(evt);
            }
        });

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Reset");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_reset_30px.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSearch1Layout = new javax.swing.GroupLayout(btnSearch1);
        btnSearch1.setLayout(btnSearch1Layout);
        btnSearch1Layout.setHorizontalGroup(
            btnSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSearch1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        btnSearch1Layout.setVerticalGroup(
            btnSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DrugCatComboBox, 0, 200, Short.MAX_VALUE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(DrugCatComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtSeachBox, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DrugCatComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSeachBox))
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DrugCatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DrugCatComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DrugCatComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        SearchProductPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, 190));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(SearchProductPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(SearchProductPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtSeachBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeachBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeachBoxActionPerformed

    private void DrugCatComboBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DrugCatComboBoxMouseClicked
        // TODO add your handling code here:

        
    }//GEN-LAST:event_DrugCatComboBoxMouseClicked

    private void DrugCatComboBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DrugCatComboBoxMousePressed
        // TODO add your handling code here:       
        
        String query = DrugCatComboBox.getSelectedItem().toString();
        filterlstatus(query);
        
    }//GEN-LAST:event_DrugCatComboBoxMousePressed

    private void DrugCatComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrugCatComboBoxActionPerformed
        // TODO add your handling code here:
        
        
         
    }//GEN-LAST:event_DrugCatComboBoxActionPerformed

    private void DrugCatComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrugCatComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DrugCatComboBox1ActionPerformed

    private void DrugCatComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DrugCatComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DrugCatComboBox3ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:

        String searchInput = txtSeachBox.getText();

        if (searchInput.matches("[a-zA-Z]+")) {
            try {
                Class.forName("com.mysql.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic", "root", "");

                PreparedStatement pst = null;
                ResultSet rs = null;
                String search = txtSeachBox.getText();

                int row = 0;
                int rowIndex = 0;
                Statement stm = con.createStatement();

                String sql = "Select productCode, productName, unitPrice, drugCatagory, barcodeNumber, provider from productadmin where productName LIKE '%" + search + "%' ";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();

                if (rs.next()) {
                    rs.last();
                    row = rs.getRow();
                    rs.beforeFirst();
                }

                String[][] data = new String[row][6];
                while (rs.next()) {
                    data[rowIndex][0] = rs.getInt(1) + "";
                    data[rowIndex][1] = rs.getString(2) + "";
                    data[rowIndex][2] = rs.getInt(3) + "";
                    data[rowIndex][3] = rs.getString(4) + "";
                    data[rowIndex][4] = rs.getInt(5) + "";
                    data[rowIndex][5] = rs.getString(6) + "";
                    rowIndex++;
                }

                String[] title = {"Product Code", "Product Name", "Unit Price", "Drug Catagory", "Barcode No", "Provider"};
                DefaultTableModel model = new DefaultTableModel(data, title);
                productTable.setModel(model);
                rs.close();
                stm.close();

                productTable.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (Exception e) {

            }

        } else if (searchInput.matches("[0-9]+")) {

            try {
                Class.forName("com.mysql.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic", "root", "");

                PreparedStatement pst = null;
                ResultSet rs = null;
                String search = txtSeachBox.getText();

                int row = 0;
                int rowIndex = 0;
                Statement stm = con.createStatement();

                String sql = "Select productCode, productName, unitPrice, drugCatagory, barcodeNumber, provider from productadmin where productCode LIKE '%" + search + "%' ";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();

                if (rs.next()) {
                    rs.last();
                    row = rs.getRow();
                    rs.beforeFirst();
                }

                String[][] data = new String[row][6];
                while (rs.next()) {
                    data[rowIndex][0] = rs.getInt(1) + "";
                    data[rowIndex][1] = rs.getString(2) + "";
                    data[rowIndex][2] = rs.getInt(3) + "";
                    data[rowIndex][3] = rs.getString(4) + "";
                    data[rowIndex][4] = rs.getInt(5) + "";
                    data[rowIndex][5] = rs.getString(6) + "";
                    rowIndex++;
                }

                String[] title = {"Product Code", "Product Name", "Unit Price", "Drug Catagory", "Barcode No", "Provider"};
                DefaultTableModel model = new DefaultTableModel(data, title);
                productTable.setModel(model);
                rs.close();
                stm.close();

                productTable.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (Exception e) {

            }

        }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked

       String searchInput = txtSeachBox.getText();

        if (searchInput.matches("[a-zA-Z]+")) {
            try {
                Class.forName("com.mysql.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic", "root", "");

                PreparedStatement pst = null;
                ResultSet rs = null;
                String search = txtSeachBox.getText();

                int row = 0;
                int rowIndex = 0;
                Statement stm = con.createStatement();

                String sql = "Select productCode, productName, unitPrice, drugCatagory, barcodeNumber, provider from productadmin where productName LIKE '%" + search + "%' ";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();

                if (rs.next()) {
                    rs.last();
                    row = rs.getRow();
                    rs.beforeFirst();
                }

                String[][] data = new String[row][6];
                while (rs.next()) {
                    data[rowIndex][0] = rs.getInt(1) + "";
                    data[rowIndex][1] = rs.getString(2) + "";
                    data[rowIndex][2] = rs.getInt(3) + "";
                    data[rowIndex][3] = rs.getString(4) + "";
                    data[rowIndex][4] = rs.getInt(5) + "";
                    data[rowIndex][5] = rs.getString(6) + "";
                    rowIndex++;
                }

                String[] title = {"Product Code", "Product Name", "Unit Price", "Drug Catagory", "Barcode No", "Provider"};
                DefaultTableModel model = new DefaultTableModel(data, title);
                productTable.setModel(model);
                rs.close();
                stm.close();

                productTable.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (Exception e) {

            }

        } else if (searchInput.matches("[0-9]+")) {

            try {
                Class.forName("com.mysql.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic", "root", "");

                PreparedStatement pst = null;
                ResultSet rs = null;
                String search = txtSeachBox.getText();

                int row = 0;
                int rowIndex = 0;
                Statement stm = con.createStatement();

                String sql = "Select productCode, productName, unitPrice, drugCatagory, barcodeNumber, provider from productadmin where productCode LIKE '%" + search + "%' ";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();

                if (rs.next()) {
                    rs.last();
                    row = rs.getRow();
                    rs.beforeFirst();
                }

                String[][] data = new String[row][6];
                while (rs.next()) {
                    data[rowIndex][0] = rs.getInt(1) + "";
                    data[rowIndex][1] = rs.getString(2) + "";
                    data[rowIndex][2] = rs.getInt(3) + "";
                    data[rowIndex][3] = rs.getString(4) + "";
                    data[rowIndex][4] = rs.getInt(5) + "";
                    data[rowIndex][5] = rs.getString(6) + "";
                    rowIndex++;
                }

                String[] title = {"Product Code", "Product Name", "Unit Price", "Drug Catagory", "Barcode No", "Provider"};
                DefaultTableModel model = new DefaultTableModel(data, title);
                productTable.setModel(model);
                rs.close();
                stm.close();

                productTable.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (Exception e) {

            }

        }
    }//GEN-LAST:event_btnSearchMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
      DrugCatComboBox1.setSelectedItem("Select"); 
      DrugCatComboBox.setSelectedItem("Select");
      DrugCatComboBox3.setSelectedItem("Select");
        tableload();
        
    }//GEN-LAST:event_jLabel9MouseClicked

    private void btnSearch1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearch1MouseClicked
      DrugCatComboBox1.setSelectedItem("Select"); 
      DrugCatComboBox.setSelectedItem("Select");
      DrugCatComboBox3.setSelectedItem("Select");
        tableload();
        
    }//GEN-LAST:event_btnSearch1MouseClicked

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
            java.util.logging.Logger.getLogger(seachProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seachProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seachProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seachProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seachProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox DrugCatComboBox;
    private javax.swing.JComboBox DrugCatComboBox1;
    private javax.swing.JComboBox DrugCatComboBox3;
    private javax.swing.JPanel SearchProductPanel1;
    private javax.swing.JPanel btnSearch;
    private javax.swing.JPanel btnSearch1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable productTable;
    private javax.swing.JTextField txtSeachBox;
    // End of variables declaration//GEN-END:variables
}
