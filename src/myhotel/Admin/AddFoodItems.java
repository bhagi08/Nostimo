/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myhotel.Admin;

/**
 *
 * @author Pasan Sampath
 */
import com.mysql.jdbc.Connection;
import myhotel.db.DBConnect;
import java.sql.PreparedStatement;
import java.sql.*;
import javax.swing.*;
public class AddFoodItems extends javax.swing.JFrame {
    Connection link = null;
    PreparedStatement stmt=null;
    /**
     * Creates new form AddFoodItems
     */
    public AddFoodItems() {
        setTitle("Food Items");
        initComponents();
        link =DBConnect.connectDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Ino = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        descript = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        Iprice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Itype = new javax.swing.JComboBox();
        addItems = new javax.swing.JButton();
        ResetAll = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 360));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel1.setText("Item No");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 30, 110, 25);

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel2.setText("Description");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 90, 120, 25);

        Ino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InoActionPerformed(evt);
            }
        });
        getContentPane().add(Ino);
        Ino.setBounds(130, 30, 60, 30);

        descript.setColumns(20);
        descript.setRows(5);
        jScrollPane1.setViewportView(descript);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 90, 186, 96);

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel3.setText("Price");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 220, 120, 25);

        Iprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IpriceActionPerformed(evt);
            }
        });
        getContentPane().add(Iprice);
        Iprice.setBounds(130, 220, 86, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel4.setText("Type");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 270, 120, 25);

        Itype.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        Itype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose the Type", "Sri Lankan", "Indian", "Italian", "Chienese", "Mongolian" }));
        Itype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItypeActionPerformed(evt);
            }
        });
        getContentPane().add(Itype);
        Itype.setBounds(130, 270, 150, 26);

        addItems.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        addItems.setText("Add");
        addItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemsActionPerformed(evt);
            }
        });
        getContentPane().add(addItems);
        addItems.setBounds(160, 330, 84, 33);

        ResetAll.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        ResetAll.setText("Reset All");
        ResetAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetAllActionPerformed(evt);
            }
        });
        getContentPane().add(ResetAll);
        ResetAll.setBounds(260, 330, 110, 33);

        Back.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        Back.setText("Back");
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(380, 330, 70, 33);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/myhotel/images/0.jpg"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(400, 360));
        jLabel5.setMinimumSize(new java.awt.Dimension(450, 400));
        jLabel5.setPreferredSize(new java.awt.Dimension(400, 360));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 470, 380);

        setSize(new java.awt.Dimension(487, 423));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InoActionPerformed

    private void IpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IpriceActionPerformed

    private void ItypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItypeActionPerformed

    private void ResetAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetAllActionPerformed
        // TODO add your handling code here:
        Ino.setText("");
        Iprice.setText("");
        descript.setText("");
    }//GEN-LAST:event_ResetAllActionPerformed

    private void addItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemsActionPerformed
        // TODO add your handling code here:
        String ItemNo = Ino.getText();
        String description = descript.getText();
        double price = Double.parseDouble(Iprice.getText());
        String type = (String) Itype.getSelectedItem();
        
        try{
        String q = "INSERT INTO food_items(description,item_no,price,type) VALUES('"+description+"','"+ItemNo+"','"+price+"','"+type+"')";
        Statement stmt=link.createStatement();
        stmt.executeUpdate(q);
        //stm=link.prepareStatement(q);
       // stm.execute();
         String st="Food Item Successfully added!";
        JOptionPane.showMessageDialog(null,st);
        Ino.setText("");
        Iprice.setText("");
        descript.setText("");
        }catch(Exception e){
            String st2="Food Item Already added!";
            JOptionPane.showMessageDialog(null,st2);
            Ino.setText("");
            Iprice.setText("");
            descript.setText("");
            
        }
       
           
        
    }//GEN-LAST:event_addItemsActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        AdminMain amm=new AdminMain();
        amm.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BackActionPerformed

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
            java.util.logging.Logger.getLogger(AddFoodItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFoodItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFoodItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFoodItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AddFoodItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JButton Back;
    private javax.swing.JTextField Ino;
    private javax.swing.JTextField Iprice;
    private javax.swing.JComboBox Itype;
    private javax.swing.JButton ResetAll;
    private javax.swing.JButton addItems;
    private javax.swing.JTextArea descript;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
