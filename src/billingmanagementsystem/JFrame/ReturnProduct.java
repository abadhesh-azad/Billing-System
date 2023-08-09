/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package billingmanagementsystem.JFrame;
import static billingmanagementsystem.JFrame.SaleProduct.pass;
import static billingmanagementsystem.JFrame.SaleProduct.url;
import static billingmanagementsystem.JFrame.SaleProduct.user;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.util.Vector;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSetMetaData;
public class ReturnProduct extends javax.swing.JFrame {
     static final String user = "root";
     static final String pass = "azad";
     static final String url= "jdbc:mysql://localhost:3306/billingsystem";
     Connection con=null;
     PreparedStatement pst=null;
     ResultSet rs=null;
     int bill=0;
     public void updataTabel()
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(url,user,pass);
        pst=con.prepareStatement("select *from billinginfo");
        rs=pst.executeQuery();
        ResultSetMetaData rsmd=rs.getMetaData();
        int q=rsmd.getColumnCount();
        DefaultTableModel dtm=(DefaultTableModel)jTableTest.getModel();
        dtm.setRowCount(0);
        while(rs.next())
        {
            Vector cd=new Vector();
            for(int i=1;i<=q;i++)
            {
                cd.add(rs.getString("bill_id"));
                cd.add(rs.getString("Pid"));
                cd.add(rs.getString("totalquantity"));
                cd.add(rs.getString("totalprice"));
                
            }
            dtm.addRow(cd);
        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, user);
        }
    }
        public ReturnProduct() {
        initComponents();
        updataTabel();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableTest = new javax.swing.JTable();
        btnSearchBill = new javax.swing.JButton();
        txtSearchBill = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        txtPid = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        txtBrands = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        txtPrices = new javax.swing.JTextField();
        txtTotalQuantities = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        txtTotalPrices = new javax.swing.JTextField();
        btnUpdate2 = new javax.swing.JButton();
        btnAdd2 = new javax.swing.JButton();
        txtQuantityType = new javax.swing.JTextField();
        txtProductNames = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        txtDiscounts = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        txtFinalPrices = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        txtBill = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153), 2));
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 32750));

        jPanel9.setBackground(new java.awt.Color(153, 153, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 204), 2));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Bill_Id", "ProductID", "TotalQuantity", "TotalPrice"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable4MouseEntered(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane4)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(255, 204, 153));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 204), 2));

        jTableTest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Bill_Id", "ProductId", "TotalQuantity", "Quantity Type"
            }
        ));
        jTableTest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTestMouseClicked(evt);
            }
        });
        jTableTest.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTableTestKeyPressed(evt);
            }
        });
        jScrollPane5.setViewportView(jTableTest);

        btnSearchBill.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnSearchBill.setForeground(new java.awt.Color(102, 102, 102));
        btnSearchBill.setText("Search");
        btnSearchBill.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearchBill.setBorderPainted(false);
        btnSearchBill.setOpaque(true);
        btnSearchBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBillActionPerformed(evt);
            }
        });

        txtSearchBill.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtSearchBill.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSearchBill.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtSearchBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchBillActionPerformed(evt);
            }
        });

        jLabel49.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 102));
        jLabel49.setText("Search by Bill Id");
        jLabel49.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel49)
                .addGap(18, 18, 18)
                .addComponent(txtSearchBill, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSearchBill, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchBill, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearchBill, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        jPanel12.setBackground(new java.awt.Color(0, 102, 102));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 204), 2));

        jLabel43.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 102));
        jLabel43.setText("Product Id");
        jLabel43.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txtPid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPid.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPid.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtPid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPidActionPerformed(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 102));
        jLabel44.setText("Brand");
        jLabel44.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel45.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 102));
        jLabel45.setText("Name");

        txtBrands.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtBrands.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtBrands.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtBrands.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBrandsActionPerformed(evt);
            }
        });

        jLabel46.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 102));
        jLabel46.setText("Quantity Type");

        jLabel47.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 102));
        jLabel47.setText("Inital Price");
        jLabel47.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txtPrices.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPrices.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPrices.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtPrices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPricesActionPerformed(evt);
            }
        });

        txtTotalQuantities.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTotalQuantities.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTotalQuantities.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtTotalQuantities.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalQuantitiesActionPerformed(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 102));
        jLabel50.setText("Total Price");
        jLabel50.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txtTotalPrices.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTotalPrices.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtTotalPrices.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtTotalPrices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalPricesActionPerformed(evt);
            }
        });

        btnUpdate2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnUpdate2.setForeground(new java.awt.Color(102, 102, 102));
        btnUpdate2.setText("Cancel");
        btnUpdate2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate2.setBorderPainted(false);
        btnUpdate2.setOpaque(true);
        btnUpdate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate2ActionPerformed(evt);
            }
        });

        btnAdd2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnAdd2.setForeground(new java.awt.Color(102, 102, 102));
        btnAdd2.setText("Add ");
        btnAdd2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd2.setBorderPainted(false);
        btnAdd2.setOpaque(true);
        btnAdd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd2ActionPerformed(evt);
            }
        });

        txtQuantityType.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtQuantityType.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtQuantityType.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtQuantityType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityTypeActionPerformed(evt);
            }
        });

        txtProductNames.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtProductNames.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtProductNames.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtProductNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProductNamesActionPerformed(evt);
            }
        });

        jLabel51.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 102));
        jLabel51.setText("Discount");
        jLabel51.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txtDiscounts.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtDiscounts.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDiscounts.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtDiscounts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiscountsActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 102));
        jLabel52.setText("Final Price");
        jLabel52.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txtFinalPrices.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtFinalPrices.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtFinalPrices.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtFinalPrices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFinalPricesActionPerformed(evt);
            }
        });

        jLabel48.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 102));
        jLabel48.setText("Total Quantity");
        jLabel48.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabel53.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 102));
        jLabel53.setText("Bill_Id");
        jLabel53.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        txtBill.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtBill.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtBill.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        txtBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBillActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtTotalPrices, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(btnUpdate2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtQuantityType, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtProductNames, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtBrands, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtTotalQuantities)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(txtPrices)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDiscounts, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtFinalPrices, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBill, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPid, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(txtPid, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(txtBill, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBrands, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtProductNames, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuantityType, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFinalPrices, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDiscounts, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrices, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTotalQuantities, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTotalPrices, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel13.setBackground(new java.awt.Color(153, 0, 153));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("Select Product From  Table");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(141, 141, 141))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(153, 0, 153));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setText("Return Product Information");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(51, 102, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Return Product");

        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billingmanagementsystem/Icon/icons8-close-window-48.png"))); // NOI18N
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(372, 372, 372)
                .addComponent(lblClose))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblClose, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel16.setBackground(new java.awt.Color(153, 0, 153));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));

        jLabel54.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 153, 153));
        jLabel54.setText("Product Description");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel54)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel54)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        btnNext.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnNext.setForeground(new java.awt.Color(102, 102, 102));
        btnNext.setText("Next");
        btnNext.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnNext.setBorderPainted(false);
        btnNext.setOpaque(true);
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void updataTabel1()
    {
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(url,user,pass);
        pst=con.prepareStatement("select *from tempreturnproduct");
        rs=pst.executeQuery();
        ResultSetMetaData rsmd=rs.getMetaData();
        int q=rsmd.getColumnCount();
        DefaultTableModel dtm=(DefaultTableModel)jTable4.getModel();
        dtm.setRowCount(0);
        while(rs.next())
        {
            Vector cd=new Vector();
            for(int i=1;i<=q;i++)
            {   cd.add(rs.getString("bill_id"));
                cd.add(rs.getString("pid"));
                cd.add(rs.getString("totalquantity"));
                cd.add(rs.getString("totalprice"));
            }
            dtm.addRow(cd);
        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, user);
        }
    }
    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        try
        {
            TableModel dtm=jTable4.getModel();
            int sr=jTable4.getSelectedRow();
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
            pst=con.prepareStatement("select *from product where pid =?");
            String spid=dtm.getValueAt(sr,0).toString();
            pst.setString(1,spid);
            rs=pst.executeQuery();
            if(rs.next())
            {
                txtPid.setText(rs.getString("pid"));
                txtBrands.setText(rs.getString("Brand"));
                txtProductNames.setText(rs.getString("pname"));
                txtQuantityType.setText(rs.getString("QType"));
                txtPrices.setText(rs.getString("price"));
                txtDiscounts.setText(rs.getString("discount"));
                txtFinalPrices.setText("finalPrice");
                txtTotalQuantities.setText(dtm.getValueAt(sr,1).toString());
                txtTotalPrices.setText(dtm.getValueAt(sr,2).toString());
            }
            con.close();
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
            pst=con.prepareStatement("delete from tempsaleproduct where pid =?");
            pst.setString(1, spid);
            pst.executeUpdate();

            this.updataTabel1();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, pass);
        }
    }//GEN-LAST:event_jTable4MouseClicked

    private void jTable4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable4MouseEntered

    private void jTableTestMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTestMouseClicked

          try
        {
            TableModel dtm=jTableTest.getModel();
            int sr=jTableTest.getSelectedRow();
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
            pst=con.prepareStatement("select *from product where pid =?");
            String spid=dtm.getValueAt(sr,1).toString();
            pst.setString(1,spid);
            rs=pst.executeQuery();
            if(rs.next())
            {
                txtPid.setText(rs.getString("pid"));
                txtBrands.setText(rs.getString("Brand"));
                txtProductNames.setText(rs.getString("pname"));
                txtQuantityType.setText(rs.getString("QType"));
                txtPrices.setText(rs.getString("price"));
                txtDiscounts.setText(rs.getString("discount"));
                txtFinalPrices.setText(rs.getString("finalPrice"));
                txtBill.setText(dtm.getValueAt(sr,0).toString());
                txtTotalQuantities.setText(dtm.getValueAt(sr,2).toString());
                txtTotalPrices.setText(dtm.getValueAt(sr,3).toString());
            }
            con.close();        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, pass);
        }
    }//GEN-LAST:event_jTableTestMouseClicked

    private void jTableTestKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableTestKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableTestKeyPressed

    private void txtPidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPidActionPerformed

    private void btnSearchBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBillActionPerformed
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(url,user,pass);
        pst=con.prepareStatement("select *from billinginfo where bill_id=?");
        pst.setString(1, txtSearchBill.getText().toString());
        rs=pst.executeQuery();
        ResultSetMetaData rsmd=rs.getMetaData();
        int q=rsmd.getColumnCount();
        DefaultTableModel dtm=(DefaultTableModel)jTableTest.getModel();
        dtm.setRowCount(0);
        while(rs.next())
        {
            Vector cd=new Vector();
            for(int i=1;i<=q;i++)
            {
                cd.add(rs.getString("bill_id"));
                //bill=Integer.parseInt(rs.getString("bill_id"));
                cd.add(rs.getString("Pid"));
                cd.add(rs.getString("totalquantity"));
                cd.add(rs.getString("totalprice"));
                
            }
            dtm.addRow(cd);
        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, user);
        }
    }//GEN-LAST:event_btnSearchBillActionPerformed

    private void txtBrandsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBrandsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBrandsActionPerformed

    private void txtPricesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPricesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPricesActionPerformed

    private void txtTotalQuantitiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalQuantitiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalQuantitiesActionPerformed

    private void txtTotalPricesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalPricesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalPricesActionPerformed

    private void btnUpdate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate2ActionPerformed

    }//GEN-LAST:event_btnUpdate2ActionPerformed

    private void btnAdd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd2ActionPerformed

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
            pst=con.prepareStatement("insert into tempreturnProduct(pid,totalquantity,totalprice,bill_id) value(?,?,?,?)");
            pst.setString(1,txtPid.getText());
            pst.setString(2,txtTotalQuantities.getText());
            float p=Float.parseFloat(txtPrices.getText());
            float d=Float.parseFloat(txtDiscounts.getText());
            float tq=Float.parseFloat(txtTotalQuantities.getText());
            float f=p-p*d/100;
            pst.setString(3,""+(f*tq));
            pst.setString(4, txtBill.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this,"Product Record is added in return list successfully!");
            this.updataTabel1();
        }

        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, user);
        }
    }//GEN-LAST:event_btnAdd2ActionPerformed

    private void txtQuantityTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityTypeActionPerformed

    private void txtProductNamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProductNamesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProductNamesActionPerformed

    private void txtDiscountsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiscountsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiscountsActionPerformed

    private void txtFinalPricesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFinalPricesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFinalPricesActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        try
        {
        Class.forName("com.mysql.jdbc.Driver");
        con=DriverManager.getConnection(url,user,pass);
        pst=con.prepareStatement("select *from tempreturnproduct");
        rs=pst.executeQuery();
        if(rs.next())
        {
            dispose();
            ReturnCustomerpayment r= new ReturnCustomerpayment();
            r.setVisible(true);
            r.setLocation(185, 155);
            //JOptionPane.showMessageDialog(null, "plz one or more product add to return product list");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "plz one or more product add to return product list");
        }
        }
        catch(Exception e)
        {
            //JOptionPane.showMessageDialog(null, user);
        }
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtSearchBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBillActionPerformed

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
      int opt = JOptionPane.showConfirmDialog(this,"Do you want to close?","Confimation ",JOptionPane.YES_NO_OPTION);
        if(opt==JOptionPane.YES_OPTION)
        {
            dispose();
            new ReturnProduct().setVisible(false);
        }
    }//GEN-LAST:event_lblCloseMouseClicked

    private void txtBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBillActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBillActionPerformed

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
            java.util.logging.Logger.getLogger(ReturnProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReturnProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReturnProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReturnProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReturnProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd2;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSearchBill;
    private javax.swing.JButton btnUpdate2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTableTest;
    private javax.swing.JLabel lblClose;
    private javax.swing.JTextField txtBill;
    private javax.swing.JTextField txtBrands;
    private javax.swing.JTextField txtDiscounts;
    private javax.swing.JTextField txtFinalPrices;
    private javax.swing.JTextField txtPid;
    private javax.swing.JTextField txtPrices;
    private javax.swing.JTextField txtProductNames;
    private javax.swing.JTextField txtQuantityType;
    private javax.swing.JTextField txtSearchBill;
    private javax.swing.JTextField txtTotalPrices;
    private javax.swing.JTextField txtTotalQuantities;
    // End of variables declaration//GEN-END:variables
}
