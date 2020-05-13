/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import Home.Home;
import Home.pharmacySubMenu;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Malintha Fernando
 */
public class stockAdministrationView extends javax.swing.JFrame {

    /**
     * Creates new form stockAdministrationView
     */
    public stockAdministrationView() {
        initComponents();
              tableload();
        FillcoboProductName();
        
        setBackground(new Color(0,0,0));
        
        searchTableResult.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 20));

        searchTableResult.getTableHeader().setOpaque(false);
        searchTableResult.getTableHeader().setBackground(new Color(32, 136, 203));
        searchTableResult.getTableHeader().setForeground(new Color(255,255,255));
        searchTableResult.setRowHeight(45);
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
                
                productComboBox1.addItem(rs.getString("productName"));
            }
            } 
        
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            
        }
       }
    
    
    
    
    
    
    
    
     public void tableload(){
     
         try {
             
            Class.forName("com.mysql.jdbc.Driver");

            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/openclinic","root","");  
             
               //String query = "INSERT INTO stockadmin (stockname, stockId, noOfUnit, product, antorizedDepartment, oderPeriodMonth, outsetdate, finaldate, hiddenstock, closestock) VALUES (?,?,?,?,?,?,?,?,?,?)";
            
            
             int row =0 ;
             int rowIndex = 0;
             Statement stm = conn.createStatement();
             ResultSet rs = stm.executeQuery("SELECT stockname, stockId, noOfUnit, product, antorizedDepartment, oderPeriodMonth, outsetdate, finaldate, hiddenstock, closestock FROM stockadmin");
             
             if(rs.next()){
             rs.last();
             row = rs.getRow();
             rs.beforeFirst();
             }
             
                String[][] data = new String[row][5];
                while (rs.next()) {
             data[rowIndex] [0]= rs.getString(1)+"";
             data[rowIndex] [1]= rs.getInt(2)+"";
             data[rowIndex] [2]= rs.getInt(3)+"";
             data[rowIndex] [3]= rs.getString(4)+"";
             data[rowIndex] [4]= rs.getString(5)+"";             
             rowIndex++;
             }
             
             String[] title = {"Stock Name", "Stock Code", "No of Unit", "Product", "Antorized Department" };
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
        SearchProductPanel = new javax.swing.JPanel();
        SearchProductPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        DrugCatComboBox = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtSeachBox = new javax.swing.JTextField();
        btnSearch = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSearch1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        productComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchTableResult = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Edit current Stock");
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

        SearchProductPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SearchProductPanel1.setBackground(new java.awt.Color(255, 255, 255));
        SearchProductPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(235, 236, 240));

        DrugCatComboBox.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        DrugCatComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Outpatient(OPD)", "Emergency room", "Intensive care", "Surgical ward", "General surgery" }));

        jLabel9.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Authorized Department ");

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Stock ID/  Name");

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

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_search_35px.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
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
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnSearchLayout.setVerticalGroup(
            btnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
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

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_reset_30px.png"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
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
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        btnSearch1Layout.setVerticalGroup(
            btnSearch1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        jLabel12.setFont(new java.awt.Font("Leelawadee UI", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Products");

        productComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        productComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(59, 59, 59)
                        .addComponent(txtSeachBox, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DrugCatComboBox, 0, 240, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(133, 133, 133)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSeachBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DrugCatComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(productComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );

        SearchProductPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1000, 190));

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

        SearchProductPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 1000, 540));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        SearchProductPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 790, 1060, 20));

        SearchProductPanel.add(SearchProductPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout productAdmindesktopPanelLayout = new javax.swing.GroupLayout(productAdmindesktopPanel);
        productAdmindesktopPanel.setLayout(productAdmindesktopPanelLayout);
        productAdmindesktopPanelLayout.setHorizontalGroup(
            productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SearchProductPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        productAdmindesktopPanelLayout.setVerticalGroup(
            productAdmindesktopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SearchProductPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void deleteProductjPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteProductjPanel2MouseClicked
        // TODO add your handling code here:
        stockAdministrationDelete h = new stockAdministrationDelete();
        h.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_deleteProductjPanel2MouseClicked

    private void txtSeachBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeachBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeachBoxActionPerformed

    private void txtSeachBoxKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSeachBoxKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeachBoxKeyTyped

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
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

                String sql = "SELECT stockname, stockId, noOfUnit, product, antorizedDepartment, oderPeriodMonth, outsetdate, finaldate, hiddenstock, closestock  from stockadmin where stockname LIKE '%" + search + "%' ";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();

                if (rs.next()) {
                    rs.last();
                    row = rs.getRow();
                    rs.beforeFirst();
                }

                String[][] data = new String[row][5];
                while (rs.next()) {
                    data[rowIndex] [0]= rs.getString(1)+"";
                    data[rowIndex] [1]= rs.getInt(2)+"";
                    data[rowIndex] [2]= rs.getInt(3)+"";
                    data[rowIndex] [3]= rs.getString(4)+"";
                    data[rowIndex] [4]= rs.getString(5)+"";
                    rowIndex++;
                }

                String[] title = {"Stock Name", "Stock Code", "No of Unit", "Product", "Antorized Department" };
                DefaultTableModel model = new DefaultTableModel(data, title);
                searchTableResult.setModel(model);
                rs.close();
                stm.close();

                searchTableResult.setModel(DbUtils.resultSetToTableModel(rs));

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

                String sql = "SELECT stockname, stockId, noOfUnit, product, antorizedDepartment, oderPeriodMonth, outsetdate, finaldate, hiddenstock, closestock  from stockadmin where stockId LIKE '%" + search + "%' ";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();

                if (rs.next()) {
                    rs.last();
                    row = rs.getRow();
                    rs.beforeFirst();
                }

                String[][] data = new String[row][5];
                while (rs.next()) {
                    data[rowIndex] [0]= rs.getString(1)+"";
                    data[rowIndex] [1]= rs.getInt(2)+"";
                    data[rowIndex] [2]= rs.getInt(3)+"";
                    data[rowIndex] [3]= rs.getString(4)+"";
                    data[rowIndex] [4]= rs.getString(5)+"";
                    rowIndex++;
                }

                String[] title = {"Stock Name", "Stock Code", "No of Unit", "Product", "Antorized Department" };
                DefaultTableModel model = new DefaultTableModel(data, title);
                searchTableResult.setModel(model);
                rs.close();
                stm.close();

                searchTableResult.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (Exception e) {

            }

        }

    }//GEN-LAST:event_jLabel8MouseClicked

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

                String sql = "SELECT stockname, stockId, noOfUnit, product, antorizedDepartment, oderPeriodMonth, outsetdate, finaldate, hiddenstock, closestock  from stockadmin where stockname LIKE '%" + search + "%' ";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();

                if (rs.next()) {
                    rs.last();
                    row = rs.getRow();
                    rs.beforeFirst();
                }
                String[][] data = new String[row][5];
                while (rs.next()) {
                    data[rowIndex] [0]= rs.getString(1)+"";
                    data[rowIndex] [1]= rs.getInt(2)+"";
                    data[rowIndex] [2]= rs.getInt(3)+"";
                    data[rowIndex] [3]= rs.getString(4)+"";
                    data[rowIndex] [4]= rs.getString(5)+"";
                    rowIndex++;
                }

                String[] title = {"Stock Name", "Stock Code", "No of Unit", "Product", "Antorized Department" };
                DefaultTableModel model = new DefaultTableModel(data, title);
                searchTableResult.setModel(model);
                rs.close();
                stm.close();

                searchTableResult.setModel(DbUtils.resultSetToTableModel(rs));

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

                String sql = "SELECT stockname, stockId, noOfUnit, product, antorizedDepartment, oderPeriodMonth, outsetdate, finaldate, hiddenstock, closestock  from stockadmin where stockId LIKE '%" + search + "%' ";
                pst = con.prepareStatement(sql);
                rs = pst.executeQuery();

                if (rs.next()) {
                    rs.last();
                    row = rs.getRow();
                    rs.beforeFirst();
                }

                String[][] data = new String[row][5];
                while (rs.next()) {
                    data[rowIndex] [0]= rs.getString(1)+"";
                    data[rowIndex] [1]= rs.getInt(2)+"";
                    data[rowIndex] [2]= rs.getInt(3)+"";
                    data[rowIndex] [3]= rs.getString(4)+"";
                    data[rowIndex] [4]= rs.getString(5)+"";
                    rowIndex++;
                }

                String[] title = {"Stock Name", "Stock Code", "No of Unit", "Product", "Antorized Department" };
                DefaultTableModel model = new DefaultTableModel(data, title);
                searchTableResult.setModel(model);
                rs.close();
                stm.close();

                searchTableResult.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (Exception e) {

            }

        }

    }//GEN-LAST:event_btnSearchMouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        tableload();
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:

        tableload();
    }//GEN-LAST:event_jLabel11MouseClicked

    private void btnSearch1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearch1MouseClicked

        tableload();
    }//GEN-LAST:event_btnSearch1MouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(stockAdministrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stockAdministrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stockAdministrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stockAdministrationView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stockAdministrationView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AddproductjPane1;
    private javax.swing.JLabel Back;
    private javax.swing.JComboBox DrugCatComboBox;
    private javax.swing.JLabel HomeLable;
    private javax.swing.JLabel MainNavi;
    private javax.swing.JPanel SearchProductPanel;
    private javax.swing.JPanel SearchProductPanel1;
    private javax.swing.JPanel btnSearch;
    private javax.swing.JPanel btnSearch1;
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
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel productAdmindesktopPanel;
    private javax.swing.JComboBox productComboBox1;
    private javax.swing.JTable searchTableResult;
    private javax.swing.JLabel sideNavi;
    private javax.swing.JTextField txtSeachBox;
    // End of variables declaration//GEN-END:variables
}
