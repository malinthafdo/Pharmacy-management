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
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Malintha Fernando
 */
public class searchCatagory extends javax.swing.JFrame {

    /**
     * Creates new form searchCatagory
     */
    public searchCatagory() {
        initComponents();
        tableload();
        FillcoboDrugCat();
        
        setBackground(new Color(0,0,0));
        
        searchTableResult.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 20));
        searchTableResult.getTableHeader().setOpaque(false);
        searchTableResult.getTableHeader().setBackground(new Color(32, 136, 203));
        searchTableResult.getTableHeader().setForeground(new Color(255,255,255));
        searchTableResult.setRowHeight(35);
    }

    
     public void filterlstatus(String query) {
        DefaultTableModel dtm = (DefaultTableModel) searchTableResult.getModel();

        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(dtm);
        searchTableResult.setRowSorter(tr);
                  
        
        
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
    
    
    
    
    
    
    
    
             private void FillcoboDrugCat(){
        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic","root","");       
            Statement stat = conn.createStatement();
            String sql = "select dname from drugcategories";
            ResultSet rs = stat.executeQuery(sql);
            
           
            
            while(rs.next())
            {
                
                DrugCatComboBox.addItem(rs.getString("dname"));
            }
            } 
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
       }

   
    
//        public void tableload(){
//        
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            
//        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic","root","");
//            
//            PreparedStatement pst = null;
//            ResultSet res = null;
//            
//            String sql = "SELECT drugCategorieId, dname, patientType, description from drugcategories";
//            pst = con.prepareStatement(sql);
//            res = pst.executeQuery();
//            
//            searchTableResult.setModel(DbUtils.resultSetToTableModel(res));
//        }
//        catch (Exception e){
//            System.out.println(e);
//        }
//    }
    
        
        
        
        
        
        
        
          public void tableload(){
     
         try {
             
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic","root","");  
             
             
             int row =0 ;
             int rowIndex = 0;
             Statement stm = conn.createStatement();
             ResultSet rs = stm.executeQuery("SELECT drugCategorieId, dname, patientType, description from drugcategories");
             
             if(rs.next()){
             rs.last();
             row = rs.getRow();
             rs.beforeFirst();
             }
             
             String [][] data = new String[row][4];
             while (rs.next())
             {
             data[rowIndex] [0]= rs.getInt(1)+"";
             data[rowIndex] [1]= rs.getString(2)+"";
             data[rowIndex] [2]= rs.getString(3)+"";
             data[rowIndex] [3]= rs.getString(4)+"";
             
             
             rowIndex++;
             }
             
             String[] title = {"Catagory Code", "Catagory Name", "Patient Type", "Description" };
             DefaultTableModel model = new DefaultTableModel(data, title);
             searchTableResult.setModel(model);
             rs.close();
             stm.close();
                         
             
         } 
         
         catch (Exception e) 
         {
             JOptionPane.showMessageDialog(null, e + "Database Loading error");
             
          
         }
     
     }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        SearchProductPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        DrugCatComboBox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtSeachBox = new javax.swing.JTextField();
        btnSearch = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSearch1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        DrugCatComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchTableResult = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        SearchProductPanel.setBackground(new java.awt.Color(255, 255, 255));
        SearchProductPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("Category Details");
        SearchProductPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 270, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bar2.jpg"))); // NOI18N
        SearchProductPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, 50));

        jPanel3.setBackground(new java.awt.Color(235, 236, 240));

        DrugCatComboBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DrugCatComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        DrugCatComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DrugCatComboBoxMousePressed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Drug category");

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Catagory ID/  Name");

        txtSeachBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtSeachBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeachBoxActionPerformed(evt);
            }
        });
        txtSeachBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSeachBoxKeyTyped(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(226, 224, 224));
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

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_search_35px.png"))); // NOI18N
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSearchLayout = new javax.swing.GroupLayout(btnSearch);
        btnSearch.setLayout(btnSearchLayout);
        btnSearchLayout.setHorizontalGroup(
            btnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSearchLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnSearchLayout.setVerticalGroup(
            btnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        btnSearch1.setBackground(new java.awt.Color(226, 224, 224));
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
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_reset_30px.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
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
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        btnSearch1Layout.setVerticalGroup(
            btnSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jLabel11.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Patient type");

        DrugCatComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DrugCatComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DrugCatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(133, 133, 133)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DrugCatComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(337, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(33, 33, 33)
                        .addComponent(txtSeachBox, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSeachBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DrugCatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DrugCatComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37))
        );

        SearchProductPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 1000, 190));

        searchTableResult.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        searchTableResult.setModel(new javax.swing.table.DefaultTableModel(
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
        searchTableResult.setFocusable(false);
        searchTableResult.setRowHeight(25);
        searchTableResult.setSelectionBackground(new java.awt.Color(232, 57, 95));
        searchTableResult.setShowVerticalLines(false);
        searchTableResult.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(searchTableResult);
        searchTableResult.getAccessibleContext().setAccessibleDescription("");

        SearchProductPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 1000, 510));

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

        SearchProductPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 790, 1060, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SearchProductPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SearchProductPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:

        String searchInput = txtSeachBox.getText();

        if (searchInput.matches("[a-zA-Z]+"))
        {
            try{
                Class.forName("com.mysql.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic","root","");

                PreparedStatement pst = null;
                ResultSet res = null;
                String search = txtSeachBox.getText();

                String sql = "Select drugCategorieId, dname, patientType, description from drugcategories where dname LIKE '%"+search+"%' ";

                pst = con.prepareStatement(sql);
                res = pst.executeQuery();

                searchTableResult.setModel(DbUtils.resultSetToTableModel(res));

            }

            catch (Exception e)
            {

            }

        }
        else if (searchInput.matches("[0-9]+"))
        {

            try{
                Class.forName("com.mysql.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic","root","");

                PreparedStatement pst = null;
                ResultSet res = null;
                String search = txtSeachBox.getText();

                String sql = "Select drugCategorieId, dname, patientType, description from drugcategories where drugCategorieId LIKE '%"+search+"%' ";

                pst = con.prepareStatement(sql);
                res = pst.executeQuery();

                searchTableResult.setModel(DbUtils.resultSetToTableModel(res));

            }

            catch (Exception e)
            {

            }

        }
    }//GEN-LAST:event_jLabel4MouseClicked

    private void txtSeachBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeachBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeachBoxActionPerformed

    private void txtSeachBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeachBoxKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtSeachBoxKeyTyped

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked

         String searchInput = txtSeachBox.getText();

        if (searchInput.matches("[a-zA-Z]+"))
        {
            try{
                Class.forName("com.mysql.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic","root","");

                PreparedStatement pst = null;
                ResultSet res = null;
                String search = txtSeachBox.getText();

                String sql = "Select drugCategorieId, dname, patientType, description from drugcategories where dname LIKE '%"+search+"%' ";

                pst = con.prepareStatement(sql);
                res = pst.executeQuery();

                searchTableResult.setModel(DbUtils.resultSetToTableModel(res));

            }

            catch (Exception e)
            {

            }

        }
        else if (searchInput.matches("[0-9]+"))
        {

            try{
                Class.forName("com.mysql.jdbc.Driver");

                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic","root","");

                PreparedStatement pst = null;
                ResultSet res = null;
                String search = txtSeachBox.getText();

                String sql = "Select drugCategorieId, dname, patientType, description from drugcategories where drugCategorieId LIKE '%"+search+"%' ";

                pst = con.prepareStatement(sql);
                res = pst.executeQuery();

                searchTableResult.setModel(DbUtils.resultSetToTableModel(res));

            }

            catch (Exception e)
            {

            }

        }

    }//GEN-LAST:event_btnSearchMouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:

        tableload();

    }//GEN-LAST:event_jLabel10MouseClicked

    private void btnSearch1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearch1MouseClicked

        tableload();

    }//GEN-LAST:event_btnSearch1MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        tableload();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void DrugCatComboBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DrugCatComboBoxMousePressed
        // TODO add your handling code here:
        String query = DrugCatComboBox.getSelectedItem().toString();
        filterlstatus(query);
        
    }//GEN-LAST:event_DrugCatComboBoxMousePressed

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
            java.util.logging.Logger.getLogger(searchCatagory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchCatagory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchCatagory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchCatagory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchCatagory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox DrugCatComboBox;
    private javax.swing.JComboBox DrugCatComboBox1;
    private javax.swing.JPanel SearchProductPanel;
    private javax.swing.JPanel btnSearch;
    private javax.swing.JPanel btnSearch1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable searchTableResult;
    private javax.swing.JTextField txtSeachBox;
    // End of variables declaration//GEN-END:variables
}
