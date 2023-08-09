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

public class Homes extends javax.swing.JFrame {

     
        public Homes() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        returnProduct = new javax.swing.JButton();
        viewProductList = new javax.swing.JButton();
        prodManagement = new javax.swing.JButton();
        viewSaleProductList = new javax.swing.JButton();
        viewReturnProductList = new javax.swing.JButton();
        saleProduct = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(153, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153), 2));

        jPanel15.setBackground(new java.awt.Color(51, 102, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Billing Management  System");

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

        jPanel16.setBackground(new java.awt.Color(153, 153, 0));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));
        jPanel16.setPreferredSize(new java.awt.Dimension(1121, 50));

        returnProduct.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        returnProduct.setText("Return Product ");
        returnProduct.setMaximumSize(new java.awt.Dimension(127, 30));
        returnProduct.setMinimumSize(new java.awt.Dimension(127, 30));
        returnProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnProductActionPerformed(evt);
            }
        });

        viewProductList.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        viewProductList.setText("View All Product  List");
        viewProductList.setMaximumSize(new java.awt.Dimension(127, 30));
        viewProductList.setMinimumSize(new java.awt.Dimension(127, 30));
        viewProductList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewProductListActionPerformed(evt);
            }
        });

        prodManagement.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        prodManagement.setText("Product Management");
        prodManagement.setMaximumSize(new java.awt.Dimension(127, 30));
        prodManagement.setMinimumSize(new java.awt.Dimension(127, 30));
        prodManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodManagementActionPerformed(evt);
            }
        });

        viewSaleProductList.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        viewSaleProductList.setText("View Sale Products List ");
        viewSaleProductList.setMaximumSize(new java.awt.Dimension(127, 30));
        viewSaleProductList.setMinimumSize(new java.awt.Dimension(127, 30));
        viewSaleProductList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSaleProductListActionPerformed(evt);
            }
        });

        viewReturnProductList.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        viewReturnProductList.setText("View Return Products List");
        viewReturnProductList.setMaximumSize(new java.awt.Dimension(127, 30));
        viewReturnProductList.setMinimumSize(new java.awt.Dimension(127, 30));
        viewReturnProductList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewReturnProductListActionPerformed(evt);
            }
        });

        saleProduct.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        saleProduct.setText("Sale  Product");
        saleProduct.setMaximumSize(new java.awt.Dimension(127, 30));
        saleProduct.setMinimumSize(new java.awt.Dimension(127, 30));
        saleProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saleProductActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 325, Short.MAX_VALUE)
                .addComponent(prodManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saleProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(returnProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewProductList, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewSaleProductList, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewReturnProductList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saleProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(prodManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(returnProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewProductList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewSaleProductList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewReturnProductList, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, 1362, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(685, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        int opt = JOptionPane.showConfirmDialog(this,"Do you want to close?","Confimation ",JOptionPane.YES_NO_OPTION);
        if(opt==JOptionPane.YES_OPTION)
        {
            new Homes().setVisible(false);
            System.exit(0);
        }
    }//GEN-LAST:event_lblCloseMouseClicked

    private void viewProductListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewProductListActionPerformed
        // TODO add your handling code here:
          ProductList p=new ProductList();
          p.setVisible(true);
          p.setLocation(235, 150);
        
    }//GEN-LAST:event_viewProductListActionPerformed

    private void viewSaleProductListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSaleProductListActionPerformed
        // TODO add your handling code here:
        SaleProductList s=new SaleProductList();
       s.setVisible(true);
       s.setLocation(235, 150);
    }//GEN-LAST:event_viewSaleProductListActionPerformed

    private void prodManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodManagementActionPerformed
        // TODO add your handling code here:
        Product p=new Product();
       p.setVisible(true);
       p.setLocation(287, 160);
        
    }//GEN-LAST:event_prodManagementActionPerformed

    private void saleProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saleProductActionPerformed
        // TODO add your handling code here:
       SaleProduct s=new SaleProduct();
       s.setVisible(true);
       s.setLocation(105, 115);
        
    }//GEN-LAST:event_saleProductActionPerformed

    private void returnProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnProductActionPerformed
        // TODO add your handling code here:
      ReturnProduct r= new  ReturnProduct();
       r.setVisible(true);
       r.setLocation(105, 115);
    }//GEN-LAST:event_returnProductActionPerformed

    private void viewReturnProductListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewReturnProductListActionPerformed
        // TODO add your handling code here:
       ReturnProductList r=new ReturnProductList();
       r.setVisible(true);
       r.setLocation(235, 150);
    }//GEN-LAST:event_viewReturnProductListActionPerformed

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
            java.util.logging.Logger.getLogger(Homes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Homes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Homes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Homes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Homes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JLabel lblClose;
    private javax.swing.JButton prodManagement;
    private javax.swing.JButton returnProduct;
    private javax.swing.JButton saleProduct;
    private javax.swing.JButton viewProductList;
    private javax.swing.JButton viewReturnProductList;
    private javax.swing.JButton viewSaleProductList;
    // End of variables declaration//GEN-END:variables
}
